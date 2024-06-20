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

	<section class="banner-area organic-breadcrumb">
		<div class="container">
			<div
				class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
				<div class="col-first">
					<h1>Shopping Cart</h1>
					<nav class="d-flex align-items-center">
						<a href="index-2.html">Home<span class="lnr lnr-arrow-right"></span></a>
						<a href="category.html">Cart</a>
					</nav>
				</div>
			</div>
		</div>
	</section>


	<section class="cart_area">
		<div class="container">
			<div class="cart_inner">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">Product</th>
								<th scope="col">Price</th>
								<th scope="col">Quantity</th>
								<th scope="col">Total</th>
								<th scope="col">Remove</th>
							</tr>
						</thead>
						<tbody>
							<%
							int net_price = 0;
							%>
							<%
							List<Cart> cLIst = CartDao.getCartListByCusId(c.getId());
							%>
							<%
							for (Cart cart : cLIst) {
							%>
							<%
							Product p = ProductDao.getProductByPid(cart.getPid());
							%>
							<%
							net_price = net_price + cart.getTotal_price();
							%>
							<tr>
								<td>
									<div class="media">
										<div class="d-flex">
											<img src="image/<%=p.getImage()%>" height="100" width="100">
										</div>
										<div class="media-body">
											<p><%=p.getPname()%></p>
										</div>
									</div>
								</td>
								<td>
									<h5><%=p.getPprice()%></h5>
								</td>
								<td>
									<div class="product_count">
										<form action="CartController" method="post">
											<input type="hidden" name="cart_id"
												value="<%=cart.getCart_id()%>"> <input type="hidden"
												name="pid" value="<%=cart.getPid()%>"> <input
												type="hidden" name="pprice" value="<%=cart.getPprice()%>">
											<input type="number" name="qty" value="<%=cart.getQty()%>"
												onchange="this.form.submit();">
										</form>
									</div>
								</td>
								<td>
									<h5><%=cart.getTotal_price()%></h5>
								</td>
							</tr>
							<%
							}
							%>

							<tr>
								<td></td>
								<td></td>
								<td>
									<h5>Subtotal</h5>
								</td>
								<td>
									<h5>
										Rs.
										<%=net_price%></h5>
								</td>
							</tr>

							<tr class="shipping_area">
								<td></td>
								<td></td>
								<td>
									<h5>Shipping</h5>
								</td>
								<td>
									<div class="shipping_box">
										<ul class="list">
											<li><a href="#">Flat Rate: $5.00</a></li>
											<li><a href="#">Free Shipping</a></li>
											<li><a href="#">Flat Rate: $10.00</a></li>
											<li class="active"><a href="#">Local Delivery: $2.00</a></li>
										</ul>
										<h6>
											Calculate Shipping <i class="fa fa-caret-down"
												aria-hidden="true"></i>
										</h6>
										<select class="shipping_select">
											<option value="1">Bangladesh</option>
											<option value="2">India</option>
											<option value="4">Pakistan</option>
										</select> <select class="shipping_select">
											<option value="1">Select a State</option>
											<option value="2">Select a State</option>
											<option value="4">Select a State</option>
										</select> <input type="text" placeholder="Postcode/Zipcode"> <a
											class="gray_btn" href="#">Update Details</a>
									</div>
								</td>
							</tr>
							<tr class="out_button_area">
								<td></td>
								<td></td>
								<td></td>
								<td>
									<div class="checkout_btn_inner d-flex align-items-center">
										<a class="gray_btn" href="#">Continue Shopping</a> <a
											class="primary-btn" href="#">Proceed to checkout</a>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
					<%
					Cart c1 = CartDao.getCartByCusId(c.getId());
					%>
					<%
					out.print(c1);
					%>
					<form method="post"
						action="payment.jsp?amount=<%=net_price%>&cid=<%=c1.getCart_id()%>">
						<table border="1">
							<tbody>
								<tr>
									<th>S.No</th>
									<th>Label</th>
									<th>Value</th>
								</tr>

								<tr>
									<td>1</td>
									<td><label>txnAmount*</label></td>
									<td><input title="TXN_AMOUNT" tabindex="10" type="text"
										name="TXN_AMOUNT" value="<%=net_price%>"></td>
								</tr>
								<tr>
									<td></td>
									<td></td>
									<td><input value="CheckOut" type="submit" onclick=""></td>
								</tr>
							</tbody>
						</table>
						* - Mandatory Fields
					</form>
				</div>
			</div>
		</div>
	</section>

</body>
</html>