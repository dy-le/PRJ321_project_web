<%-- 
    Document   : register
    Created on : Oct 12, 2019, 9:03:36 PM
    Author     : Tuan Anh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <!--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>-->
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">-->
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">-->
        <style>
            body {font-family: Arial, Helvetica, sans-serif;}
            * {box-sizing: border-box}

            /* Full-width input fields */
            input[type=text], input[type=password] {
                width: 100%;
                padding: 15px;
                margin: 5px 0 22px 0;
                display: inline-block;
                border: none;
                background: #f1f1f1;
            }

            input[type=text]:focus, input[type=password]:focus {
                background-color: #ddd;
                outline: none;
            }

            hr {
                border: 1px solid #f1f1f1;
                margin-bottom: 25px;
            }

            /* Set a style for all buttons */
            button {
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
                opacity: 0.9;
            }

            button:hover {
                opacity:1;
            }

            /* Extra styles for the cancel button */
            .cancelbtn {
                padding: 14px 20px;
                background-color: #f44336;
            }

            /* Float cancel and signup buttons and add an equal width */
            .cancelbtn, .signupbtn {
                float: left;
                width: 50%;
            }

            /* Add padding to container elements */
            .container {
                margin: 10px;
                padding: 16px;
            }

            /* Clear floats */
            .clearfix::after {
                content: "";
                clear: both;
                display: table;
            }

            /* Change styles for cancel button and signup button on extra small screens */
            @media screen and (max-width: 300px) {
                .cancelbtn, .signupbtn {
                    width: 100%;
                }
            }

        </style>
    <body>
        <form action="register" method="post">
            <div class="container">
                <%--<jsp:include page="header.jsp"/>--%>
            </div>

            <form  style=" border:1px solid #ccc">
                <div class="container">
                    <h1>Sign Up</h1>
                    <p>Please fill in this form to create an account.</p>
                    <hr>
                    <label for="Name"><b>Name</b></label>
                    <input type="text" placeholder="Name" name="name" required>
                    
                    <label for="username"><b>Username</b></label>
                    <input type="text" placeholder="Username" name="username" required>

                    <label for="email"><b>Email</b></label>
                    <input type="text" placeholder="Enter Email" name="email" required>

                    <label for="psw"><b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="password1" required>

                    <label for="psw-repeat"><b>Repeat Password</b></label>
                    <input type="password" placeholder="Repeat Password" name="password2" required>

                    <label>
                        <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
                    </label>

                    <p>If you have been account <a href="login" style="color:dodgerblue">Sign in</a>.</p>

                    <div class="clearfix">
                        <button type="submit" name="register" class="signupbtn">Sign Up</button>
                        <button type="button" class="cancelbtn"><a href="home"> Cancel</button>
                    </div>
                </div>
            </form>
            <div class="footer">
                <%--<jsp:include page="footer.jsp"/>--%>
            </div>
        </form>

    </body>
</html>


