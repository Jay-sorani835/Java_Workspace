<!DOCTYPE html>
<html>
<head>
<title>Registration Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
<!-- Client side Validation -->
<script type="text/javascript">
	
function validateForm()
{
	 var username = document.forms["registrationForm"]["username"].value;
	 var email = document.forms["registrationForm"]["email"].value;
	 var password = document.forms["registrationForm"]["password"].value;
	 var repassword = document.forms["registrationForm"]["repassword"].value;
	 
	 if(username =="" || email =="" || password =="" || repassword =="")
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
	 if(isAlphabet(username, "Please enter letters only for your Username!!"))
	   {
		 return true;
	   }
	 if(emailValidator(email, "Please enter a valid Email!!"))
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

// Validating Username Field
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
//AJAX Validation
 var request = new XMlHttpRequest();
function searchInfo()
{
	var email = document.registrationForm.email.value;
	var url = "index.jsp?val="+name;

	try
	{
		request.onreadystatechange = function()
		{
			if(request.readyState == 4)
			{
				var val = request.responseText;
				document.getElementById('gmail').innerHTML = val;	
			}
		}
		request.open("GET", url, true);
		request.send();
	}
	catch(Exception e)
	{
		alert("Unable to connect to server");
	}
}

</script>
</head>
<body>
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1>Creative SignUp Form</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form name="registrationForm" action="register.jsp" onsubmit="return validateForm()">
					<input class="text" type="text" name="username" placeholder="Username" required="">
					<input class="text email" type="email" name="email" placeholder="Email" required="" onblur="searchInfo()">
					<input class="text" type="password" name="password" placeholder="Password" required="">
					<input class="text w3lpass" type="password" name="repassword" placeholder="Confirm Password" required="">
					<div class="wthree-text">
						<label class="anim">
							<input type="checkbox" class="checkbox" required="">
							<span>I Agree To The Terms & Conditions</span>
						</label>
						<div class="clear"> </div>
					</div>
					<input type="submit" value="SIGNUP">
				</form>
				<p>Have a member?<a href="signin.jsp"> Login Now!</a></p>
			</div>
		</div>
		<!-- copyright -->
		<div class="colorlibcopy-agile">
			<p>© 2024 Temp Signup Forms </p>
		</div>
		<!-- //copyright -->
		<ul class="colorlib-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div><!-- 
	<span id="gmail"></span> -->
	<!-- //main -->
</body>
</html>