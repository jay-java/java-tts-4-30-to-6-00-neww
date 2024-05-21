<%@page import="dao.UserDao"%>
<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<%
	User u = null;
	if (session.getAttribute("data") != null) {
		u = (User) session.getAttribute("data");
	} else {
		response.sendRedirect("login.jsp");
	}
	%>
	<%-- <h1>ID : <%=u.getId() %></h1>
<h1>name : <%=u.getName() %></h1>
<h1>Contact: <%=u.getContact() %></h1>
<h1>Address : <%=u.getAddress() %></h1>
<h1>Email : <%=u.getEmail() %></h1>
<h1>Password : <%=u.getPassword() %></h1> --%>

	<h1>
		Welcome :
		<%=u.getName()%></h1>

	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Contact</th>
					<th>Address</th>
					<th>Email</th>
					<th>Password</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
			<%List<User> list = UserDao.getAllUser(); %>
			<%for(User u1 :list){ %>
				<tr>
					<td><%=u1.getId() %></td>
					<td><%=u1.getName() %></td>
					<td><%=u1.getContact() %></td>
					<td><%=u1.getAddress() %></td>
					<td><%=u1.getEmail() %></td>
					<td><%=u1.getPassword() %></td>
					<td>
						<form action="UserController" method="post">
						<input type="hidden" name="id" value="<%=u1.getId()%>">
							<input type="submit" name="action" value="edit">
						</form>
					</td>
						<td>
						<form>
							<input type="submit" name="action" value="delete">
						</form>
					</td>
				</tr>
				<%} %>
			</tbody>
		</table>
	</div>

</body>
</html>