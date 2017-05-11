package po;

import org.apache.struts.action.ActionForm;

/**
 * Created by ARUN MANI on 4/29/2017.
 */
public class LoginForm extends ActionForm {

    final String originalUserId="arun";
    final String originalPassword="1234";

    private String userId;
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOriginalUserId() {
        return originalUserId;
    }

    public String getOriginalPassword() {
        return originalPassword;
    }
}
