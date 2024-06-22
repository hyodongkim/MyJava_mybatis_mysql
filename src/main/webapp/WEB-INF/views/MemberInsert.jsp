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
            <form action="/memberInsert" method="get">
                <table>
                    <td><input type="text" name="id" value="" /></td>
                    <td><input type="text" name="memberId" value="" /></td>
                    <td><input type="text" name="password" value="" /></td>
                    <td><input type="text" name="age" value="" /></td>
                    <td><input type="text" name="sex" value="" /></td>
                    <td><input type="text" name="name" value="" /></td>
                    <td><input type="text" name="year" value="" /></td>
                    <td><input type="text" name="month" value="" /></td>
                    <td><input type="text" name="day" value="" /></td>
                    <td><input type="text" name="memberJoin" value="" /></td>
                    <td><input type="text" name="countView" value="" /></td>
                    <td><input type="text" name="countHit" value="" /></td>
                    <td><input type="text" name="job" value="" /></td>
                    <td><input type="text" name="introduce" value="" /></td>
                    <td><input type="text" name="money" value="" /></td>
                    <td><input type="text" name="image" value="" /></td>
                    <td><input type="text" name="joinTime" value="" /></td>

                </table>

                <input type="submit" value="제출">
            </form>
 </body>
</html>