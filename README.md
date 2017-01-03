# servlet

>> mvn clean jetty7:run  or 
>> mvn clean jetty:run

To test basic Servlet with browser : http://localhost:8080/servlet/basicServlet


# how it works

check web.xml descriptor

```java

 <servlet>
        <servlet-name>BasicServlet</servlet-name>
        <servlet-class>com.rupp.sample.web.BasicServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>BasicServlet</servlet-name>
        <url-pattern>/basicServlet</url-pattern>
    </servlet-mapping>
    
```

BasicServlet.java

```java
public class BasicServlet extends HttpServlet {
    //resource
    private String message;
    @Override
    public void init() throws ServletException {
        System.out.println("=====init method is called====");
        //populate initialize resources
        message = "Hello world - my Basic Servlet";
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("=====service method is called ====");
        //render to html page
       // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println(String.format("<h1> %s </h1>", message));
    }

    @Override
    public void destroy() {
        System.out.println("=====destroy method is called====");
    }
}

```

# Servlet Mapping url pattern web.xml

```java
  <servlet>
        <servlet-name>BasicServlet</servlet-name>
        <servlet-class>com.rupp.sample.web.BasicServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>BasicServlet</servlet-name>

<!--         <url-pattern>/basicServlet</url-pattern> -->
<!--          http://serverUrl:port/contextPath/hello.jsp -->

<!--         <url-pattern>/hello.jsp</url-pattern> -->

<!--         http://serverUrl:port/contextPath/abc/test.html -->

<!--         <url-pattern>/abc/test.html</url-pattern>   -->

<!--         http://serverUrl:port/contextPath/basic/anyString 
ex : http://localhost:8080/servlet/basic/myTest  - match url-pattern
ex : http://localhost:8080/servlet/basic/myTest/abac/test.jsp   - match url-pattern
-->
            <url-pattern>/basic/*</url-pattern>   
```
