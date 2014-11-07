package cvrp.action;

import context.MyActionBeanContext;
import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.validation.SimpleError;
import net.sourceforge.stripes.validation.Validate;
import net.sourceforge.stripes.validation.ValidationErrors;
import net.sourceforge.stripes.validation.ValidationMethod;

/**
 * Created by Nastya on 09.06.2014.
 */
@UrlBinding("/cvrp_webapp/CreateAccount.htm")
public class LoginActionBean extends BaseActionBean {
    public MyActionBeanContext getContext() {
        return ctx;
    }
    public void setContext(ActionBeanContext ctx) {
        this.ctx = (MyActionBeanContext)ctx;
    }

    private MyActionBeanContext ctx;

    @Validate(required=true, on="enter")
    private String password;
    @Validate(required=true, on="enter")
    private String controlPassword;
    private String login;
    private String name;
    @Validate(required=true, on="enter", mask="\\d+")
    private String phoneNumber;

    public String getControlPassword() {
        return controlPassword;
    }

    public void setControlPassword(String controlPassword) {
        this.controlPassword = controlPassword;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @DefaultHandler
    public Resolution view() {
        return new ForwardResolution("/WEB-INF/jsp/start.jsp");
    }

    @HandlesEvent("enter")
    public Resolution enter() {
        getContext().setUser(getLogin());
        this.setContext(ctx);
        return new ForwardResolution("/WEB-INF/jsp/home.jsp");
    }

    @ValidationMethod(on="enter")
    public void avoidEmptyLogin(ValidationErrors errors) {
        if (this.getLogin().isEmpty()) {
            errors.add("login", new SimpleError("Empty login"));
        }
    }
    @ValidationMethod(on="enter")
    public void avoidWrongPassword(ValidationErrors errors) {
        if (!getPassword().equals(getControlPassword())) {
            errors.add("password", new SimpleError("Password doesn't match to Check password"));
        }
    }
}
