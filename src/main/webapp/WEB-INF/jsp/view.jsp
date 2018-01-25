<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
 
<!-- let's add tag srping:url -->
<spring:url value="/resources/css/test.css" var="crunchifyCSS" />
<link href="${crunchifyCSS}" rel="stylesheet" />
<!-- Finish adding tags -->
 
<title>Spring MVC Tutorial by Crunchify - Hello World Spring MVC Example</title>
<style type="text/css">
</style>
</head>
<body>
<h1>hello</h1>
</body>
</html>