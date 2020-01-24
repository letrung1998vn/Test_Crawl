<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>
            <s:form action="Crawl">
                <s:submit name="Crawl"/>
            </s:form>
            <s:if test="statusList!=null">
                <table>
                    <thead>
                        <tr>
                            <th>No.</th>
                            <th>Id</th>
                            <th>Message</th>
                        </tr>
                    </thead>
                    <tbody>

                        <s:iterator value="statusList" status="count" var="status">
                            <tr>
                                <td><s:property value="%{#count.count}"/></td>
                                <td><s:property value="statusId"/></td>
                                <td><s:property value="statusMessage"/></td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </s:if>
        </div>
    </body>
</html>
