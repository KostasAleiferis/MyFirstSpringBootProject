

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainers</title>
        <!-- Latest compiled and minified CSS -->

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="css/maincss.css" rel="stylesheet"/>
        <style type="text/css">
            body {
                color: #404E67;
                background: #F5F7FA;
                font-family: 'Open Sans', sans-serif;

            }
            .table-wrapper {
                width: 1200px;
                margin: 30px auto;
                background: #fff;
                padding: 20px;	
                box-shadow: 0 1px 1px rgba(0,0,0,.05);
            }
            .table-title {
                padding-bottom: 10px;
                margin: 0 0 10px;
            }
            .table-title h2 {
                margin: 6px 0 0;
                font-size: 22px;
            }
            .table-title .add-new {
                float: right;
                height: 30px;
                font-weight: bold;
                font-size: 12px;
                text-shadow: none;
                min-width: 100px;
                border-radius: 50px;
                line-height: 13px;
            }
            .table-title .add-new i {
                margin-right: 4px;
            }
            table.table {
                table-layout: fixed;
            }
            table.table tr th, table.table tr td {
                border-color: #e9e9e9;
            }
            table.table th i {
                font-size: 13px;
                margin: 0 5px;
                cursor: pointer;
            }

        </style>
    </head>
    <body>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div><a href="mainMenu" class="btn btn-info">Main menu</a></div>
                    <div class="row">
                        <div class="col-sm-8"><h1><b>Trainers</b></h1></div>
                        <div class="col-sm-4">
                            <a href="addTrainersForm" class="btn btn-info add-new"><i class="fa fa-plus"></i> Add New</a>
                        </div>
                    </div>
                </div>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>First name</th>
                            <th>Last name</th>
                            <th>Subject</th>

                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${alltrainers}" var="t">
                            <tr>
                                <td> ${t.trainerid}</td>
                                <td> ${t.firstname}</td>
                                <td> ${t.lastname}</td>
                                <td> ${t.subject}</td>
                                <td><form action="deleteTrainer" method="POST">
                                        <input name="TrainerID" value="${t.trainerid}" type="hidden">
                                        <input type="submit" value="DELETE" class="btn btn-danger btn-rounded btn-sm my-0"></form> </td>
                                <td> <form action="updateTrainerForm" method="POST">
                                        <input name="TrainerID" value="${t.trainerid}" type="hidden">
                                        <input type="submit" value="UPDATE" class="btn btn-primary btn-rounded btn-sm my-0"></form> </td>
                            </tr>

                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
