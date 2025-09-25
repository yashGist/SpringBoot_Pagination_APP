<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1" bgcolor="green">
<tr>
<th>EMPNO</th>
<th>ENAME</th>
<th>SAL</th>
<th>DEPTNO</th>
</tr>
<c:if test="${!empty employees}">
<c:forEach items="${employees}" var="e">
<tr>
<td><c:out value="${e.empno}"/></td>
<td><c:out value="${e.ename}"/></td>
<td><c:out value="${e.sal}"/></td>
<td><c:out value="${e.deptno}"/></td>
</tr>
</c:forEach>
</c:if>
</table>
<c:if test="${back}">
<a href="emps?pageIndex=${currentPage-1}">BACK</a>
</c:if>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${next}">
<a href="emps?pageIndex=${currentPage+1}">NEXT</a>
</c:if>
