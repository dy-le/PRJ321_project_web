<%-- 
    Document   : userInf
    Created on : Oct 12, 2019, 9:26:59 PM
    Author     : Tuan Anh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            body{
                background-color: #25274d;
            }
            .contact{
                padding: 4%;
                height: 400px;
            }
            .col-md-3{
                background: #ff9b11 ;
                padding: 4%;
                border-top-left-radius: 0.5rem;
                border-bottom-left-radius: 0.5rem;
            }
            .contact-info{
                margin-top:10%;
                text-align: center;
            }
            .contact-info img{
                margin-bottom: 15%;
            }
            .contact-info h2{
                margin-bottom: 10%;
            }
            .col-md-9{
                background: #fff;
                padding: 3%;
                border-top-right-radius: 0.5rem;
                border-bottom-right-radius: 0.5rem;
            }
            .contact-form label{
                font-weight:600;
            }
            .contact-form button{
                background: #25274d;
                color: #fff;
                font-weight: 600;
                width: 25%;
            }
            .contact-form button:focus{
                box-shadow:none;
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container contact">
            <div class="row">
                <div class="col-md-3">
                    <div class="contact-info">
                        <img src="../media/LOGO.png" style="width:100%; height: 100%" height=40 width=40 alt="image"/>
                        <h2 >Your Information</h2>
                    </div>
                </div>
                <div class="col-md-9">
                    <div class="contact-form">
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="fname">Name:</label>
                            <div class="col-sm-10">          
                                <input type="text" class="form-control" id="fname" placeholder="Enter First Name" name="fname">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="lname">Birth Day:</label>
                            <div class="col-sm-10">          
                                <input type="text" class="form-control" id="lname" placeholder="Enter Last Name" name="lname">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="email">Email:</label>
                            <div class="col-sm-10">
                                <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="comment">Detail</label>
                            <div class="col-sm-10">
                                <textarea class="form-control" rows="5" id="comment"></textarea>
                            </div>
                        </div>
                        <div class="form-group">        
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="homeback" class="btn btn-default">Home Back</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
