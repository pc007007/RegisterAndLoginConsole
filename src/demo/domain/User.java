package demo.domain;

/**
 * Created by pc on 1/25/16.
 */
public class User {

    private String username;
    private String password;
    private String city;
    private String mobile;
    private String email;

    public User() {
    }

    public User(String username, String password, String city, String mobile, String email) {
        this.username = username;
        this.password = password;
        this.city = city;
        this.mobile = mobile;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
