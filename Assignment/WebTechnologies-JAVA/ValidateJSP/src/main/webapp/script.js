function emailvalidate(elem,Msg)
{
	var emailExp =/ ^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
	
	if(elem.value.match(emailExp)){
		return true;
	}else{
		alert(Msg);
		elem.focus();
		return false;
	}
}
function namevalidate(elem,msg)
{
	var name = /^[a-zA-Z]/;
	if(elem.value.match(name))
	{
		return true;
	}
	else{
		alert(Msg);
		elem.focus();
		return false;
	}
}
function phonenumbervalidate(elem,Msg)
{
	var phone = /^[0-9]{10}/;
	if(elem.value.match(phone))
	{
		return true;
	}
	else{
		alert(Msg);
		elem.focus();
		return false;
	}
}
function passwordvalidate(elem,Msg)
{
	var password = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@#$%_&])[A-Za-z\d@#$%_&]{8,10}$/;
	if(elem.value.match(password))
	{
		return true;
	}
	else
	{
		alert(Msg);
		elem.focus();
		return false;
	}
}
