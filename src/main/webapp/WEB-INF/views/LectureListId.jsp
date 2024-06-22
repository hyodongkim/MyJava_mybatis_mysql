<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
 <body>
                <c:forEach items="${list}" var="lec">
                    <tr>
                        <td>${lec.id}</td>
                        <td>${lec.name}</td>
                        <td>${lec.cost}</td>
                        <td>${lec.totalCount}</td>
                        <td>${lec.favorite}</td>
                        <td>${lec.videoName}</td>
                        <td>${lec.videoTime}</td>
                        <td>${lec.teacherName}</td>
                        <td>${lec.subject}</td>
                        <td>${lec.hit}</td>
                        <td>${lec.name}</td>
                        <td>${lec.count}</td>
                        <td>${lec.memberId}</td>
                        <br>
                    </tr>
                </c:forEach>

                <form action="/lectureListId" method="get">
                    <table>
                        <td><input type="text" name="id" value="" /></td>
                    </table>

                    <input type="submit" value="제출">
                </form>
 </body>
</html>