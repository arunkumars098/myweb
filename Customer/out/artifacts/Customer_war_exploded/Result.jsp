<%--
  Created by IntelliJ IDEA.
  User: Abhishek
  Date: 29-04-2017
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.po.Insert2DBForm, java.util.ArrayList" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="Style.css">
    <style>
        input[type],select {
            width: 180px;
            box-sizing: border-box;
            border: 2px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
            background-color: white;
            background-position: 10px 10px;
            padding: 7px 20px 7px 20px;
        }

        input[type="text"]:focus {
            width: 100%;
        }



    </style>
</head>
<body style="background:#8ee191 ">
<div class="container">


    <header>

        <table border=0>
            <tr>
                <td style="width:52%">
                    <h1>Cimbidia</h1>
                </td>
                <td style="width:35%" class="searchbox" align="right" valign="middle">
                    <form>
                        <input type="text" placeholder="Search.." name="search">
                    </form>
                </td>
                <td style="width:35%" align="right" valign="top">
                    <p class="headp"><b><%=request.getParameter("user")%></b>, buyer<br> Acme. Corporation</p>
                </td>
                <td>

                </td>
            </tr>
        </table>

    </header>
    <link>
    <table border=0 style="width:100%">
        <tr style="width:100%">
            <td style="width:100%">
                <ul>
                    <li><a href="#">Purchase Orders</a></li>
                    <li><a href="#">Customer Orders</a></li>
                    <li><a href="#">ASNs</a></li>
                    <li><a href="#">Shipments</a></li>
                    <li><a href="#">Bookings</a></li>
                    <li><a href="#">Invoice</a></li>
                    <li><a href="#">Visibility</a></li>
                    <li><a href="#">Cimchat</a></li>
                    <li><a href="#">Settings</a></li>
                </ul>
            </td>
        </tr>
    </table>



    </link>

</div>
<div>
    <table width="100%" align="center"
           style="border:1px solid #000000;">

        <tr style="background-color:lightgrey;width: 100%">
            <td><b>Supplier</b></td>
            <td><b>duedate</b></td>
            <td><b>postatus</b></td>
            <td><b>priority </b></td>
            <td><b>items </b></td>
            <td><b>ship from </b></td>
            <td><b>transresp </b></td>
            <td><b>country </b></td>
            <td><b>ponumber</b></td>
        </tr>
        <%
            int count = 0;
            String color = "#F9EBB3";
            if (request.getAttribute("piList") != null) {
                ArrayList al = (ArrayList) request.getAttribute("piList");
                System.out.println(al);
                Iterator itr = al.iterator();
                while (itr.hasNext()) {

                    if ((count % 2) == 0) {
                        color = "#eeffee";
                    }
                    count++;
                    ArrayList pList = (ArrayList) itr.next();
        %>
        <tr style="background-color:<%=color%>;">
            <td><%=pList.get(0)%></td>
            <td><%=pList.get(1)%></td>
            <td><%=pList.get(2)%></td>
            <td><%=pList.get(3)%></td>
            <td><%=pList.get(4)%></td>
            <td><%=pList.get(5)%></td>
            <td><%=pList.get(6)%></td>
            <td><%=pList.get(7)%></td>
            <td><%=pList.get(8)%></td>
        </tr>
        <%
                }
            }
            if (count == 0) {
        %>
        <tr>
            <td colspan=4 align="center"
                style="background-color:#eeffee"><b>No Record Found..</b></td>
        </tr>
        <%            }
        %>
    </table>
</div>
</body>
</html>
