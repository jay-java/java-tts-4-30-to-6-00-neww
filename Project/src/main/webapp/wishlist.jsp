<%@page import="dao.ProductDao"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file ="customer-header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<section class="owl-carousel active-product-area section_gap">

		<div class="single-product-slider">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1>Latest Products</h1>
						</div>
					</div>
				</div>
				<div class="row">
				<%List<WishList> list = WishListDao.getWishListByCusId(c.getId()); %>
				<%for(WishList w : list){ %>
				<%Product p = ProductDao.getProductByPid(w.getPid()); %>
					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="image/<%=p.getImage() %>" height="150">
							<div class="product-details">
								<h6><%=p.getPname() %></h6>
								<div class="price">
									<h6>Rs. <%=p.getPprice() %></h6>
								</div>
								<div class="prd-bottom">
									
									<a href="WishListController?action=remove&wid=<%=w.getWid()%>">
										<p class="hover-text">Remove</p>
									</a> 
								</div>
							</div>
						</div>
					</div>
				<%} %>
				

				</div>
			</div>
		</div>

		<div class="single-product-slider">
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-6 text-center">
						<div class="section-title">
							<h1>Coming Products</h1>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua.</p>
						</div>
					</div>
				</div>
				<div class="row">

					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="img/product/p6.jpg" alt>
							<div class="product-details">
								<h6>addidas New Hammer sole for Sports person</h6>
								<div class="price">
									<h6>$150.00</h6>
									<h6 class="l-through">$210.00</h6>
								</div>
								<div class="prd-bottom">
									<a href class="social-info"> <span class="ti-bag"></span>
										<p class="hover-text">add to bag</p>
									</a> <a href class="social-info"> <span class="lnr lnr-heart"></span>
										<p class="hover-text">Wishlist</p>
									</a> <a href class="social-info"> <span class="lnr lnr-sync"></span>
										<p class="hover-text">compare</p>
									</a> <a href class="social-info"> <span class="lnr lnr-move"></span>
										<p class="hover-text">view more</p>
									</a>
								</div>
							</div>
						</div>
					</div>

					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="img/product/p8.jpg" alt>
							<div class="product-details">
								<h6>addidas New Hammer sole for Sports person</h6>
								<div class="price">
									<h6>$150.00</h6>
									<h6 class="l-through">$210.00</h6>
								</div>
								<div class="prd-bottom">
									<a href class="social-info"> <span class="ti-bag"></span>
										<p class="hover-text">add to bag</p>
									</a> <a href class="social-info"> <span class="lnr lnr-heart"></span>
										<p class="hover-text">Wishlist</p>
									</a> <a href class="social-info"> <span class="lnr lnr-sync"></span>
										<p class="hover-text">compare</p>
									</a> <a href class="social-info"> <span class="lnr lnr-move"></span>
										<p class="hover-text">view more</p>
									</a>
								</div>
							</div>
						</div>
					</div>

					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="img/product/p3.jpg" alt>
							<div class="product-details">
								<h6>addidas New Hammer sole for Sports person</h6>
								<div class="price">
									<h6>$150.00</h6>
									<h6 class="l-through">$210.00</h6>
								</div>
								<div class="prd-bottom">
									<a href class="social-info"> <span class="ti-bag"></span>
										<p class="hover-text">add to bag</p>
									</a> <a href class="social-info"> <span class="lnr lnr-heart"></span>
										<p class="hover-text">Wishlist</p>
									</a> <a href class="social-info"> <span class="lnr lnr-sync"></span>
										<p class="hover-text">compare</p>
									</a> <a href class="social-info"> <span class="lnr lnr-move"></span>
										<p class="hover-text">view more</p>
									</a>
								</div>
							</div>
						</div>
					</div>

					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="img/product/p5.jpg" alt>
							<div class="product-details">
								<h6>addidas New Hammer sole for Sports person</h6>
								<div class="price">
									<h6>$150.00</h6>
									<h6 class="l-through">$210.00</h6>
								</div>
								<div class="prd-bottom">
									<a href class="social-info"> <span class="ti-bag"></span>
										<p class="hover-text">add to bag</p>
									</a> <a href class="social-info"> <span class="lnr lnr-heart"></span>
										<p class="hover-text">Wishlist</p>
									</a> <a href class="social-info"> <span class="lnr lnr-sync"></span>
										<p class="hover-text">compare</p>
									</a> <a href class="social-info"> <span class="lnr lnr-move"></span>
										<p class="hover-text">view more</p>
									</a>
								</div>
							</div>
						</div>
					</div>

					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="img/product/p1.jpg" alt>
							<div class="product-details">
								<h6>addidas New Hammer sole for Sports person</h6>
								<div class="price">
									<h6>$150.00</h6>
									<h6 class="l-through">$210.00</h6>
								</div>
								<div class="prd-bottom">
									<a href class="social-info"> <span class="ti-bag"></span>
										<p class="hover-text">add to bag</p>
									</a> <a href class="social-info"> <span class="lnr lnr-heart"></span>
										<p class="hover-text">Wishlist</p>
									</a> <a href class="social-info"> <span class="lnr lnr-sync"></span>
										<p class="hover-text">compare</p>
									</a> <a href class="social-info"> <span class="lnr lnr-move"></span>
										<p class="hover-text">view more</p>
									</a>
								</div>
							</div>
						</div>
					</div>

					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="img/product/p4.jpg" alt>
							<div class="product-details">
								<h6>addidas New Hammer sole for Sports person</h6>
								<div class="price">
									<h6>$150.00</h6>
									<h6 class="l-through">$210.00</h6>
								</div>
								<div class="prd-bottom">
									<a href class="social-info"> <span class="ti-bag"></span>
										<p class="hover-text">add to bag</p>
									</a> <a href class="social-info"> <span class="lnr lnr-heart"></span>
										<p class="hover-text">Wishlist</p>
									</a> <a href class="social-info"> <span class="lnr lnr-sync"></span>
										<p class="hover-text">compare</p>
									</a> <a href class="social-info"> <span class="lnr lnr-move"></span>
										<p class="hover-text">view more</p>
									</a>
								</div>
							</div>
						</div>
					</div>

					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="img/product/p1.jpg" alt>
							<div class="product-details">
								<h6>addidas New Hammer sole for Sports person</h6>
								<div class="price">
									<h6>$150.00</h6>
									<h6 class="l-through">$210.00</h6>
								</div>
								<div class="prd-bottom">
									<a href class="social-info"> <span class="ti-bag"></span>
										<p class="hover-text">add to bag</p>
									</a> <a href class="social-info"> <span class="lnr lnr-heart"></span>
										<p class="hover-text">Wishlist</p>
									</a> <a href class="social-info"> <span class="lnr lnr-sync"></span>
										<p class="hover-text">compare</p>
									</a> <a href class="social-info"> <span class="lnr lnr-move"></span>
										<p class="hover-text">view more</p>
									</a>
								</div>
							</div>
						</div>
					</div>

					<div class="col-lg-3 col-md-6">
						<div class="single-product">
							<img class="img-fluid" src="img/product/p8.jpg" alt>
							<div class="product-details">
								<h6>addidas New Hammer sole for Sports person</h6>
								<div class="price">
									<h6>$150.00</h6>
									<h6 class="l-through">$210.00</h6>
								</div>
								<div class="prd-bottom">
									<a href class="social-info"> <span class="ti-bag"></span>
										<p class="hover-text">add to bag</p>
									</a> <a href class="social-info"> <span class="lnr lnr-heart"></span>
										<p class="hover-text">Wishlist</p>
									</a> <a href class="social-info"> <span class="lnr lnr-sync"></span>
										<p class="hover-text">compare</p>
									</a> <a href class="social-info"> <span class="lnr lnr-move"></span>
										<p class="hover-text">view more</p>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>