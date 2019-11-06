<%-- 
    Document   : status
    Created on : Oct 28, 2019, 1:29:00 PM
    Author     : lpxed
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link rel="icon" href="${pageContext.request.contextPath}/yummy/img/core-img/favicon.ico">

        <!-- Core Stylesheet -->
        <link href="${pageContext.request.contextPath}/yummy/style.css" rel="stylesheet">

        <!-- Responsive CSS -->
        <link href="${pageContext.request.contextPath}/yummy/css/responsive/responsive.css" rel="stylesheet">

    </head>
    <body>
        <!-- ****** Blog Sidebar ****** -->
        <div class="col-12 col-sm-8 col-md-6 col-lg-4">

            <div class="blog-sidebar mt-5 mt-lg-0">
                <!-- Single Widget Area -->
                <c:if test="${not empty sessionScope.login}">
                    <form action="home">
                        <div class="single-widget-area about-me-widget text-center">
                            <div class="widget-title">
                                <h6>About Me</h6>
                            </div>
                            <div class="about-me-widget-thumb">
                                <img src="${pageContext.request.contextPath}/media/img/${sessionScope.login.userID}.jpg" alt="">
                            </div>
                            <a href="profile"><h4 class="font-shadow-into-light">${sessionScope.login.name}</h4></a>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt</p>
                        </div>
                    </form>
                </c:if>
                <!-- Single Widget Area -->
                <div class="single-widget-area subscribe_widget text-center">
                    <div class="widget-title">
                        <h6>Subscribe &amp; Follow</h6>
                    </div>
                    <div class="subscribe-link">
                        <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                        <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                        <a href="#"><i class="fa fa-google" aria-hidden="true"></i></a>
                        <a href="#"><i class="fa fa-linkedin-square" aria-hidden="true"></i></a>
                        <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                        <a href="#"><i class="fa fa-vimeo" aria-hidden="true"></i></a>
                    </div>
                </div>

                <!-- Single Widget Area -->
                <div class="single-widget-area popular-post-widget">
                    <div class="widget-title text-center">
                        <h6>Populer Post</h6>
                    </div>
                    <!-- Single Popular Post -->
                    <c:forEach var="i" begin="1" end="5">
                        <div class="single-populer-post d-flex">
                            <img src="${pageContext.request.contextPath}/yummy/img/sidebar-img/1.jpg" alt="">
                            <div class="post-content">
                                <a href="#">
                                    <h6>Top Wineries To Visit In England</h6>
                                </a>
                                <p>Tuesday, October 3, 2017</p>
                            </div>
                        </div>
                    </c:forEach>
                </div>

                <!-- Single Widget Area -->
                <div class="single-widget-area add-widget text-center">
                    <div class="add-widget-area">
                        <img src="${pageContext.request.contextPath}/yummy/img/sidebar-img/6.jpg" alt="">
                        <div class="add-text">
                            <div class="yummy-table">
                                <div class="yummy-table-cell">
                                    <h2>Cooking Book</h2>
                                    <p>Buy Book Online Now!</p>
                                    <a href="#" class="add-btn">Buy Now</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Single Widget Area -->
                <div class="single-widget-area newsletter-widget">
                    <div class="widget-title text-center">
                        <h6>Newsletter</h6>
                    </div>
                    <p>Subscribe our newsletter gor get notification about new updates, information discount, etc.</p>
                    <div class="newsletter-form">
                        <form action="#" method="post">
                            <input type="email" name="newsletter-email" id="email" placeholder="Your email">
                            <button type="submit"><i class="fa fa-paper-plane-o" aria-hidden="true"></i></button>
                        </form>
                    </div>
                </div>
            </div>

        </div>
    </body>
</html>
