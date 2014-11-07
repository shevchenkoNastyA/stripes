<%@ include file="/WEB-INF/jsp/taglibs.jsp" %>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css"
      rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<script src="js/bootstrap.min.js"></script>

<link rel="stylesheet" href="./bootstrap-3.1.1-dist/css/bootstrap.css">
<link rel="stylesheet" href="./bootstrap-3.1.1-dist/css/bootstrap-responsive.css">
<script src='./js/jquery.js' type="text/javascript"></script>
<script src="./bootstrap-3.1.1-dist/js/bootstrap.js"></script>
<script type="text/javascript" src="./datepicker/datepicker/bootstrap-datepicker.js"></script>

<s:layout-render name="/WEB-INF/jsp/layout.jsp" title="Welcome">
  <s:layout-component name="body">
      <div class="container col-xs-12 ">
         You succesufuly registered and autorised <br>
          Name: ${actionBean.name} <br>
          PhoneNumber: ${actionBean.phoneNumber} <br>
          Login: ${actionBean.login} <br>
      </div>

  </s:layout-component>
</s:layout-render>

