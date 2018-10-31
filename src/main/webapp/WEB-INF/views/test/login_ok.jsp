<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@taglib prefix="c" url="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>g</title>
<script src=""></script>
<script type="text/javascript">
function toJson_submit(){
	ajax_request();
}
function ajax_request(){
	var usrId = loginForm.id.value;
	var usrPwd = loginForm.pwd.value;
	$.ajax(
		{
			url:'/user/login',
			method:'POST',
			dataType:'json',
			params:{id:usrId, pwd:usrPwd},
		contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
		success:function(login){
			if(login.result==true){
				$('#result').html('로그인 성공');
			}else{
				$('#result').html('로그인 실패');
			}
		},
			error:function(errMsg){alert("에러:"+errMsg);}
		}	
			
			);
}
</script>
</head>
<body>
<div id=result></div>
<form name="loginForm">
ID <input type="text" name="id">
PWD <input type="password" name="pwd">
<input type="button" value="submit" onclick="toJson_submit()">
</form>
</body>
</html> 

