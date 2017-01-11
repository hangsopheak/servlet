<%@page import="java.util.Date" %> 
<h1>write java method code in jsp</h1>

<pre>

<%! 
public static String getMyStatment () {
        return ("This java statement is a return of a method");
}
%>

<%= getMyStatment() %>


</pre>