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


//login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DataStore.jsp">
<label for="firstname">First Name:</label><br>
<input type="text" name="firstname"><br><br>
<label for="lastname">Last name:</label><br>
<input type="text" name="lastname"><br><br>
<label for="mob">Mobile:</label><br>
<input type="text" name="mob"><br><br>
<label for="uname">UserName:</label><br>
<input type="text" name="uname"><br><br>
<label for="upass">Password:</label><br>
<input type="text" name="upass"><br><br>
<button type="submit">Submit</button>
</form>
</body>
</html>