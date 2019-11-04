<%-- 
    Document   : single
    Created on : Oct 28, 2019, 1:26:42 PM
    Author     : lpxed
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

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
        <!--        <div id="preloader">
                    <div class="yummy-load"></div>
                </div>-->


        <jsp:include page="header.jsp"/>

        <!-- ****** Breadcumb Area Start ****** -->
        <div class="breadcumb-area" style="background-image: url(${pageContext.request.contextPath}/yummy/img/bg-img/breadcumb.jpg);">
            <div class="container h-100">
                <div class="row h-100 align-items-center">
                    <div class="col-12">
                        <div class="bradcumb-title text-center">
                            <h2>Single Post Blog</h2>
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
                                <li class="breadcrumb-item"><a href="#">Archive</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Single Post Blog</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
        <!-- ****** Breadcumb Area End ****** -->

        <!-- ****** Single Blog Area Start ****** -->
        <section class="single_blog_area section_padding_80">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-12 col-lg-8">
                        <div class="row no-gutters">

                            <!-- Single Post Share Info -->
                            <div class="col-2 col-sm-1">
                                <div class="single-post-share-info mt-100">
                                    <a href="#" class="facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                                    <a href="#" class="twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                                    <a href="#" class="googleplus"><i class="fa fa-google-plus" aria-hidden="true"></i></a>
                                    <a href="#" class="instagram"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                                    <a href="#" class="pinterest"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
                                </div>
                            </div>

                            <!-- Single Post -->
                            <div class="col-10 col-sm-11">
                                <div class="single-post">
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
                                                    <a href="#">By  ${post.acc}</a>
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
                                                    <a onclick="focusMethod()" href="#"><i class="fa fa-comment-o" aria-hidden="true"></i> 12</a>
                                                    <script>
                                                        focusMethod = function getFocus() {
                                                            document.getElementById("message").focus();
//                                                            document.getElementById("myT")
                                                        }
                                                    </script>
                                                </div>
                                                <!-- Post Share -->
                                                <div class="post-share">
                                                    <a href="#"><i class="fa fa-share-alt" aria-hidden="true"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <a href="#">
                                            <h2 class="post-headline">${post.header}</h2>
                                        </a>
                                        ${post.body}
                                    </div>
                                </div>

                                <!-- Tags Area -->
                                <div class="tags-area">
                                    <a href="#">Multipurpose</a>
                                    <a href="#">Design</a>
                                    <a href="#">${post.type.content}</a>
                                </div>

                                <!-- Related Post Area -->
                                <div class="related-post-area section_padding_50">
                                    <h4 class="mb-30">Related post</h4> 

                                    <div class="related-post-slider owl-carousel">
                                        <c:forEach var="pt" items="${listpost}">
                                            <!-- Single Related Post-->
                                            <div class="single-post">
                                                <!-- Post Thumb -->
                                                <div class="post-thumb">
                                                    <img src="${pageContext.request.contextPath}/yummy/img/blog-img/${pt.img}" alt="${pt.img}">
                                                </div>
                                                <!-- Post Content -->
                                                <div class="post-content">
                                                    <div class="post-meta d-flex">
                                                        <div class="post-author-date-area d-flex">
                                                            <!-- Post Author -->
                                                            <div class="post-author">
                                                                <a href="#">By ${pt.acc}</a>
                                                            </div>
                                                            <!-- Post Date -->
                                                            <div class="post-date">
                                                                <a href="#">${pt.date}</a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <a href="${pageContext.request.contextPath}/post?idPost=${pt.id}">
                                                        <h6>${pt.header}</h6>
                                                    </a>
                                                </div>
                                            </div>
                                        </c:forEach>
                                    </div>
                                </div>

                                <!-- Comment Area Start -->
                                <div class="comment_area section_padding_50 clearfix" >
                                    <h4 class="mb-30">2 Comments</h4>

                                    <ol>
                                        <c:forEach var="x" items="${listComment}">
                                            <li class="single_comment_area">
                                                <div class="comment-wrapper d-flex">
                                                    <!-- Comment Meta -->
                                                    <div class="comment-author">
                                                        <img src="${pageContext.request.contextPath}/media/img/${x.userid}.jpg" alt="">
                                                    </div>
                                                    <!-- Comment Content -->
                                                    <div class="comment-content">
                                                        <span class="comment-date text-muted">${x.date}</span>
                                                        <h5>${x.name}</h5>
                                                        <p>${x.commentct}</p>
                                                        <a href="#">Like</a>
                                                        <a class="active" href="#">Reply</a>
                                                    </div>
                                                </div>
                                            </li>
                                        </c:forEach>
                                        <!-- Single Comment Area -->
                                        <li class="single_comment_area">
                                            <div class="comment-wrapper d-flex">
                                                <!-- Comment Meta -->
                                                <div class="comment-author">
                                                    <img src="${pageContext.request.contextPath}/yummy/img/blog-img/17.jpg" alt="">
                                                </div>
                                                <!-- Comment Content -->
                                                <div class="comment-content">
                                                    <span class="comment-date text-muted">27 Aug 2018</span>
                                                    <h5>Brandon Kelley</h5>
                                                    <p>Neque porro qui squam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora.</p>
                                                    <a href="#">Like</a>
                                                    <a class="active" href="#">Reply</a>
                                                </div>
                                            </div>
                                            <!--                                            <ol class="children">
                                                                                            <li class="single_comment_area">
                                                                                                <div class="comment-wrapper d-flex">
                                                                                                     Comment Meta 
                                                                                                    <div class="comment-author">
                                                                                                        <img src="${pageContext.request.contextPath}/yummy/img/blog-img/18.jpg" alt="">
                                                                                                    </div>
                                                                                                     Comment Content 
                                                                                                    <div class="comment-content">
                                                                                                        <span class="comment-date text-muted">27 Aug 2018</span>
                                                                                                        <h5>Brandon Kelley</h5>
                                                                                                        <p>Neque porro qui squam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora.</p>
                                                                                                        <a href="#">Like</a>
                                                                                                        <a class="active" href="#">Reply</a>
                                                                                                    </div>
                                                                                                </div>
                                                                                            </li>
                                                                                        </ol>-->
                                        </li>
                                        <li class="single_comment_area">
                                            <div class="comment-wrapper d-flex">
                                                <!-- Comment Meta -->
                                                <div class="comment-author">
                                                    <img src="${pageContext.request.contextPath}/yummy/img/blog-img/19.jpg" alt="">
                                                </div>
                                                <!-- Comment Content -->
                                                <div class="comment-content">
                                                    <span class="comment-date text-muted">27 Aug 2018</span>
                                                    <h5>Brandon Kelley</h5>
                                                    <p>Neque porro qui squam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora.</p>
                                                    <a href="#">Like</a>
                                                    <a class="active" href="#">Reply</a>
                                                </div>
                                            </div>
                                        </li>
                                    </ol>
                                </div>

                                <!-- Leave A Comment -->
                                <div class="leave-comment-area section_padding_50 clearfix">
                                    <div class="comment-form">
                                        <h4 class="mb-30">Leave A Comment</h4>

                                        <!-- Comment Form -->
                                        <form action="post" method="">
                                            <div class="form-group">
                                                <textarea class="form-control" name="message" id="message" cols="30" rows="10" placeholder="Message"></textarea>
                                            </div>

                                            <button type="submit" name="idPost" value="${param.idPost}" class="btn contact-btn">Post Comment</button>
                                        </form>

                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                    <!-- ****** Blog Sidebar ****** -->
                    <jsp:include page="status.jsp" flush="true">
                        <jsp:param name="name" value="${sessionScope.login.name}"/>
                        <jsp:param name="id" value="${sessionScope.login.userID}"/>
                    </jsp:include>
                </div>
            </div>
        </section>
        <!-- ****** Single Blog Area End ****** -->
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
