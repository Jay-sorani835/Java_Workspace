<%@page import="com.model.User"%>
<%@page import="com.bo.Bo"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins',sans-serif;
}
body{
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 10px;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);
}
.container{
  max-width: 700px;
  width: 100%;
  marign-top: 100px;
  background-color: #fff;
  padding: 25px 30px;
  border-radius: 5px;
  box-shadow: 0 5px 10px rgba(0,0,0,0.15);
}
.container .title{
	margin-top:150px;
  font-size: 25px;
  font-weight: 500;
  position: relative;
}
.container .title::before{
  content: "";
  position: absolute;
  left: 0;
  bottom: 0;
  height: 3px;
  width: 30px;
  border-radius: 5px;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);
}
.content form .user-details{
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  margin: 20px 20px 12px 0;
}
form .user-details .input-box{
  margin-bottom: 15px;
  width: calc(100% / 2 - 20px);
}
form .input-box span.details{
  display: block;
  font-weight: 500;
  margin-bottom: 5px;
}
.user-details .input-box input{
  height: 45px;
  width: 100%;
  outline: none;
  font-size: 16px;
  border-radius: 5px;
  padding-left: 15px;
  border: 1px solid #ccc;
  border-bottom-width: 2px;
  transition: all 0.3s ease;
}
.user-details .input-box input:focus,
.user-details .input-box input:valid{
  border-color: #9b59b6;
}
 form .gender-details .gender-title{
  font-size: 20px;
  font-weight: 500;
 }
 form .category{
   display: flex;
   width: 80%;
   margin: 14px 10px ;
   justify-content: space-between;
 }
 form .category label{
   display: flex;
   align-items: center;
   cursor: pointer;
 }
 form .category label .dot{
  height: 18px;
  width: 18px;
  border-radius: 50%;
  margin-right: 10px;
  background: #d9d9d9;
  border: 5px solid transparent;
  transition: all 0.3s ease;
  align-items: center;
}
 #dot-1:checked ~ .category label .one,
 #dot-2:checked ~ .category label .two{
   background: #9b59b6;
   border-color: #d9d9d9;
 }
 form input[type="radio"]{
   display: none;
 }
 form .button{
   height: 45px;
   margin: 35px 0
 }
 form .button input{
   height: 100%;
   width: 100%;
   border-radius: 5px;
   border: none;
   color: #fff;
   font-size: 18px;
   font-weight: 500;
   letter-spacing: 1px;
   cursor: pointer;
   transition: all 0.3s ease;
   background: linear-gradient(135deg, #71b7e6, #9b59b6);
 }
 form .button input:hover{
  /* transform: scale(0.99); */
  background: linear-gradient(-135deg, #71b7e6, #9b59b6);
  }
 @media(max-width: 584px){
 .container{
  max-width: 100%;
}
form .user-details .input-box{
    margin-bottom: 15px;
    width: 100%;
  }
  form .category{
    width: 100%;
  }
  .content form .user-details{
    max-height: 300px;
    overflow-y: scroll;
  }
  .user-details::-webkit-scrollbar{
    width: 5px;
  }
  }
  @media(max-width: 459px){
  .container .content .category{
    flex-direction: column;
  }
}


h1 {
  font-size: 24px;
  color: #333;
  margin-bottom: 20px;
}

.upload-label {
  display: inline-block;
  background-color: #3897f0;
  color: #fff;
  padding: 10px 20px;
  border-radius: 5px;
  cursor: pointer;
  font-weight: bold;
}

.upload-label input {
  display: none;
}

.image-preview {
  margin-top: 20px;
  width: 100%;
  height: 100px;
  border: 1px solid #dbdbdb;
  border-radius: 10px;
  overflow: hidden;
  display: flex;
  align-items: center;
  justify-content: center;
}

.image-preview img {
  display: none;
  width: 100%;
  height: 100%;
  object-fit: cover;
}

button {
  margin-top: 20px;
  padding: 10px 20px;
  background-color: #3897f0;
  color: #fff;
  border: none;
  border-radius: 5px;
  font-size: 16px;
  cursor: pointer;
}

button:hover {
  background-color: #3579e8;
}

    </style>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
<%
	ApplicationContext acm = new ClassPathXmlApplicationContext("beans.xml");
	Bo bo = (Bo)acm.getBean("bo");

	User u1 = bo.getSingle(session.getAttribute("email").toString());
%>
  <div class="container">
    <div class="title">User Registration</div>
    <div class="content">
      <form action="Update" enctype="multipart/form-data" method="post">
        <div class="user-details">
        <input type="hidden" name="id" value="<%=u1.getId() %>">
        <input type="hidden" name="firstname" value="<%=u1.getUFIRSTNAME() %>" required>
        <input type="hidden" name="lastname" value="<%=u1.getULASTNAME() %>" required>
          
          <div class="input-box">
            <span class="details">Email</span>
            <input type="text" name="email" value="<%=u1.getUEMAIL() %>" required>
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="text" name="mobile" value="<%=u1.getUMOBILE() %>" required>
          </div>
          <input type="hidden" name="password" value="<%=u1.getUPASSWORD() %>" required>
          <inut type="hidden" name="gender" value="<%=u1.getUGENDER() %>" required>
          <input type="hidden" name="image" value="<%=u1.getUPRO_PIC() %>" required>
          <button type="submit">Update</button>
        </div>
      </form>
    </div>
<script type="text/javascript">
function previewImage(event) {
  const preview = document.getElementById('previewImg');
  preview.src = URL.createObjectURL(event.target.files[0]);
  preview.style.display = 'block';
}

</script>
</body>
</html>