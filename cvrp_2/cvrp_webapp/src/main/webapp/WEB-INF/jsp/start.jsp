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

    <stripes:form beanclass="cvrp.action.LoginActionBean">
        <stripes:errors/>
        <div> Create an account in our system </div>
        <div class="row center-block">
            <div class="col-xs-6">
                <div class="col-xs-2">
                    Name:
                </div>
                <div class="col-xs-3">
                    <input name="name" class="form-control" width="19"/>
                </div><br><br>
                <div class="col-xs-2">
                    Phone number:
                </div>
                <div class="col-xs-3">
                    <input name="phoneNumber" class="form-control" width="19"/>
                </div><br><br>
                <div class="col-xs-2">
                     Login:
                </div>
                <div class="col-xs-3">
                    <input name="login" class="form-control" width="19"/>
                </div><br><br>
                <div class="col-xs-2">
                       Password:
                </div>
                <div class="col-xs-3">
                    <input class="form-control input-normal" id="password" name="password" type="password" value="" width="19" />
                </div><br><br>
                <div class="col-xs-2">
                    Copy Password:
                </div>
                <div class="col-xs-3">
                    <input class="form-control input-normal" id="controlPassword" name="controlPassword" type="password" value="" width="19" />
                </div><br><br>
                <div class="col-xs-2"> </div>
                <div class="col-xs-3 text-right">
                    <s:submit class="btn btn-default" name="enter" value="Enter"/>
                </div>
            </div>
         </div>
        </stripes:form>
    </s:layout-component>
</s:layout-render>
