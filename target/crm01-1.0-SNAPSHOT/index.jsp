
<!DOCTYPE html>
<html>
<%
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + 	request.getServerPort() + request.getContextPath() + "/";
%>


  <head>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="js/*.js"></script>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  </body>
</html>
