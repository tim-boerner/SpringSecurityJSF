import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.security.access.prepost.PreAuthorize;

@ManagedBean(name="helloWorld")
@SessionScoped
public class HelloWorld {
    private static final long serialVersionUID = -6913972022251814607L;

    private String s1 = "Hello World!!";
    private String s2 = "Second Hello World!!";
    private String secure = "secure";
    private String notSecure = "not secure";

    public String getNotSecure() {
        return notSecure;
    }

    public void setNotSecure(String notSecure) {
        this.notSecure = notSecure;
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    public String getSecure() {
        return secure;
    }

    public void setSecure(String secure) {
        this.secure = secure;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }
}
