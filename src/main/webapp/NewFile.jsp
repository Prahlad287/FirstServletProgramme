<%@ page import="jakarta.servlet.http.Cookie" %>
<%@ page import="java.io.PrintWriter" %>
<% 
    Cookie[] cookies = request.getCookies();
    String username = null;
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("username")) {
                username = cookie.getValue();
            }
            // Print cookie information for debugging
            System.out.println("Cookie Name: " + cookie.getName() + ", Value: " + cookie.getValue());
        }
    } else {
        System.out.println("No cookies found in the request.");
    }
%>
<html>
<head>
    <title>Cookie Example</title>
</head>
<body>
    <h1>Hello <%= username %></h1>
</body>
</html>
