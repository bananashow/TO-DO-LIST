<%@page import="java.util.ArrayList"%>
<%@page import="todoList.DTO.todoListDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TO-DO LIST</title>
<link href="css/todoStyle.css" rel="stylesheet" />
</head>
<body>
	<div id="backgd">
		<div id="TodoBox">
		
		<div class="title">
			<h1>TO-DO LIST</h1>
		
			<form name="myForm" action="main_process.do" method="get">
				<input type="text" name="work" class="work" placeholder=" Add something to do">
				<span class="xBox"> <input type="button" value="+" class="add" id="add" onclick="addListCheck()"> </span>
			</form>
		</div>

		<%
			ArrayList<todoListDTO> list = (ArrayList<todoListDTO>) request.getAttribute("list");
			for (int i = 0; i < list.size(); i++) {
			int num = list.get(i).getNum();
		%>
		<div class="todo">
				<input type="checkbox" id="checkBox<%=i%>" onclick="checkClick(<%=i%>)">
				<input type="text" name="workCheck" id="workCheck<%=i%>" class="workCheck" value="<%=list.get(i).getWork()%>" onclick="textClick(<%=i%>)" readonly>
				<input type="button" value="삭제" id="deletebtn" onclick="location.href='delete.do?num=<%=num%>';"> <br />
		</div>
		<%
			}
		%>
		</div>
	</div>
	
	<script>
		function addListCheck() {
			if (myForm.work.value == "") {
				alert('★할 일을 입력하세요★');
				return false;
			}
			myForm.submit();
		}
	
	
		function checkClick(id){
			console.log(id);
			console.log(document.getElementById('workCheck'+id));
			
			if (document.getElementById('checkBox'+id).checked) {
				document.getElementById('workCheck'+id).style.textDecoration = "line-through";
			} else {
				document.getElementById('workCheck'+id).style.textDecoration = "none";
			}
		}
	</script>
</body>
</html>