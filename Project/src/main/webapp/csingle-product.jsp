<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="customer-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%int pid = Integer.parseInt(request.getParameter("pid")); %>
<%Product p  = ProductDao.getProductByPid(pid); %>
	<section class="banner-area organic-breadcrumb">
		<div class="container">
			<div
				class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
				<div class="col-first">
					<h1>Product Details Page</h1>
					<nav class="d-flex align-items-center">
						<a href="index-2.html">Home<span class="lnr lnr-arrow-right"></span></a>
						<a href="#">Shop<span class="lnr lnr-arrow-right"></span></a> <a
							href="single-product.html">product-details</a>
					</nav>
				</div>
			</div>
		</div>
	</section>


	<div class="product_image_area">
		<div class="container">
			<div class="row s_product_inner">
				<div class="col-lg-6">
					<div class="s_Product_carousel">
						<div class="single-prd-item">
							<img class="img-fluid" src="image/<%=p.getImage() %>" alt>
						</div>
						<div class="single-prd-item">
							<img class="img-fluid" src="image/<%=p.getImage() %>" alt>
						</div>
						<div class="single-prd-item">
							<img class="img-fluid" src="image/<%=p.getImage() %>" alt>
						</div>
					</div>
				</div>
				<div class="col-lg-5 offset-lg-1">
					<div class="s_product_text">
						<h3><%=p.getPname() %></h3>
						<h2><%=p.getPprice() %></h2>
						<ul class="list">
							<li><a class="active" href="#"><span>Category</span> :
									<%=p.getPcategory() %></a></li>
							<li><a href="#"><span>Availibility</span> : In Stock</a></li>
						</ul>
						<p><%=p.getPdescription() %></p>
					
						<div class="card_area d-flex align-items-center">
							<a class="primary-btn" href="CartController?action=addtocart&cusid=<%=c.getId()%>&pid=<%=p.getPid()%>">Add to Cart</a> <a
								class="icon_btn" href="#"><i class="lnr lnr lnr-diamond"></i></a>
							<a class="icon_btn" href="#"><i class="lnr lnr lnr-heart"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>