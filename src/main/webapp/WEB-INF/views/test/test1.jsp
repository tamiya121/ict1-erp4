<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
</head>
<style>
#left{
width:40%;
height:400px;
float:left;
background-color:rgba(153,51,242,0,8);
}

#right{
width:40%;
height:400px;
float:right;
background-color:rgba(213.101.100.0.8);
}
</style>

<body>
	<div>
		<div id="left">
			<select id="chText">
				<option value="">선택</option>
				<option value="text1">r1</option>
				<option value="text2">r2</option>
				<option value="text3">r3</option>
			</select>
		</div>
		
		<div id="right">
			<h2>왼쪽 메뉴 선택</h2>
		</div>
	</div>
	
<script>
	var context = {
	text1: 'r1페이지!',
	text2: 'r2페이지!',
	text3: 'r3페이지!'
	}
	document.querySelector('#chText').onchange = function() {
		document.querySelector('#right').innerHTML = context[this.value];
	}
</script>	
</body>
</html>