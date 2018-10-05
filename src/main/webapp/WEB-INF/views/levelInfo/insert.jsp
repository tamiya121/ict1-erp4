<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
</head>
<body>
<c:if test="${rCnt==1}">
<script>
		alert("저장성공");
		location.href="/levelInfo";
</script>
	</c:if>
<form action="/insertLevel" method="post">
	liname : <input type="text" name="liname"><br>
	lilevel : <input type="text" name="lilevel"><br>
	lidesc : <input type="text" name="lidesc"><br>
	<button>레벨등록</button>
</form>
</body>
</html>