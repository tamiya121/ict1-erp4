<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<form onsubmit="return check()">
		<table border="1">
			<tr>
				<th class="p" colspan="2" align="center">회원가입</th>
			</tr>

			<tr>
				<th><label for="id">ID</label></th>
				<td><input type="text" id="id" name="id" size="30"
					placeholder="아이디를 입력하세요." required></td>
			</tr>

			<tr>
				<th><label for="pwd">Password</label></th>
				<td><input type="password" id="pwd" name="pwd" size="30"
					placeholder="비밀번호를 입력하세요." required></td>
			</tr>

			<tr>
				<th><label for="pwdC">Password check</label></th>
				<td><input type="password" id="pwdC" name="pwdC" size="30"
					placeholder="비밀번호를 다시 입력해주세요." required></td>
			</tr>


			<tr>
				<th><label for="age">Age</label></th>
				<td><input type="text" id="age" name="age" size="30"
					placeholder="나이를 입력하세요." required></td>
			</tr>
			<tr>
				<th><label for="email">e-mail</label></th>
				<td><input type="email" id="email" name="email" size="30"
					placeholder="이메일을 입력하세요." required></td>
			</tr>

			

			<tr>
				<td colspan="2" align="center"><button style="width: 100%">회원가입</button></td>
			</tr>

		</table>
	</form>
	<script>
		function check() {
			var idObj = document.querySelector("#id");
			var pwdObj = document.querySelector("#pwd");
			var pwdCObj = document.querySelector("#pwdC");
			var ageObj = document.querySelector("#age");
			var emailObj = document.querySelector("#email");
			
			if (idObj.value.trim().length < 5) {
				alert("ID를 5글자 이상 입력하세요");
				idObj.value = "";
				idObj.focus();
				return false;
			}
			if (pwdObj.value.trim().length < 8) {
				alert("비밀번호를 8글자 이상 입력하세요");
				pwdObj.value = "";
				pwdObj.focus();
				return false;
			}
			if (pwdCObj.value != pwdObj.value) {
				alert("비밀번호가 다릅니다");
				pwdCObj.value = "";
				pwdCObj.focus();
				return false;
			}
			if (ageObj.value > 130 || ageObj.value == 0) {
				alert("0미만 130초과 불가");
				ageObj.value = "";
				ageObj.focus();
				return false;
			}
			var exptext = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;
			if (exptext.test(emailObj.value) == false) {
				alert("이메일 형식에 맞게 입력해주세요.");
				emailObj.value = "";
				emailObj.focus();
				return false;
			}
			
		}
	</script>
</body>
</html>