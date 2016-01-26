package com.ba.volunteer.data.user;

import java.io.Serializable;

/**
 * Created by John on 26/01/2016.
 */
public class Name implements Serializable {

    private String title;

    private String firstname;

    private String lastname;

    public Name() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
