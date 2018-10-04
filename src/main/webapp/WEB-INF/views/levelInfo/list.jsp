<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
</head>
<body>
<form action="levelInfo" method="get">
	liname : <input type="text" name="liname">
	<button>검색</button>
</form>
<table border="1">
	<thead>
		<tr>
			<th>linum</th>
			<th>lilevel</th>
			<th>liname</th>
			<th>lidesc</th>
		</tr>
	</thead>
	<tbody>
	
	<c:if test="${empty biList}">
		<tr>
			<td colspan="4">아무 것도 없음.</td>
		</tr>
	</c:if>
	<c:forEach items="${biList}" var="li">
		<tr>
			<td>${li.linum}</td>
			<td>${li.lilevel}</td>
			<td>${li.liname}</td>
			<td>${li.lidesc}</td>
		</tr>
	</c:forEach>	
	</tbody>
</table>

</body>
</html>
	