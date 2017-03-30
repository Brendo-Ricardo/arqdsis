<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@page import="MODEL.Pedido" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pedido</title>
</head>
<body>
<%Pedido pedido = (Pedido)request.getAttribute("pedido"); %>
 Id:                 <%=pedido.getId() %><br>
 Descrição:          <%=pedido.getDescrição() %><br>
 Preço:              <%=pedido.getPreço() %><br>
 QuantidadeVendidas: <%=pedido.getQuantidadeVendidas() %><br>
</body>
</html>