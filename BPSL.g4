// Copyright (c) 2018, BlockProject
//
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//     * Redistributions of source code must retain the above copyright notice,
//       this list of conditions and the following disclaimer.
//     * Redistributions in binary form must reproduce the above copyright notice,
//       this list of conditions and the following disclaimer in the documentation
//       and/or other materials provided with the distribution.
//     * Neither the name of BlockProject nor the names of its contributors
//       may be used to endorse or promote products derived from this software
//       without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
// CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
// EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
// PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
// PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
// LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
// NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
// SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

grammar BPSL;

WS: [ \n\t\r]+ -> skip;

STRUCT: 'struct';
CLASS1: 'class';
CONST: 'const';
IF: 'if';
FOR: 'for';
WHILE: 'while';
QUALIFIER_CBUF: 'constbuf';
QUALIFIER_VL: 'vlayout';

CBRACE_OPEN: '{';
CBRACE_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

QUOTE: '"';

SBRACE_OPEN: '[';
SBRACE_CLOSE: ']';

COMA: ',';

SEMICOLON: ';';

// Operator tokens
DOT: '.';
AND: '&';
OR: '|';
NOT: '!';
DIV: '/';
MUL: '*';
MOD: '%';
LESS: '<';
GREATER: '>';
PLUS: '+';
MINUS: '-';
EQUAL: '=';

//Litterals
fragment NUMERIC: [0-9];
fragment UPPER: [A-Z];
fragment LOWER: [a-z];
L_INT: NUMERIC+;
L_FLOAT: NUMERIC+ DOT NUMERIC+ 'f';
L_DOUBLE: NUMERIC+ DOT NUMERIC+;
L_STRING: QUOTE [\u0000-\u00FF]* QUOTE;

IDENTIFIER: (UPPER | LOWER) (UPPER | LOWER | NUMERIC)*;

bpsl: block;

block: structure | function | classFucker | constantDefinition;

structure: STRUCT qualifier IDENTIFIER CBRACE_OPEN attribute* CBRACE_CLOSE;

classFucker: CLASS1 IDENTIFIER CBRACE_OPEN (attribute | function)* CBRACE_CLOSE;

constantDefinition: CONST IDENTIFIER IDENTIFIER EQUAL constantExpr SEMICOLON;

function: IDENTIFIER IDENTIFIER PAR_OPEN (functionParameter COMA)* PAR_CLOSE compoundStatement;

attribute: IDENTIFIER IDENTIFIER SEMICOLON;

functionParameter: IDENTIFIER IDENTIFIER
    | IDENTIFIER IDENTIFIER EQUAL (L_INT | L_FLOAT | L_DOUBLE | L_STRING);

qualifier: QUALIFIER_CBUF | QUALIFIER_VL;

constantExpr: L_INT
    | L_FLOAT
    | L_DOUBLE
    | IDENTIFIER
    | PAR_OPEN constantExpr PAR_CLOSE
    | constantFunctionCall
    | constantExpr op=MUL constantExpr
    | constantExpr op=DIV constantExpr
    | constantExpr op=MOD constantExpr
    | constantExpr op=PLUS constantExpr
    | constantExpr op=MINUS constantExpr
    | op=MINUS constantExpr;

constantFunctionCall: IDENTIFIER PAR_OPEN (constantExpr COMA?)* PAR_CLOSE;

statement: ifStatement
    | whileStatement
    | forStatement
    | compoundStatement
    | variableDeclaration
    | expr SEMICOLON;

ifStatement: IF PAR_OPEN expr PAR_CLOSE statement;
whileStatement: WHILE PAR_OPEN expr PAR_CLOSE statement;
forStatement: FOR PAR_OPEN expr PAR_CLOSE statement;
compoundStatement: CBRACE_OPEN statement* CBRACE_CLOSE;

variableDeclaration: IDENTIFIER IDENTIFIER SEMICOLON
    | IDENTIFIER IDENTIFIER EQUAL expr SEMICOLON;

expr: L_INT
    | L_FLOAT
    | L_DOUBLE
    | L_STRING
    | IDENTIFIER
    | PAR_OPEN expr PAR_CLOSE
    | expr op=SBRACE_OPEN expr SBRACE_CLOSE
    | expr op=DOT IDENTIFIER
    | expr op=DOT functionCall
    | functionCall
    | expr op=MUL expr
    | expr op=DIV expr
    | expr op=MOD expr
    | expr op=PLUS expr
    | expr op=MINUS expr
    | expr MUL EQUAL expr
    | expr DIV EQUAL expr
    | expr MOD EQUAL expr
    | expr PLUS EQUAL expr
    | expr MINUS EQUAL expr
    | expr op=GREATER expr
    | expr op=LESS expr
    | expr GREATER EQUAL expr
    | expr LESS EQUAL expr
    | expr EQUAL EQUAL expr
    | expr NOT EQUAL expr
    | expr OR OR expr
    | expr AND AND expr
    | expr GREATER GREATER expr
    | expr LESS LESS expr
    | expr AND expr
    | expr OR expr
    | MINUS MINUS expr
    | PLUS PLUS expr
    | MINUS expr
    | NOT expr;

functionCall: IDENTIFIER PAR_OPEN (expr COMA?)* PAR_CLOSE;
