<!-- For Tag File we do not need declare it on TLD, except if it will be deployed in a JAR file in this case we must use TLD to declare the location of the tags -->

<%@ attribute name="subtitle" required="true" %>
<%@ tag body-content="empty" %>

<h3>Java Web Study</h3><br/>
<p>Project of study about Servlets and JSP. Using the book: Head First Servlets and JSP</p><br/>
<h4>${subtitle}</h4>