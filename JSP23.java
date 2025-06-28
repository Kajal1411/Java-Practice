//Test1.java
package myPack;
import java.io.Serializable;
public class Test1 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String uname, upass;
    public Test1() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
}


//Test2.java
package myPack;
import java.io.Serializable;
public class Test2 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name, pass;

    public Test2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
