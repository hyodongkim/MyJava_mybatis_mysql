<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

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

        <form action="/memberUpdate" method="post">
          <c:forEach var="mem" items="${list}">
            <table>
                <td>id : <input type="text" name="id" value="${mem.id}" /></td>
                <td>memberId : <input type="text" name="memberId" value="${mem.memberId}" /></td>
                <td>password : <input type="text" name="password" value="${mem.password}" /></td>
                <td>age : <input type="text" name="age" value="${mem.age}" /></td>
                <td>sex : <input type="text" name="sex" value="${mem.sex}" /></td>
                <td>name : <input type="text" name="name" value="${mem.name}" /></td>
                <td>year : <input type="text" name="year" value="${mem.year}" /></td>
                <td>month : <input type="text" name="month" value="${mem.month}" /></td>
                <td>day : <input type="text" name="day" value="${mem.day}" /></td>
                <td>memberJoin : <input type="text" name="memberJoin" value="${mem.memberJoin}" /></td>
                <td>countView : <input type="text" name="countView" value="${mem.countView}" /></td>
                <td>countHit : <input type="text" name="countHit" value="${mem.countHit}" /></td>
                <td>job : <input type="text" name="job" value="${mem.job}" /></td>
                <td>introduce : <input type="text" name="introduce" value="${mem.introduce}" /></td>
                <td>money : <input type="text" name="money" value="${mem.money}" /></td>
                <td>image : <input type="text" name="image" value="${mem.image}" /></td>
                <td>joinTime : <input type="text" name="joinTime" value="${mem.joinTime}" /></td>

            </table>
          </c:forEach>

          <c:if test="${fn:length(list) != 1}">
          </c:if>

          <c:if test="${fn:length(list) == 1}">
            <input type="submit" value="제출">
          </c:if>

        </form>
 </body>
</html>