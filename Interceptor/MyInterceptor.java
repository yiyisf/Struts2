package Interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by liuzhe on 2016/5/17.
 */
public class MyInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.print("intercept preporcess.....");
        System.out.print("input action:" + actionInvocation.getAction().toString());
        String result = actionInvocation.invoke();

        System.out.print("result:" + actionInvocation.getResultCode());
        System.out.print("intercept already progrecess...");

        return result;
    }
}
