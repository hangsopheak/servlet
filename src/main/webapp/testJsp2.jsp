<%@page import="java.util.Date" %> 
<h1>Expression tags (Sample)</h1>

<pre>

<%
    Date x = new java.util.Date(); 
    out.println (x);
%>

<%  
   if (x.getHours() > 3 && x.getHours() < 12 ) {   
%>
         Good Morning        
<%   } 

      else if (x.getHours() > 12 && x.getHours ()< 18 )   {    %>
         Good Afternoon
<%   } 
      else if (x.getHours()> 18 || x.getHours() <3)   {    %>
         Good Evening
<%   } %>

</pre>