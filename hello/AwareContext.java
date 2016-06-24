package hello;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by liuzhe on 2016/6/23.
 */
public class AwareContext implements ApplicationAware, SessionAware, RequestAware,
        ParameterAware{

    private String name;

    public String  execute(){
        System.out.println(application.toString());

        application.put("ApplicationAwareKey", "Test ApplicationAwareKeyvalue");

        ac.getApplication().put("ApplicationContextKey", "ApplicationContextvalue");

        this.name = "nihao ";
        return "success";
    }

    private Map<String, Object> application;
    private ActionContext ac;


    @Override
    public void setApplication(Map<String, Object> map) {
        this.application = map;
        ac = ActionContext.getContext();
    }

    @Override
    public void setParameters(Map<String, String[]> map) {
        System.out.println(map);
    }

    @Override
    public void setRequest(Map<String, Object> map) {
        System.out.println(map);
    }

    @Override
    public void setSession(Map<String, Object> map) {
        System.out.println(map);
    }
}
