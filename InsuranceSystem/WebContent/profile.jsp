<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
  table{
  float:left;
  margin-left:10%;
  
  }
 body{
  background-color:#fff;
 }
 #w1{
   background-color:green;
   width:10%;
   height:25px;
 
   }
   #w2{
   background-color:green;
   width:10%;
   height:25px;
 
   }
h1{
   color:darkgreen;
   text-align: center;
   background-color: coral;
}
a{
   color:white;
}
 
</style>
</head>
<body>
<h1>INSURANCE MANAGEMENT SYSTEM</h1>

<br>
<br>
<div id="w1">
<a style="text-decoration:none" href="profile.jsp">view profile</a>
</div>
<br>
<div id="w2">
<a style="text-decoration:none" href="policy.jsp">Policy</a></div>
<%
  String name=(String)session.getAttribute("cliname");
  String DOB=(String)session.getAttribute("db");
  String mobile=(String)session.getAttribute("mo");
  String address=(String)session.getAttribute("addr");
  String state=(String)session.getAttribute("st");
  String cno=(String)session.getAttribute("cn");
  String ptyp=(String)session.getAttribute("ctyp");
  String polamt=(String)session.getAttribute("initial");
  String age=(String)session.getAttribute("ag");
  String ema=(String)session.getAttribute("mail");
  String cty=(String)session.getAttribute("ct");
  String Nation=(String)session.getAttribute("N");



%>
<table >
<tr><td>NAME:</td><td><input type="text" value="<%= name %>"/></td></tr>
<tr><td>DOB :</td><td><input type="text" value="<%= DOB %>"/></td></tr>
<tr><td>MOBILE:</td><td><input type="text" value="<%= mobile %>"/></td></tr>
<tr><td>ADDRESS:</td><td><input type="text" value="<%= address %>"/></td></tr>
<tr><td>STATE:</td><td><input type="text" value="<%= state %>"/></td></tr>
<tr><td>AGE:</td><td><input type="text" value="<%= age %>"/></td></tr>
</table>
<table>
<tr><td>CLIENT NUMBER:</td><td><input type="text" value="<%= cno %>"/></td></tr>
<tr><td>POLICY TYPE:</td><td><input type="text" value="<%= ptyp %>"/></td></tr>
<tr><td>POLICY AMOUNT:</td><td><input type="text" value="<%= polamt %>"/></td></tr>
<tr><td>EMAIL:</td><td><input type="text" value="<%= ema %>"/></td></tr>
<tr><td>CITY:</td><td><input type="text" value="<%= cty %>"/></td></tr>
<tr><td>NATION:</td><td><input type="text" value="<%= Nation %>"/></td></tr>
</table>

</body>
</html>
