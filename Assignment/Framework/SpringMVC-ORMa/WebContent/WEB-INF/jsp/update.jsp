<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.bo.BO"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.User"%>
<%@page import="java.util.List"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Bootstrap CRUD Data Table for Database with Modal Form</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>
body {
	color: #566787;
	background: #f5f5f5;
	font-family: 'Varela Round', sans-serif;
	font-size: 13px;
	display:flex;
	flex-direction:column;
	justify-content:center;
	align-items:center;
}

.pagination {
	float: right;
	margin: 0 0 5px;
}
.pagination li a {
	border: none;
	font-size: 13px;
	min-width: 30px;
	min-height: 30px;
	color: #999;
	margin: 0 2px;
	line-height: 30px;
	border-radius: 2px !important;
	text-align: center;
	padding: 0 6px;
}
.pagination li a:hover {
	color: #666;
}	
.pagination li.active a, .pagination li.active a.page-link {
	background: #03A9F4;
}
.pagination li.active a:hover {        
	background: #0397d6;
}
.pagination li.disabled i {
	color: #ccc;
}
.pagination li i {
	font-size: 16px;
	padding-top: 6px
}
.hint-text {
	float: left;
	margin-top: 10px;
	font-size: 13px;
}  */    */
/* Custom checkbox */
.custom-checkbox {
	position: relative;
}
.custom-checkbox input[type="checkbox"] {    
	opacity: 0;
	position: absolute;
	margin: 5px 0 0 3px;
	z-index: 9;
}
.custom-checkbox label:before{
	width: 18px;
	height: 18px;
}
.custom-checkbox label:before {
	content: '';
	margin-right: 10px;
	display: inline-block;
	vertical-align: text-top;
	background: white;
	border: 1px solid #bbb;
	border-radius: 2px;
	box-sizing: border-box;
	z-index: 2;
}
.custom-checkbox input[type="checkbox"]:checked + label:after {
	content: '';
	position: absolute;
	left: 6px;
	top: 3px;
	width: 6px;
	height: 11px;
	border: solid #000;
	border-width: 0 3px 3px 0;
	transform: inherit;
	z-index: 3;
	transform: rotateZ(45deg);
}
.custom-checkbox input[type="checkbox"]:checked + label:before {
	border-color: #03A9F4;
	background: #03A9F4;
}
.custom-checkbox input[type="checkbox"]:checked + label:after {
	border-color: #fff;
}
.custom-checkbox input[type="checkbox"]:disabled + label:before {
	color: #b8b8b8;
	cursor: auto;
	box-shadow: none;
	background: #ddd;
}
/* Modal styles */
/* .modal .modal-dialog {
	max-width: 400px;
} */
.modal .modal-header, .modal .modal-body, .modal .modal-footer {
	padding: 20px 30px;
}
.modal .modal-content {
	border-radius: 3px;
	font-size: 14px;
}
.modal .modal-footer {
	background: #ecf0f1;
	border-radius: 0 0 3px 3px;
}
.modal .modal-title {
	display: inline-block;
}
.modal .form-control {
	border-radius: 2px;
	box-shadow: none;
	border-color: #dddddd;
}
.modal textarea.form-control {
	resize: vertical;
}
.modal .btn {
	border-radius: 2px;
	min-width: 100px;
}	
.modal form label {
	font-weight: normal;
}	
a:hover{
	background-color: white;
}
.link a
{
	display: inline-block;
	margin-right: 16px;
}
.link
{
	display: flex;
}
.table{
margin:auto;
}
</style>
<script>
$(document).ready(function(){
	// Activate tooltip
	$('[data-toggle="tooltip"]').tooltip();
	
	// Select/Deselect checkboxes
	var checkbox = $('table tbody input[type="checkbox"]');
	$("#selectAll").click(function(){
		if(this.checked){
			checkbox.each(function(){
				this.checked = true;                        
			});
		} else{
			checkbox.each(function(){
				this.checked = false;                        
			});
		} 
	});
	checkbox.click(function(){
		if(!this.checked){
			$("#selectAll").prop("checked", false);
		}
	});
});

function validateForm()
{
	 var username = document.forms["update"]["editname"].value;
	 var email = document.forms["update"]["editemail"].value;
	 var framework = document.forms["update"]["editfrmaework"].value;
	 
	 if(username =="" || email =="" || framework == "")
		 {
		    alert('All Fields are mandatory!!');
		    return false;
		 }
	 if(isAlphabet(username, "Please enter letters only for your username!!"))
	   {
		 return true;
	   }
	 if(emailValidator(email, "Please enter a valid Email!!"))
	  {
		 return true;
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

<!-- Edit Modal HTML -->
<div class="modal-dialog">
		<div class="modal-content">
			<form action="update" name="update" method="post">
				<div class="modal-header">						
					<h4 class="modal-title">Edit Employee</h4>
					<a href="back" class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
				</div>
				<input type="hidden" name="id" class="form-control" value="${temp.id }" required>
				<div class="modal-body">					
					<div class="form-group">
						<label>Name</label>
						<input type="text" name="editname" class="form-control" value="${temp.name }" required>
					</div>
					<div class="form-group">
						<label>Email</label>
						<input type="email" name="editemail" class="form-control" value="${temp.email }" required>
					</div>
					<div class="form-group">
						<label>Framework</label>
						<input type="text" class="form-control" name="editframework" value="${temp.framework }" required></input>
					</div>	
				</div>
				<div class="modal-footer">
				<a href="back" class="btn btn-outline-danger">Cancel</a>
					<input type="submit" class="btn btn-info" value="Save">
				</div>
			</form>
</div>
</div>

</body>
</html>