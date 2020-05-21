<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<body>
<%
    PrintWriter printer = response.getWriter();
    printer.print("La concatenacion de  " );
    List<String> palabras = (List) request.getAttribute("listaPalabras");
    for (String palabra : palabras){
        printer.print(palabra + ", ");
    }
    printer.print(" quedarias asi: " + request.getAttribute("palabrasConcatenadas"));
%>

</body>
</html>
