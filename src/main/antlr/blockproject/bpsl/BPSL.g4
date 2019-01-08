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

@header
{
    package blockproject.bpsl;
}

WS: [ \n\t\r]+ -> skip;

STRUCT: 'struct';
CLASS: 'class';
CONST: 'const';
RETURN: 'return';
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
MUL_EQUAL: MUL EQUAL;
DIV_EQUAL: DIV EQUAL;
MOD_EQUAL: MOD EQUAL;
PLUS_EQUAL: PLUS EQUAL;
MINUS_EQUAL: MINUS EQUAL;
GREATER_EQUAL: GREATER EQUAL;
LESS_EQUAL: LESS EQUAL;
EQUAL_EQUAL: EQUAL EQUAL;
NOT_EQUAL: NOT EQUAL;
AND_AND: AND AND;
OR_OR: OR OR;
SHIFT_LEFT: LESS LESS;
SHIFT_RIGHT: GREATER GREATER;
INCREMENT: PLUS PLUS;
DECREMENT: MINUS MINUS;

//Litterals
fragment NUMERIC: [0-9];
fragment UPPER: [A-Z];
fragment LOWER: [a-z];
L_INT: NUMERIC+;
L_FLOAT: NUMERIC+ DOT NUMERIC+ 'f';
L_DOUBLE: NUMERIC+ DOT NUMERIC+;
L_STRING: QUOTE [\u0000-\u00FF]* QUOTE;

IDENTIFIER: (UPPER | LOWER) (UPPER | LOWER | NUMERIC)*;

bpsl: block*;

block: structure | function | classFucker | constantDefinition;

structure: STRUCT qualifier name=IDENTIFIER CBRACE_OPEN attribute* CBRACE_CLOSE;

classFucker: CLASS name=IDENTIFIER CBRACE_OPEN (attribute | function)* CBRACE_CLOSE;

constantDefinition: CONST type=IDENTIFIER name=IDENTIFIER EQUAL constantExpr SEMICOLON;

function: type=IDENTIFIER name=IDENTIFIER PAR_OPEN (functionParameter COMA)* PAR_CLOSE compoundStatement;

attribute: type=IDENTIFIER name=IDENTIFIER SEMICOLON
    | type=IDENTIFIER name=IDENTIFIER SBRACE_OPEN constantExpr SBRACE_CLOSE SEMICOLON;

functionParameter: type=IDENTIFIER name=IDENTIFIER
    | type=IDENTIFIER name=IDENTIFIER EQUAL (L_INT | L_FLOAT | L_DOUBLE | L_STRING);

qualifier: QUALIFIER_CBUF | QUALIFIER_VL;

constantExpr: value=L_INT
    | value=L_FLOAT
    | value=L_DOUBLE
    | value=IDENTIFIER
    | PAR_OPEN constantExpr PAR_CLOSE
    | constantFunctionCall
    | constantExpr op=(MUL | DIV | MOD) constantExpr
    | constantExpr op=(PLUS | MINUS) constantExpr
    | op=MINUS constantExpr;

constantFunctionCall: name=IDENTIFIER PAR_OPEN (constantExpr COMA?)* PAR_CLOSE;

statement: ifStatement
    | whileStatement
    | forStatement
    | compoundStatement
    | variableDeclaration
    | expr SEMICOLON
    | returnStatement;

ifStatement: IF PAR_OPEN expr PAR_CLOSE statement;
whileStatement: WHILE PAR_OPEN expr PAR_CLOSE statement;
forStatement: FOR PAR_OPEN expr PAR_CLOSE statement;
compoundStatement: CBRACE_OPEN statement* CBRACE_CLOSE;
returnStatement: RETURN (PAR_OPEN expr PAR_CLOSE | expr)? SEMICOLON;

variableDeclaration: type=IDENTIFIER name=IDENTIFIER SEMICOLON
    | type=IDENTIFIER name=IDENTIFIER EQUAL expr SEMICOLON
    | type=IDENTIFIER name=IDENTIFIER SBRACE_OPEN constantExpr SBRACE_CLOSE SEMICOLON;

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
    | expr op=(MUL | DIV | MOD) expr
    | expr op=(PLUS | MINUS) expr
    | expr op=(MUL_EQUAL | DIV_EQUAL | MOD_EQUAL) expr
    | expr op=(PLUS_EQUAL | MINUS_EQUAL) expr
    | expr op=(LESS_EQUAL | GREATER_EQUAL | GREATER | LESS) expr
    | expr op=(EQUAL_EQUAL | NOT_EQUAL) expr
    | expr op=(OR_OR | AND_AND) expr
    | expr op=(SHIFT_LEFT | SHIFT_RIGHT | AND | OR) expr
    | op=(DECREMENT | INCREMENT) expr
    | op=MINUS expr
    | op=NOT expr;

functionCall: name=IDENTIFIER PAR_OPEN (expr COMA?)* PAR_CLOSE;
