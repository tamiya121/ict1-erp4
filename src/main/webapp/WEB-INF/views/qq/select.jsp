<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String content = "/url/qq:";
if(request.getParameter("page") != null) {
	content += request.getParameter("page");
}else{
	content += "r1";
}
%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<div class="include-wrapper"
style="width:500px">
<div class="left"
style = "float:left;width:100px">
<jsp:include page="/url/qq:left"
flush="false"/>
</div>
<div class="right"
style ="float:right;width:100px">
<jsp:include page="<%=content %>"
flush="false"/>
</div>
</div>
</body>
</html>
