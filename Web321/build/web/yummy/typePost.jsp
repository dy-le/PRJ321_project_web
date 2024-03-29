<%-- 
    Document   : archive
    Created on : Oct 29, 2019, 8:40:16 PM
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
        <link rel="icon" href="${pageContext.request.contextPath}/yummy/img/core-img/favicon.ico">

        <!-- Core Stylesheet -->
        <link href="${pageContext.request.contextPath}/yummy/style.css" rel="stylesheet">

        <!-- Responsive CSS -->
        <link href="${pageContext.request.contextPath}/yummy/css/responsive/responsive.css" rel="stylesheet">
    </head>
    <body>
        <!-- Preloader Start -->
        <div id="preloader">
            <div class="yummy-load"></div>
        </div>


        <jsp:include page="header.jsp"/>

        <!-- ****** Breadcumb Area Start ****** -->

        <div class="breadcumb-area" style="background-image: url(${pageContext.request.contextPath}/yummy/img/bg-img/breadcumb.jpg);">
            <div class="container h-100">
                <div class="row h-100 align-items-center">
                    <div class="col-12">
                        <div class="bradcumb-title text-center">
                            <h2>Archive Page</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="breadcumb-nav">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="home"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Archive Page</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
        <!-- ****** Breadcumb Area End ****** -->

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
                        <c:if test="${not empty listpost}">
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
                                                        <a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i> ${first.countcmt}</</a>
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
                                <c:forEach var="post" items="${listpost.subList(1, listpost.size())}">
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
                        </c:if>
                    </div>
                    <jsp:include page="status.jsp" flush="true">
                        <jsp:param name="account" value="Daemon Lee"/>
                        <jsp:param name="id" value="18"/>
                    </jsp:include>
                </div>
            </div>
        </div>
        <!-- ****** Blog Area End ****** -->


        <jsp:include page="footer.html"/>

        <!-- Jquery-2.2.4 js -->
        <script src="${pageContext.request.contextPath}/yummy/js/jquery/jquery-2.2.4.min.js"></script>
        <!-- Popper js -->
        <script src="${pageContext.request.contextPath}/yummy/js/bootstrap/popper.min.js"></script>
        <!-- Bootstrap-4 js -->
        <script src="${pageContext.request.contextPath}/yummy/js/bootstrap/bootstrap.min.js"></script>
        <!-- All Plugins JS -->
        <script src="${pageContext.request.contextPath}/yummy/js/others/plugins.js"></script>
        <!-- Active JS -->
        <script src="${pageContext.request.contextPath}/yummy/js/active.js"></script>
    </body>
</html>