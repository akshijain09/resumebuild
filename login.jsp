<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
      <form action="log" method="post">
             <label for="Email">Email</label><br>
             <input type="email" name="uemail" placeholder="Enter your Email" required="required"><br><br>
             <label for="Passord">Password</label><br>
             <input type="password" name="upassword" placeholder="Enter your Password" required="required"><br><br>
             <input type="submit" value="Login">
             <a href="reg.jsp">Create an account</a>

      </form>

      <script src="https://unpkg.com/sweetalert/dist//sweetalert.min.js"></script>
      <script type="text/javascript">

    var status=document.getElementById("status").value;
    if(status=="success"){
    	swal("Congrats","login Successfully","success");
    }
    if(status=="failed"){
    	swal("Sorry","Wrong Username or Password","error");
    }
    </script>
</body>
</html>