<%-- 
    Document   : newPost
    Created on : Oct 29, 2019, 11:46:58 PM
    Author     : lpxed
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

        <jsp:include page="header.jsp"/>

        <!-- ****** Breadcumb Area Start ****** -->
        <div class="breadcumb-area" style="background-image: url(${pageContext.request.contextPath}/yummy/img/bg-img/breadcumb.jpg);">
            <div class="container h-100">
                <div class="row h-100 align-items-center">
                    <div class="col-12">
                        <div class="bradcumb-title text-center">
                            <h2>New Post</h2>
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
                                <li class="breadcrumb-item active" aria-current="page">Create new post</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
        <div class="blog_area section_padding_0_80">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-12 col-lg-8">
                        <div class="no-gutters">
                            <div class="col-10 col-sm-11">
                                <div class="single-post section_padding_50">

                                    <!-- Post Content -->
                                    <div class="post-content">
                                        <div class="post-meta d-flex">
                                            <h2 class="post-headline">Creat new post</h2>
                                        </div>
                                        <form name="createNew" action="newPost" method="get">
                                            <div class="related-post-area section_padding_50">
                                                <table class="post-content">
                                                    <tr>
                                                        <th><h5 class="mb-30 col-10">Title</h5></th>
                                                        <td>
                                                            <h5 class="mb-30 col-10">
                                                                <input type="text" name="title" value="" placeholder="Title of post..."
                                                                       class="col-10"
                                                                       style="width:700px;height:50px;"/>
                                                            </h5>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <th><h5 class="mb-30 col-10">Detail</h5></th>
                                                        <td>
                                                            <h5 class="mb-30 col-10">
                                                                <!--<input type="text" name="body" value="" placeholder="detail of post..."/>-->
                                                                <textarea type="text" name="body" style="width:700px;height:400px;" value=""
                                                                          placeholder="Detail of post..."
                                                                          class="col-10"></textarea>
                                                            </h5>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <th><h5 class="mb-30 col-10">Type</h5></th>
                                                        <td>
                                                            <h5 class="mb-30 col-10">
                                                                <select name="stypeSelect" style="width:700px;height:50px;" class="col-10">
                                                                    <option value="0">${not empty listType}select a type</option>
                                                                    <c:if test="${not empty listType}">
                                                                        <c:forEach var="t" items="${listType}">
                                                                            <option value=${t.id}>- ${t.content} -</option>
                                                                        </c:forEach>
                                                                    </c:if>
                                                                </select>

                                                            </h5>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                            <div class="single_catagory">
                                                <div>
                                                    <input type="submit" class="catagory-title" value="Post!" name="submit" />        
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>


                            </div>

                        </div>
                    </div>
                    <jsp:include page="status.jsp" flush="true">
                        <jsp:param name="account" value="Daemon Lee"/>
                        <jsp:param name="id" value="18"/>
                    </jsp:include>
                </div>
            </div>
        </div>


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
