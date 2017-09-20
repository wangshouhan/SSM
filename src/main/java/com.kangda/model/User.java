package com.kangda.model;

/**
 * Created by: shouhan
 *
 * @Date: 15:29 2017/9/20
 */
public class User {
    private Long id;
    private String user_name;
    private String pass_word;

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

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }
}
