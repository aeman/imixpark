package cn.ebatech.imixpark.demo.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
//@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class User implements Serializable {

    @NotNull
    @Min(1L)
    private Long id;

    @NotNull
    @Size(min = 6, max = 50)
    private String user_name="";

    @NotNull
    @Size(min = 6, max = 50)
    private String login_name="";

    @NotNull
    private String pass_word="";

    @NotNull
    private String pass_salt="";

    private Integer test_int=0;

    private Double test_double=0.0;

    private Date test_date=new Date(0L);

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

    public Integer getTest_int() {
        return test_int;
    }

    public void setTest_int(Integer test_int) {
        this.test_int = test_int;
    }

    public Double getTest_double() {
        return test_double;
    }

    public void setTest_double(Double test_double) {
        this.test_double = test_double;
    }

    public Date getTest_date() {
        return test_date;
    }

    public void setTest_date(Date test_date) {
        this.test_date = test_date;
    }
}
