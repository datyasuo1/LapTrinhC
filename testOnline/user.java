package testOnline;

public class user {
    private int userID ;
    private String name;
    private String pass;
    private int type;
    private String createdate;
    private String updatedate;

    public user(){
        userID = 0;
        name = "";
        pass = "";
        type = 0;
        createdate ="";
        updatedate ="";
    }

    public user(int userID, String name, String pass, int type, String createdate, String updatedate) {
        this.userID = userID;
        this.name = name;
        this.pass = pass;
        this.type = type;
        this.createdate = createdate;
        this.updatedate = updatedate;
    }

    public user(String name, String pass, int type) {
        this.name = name;
        this.pass = pass;
        this.type = type;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }
}
