<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
</head>
<script>
	var AjaxUtil = function(conf) {
		var xhr = new XMLHttpRequest();
		var url = conf.url;
		var method = conf.method?conf.method:'GET';
		var param = conf.param?conf.param:'{}';
		
		var success = conf.success?conf.success:function(res) {
			alert(res);
		}
		
		var error = conf.error?conf.error:function(res){
			alert(res);
		}
		
		xhr.onreadystatechange = function() {
			if(xhr.readyState==4) {
				if(xhr.status=="200") {
					success(xhr.responseText);
				}else {
					error(xhr.responseText);
				}
			}
			
		}
		xhr.open(method,url);
		if(method!='GET') {
			xhr.setRequestHeader('Content-type','application/json;charset=utf-8');
		}
		this.send = function() {
			xhr.send(param);
		}
	}
	
	window.addEventListener('load',function() {
		var conf = {
						url : '/userInfo',
						success : function(res) {
							res = JSON.parse(res);
							var html = '';
							for(var ui of res) {
								html += '<tr>';
								html += '<td>' + ui.uiNum + '</td>';
								html += '<td><input type="text" id="uiName' + ui.uiNum +'" value="' + ui.uiName + '"></td>';
								html += '<td><input type="text" id="uiId' + ui.uiNum +'" value="' + ui.uiId + '"></td>';
								html += '<td><input type="text" id="uiPwd' + ui.uiNum +'" value="' + ui.uiPwd + '"></td>';
								html += '<td><input type="text" id="uiDesc' + ui.uiNum +'"  value="' + ui.uiDesc + '"></td>';
								html += '<td><button onclick="updateUserInfo(' + ui.uiNum +')">수정</button><button onclick="deleteUserInfo(' + ui.uiNum + ')">삭제</button></td>';
								html += '</tr>';
							}
							document.querySelector('#uiBody').insertAdjacentHTML('beforeend',html);
						}
		}
		var au = new AjaxUtil(conf);
		au.send();
	});
</script>
<body>
uiName : <input type="text" name="uiName">
<button>검색</button>
<table border="1">
	<thead>
		<tr>
			<th>uiNum</th>
			<th>uiName</th>
			<th>uiId</th>
			<th>uiPwd</th>
			<th>uiDesc</th>
			<th>수정/삭제</th>
		</tr>	
	</thead>
	<tbody id="uiBody">
	</tbody>	
</table>
<button onclick="addUserInfo()">레벨추가</button>
<script>
function addUserInfo() {
	
	var	html = '<tr>';
		html += '<td>&nbsp;</td>';
		html += '<td><input type="text" id="uiName" value=""></td>';
		html += '<td><input type="text" id="uiId" value=""></td>';
		html += '<td><input type="text" id="uiPwd" value=""></td>';
		html += '<td><input type="text" id="uiDesc" value=""></td>';
		html += '<td><button onclick="saveUserInfo()">저장</button></td>';
		html += '</tr>';
		document.querySelector('#uiBody').insertAdjacentHTML('beforeend',html);
	}
	
function saveUserInfo() {
	var uiName = document.querySelector("#uiName").value;
	var uiId = document.querySelector("#uiId").value;
	var uiPwd = document.querySelector("#uiPwd").value;
	var uiDesc = document.querySelector("#uiDesc").value;
	var params = {uiName:uiName, uiId:uiId, uiPwd:uiPwd, uiDesc:uiDesc};
	params = JSON.stringify(params);
	
	
	var conf = {
					url : '/userInfo/',
					method : 'POST',
					param : params,
					success : function(res) {
						if(res=='1') {
							alert('저장완료');
							initList();
						}
					
					}
	}
	var au = new AjaxUtil(conf);
	au.send();
	
}


function updateUserInfo(uiNum) {
	var uiName = document.querySelector('#uiName' + uiNum).value;
	var uiId = document.querySelector('#uiId' + uiNum).value;
	var uiPwd = document.querySelector('#uiPwd' + uiNum).value;
	var uiDesc = document.querySelector('#uiDesc' + uiNum).value;
	var params = {uiName:uiName, uiId:uiId, uiPwd:uiPwd, uiDesc:uiDesc};
	params = JSON.stringify(params);
	
	
	var conf = {
					url : '/userInfo/' + uiNum,
					method : 'PUT',
					param : params,
					success : function(res) {
						alert(res);
					
					}
	}
	var au = new AjaxUtil(conf);
	au.send();
	
}

function deleteUserInfo(uiNum) {
	var conf = {
			url : '/userInfo/' + uiNum,
			method : 'DELETE',
			success : function(res) {
				if(res=='1') {
					alert('삭제완료');
					location.href='/url/userInfo:list';
				}
			}
	}
	var au = new AjaxUtil(conf);
	au.send();
}


</script>
</body>
</html>	