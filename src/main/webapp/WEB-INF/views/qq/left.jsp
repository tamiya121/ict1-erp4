<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>


</head>
<body>
	<% 
	String param = request.getParameter("page");
	String r1 = null;
	String r2 = null;
	String r3 = null;
	if(param == null || param.isEmpty()) {
		r1 = "selected";
	}else {
		if(param.equals("r1")){
			r1 = "selected";
	}else if(param.equals("r2")){
		r2= "selected";
	}else if(param.equals("r3")){
		r3 = "selected";
	}
		}
	
	%>
	<form id="left">
		<select name="page" onchange = "this.form.submit()">
			<option value="r1"<%=r1%>>r1</option>
			<option value="r2"<%=r2%>>r2</option>
			<option value="r3"<%=r3%>>r3</option> 
		</select>
	</form>
</body>
</html>