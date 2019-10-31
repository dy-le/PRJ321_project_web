<%-- 
    Document   : register
    Created on : Oct 12, 2019, 9:03:36 PM
    Author     : Tuan Anh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                top: 0;
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
        <%--<jsp:include page="yummy/header.jsp"/>--%>
        <form action="profile" method="post">
            <div class="container">
                <%--<jsp:include page="header.jsp"/>--%>
            </div>

            <form  style=" border:1px solid #ccc">
                <div class="container">
                        <img src="${pageContext.request.contextPath}/media/img/${sessionScope.login.userID}.jpg" alt="" width="250" height="250">
                        <hr>
                        <label for="name">
                            <b>Name</b>
                        </label>
                        <!--<input type="text" placeholder="Empty"  name="name" value="${sessionScope.name}" ${change=="0"?"disabled":""}  required>-->
                        <input type="text" placeholder="Empty"  name="name" value="${sessionScope.login.name}"  required disabled>


                        <label for="age"><b>Age</b></label>
                        <input type="text" placeholder="Empty"   name="age" value="${sessionScope.login.age}" required disabled>

                        <label for="phone"><b>Phone</b></label>
                        <input type="text" placeholder="Empty"   name="phone" value="${sessionScope.login.phone}" required disabled>

                        <label for="email"><b>Email</b></label>
                        <input type="text" placeholder="Empty"  name="email" value="${sessionScope.login.email}" required disabled>

                        <div class="clearfix">               
                            <button type="button" name="change" id="1" onclick="changeValue();"  value="Change" class="signupbtn">Change</button>
                            <button type="submit" class="cancelbtn" name="save" value="save">Save</button>

                            <button type="button" name="home" class="signupbtn" style="background: #3366FF; width: 100%;"><a href="home">HOME</button>
                        </div>
                </div>
            </form>
            <div class="footer">
                <%--<jsp:include page="footer.jsp"/>--%>
            </div>

        </form>

    </body>
</html>
<script>
    function changeValue() {
        var x = document.getElementById("1").value;
        if (x === "Change") {
            document.getElementById("1").innerHTML = "Cancel changing";
            document.getElementById("1").value = "Cancel changing";
            $("input").prop('disabled', false);
        } else {
            document.getElementById("1").innerHTML = "Change";
            document.getElementById("1").value = "Change";
            $("input").prop('disabled', true);
        }
    }
</script>
