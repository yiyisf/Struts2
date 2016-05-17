package hello;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by liuzhe on 2016/5/17.
 */
public class UploadFile extends ActionSupport {

    private File file;
    private String filename;
    private String contentType;
//    private String saveDir;

    public void setUpload(File file) {
        this.file = file;
    }

    public void setUploadContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setUploadFileName(String filename) {
        this.filename = filename;
    }

    @Override
    public String execute() throws Exception {
//        saveDir = "E:/apache-tomcat-9.0.0.M4/work";
        try {
            System.out.print("srcFilenam:" + file);
            System.out.print("dsc name:" + filename);
            File descFile = new File("E:/apache-tomcat-9.0.0.M4/work", filename);
            FileUtils.copyFile(file, descFile);

        }catch (IOException e){
            e.printStackTrace();
            return ERROR;
        }catch (Error e){
            e.printStackTrace();
            return ERROR;
        }
            return SUCCESS;

    }
}
