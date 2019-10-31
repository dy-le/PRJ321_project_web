<%-- 
    Document   : home
    Created on : Oct 11, 2019, 5:00:44 PM
    Author     : lpxed
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">-->
        <!--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">-->
        <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>-->
        <!--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>      
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

        <style type="text/css">

        </style>
    </head>
    <body>

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
        
        <section id="slideTop" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner no-padding">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="../media/img1.jpg" alt="First slide">
                    <div class="carousel-caption d-none d-md-block">

                        <h5 style="color:powderblue;">New.</h5>
                        <p>.New</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src="../media/img2.png" alt="Second slide">
                </div>
                <c:forEach var="i" begin="1" end="5">
                    <div class="carousel-item">
                        <img class="d-block w-100" src="../media/img1.jpg" alt="First slide">
                        <div class="carousel-caption d-none d-md-block">

                            <h5 style="color:powderblue;">New.</h5>
                            <p>.New</p>
                        </div>
                    </div>
                </c:forEach>
            </div>

            <!-- Left and right controls -->
            <a class="carousel-control-prev" href="#slideTop" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#slideTop" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </section>



    </body>
</html>
