<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="seller-header.jsp"%>
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
						<h3>Seller Profile</h3>

						<form class="row login_form" action="SellerController"
							method="post" id="contactForm" novalidate="novalidate">
														<div class="col-md-12 form-group">
								<input type="hidden" class="form-control" id="name" name="id"
									value="<%=s1.getId()%>">
							</div>
							
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="name"
									value="<%=s1.getName()%>">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="contact"
									value="<%=s1.getContact()%>">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="address"
									value="<%=s1.getAddress()%>">
							</div>
							<div class="col-md-12 form-group">
								<input type="email" class="form-control" id="name" name="email"
									value="<%=s1.getEmail()%>">
							</div>
							<div class="col-md-12 form-group">
								<button type="submit" name="action" value="update"
									class="primary-btn">update</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>