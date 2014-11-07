<%@ include file="/WEB-INF/jsp/taglibs.jsp" %>

<s:layout-render name="/WEB-INF/jsp/layout.jsp" title="Welcome">
  <s:layout-component name="body">
      <h1>CVRP GLOBAL PROJECT;)</h1>

      <stripes:form beanclass="cvrp.action.HomeActionBean" focus="">
          <table>
              <tr>
                  <td>Number 1:</td>
                  <td><stripes:text name="numberOne"/></td>
              </tr>
              <tr>
                  <td>Number 2:</td>
                  <td><stripes:text name="numberTwo"/></td>
              </tr>
              <tr>
                  <td colspan="2">
                      <stripes:submit name="addition" value="Add"/>
                  </td>
              </tr>
              <tr>
                  <td>Result:</td>
                  <td>${actionBean.result}</td>
              </tr>
          </table>
      </stripes:form>

  </s:layout-component>
</s:layout-render>

