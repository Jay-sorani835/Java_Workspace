<%@page import="java.util.Arrays"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="com.model.Subscription"%>
<%@page import="com.model.Reader"%>
<%@page import="com.controller.Dao"%>
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
	String fname = request.getParameter("fname");
	String lname = request.getParameter("lname");
	String email = request.getParameter("email");
	
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
	
 	Reader reader = new Reader();
	reader.setFirstName(fname);
	reader.setLastName(lname);
	reader.setEmail(email);
	reader.setReaderId(Integer.parseInt(request.getParameter("id")));

	reader.setSubscriptions(set);
	session.setAttribute("id", reader.getReaderId());
	new Dao().insert(reader);
	response.sendRedirect("view.jsp");
%>
</body>
</html>