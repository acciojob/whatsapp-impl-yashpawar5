package com.driver;

public class User {
    private String name;

    public User(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String mobile;
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getMobile() {
        return mobile;
    }


}
