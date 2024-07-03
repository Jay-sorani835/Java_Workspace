<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title> Responsive Registration Form | CodingLab </title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins',sans-serif;
}
body{
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 10px;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);
}
.container{
  max-width: 700px;
  width: 100%;
  background-color: #fff;
  padding: 25px 30px;
  border-radius: 5px;
  box-shadow: 0 5px 10px rgba(0,0,0,0.15);
}
.container .title{
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
  margin: 20px 0 12px 0;
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
    </style>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <script type="text/javascript">
	
function validateForm()
{
	 var fullname = document.forms["registrationForm"]["fullname"].value;
	 var email = document.forms["registrationForm"]["email"].value;
	 var phone= document.forms["registrationForm"]["phone"].value;
	 var password = document.forms["registrationForm"]["password"].value;
	 var repassword = document.forms["registrationForm"]["repassword"].value;
	 
	 if(fullname =="" || email =="" || phone =="" || password =="" || repassword =="")
		 {
		    alert('All Fields are mandatory!!');
		    return false;
		 }
	 if(password!=repassword)
		 {
		    alert('Password and Repassword mismatched!!')
		    return false;
		 }
	 else
		 {
		    return true;
		 }
	 if(isAlphabet(fullname, "Please enter letters only for your Fullname!!"))
	   {
		 return true;
	   }
	 if(emailValidator(email, "Please enter a valid Email!!"))
	  {
		 return true;
	  }
	 if(isNumeric(phone, "Please enter a valid Mobile Number!!"))
		 {
		   return true;
		 }
	 if(lengthRestriction(password, 1,10))
		 {
		   return true;
		 }
	 if(isEquals(repassword, "Password and Repeat Password mismatched!!"))
		 {
		   return true;
		 }
	 else
		 {
		   return false;
		 }
}
// Validating phone number
function isNumeric(elem, helperMsg)
{
	var numericExpression = /^[0-9]+$/;
	if(elem.value.match(numericExpression))
    {
		return true;
	}
	else
	{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}

// Validating password and confirmPassword
function isEquals(elem, helperMsg)
{
	 if(repassword.equals(password))
		 {
		    return true;
		 }
	 else
		 {
		    alert(helperMsg);
		    elem.focus();
		    return false;
		 }
}

// Validating Name Field
function isAlphabet(elem, helperMsg)
{
	 var alphaExp = /^[a-zA-Z]+$/;
	  if(elem.value.match(alphaExp))
		  {
		     return true;
		  }
	  else 
		  {
		     alert(helperMsg);
		     elem.focus();
		     return false;
		  }
}

// Length Restriction
function lengthRestriction(elem, min, max)
{
	 var uInput = elem.value;
	 if(uInput.length >= min && uInput.length <= max)
		 {
		    return true;
		 }
	 else
		 {
		    alert("Please enter between " + min+ " and " +max+ "characters");
		    elem.focus();
		    return false;
		 }
}
// Email validator
 function emailValidator(elem, helperMsg)
{
 var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
  if(elem.value.match(emailExp)){
 	return true;
   }
   else
   {
      alert(helperMsg);
      elem.focus();
       return false;
   }
 }


</script>
   
   </head>
<body>
  <div class="container">
    <div class="title">Registration</div>
    <div class="content">
      <form action="signup.jsp" method="post" enctype="multipart/form-data" onsubmit="return validateForm()">
        <div class="user-details">
          <div class="input-box">
            <span class="details">First Name</span>
            <input type="text" name="firstname"  placeholder="Enter your first name" required>
          </div>
          <div class="input-box">
            <span class="details">Last Name</span>
            <input type="text" name="lastname"  placeholder="Enter your last name" required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="text" name="email" placeholder="Enter your email" onblur="verifyEmail()" required>
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="text" name="phone"   placeholder="Enter your number" required>
          </div>
		  <label id="hobby">Hobby :</label>
          <input type="checkbox" name="hobby" value="Singing">Singing
        <input type="checkbox" name="hobby" value="Dancing">Dancing
        <input type="checkbox" name="hobby" value="Coding">Coding
        <input type="checkbox" name="hobby" value="Reading">Reading
        <br>
        <div class="input-box">
			<label id="label">City : </label>
			<select name="city">
			 <option>Rajkot</option>
			 <option>Ahmedabad</option>
			 <option>Vadodara</option>
			 <option>Surat</option>
			 <option>Gandhinagar</option>
			 
			</select>
			</div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" name="pass" placeholder="Enter your password"   required>
          </div>
          <div class="input-box">
            <span class="details">Confirm Password</span>
            <input type="password" name="repass" placeholder="Confirm your password" required>
          </div>
        </div>
        <div class="gender-details">
          <input type="radio" name="gender" value="male" id="dot-1">
          <input type="radio" name="gender" value="female" id="dot-2">
          <span class="gender-title">Gender</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender">Male</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">Female</span>
          </label>
          </div>
        </div>
		<label id="file">Upload Profile Image :</label>
		<input type="file" name="image" placeholder="Profile Image" required>
        
        <div class="button">
          <input type="submit" value="Register">
        </div>
      </form>
    </div>
  </div>
</body>
</html>