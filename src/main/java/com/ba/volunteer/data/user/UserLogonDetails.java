package com.ba.volunteer.data.user;

import java.io.Serializable;

/**
 * Created by John on 26/01/2016.
 */
public class UserLogonDetails  implements Serializable {

    private String username;

    private String password;

    public UserLogonDetails() {

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



}
