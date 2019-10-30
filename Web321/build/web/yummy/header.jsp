<%-- 
    Document   : header
    Created on : Oct 28, 2019, 1:55:56 PM
    Author     : lpxed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title -->
        <title>Yummy Blog - Food Blog Template</title>

        <!-- Favicon -->
        <!--<link rel="icon" href="img/core-img/favicon.ico">-->
        <link rel="icon" href="${pageContext.request.contextPath}/media/LOGO.png">

        <!-- Core Stylesheet -->
        <link href="${pageContext.request.contextPath}/yummy/style.css" rel="stylesheet">

        <!-- Responsive CSS -->
        <link href="${pageContext.request.contextPath}/yummy/css/responsive/responsive.css" rel="stylesheet">
        
    </head>
    <body>
        <!-- ****** Top Header Area Start ****** -->
        <div class="top_header_area">
            <div class="container">
                <div class="row">
                    <div class="col-5 col-sm-6">
                        <!--  Top Social bar start -->
                        <div class="top_social_bar">
                            <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-linkedin" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-skype" aria-hidden="true"></i></a>
                            <a href="#"><i class="fa fa-dribbble" aria-hidden="true"></i></a>
                        </div>
                    </div>
                    <!--  Login Register Area   -->
                    <div class="col-7 col-sm-6">
                        <div class="signup-search-area d-flex align-items-center justify-content-end">
                            <div class="login_register_area d-flex">
                                <div class="login">
                                    <a href="${pageContext.request.contextPath}/login/login.jsp">Sing in</a>
                                </div>
                                <div class="register">
                                    <a href="register.html">Sing up</a>
                                </div>
                            </div>
                            <!-- Search Button Area -->
                            <!--                            <div class="search_button">
                                                            <a class="searchBtn" href="#"><i class="fa fa-search" aria-hidden="true"></i></a>
                                                        </div>-->
                            <!-- Search Form -->
                            <!--                            <div class="search-hidden-form">
                                                            <form action="#" method="get">
                                                                <input type="search" name="search" id="search-anything" placeholder="Search Anything...">
                                                                <input type="submit" value="" class="d-none">
                                                                <span class="searchBtn"><i class="fa fa-times" aria-hidden="true"></i></span>
                                                            </form>
                                                        </div>-->
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <!-- ****** Top Header Area End ****** -->
        <!-- ****** Header Area Start ****** -->
        <header class="header_area">
            <div class="container">
                <div class="row">
                    <!-- Logo Area Start -->
                    <div class="col-12">
                        <div class="logo_area text-center">
                            <a href="${pageContext.request.contextPath}/home" class="yummy-logo">Yummy Blog</a>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-12">
                        <nav class="navbar navbar-expand-lg">
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#yummyfood-nav" aria-controls="yummyfood-nav" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars" aria-hidden="true"></i> Menu</button>
                            <!-- Menu Area Start -->
                            <div class="collapse navbar-collapse justify-content-center" id="yummyfood-nav">
                                <ul class="navbar-nav" id="yummy-nav">
                                    <li class="nav-item active">
                                        <a class="nav-link" href="${pageContext.request.contextPath}/home">Home <span class="sr-only">(current)</span></a>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Pages</a>
                                        <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                                            <a class="dropdown-item" href="${pageContext.request.contextPath}/home">Home</a>
                                            <a class="dropdown-item" href="${pageContext.request.contextPath}/archive">Archive</a>
                                            <a class="dropdown-item" href="${pageContext.request.contextPath}/newPost">Create new Post</a>
                                            <a class="dropdown-item" href="static.html">Static Page</a>
                                            <a class="dropdown-item" href="contact.html">Contact</a>
                                        </div>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">Features</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">Categories</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="${pageContext.request.contextPath}/archive">Archive</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="#">About</a>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="contact.html">Contact</a>
                                    </li>
                                </ul>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <!-- ****** Header Area End ****** -->


    </body>
</html>
