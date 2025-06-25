<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Arithmetic Operators</h2>
Addition: ${5 + 2} <br><br>
Subtraction: ${5 - 1} <br><br>
Multiplication: ${5 * 2} <br><br>
Division: ${10 / 2} or ${10 div 2} <br><br>
Modulo: ${10 % 3} or ${10 mod 3} <br><br>

<h2>Relational / Comparison Operators</h2>
Equal to (true): ${5 == 5} or ${5 eq 5} <br><br>
Equal to (false): ${5 == 4} or ${5 eq 4} <br><br>
Not equal to (true): ${5 != 4} or ${5 ne 4} <br><br>
Not equal to (false): ${5 != 5} or ${5 ne 5} <br><br>
Greater than: ${5 > 3} or ${5 gt 3} <br><br>
Less than: ${5 < 3} or ${5 lt 3} <br><br>
Greater than or equal to: ${5 >= 5} or ${5 ge 5} <br><br>
Less than or equal to: ${5 <= 4} or ${5 le 4} <br><br>

<h2>Logical Operators</h2>
AND (true): ${true && true} or ${true and true} <br><br>
AND (false): ${true && false} or ${true and false} <br><br>
OR (true): ${true || false} or ${true or false} <br><br>
NOT (false): ${!true} or ${not true} <br><br>

<h2>Conditional (Ternary) Operator</h2>
${5 > 3 ? 'Yes' : 'No'} <br><br>
${5 < 3 ? 'Yes' : 'No'} <br><br>

</body>
</html>