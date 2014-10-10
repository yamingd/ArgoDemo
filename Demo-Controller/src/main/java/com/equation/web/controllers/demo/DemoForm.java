package com.equation.web.controllers.demo;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * Created by yaming_deng on 14-8-21.
 */
public class DemoForm {

    @NotEmpty(message = "uname_empty")
    @Length(min=0, max=10, message = "uname_too_long")
    private String uname;

    @NotEmpty(message = "email_empty")
    @Email(message = "email_format_invalid")
    private String email;

    @NotEmpty(message = "passwd_empty")
    @Length(min=0, max=10, message = "passwd_too_long")
    private String passwd;

    @NotEmpty(message = "iconUrl_empty")
    private String iconUrl;

    @NotNull(message = "prize_empty")
    private Integer prize;

    @URL(message = "httpUrl_format_invalid")
    private String httpUrl;

    private String token;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @NotNull(message = "birthday_empty")
    @Past
    private Date birthday;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getPrize() {
        return prize;
    }

    public void setPrize(Integer prize) {
        this.prize = prize;
    }

    public String getHttpUrl() {
        return httpUrl;
    }

    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "DemoForm{" +
                "uname='" + uname + '\'' +
                ", email='" + email + '\'' +
                ", passwd='" + passwd + '\'' +
                ", iconUrl='" + iconUrl + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
