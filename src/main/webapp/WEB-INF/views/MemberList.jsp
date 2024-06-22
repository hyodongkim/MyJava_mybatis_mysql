<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
 <body>
    <c:forEach items="${list}" var="mem">
                    <tr>
                        <td>${mem.id}</td>
                        <td>${mem.memberId}</td>
                        <td>${mem.password}</td>
                        <td>${mem.age}</td>
                        <td>${mem.sex}</td>
                        <td>${mem.name}</td>
                        <td>${mem.year}</td>
                        <td>${mem.month}</td>
                        <td>${mem.day}</td>
                        <td>${mem.email}</td>
                        <td>${mem.memberJoin}</td>
                        <td>${mem.countView}</td>
                        <td>${mem.countHit}</td>
                        <td>${mem.job}</td>
                        <td>${mem.introduce}</td>
                        <td>${mem.money}</td>
                        <td>${mem.image}</td>
                        <td>${mem.joinTime}</td>
                    </tr>
                    <br>
    </c:forEach>
 </body>
</html>