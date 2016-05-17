package hello;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by liuzhe on 2016/5/17.
 */
public class LoginAction extends ActionSupport {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private String name;
    private String password;
    private String user;

    @Override
    public String execute() throws Exception {
        String ret = ERROR;
        Connection connection = null;
        try {


            System.out.print("input user:" + user);
            System.out.print("input passwor:" + password);
            String Url = "jdbc:mysql://XXX";
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(Url, "XXX", "XXX");
            String sql = "SELECT name FROM login WHERE";
            sql += " user = ? AND password = ? ";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setString(1, user);
            preparedStatement.setString(2, password);

            ResultSet set = preparedStatement.executeQuery();
            while (set.next()) {
                name = set.getString(1);
                ret = SUCCESS;
            }
        } catch (Exception e) {
            e.printStackTrace();
            ret = ERROR;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    ret = ERROR;
                }
            }
        }

        return ret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
