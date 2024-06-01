<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<section class="login_box_area section_gap">
		<div class="container">
			<div class="row">
				
				<div class="col-lg-6">
					<div class="login_form_inner">
						<h3>Seller Forgot Password</h3>
						<%
						String msg = (String)request.getAttribute("msg");
						%>
						<%if(msg!=null){ %>
							<h2><%out.print(msg); %></h2>
						<%} %>
						<form class="row login_form"
							action="SellerController"
							method="post" id="contactForm" novalidate="novalidate">
							<%String email = (String)request.getAttribute("email"); %>
							<input type="hidden" name="email" value="<%=email%>">
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="name" name="np"
									placeholder="New Password" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="name" name="cnp"
									placeholder="Confirm New Password" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<button type="submit" name="action" value="new pass" class="primary-btn">Get OTP</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
</html>