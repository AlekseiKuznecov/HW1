<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>
<h2>Wallet</h2>
<br>

<%--@elvariable id="category" type=""--%>
<form:form action="allProducts" modelAttribute="category">
    Name<form:input path="productName"/>
    <br><br>
    Balance<form:input path="price"/>
    <br><br>
    <input type="submit" value="OK">


</form:form>

</body>

</html>