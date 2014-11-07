package context;

import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.controller.ExecutionContext;
import net.sourceforge.stripes.controller.Interceptor;
import net.sourceforge.stripes.controller.Intercepts;
import net.sourceforge.stripes.controller.LifecycleStage;

/**
 * Created by Nastya on 06.11.2014.
 */

@Intercepts(LifecycleStage.HandlerResolution)
public class SecurityInterceptor implements Interceptor {
    /** Intercepts execution and checks that the user has appropriate permissions. */
    public Resolution intercept(ExecutionContext ctx) throws Exception {
        Resolution resolution = ctx.proceed();
        if (isLoggedIn(ctx.getActionBeanContext())) {
            return new ForwardResolution("/WEB-INF/jsp/home.jsp");
        }
        else {
            return new ForwardResolution("/WEB-INF/jsp/start.jsp");
        }
    }

    /** Returns true if the user is logged in. */
    protected boolean isLoggedIn(ActionBeanContext ctx) {
        return ((MyActionBeanContext) ctx).getUser() != null;
    }

    /** Returns true if the user is permitted to invoke the event requested.
     * @param actionBean
     * @param actionBeanContext*/

}
