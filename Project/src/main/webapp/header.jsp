<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="shortcut icon" href="img/fav.png">

<meta name="author" content="CodePixar">

<meta name="description" content>

<meta name="keywords" content>

<meta charset="UTF-8">

<title>Karma Shop</title>

<link rel="stylesheet" href="css/linearicons.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/themify-icons.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="css/nice-select.css">
<link rel="stylesheet" href="css/nouislider.min.css">
<link rel="stylesheet" href="css/ion.rangeSlider.css" />
<link rel="stylesheet" href="css/ion.rangeSlider.skinFlat.css" />
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/main.css">
</head>
<body>
	<header class="header_area sticky-header">
		<div class="main_menu">
			<nav class="navbar navbar-expand-lg navbar-light main_box">
				<div class="container">

					<a class="navbar-brand logo_h" href="index-2.html"><img
						src="img/logo.png" alt></a>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>

					<div class="collapse navbar-collapse offset"
						id="navbarSupportedContent">
						<ul class="nav navbar-nav menu_nav ml-auto">
							<li class="nav-item active"><a class="nav-link"
								href="index.jsp">Home</a></li>
					
							<li class="nav-item submenu dropdown"><a href="#"
								class="nav-link dropdown-toggle" data-toggle="dropdown"
								role="button" aria-haspopup="true" aria-expanded="false">Registration</a>
								<ul class="dropdown-menu">
									<li class="nav-item"><a class="nav-link" href="seller-registration.jsp">As Seller</a></li>
									<li class="nav-item"><a class="nav-link"
										href="customer-registration.jsp">As Customer</a></li>
								</ul></li>
										<li class="nav-item submenu dropdown"><a href="#"
								class="nav-link dropdown-toggle" data-toggle="dropdown"
								role="button" aria-haspopup="true" aria-expanded="false">Login</a>
								<ul class="dropdown-menu">
									<li class="nav-item"><a class="nav-link" href="seller-login.jsp">As Seller</a></li>
									<li class="nav-item"><a class="nav-link"
										href="customer-login.jsp">As Customer</a></li>
									<li class="nav-item"><a class="nav-link"
										href="admin-login.jsp">As Admin</a></li>
								</ul></li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li class="nav-item"><a href="#" class="cart"><span
									class="ti-bag"></span></a></li>
							<li class="nav-item">
								<button class="search">
									<span class="lnr lnr-magnifier" id="search"></span>
								</button>
							</li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
		<div class="search_input" id="search_input_box">
			<div class="container">
				<form class="d-flex justify-content-between">
					<input type="text" class="form-control" id="search_input"
						placeholder="Search Here">
					<button type="submit" class="btn"></button>
					<span class="lnr lnr-cross" id="close_search" title="Close Search"></span>
				</form>
			</div>
		</div>
	</header>
	
	
	
	
	<script src="js/vendor/jquery-2.2.4.min.js"></script>
	<script
		src="../../../cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
		integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
		crossorigin="anonymous"></script>
	<script src="js/vendor/bootstrap.min.js"></script>
	<script src="js/jquery.ajaxchimp.min.js"></script>
	<script src="js/jquery.nice-select.min.js"></script>
	<script src="js/jquery.sticky.js"></script>
	<script src="js/nouislider.min.js"></script>
	<script src="js/countdown.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>

	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCjCGmQ0Uq4exrzdcL6rvxywDDOvfAu6eE"></script>
	<script src="js/gmaps.min.js"></script>
	<script src="js/main.js"></script>

	<script async
		src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
	<script>
		window.dataLayer = window.dataLayer || [];
		function gtag() {
			dataLayer.push(arguments);
		}
		gtag('js', new Date());

		gtag('config', 'UA-23581568-13');
	</script>
	<script defer
		src="https://static.cloudflareinsights.com/beacon.min.js/vef91dfe02fce4ee0ad053f6de4f175db1715022073587"
		integrity="sha512-sDIX0kl85v1Cl5tu4WGLZCpH/dV9OHbA4YlKCuCiMmOQIk4buzoYDZSFj+TvC71mOBLh8CDC/REgE0GX0xcbjA=="
		data-cf-beacon='{"rayId":"8884ef83fbd53b16","b":1,"version":"2024.4.1","token":"cd0b4b3a733644fc843ef0b185f98241"}'
		crossorigin="anonymous"></script>
</body>
</html>