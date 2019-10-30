
<%-- 
    Document   : login
    Created on : Oct 12, 2019, 7:01:57 PM
    Author     : lpxed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link type="text/css" id="dark-mode" rel="stylesheet" href="https://getbootstrap.com/docs/4.0/examples/sign-in/">
    <style type="text/css" id="dark-mode-custom-style"></style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="${pageContext.request.contextPath}/media/LOGO.png">
        <title>Login Page</title>
        <link rel="canonical" href="https://getbootstrap.com/docs/4.0/examples/sign-in/">
        <linkS rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.request.contextPath}/vendor/bootstrap/css/signin.css" rel="stylesheet">
    </head>
    <body class="text-center" data-gr-c-s-loaded="true">
        <div class="container">
            <form class="form-signin" action="login" method="POST">
                <img class="mb-4" src="${pageContext.request.contextPath}/media/LOGO.png" alt="" width="250" height="250">
                <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>

                <input type="text" id="inputEmail" class="form-control" placeholder="Email address" name="username" required>

                <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="password" required>
                <div class="checkbox mb-3">
                    <label>
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit" name="signin" value="signin">Sign in</button>
                <button class="btn btn-block" type="button" style="background-color: #218838"><a href="${pageContext.request.contextPath}/register" style="color: white"> Sign up</button>
                <p class="mt-5 mb-3 text-muted">© 2019-2020</p>
                
            </form>
        </div>
        
</body>
</html>
