<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String content = "/qq/";
String param = request.getParameter("page");
if(param == null) {
	content += "r1";
}else{
	content += param;

}
content += ".jsp";
%>
<!doctype html>
<html>
<head>

</head>
<body>
	<div class="wrapper" style="width:500px">
	<div class="left" style="float:left;width:100px">
	<jsp:include page="/qq/left.jsp" flush="false" />
	</div>
	<div class="right" style="float:right;width:100px">
	<jsp:include page="<%=content %>" flush = "false" />
	</div>
	</div>
</body>
</html>
  --%>