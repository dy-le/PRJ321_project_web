<%-- 
    Document   : archive
    Created on : Oct 29, 2019, 8:40:16 PM
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
                                <li class="breadcrumb-item"><a href="#"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Archive Page</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
        <!-- ****** Breadcumb Area End ****** -->

        <!-- ****** Archive Area Start ****** -->
        <section class="archive-area section_padding_80">
            <div class="container">
                <div class="row">
                    <c:forEach var="post" items="${listpost}">
                        <!-- Single Post -->
                        <div class="col-12 col-md-6 col-lg-4">
                            <div class="single-post wow fadeInUp" data-wow-delay="0.1s">
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
                                                <a href="#">By ${post.acc}</a>
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
                                                <a href="#"><i class="fa fa-heart-o" aria-hidden="true"></i> 10</a>
                                            </div>
                                            <!-- Post Comments -->
                                            <div class="post-comments">
                                                <a href="#"><i class="fa fa-comment-o" aria-hidden="true"></i> 12</a>
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
                    
                    <div class="col-12">
                        <div class="pagination-area d-sm-flex mt-15">
                            <nav aria-label="#">
                                <ul class="pagination">
                                    <li class="page-item active">
                                        <a class="page-link" href="#">1 <span class="sr-only">(current)</span></a>
                                    </li>
                                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                                    <li class="page-item">
                                        <a class="page-link" href="#">Next <i class="fa fa-angle-double-right" aria-hidden="true"></i></a>
                                    </li>
                                </ul>
                            </nav>
                            <div class="page-status">
                                <p>Page 1 of 60 results</p>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </section>
        <!-- ****** Archive Area End ****** -->

        <!-- ****** Instagram Area Start ****** -->
        <div class="instargram_area owl-carousel section_padding_100_0 clearfix" id="portfolio">

            <!-- Instagram Item -->
            <div class="instagram_gallery_item">
                <!-- Instagram Thumb -->
                <img src="img/instagram-img/1.jpg" alt="">
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
                <img src="img/instagram-img/2.jpg" alt="">
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
                <img src="img/instagram-img/3.jpg" alt="">
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
                <img src="img/instagram-img/4.jpg" alt="">
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
                <img src="img/instagram-img/5.jpg" alt="">
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
                <img src="img/instagram-img/6.jpg" alt="">
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
                <img src="img/instagram-img/1.jpg" alt="">
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
                <img src="img/instagram-img/2.jpg" alt="">
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
