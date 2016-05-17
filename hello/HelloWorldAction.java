package hello;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.util.DateFormatter;

import java.util.Date;

/**
 * Created by liuzhe on 2016/5/17.
 */
public class HelloWorldAction extends ActionSupport{
    private String name;
    private Date date;

    public Date getDate() {
        return date;
    }

    public String exec(){



        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setFormat("YYMMDD");
        this.date = dateFormatter.getDate();


        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
