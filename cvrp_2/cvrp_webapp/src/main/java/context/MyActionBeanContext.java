package context;

import net.sourceforge.stripes.action.ActionBeanContext;

/**
 * Created by Nastya on 06.11.2014.
 */

public class MyActionBeanContext extends ActionBeanContext {

    public MyActionBeanContext() {
        super();
    }
    public void setUser(String user) {
        getRequest().getSession().setAttribute("user", user);
    }

    public String getUser() {
        return (String) getRequest().getSession().getAttribute("user");
    }
}
