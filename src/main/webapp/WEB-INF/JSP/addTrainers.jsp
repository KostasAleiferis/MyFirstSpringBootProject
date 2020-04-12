<%-- 
    Document   : addTrainers
    Created on : Mar 28, 2020, 10:34:54 PM
    Author     : kwsta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- Latest compiled and minified CSS -->

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="css/maincss.css" rel="stylesheet"/>
      
        <title>Add your trainers!</title>
    </head>
    <body>
        <div class="container">
        <form:form cssClass="form-horizontacssClassl" action="addTrainers" method="POST" modelAttribute="trainer">
            <div class="control-group">

                <label class="control-label" for="firstname">First name</label>
                <div class="controls">
                    <form:input path="firstname" cssClass="input-xlarge" type="text" id="firstname"/>
                </div>
            </div>
       
          
            <div class="control-group">

                <label class="control-label" for="lastname">Last name</label>
                <div class="controls">
                    <form:input path="lastname" cssClass="input-xlarge" type="text" id="lastname"/>
                </div>
            </div>
            <div class="control-group">

                <label class="control-label" for="subject">Subject</label>
                <div class="controls">
                    <form:input path="subject" cssClass="input-xlarge" type="text" id="subject"/>
                </div>
            </div>
                <br/>
                <br/>
            <div class="control-group">
                <div class="controls">
                    <button class="btn btn-success">Submit here!</button>
                </div>
            </div>

        </form:form>
        </div>







    </body>
</html>
