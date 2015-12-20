package cn.ebatech.imixpark.wifi.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {

    @NotNull
    @Min(1L)
    private Long id;

    @NotNull
    @Size(min = 6, max = 50)
    private String user_name;

    @NotNull
    @Size(min = 6, max = 50)
    private String login_name;

    @NotNull
    private String pass_word;

    @NotNull
    private String pass_salt;

    public User() {
    }

    public User(Long id, String user_name) {
        this.id = id;
        this.user_name = user_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "User (" +
                "id=" + id +
                ", userName='" + user_name + '\'' +
                ')';
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }

    public String getPass_salt() {
        return pass_salt;
    }

    public void setPass_salt(String pass_salt) {
        this.pass_salt = pass_salt;
    }
}
