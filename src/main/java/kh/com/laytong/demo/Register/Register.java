package kh.com.laytong.demo.Register;

public class Register {
    private Long id;
    private String userName;
    private String password;
    private String email;
    private Long age;
    private boolean isSingle;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Register() {
    }

    public Register(String userName, String password, String email, Long age, boolean isSingle, Long id) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.age = age;
        this.isSingle = isSingle;
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public boolean isSingle() {
        return isSingle;
    }

    public void setSingle(boolean single) {
        isSingle = single;
    }
}
