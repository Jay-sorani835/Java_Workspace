<%@page import="java.util.HashSet"%>
<%@page import="com.model.Subscription"%>
<%@page import="java.util.Set"%>
<%@page import="com.model.Reader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Reader reader = new Reader();
	reader.setFirstName(request.getParameter("fname"));
	reader.setLastName(request.getParameter("lname"));
	reader.setEmail(request.getParameter("email"));
	
	Set<Subscription> selectedSubscription = new HashSet<>();
	String s[] = request.getParameterValues("subscription");
	Set<Subscription> set = new HashSet<>();
	if (s != null && s.length != 0) {
	    for (String name : s) {
	        // Fetch the User entity using a service or DAO
	        Subscription setSub = new Subscription();
	        setSub.setSubscriptionName(name);
	        if (setSub != null) {
	            set.add(setSub);
	        }
	    }
	}
	reader.setSubscriptions(set);
	reader.setReaderId(Integer.parseInt(request.getParameter("id")));
	response.sendRedirect("view.jsp");
%>
</body>
</html>