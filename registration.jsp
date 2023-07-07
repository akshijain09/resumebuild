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
       <form action="reg" method="post">
       <label for="name">Name</label><br>
       <input type="text" name="uname" placeholder="Enter the Name" required="required"><br><br>
       <label for="email">Email</label><br>
       <input type="email" name="uemail" placeholder="Enter the Email" required="required"><br><br>
       <label for="password">Password</label><br>
       <input type="password" name="upass" placeholder="Enter the password" required="required"><br><br>
       <label for="contact">Contact</label><br>
       <input type="tel" name="umobile" placeholder="Enter the contact" pattern="[0-9]{3}[0-9]{3}[0-9]{4}" required="required"><br><br>
       <input type="submit" value="Sign Up">
        <a href="log.jsp">Already an member</a>
       </form>

       <script src="https://unpkg.com/sweetalert/dist//sweetalert.min.js"></script>
       <script type="text/javascript">
       var status=document.getElementById("status").value;
       if(status=="success"){
    	   swal("Congrats","Account Created Successfully","success");
       }
       if(status=="failed"){
       	swal("This email id is already registered","error");
       }



       </script>

</body>
</html>