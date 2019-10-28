<%-- 
    Document   : index.jsp
    Created on : Oct 27, 2019, 8:56:51 PM
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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <!-- Title -->
        <title>Yummy Blog - Food Blog Template</title>

        <!-- Favicon -->
        <!--<link rel="icon" href="img/core-img/favicon.ico">-->
        <link rel="icon" href="media/LOGO.png">

        <!-- Core Stylesheet -->
        <link href="vendor/style.css" rel="stylesheet">
        <!--<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">-->
        <!-- Responsive CSS -->
        <link href="vendor/responsive/responsive.css" rel="stylesheet">
        <!--<link href="vendor/others/font-awesome.min.css" rel="stylesheet">-->

        <!--<script src="vendor/bootstrap/bootstrap/js/bootstrap.min.js"></script>-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>     
    </head>

    <body>
        <!-- ****** Header Area Start ****** -->
        <header class="header_area">
            <div class="container">
                <div class="row">
                    <!-- Logo Area Start -->
                    <div class="col-12">
                        <div class="logo_area text-center">
                            <a href="index.jsp" class="yummy-logo">Yummy Blog</a>
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
                                        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Pages</a>
                                        <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                                            <a class="dropdown-item" href="index.jsp">Home</a>
                                            <a class="dropdown-item" href="archive.html">Archive</a>
                                            <a class="dropdown-item" href="single.html">Single Blog</a>
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
                                        <a class="nav-link" href="archive.html">Archive</a>
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

        <!-- ****** Welcome Post Area Start ****** -->
        <div class="welcome-post-sliders owl-carousel">

            <c:forEach var="i" begin="1" end="5">
                <div class="welcome-single-slide">
                    <img src="media/img3.png" alt="New York">
                    <!-- Overlay Text -->
                    <div class="project_title">
                        <div class="post-date-commnents d-flex">
                            <a href="#">May 19, 2017</a>
                            <a href="#">5 Comment</a>
                        </div>
                        <a href="#">
                            <h5>“I’ve Come and I’m Gone”: A Tribute to Istanbul’s Street</h5>
                        </a>
                    </div>
                </div>
            </c:forEach>


            <!-- Single Slide -->
            <div class="welcome-single-slide">
                <!-- Post Thumb -->
                <img src="media/img/bg-img/slide-2.jpg" alt="">
                <!-- Overlay Text -->
                <div class="project_title">
                    <div class="post-date-commnents d-flex">
                        <a href="#">May 19, 2017</a>
                        <a href="#">5 Comment</a>
                    </div>
                    <a href="#">
                        <h5>“I’ve Come and I’m Gone”: A Tribute to Istanbul’s Street</h5>
                    </a>
                </div>
            </div>

            <!-- Single Slide -->
            <div class="welcome-single-slide">
                <!-- Post Thumb -->
                <img src="media/img/bg-img/slide-3.jpg" alt="">
                <!-- Overlay Text -->
                <div class="project_title">
                    <div class="post-date-commnents d-flex">
                        <a href="#">May 19, 2017</a>
                        <a href="#">5 Comment</a>
                    </div>
                    <a href="#">
                        <h5>“I’ve Come and I’m Gone”: A Tribute to Istanbul’s Street</h5>
                    </a>
                </div>
            </div>

            <!-- Single Slide -->
            <div class="welcome-single-slide">
                <!-- Post Thumb -->
                <img src="media/img/bg-img/slide-4.jpg" alt="">
                <!-- Overlay Text -->
                <div class="project_title">
                    <div class="post-date-commnents d-flex">
                        <a href="#">May 19, 2017</a>
                        <a href="#">5 Comment</a>
                    </div>
                    <a href="#">
                        <h5>“I’ve Come and I’m Gone”: A Tribute to Istanbul’s Street</h5>
                    </a>
                </div>
            </div>

            <!-- Single Slide -->
            <div class="welcome-single-slide">
                <!-- Post Thumb -->
                <img src="media/img/bg-img/slide-4.jpg" alt="">
                <!-- Overlay Text -->
                <div class="project_title">
                    <div class="post-date-commnents d-flex">
                        <a href="#">May 19, 2017</a>
                        <a href="#">5 Comment</a>
                    </div>
                    <a href="#">
                        <h5>“I’ve Come and I’m Gone”: A Tribute to Istanbul’s Street</h5>
                    </a>
                </div>
            </div>

        </div>
        <!-- ****** Welcome Area End ****** -->

        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src=".../800x400?auto=yes&bg=777&fg=555&text=First slide" alt="First slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src=".../800x400?auto=yes&bg=666&fg=444&text=Second slide" alt="Second slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src=".../800x400?auto=yes&bg=555&fg=333&text=Third slide" alt="Third slide">
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>

        
        <section class="categories_area clearfix" id="about">
            <div class="container">
                <div class="row">
                    <div class="col-12 col-md-6 col-lg-4">
                        <div class="single_catagory wow fadeInUp" data-wow-delay=".3s">
                            <img src="img/catagory-img/1.jpg" alt="">
                            <div class="catagory-title">
                                <a href="#">
                                    <h5>Food</h5>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-6 col-lg-4">
                        <div class="single_catagory wow fadeInUp" data-wow-delay=".6s">
                            <img src="img/catagory-img/2.jpg" alt="">
                            <div class="catagory-title">
                                <a href="#">
                                    <h5>Cooking</h5>
                                </a>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-6 col-lg-4">
                        <div class="single_catagory wow fadeInUp" data-wow-delay=".9s">
                            <img src="img/catagory-img/3.jpg" alt="">
                            <div class="catagory-title">
                                <a href="#">
                                    <h5>Life Style</h5>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- ****** Footer Menu Area Start ****** -->
        <footer class="footer_area">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <!-- Copywrite Text -->
                        <div class="copy_right_text text-center">
                            <p>
                                Copyright @2019 All rights reserved | This template is made by
                                <a href="https://github.com/daemon-Lee" target="_blank"> daemon-Lee</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </footer>

    </body>
