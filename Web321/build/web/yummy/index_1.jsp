<%-- 
    Document   : index.jsp
    Created on : Oct 27, 2019, 8:56:51 PM
    Author     : lpxed
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
        <!--Preloader Start--> 
        <!--        <div id="preloader">
                    <div class="yummy-load"></div>
                </div>-->

        <jsp:include page="header.jsp"/>
        <!-- ****** Welcome Post Area Start ****** -->
        <div class="welcome-post-sliders owl-carousel">
            <!-- Single Slide -->
            <c:forEach var="x" items="${listpost}">
                <div class="welcome-single-slide">
                    <!-- Post Thumb -->
                    <img src="${pageContext.request.contextPath}/yummy/img/bg-img/${x.id}.jpg" alt="">
                    <!-- Overlay Text -->
                    <div class="project_title">
                        <div class="post-date-commnents d-flex">
                            <a href="#">${x.date}</a>
                            <a href="#">${x.countcmt} comment</a>
                        </div>
                        <a href="${pageContext.request.contextPath}/post?idPost=${x.id}">
                            <h5>${x.header}</h5>
                        </a>
                    </div>
                </div>
            </c:forEach>
        </div>
        <!-- ****** Welcome Area End ****** -->
        <!-- ****** Categories Area Start ****** -->
        <section class="categories_area clearfix" id="about">
            <div class="container">
                <h2>type</h2>
                <div class="row">
                    <div class="col-12 col-md-4 col-lg-2">
                        <div class="single_catagory">
                            <img src="${pageContext.request.contextPath}/yummy/img/catagory-img/1.jpg" alt="">
                            <div class="catagory-title">
                                <a href="${pageContext.request.contextPath}/singletype?type=1">
                                    <h5>News</h5>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-4 col-lg-2">
                        <div class="single_catagory">
                            <img src="${pageContext.request.contextPath}/yummy/img/catagory-img/2.jpg" alt="">
                            <div class="catagory-title">
                                <a href="${pageContext.request.contextPath}/singletype?type=2">
                                    <h5>Fashion</h5>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-4 col-lg-2">
                        <div class="single_catagory">
                            <img src="${pageContext.request.contextPath}/yummy/img/catagory-img/3.jpg" alt="">
                            <div class="catagory-title">
                                <a href="${pageContext.request.contextPath}/singletype?type=3">
                                    <h5>Foods</h5>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-4 col-lg-2">
                        <div class="single_catagory">
                            <img src="${pageContext.request.contextPath}/yummy/img/catagory-img/1.jpg" alt="">
                            <div class="catagory-title">
                                <a href="${pageContext.request.contextPath}/singletype?type=4">
                                    <h5>Sport</h5>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-4 col-lg-2">
                        <div class="single_catagory">
                            <img src="${pageContext.request.contextPath}/yummy/img/catagory-img/2.jpg" alt="">
                            <div class="catagory-title">
                                <a href="${pageContext.request.contextPath}/singletype?type=5">
                                    <h5>Others</h5>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- ****** Categories Area End ****** -->

        <!-- ****** Blog Area Start ****** -->
        <div class="blog_area section_padding_0_80">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-12 col-lg-8">
                        <div class="row">
                            <c:set var="first" value="${listpost[0]}"/>
                            <!-- Single Post -->
                            <div class="col-12">
                                <div class="single-post">
                                    <!-- Post Thumb -->
                                    <div class="post-thumb">
                                        <img src="${pageContext.request.contextPath}/yummy/img/blog-img/${first.img}" alt="">
                                    </div>
                                    <!-- Post Content -->
                                    <div class="post-content">
                                        <div class="post-meta d-flex">
                                            <div class="post-author-date-area d-flex">
                                                <!-- Post Author -->
                                                <div class="post-author">
                                                    <a href="${pageContext.request.contextPath}/postbyauthor?author=${first.acc}">By ${first.acc}</a>
                                                </div>
                                                <!-- Post Date -->
                                                <div class="post-date">
                                                    <a href="#">${first.date}</a>
                                                </div>
                                            </div>
                                            <!-- Post Comment & Share Area -->
                                            <div class="post-comment-share-area d-flex">
                                                <!-- Post Favourite -->
                                                <div class="post-favourite">
                                                    <a href="#"><i class="fa fa-heart-o" aria-hidden="true"></i> ${first.countlike}</a>
                                                </div>
                                                <!-- Post Comments -->
                                                <div class="post-comments">
                                                    <a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i> ${first.countcmt}</a>
                                                </div>
                                                <!-- Post Share -->
                                                <div class="post-share">
                                                    <a href="#"><i class="fa fa-share-alt" aria-hidden="true"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <a href="${pageContext.request.contextPath}/post?idPost=${first.id}">
                                            <h2 class="post-headline">${first.header}</h2>
                                        </a>
                                        <p>${fn:substring(first.body,0,150)}...</p>
                                        <a href="${pageContext.request.contextPath}/post?idPost=${first.id}" class="read-more">Continue Reading..</a>
                                    </div>
                                </div>
                            </div>
                            <c:forEach var="post" items="${listpost.subList(1, 5)}">
                                <!-- Single Post -->
                                <div class="col-12 col-md-6">
                                    <div class="single-post wow fadeInUp" data-wow-delay=".4s">
                                        <!-- Post Thumb -->
                                        <div class="post-thumb">
                                            <img src="${pageContext.request.contextPath}/yummy/img/blog-img/${post.img}" alt="">
                                        </div>
                                        <!-- Post Content -->
                                        <div class="post-content">
                                            <div class="post-meta d-flex">
                                                <div class="post-author-date-area d-flex">
                                                    <!-- Post Author -->
                                                    <div class="post-author">
                                                        <a href="${pageContext.request.contextPath}/postbyauthor?author=${post.acc}">By ${post.acc}</a>
                                                    </div>
                                                    <!-- Post Date -->
                                                    <div class="post-date">
                                                        <a href="#">${post.date}</a>
                                                    </div>
                                                </div>
                                                <!-- Post Comment & Share Area -->
                                                <div class="post-comment-share-area d-flex">
                                                    <!-- Post Favourite -->
                                                    <div class="post-favourite">
                                                        <a href="#"><i class="fa fa-heart-o" aria-hidden="true"></i> ${post.countlike}</a>
                                                    </div>
                                                    <!-- Post Comments -->
                                                    <div class="post-comments">
                                                        <a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i> ${post.countcmt}</a>
                                                    </div>
                                                    <!-- Post Share -->
                                                    <div class="post-share">
                                                        <a href="#"><i class="fa fa-share-alt" aria-hidden="true"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                            <a href="${pageContext.request.contextPath}/post?idPost=${post.id}">
                                                <h4 class="post-headline">${post.header}</h4>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>

                        </div>
                    </div>
                    <jsp:include page="status.jsp" flush="true">
                        <jsp:param name="populerPost" value="${populerPost}"/>
                    </jsp:include>
                </div>
            </div>
        </div>
        <!-- ****** Blog Area End ****** -->

        <!-- ****** Instagram Area Start ****** -->
        <div class="instargram_area owl-carousel section_padding_100_0 clearfix" id="portfolio">

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="${pageContext.request.contextPath}/yummy/img/instagram-img/1.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="${pageContext.request.contextPath}/yummy/img/instagram-img/2.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="${pageContext.request.contextPath}/yummy/img/instagram-img/3.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="${pageContext.request.contextPath}/yummy/img/instagram-img/4.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="${pageContext.request.contextPath}/yummy/img/instagram-img/5.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="${pageContext.request.contextPath}/yummy/img/instagram-img/6.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="${pageContext.request.contextPath}/yummy/img/instagram-img/1.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="${pageContext.request.contextPath}/yummy/img/instagram-img/7.jpg" alt="">
                <!-- Hover -->
                <div class="hover_overlay">
                    <div class="yummy-table">
                        <div class="yummy-table-cell">
                            <div class="follow-me text-center">
                                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i> Follow me</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <!-- ****** Our Creative Portfolio Area End ****** -->

        <jsp:include page="footer.html"/>

        <!--Jquery-2.2.4 js--> 
        <script src="${pageContext.request.contextPath}/yummy/js/jquery/jquery-2.2.4.min.js"></script>
        <!--Popper js--> 
        <script src="${pageContext.request.contextPath}/yummy/js/bootstrap/popper.min.js"></script>
        <!--Bootstrap-4 js--> 
        <script src="${pageContext.request.contextPath}/yummy/js/bootstrap/bootstrap.min.js"></script>
        <!--All Plugins JS--> 
        <script src="${pageContext.request.contextPath}/yummy/js/others/plugins.js"></script>
        <!--Active JS--> 
        <script src="${pageContext.request.contextPath}/yummy/js/active.js"></script>
    </body>
