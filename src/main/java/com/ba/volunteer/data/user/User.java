package com.ba.volunteer.data.user;

import java.io.Serializable;

/**
 * Created by John on 26/01/2016.
 */
public class User implements Serializable {

    private String userID;

    private String username;

    private UserType userType;

    private Name name;

    private Contact primaryContact;

    private Contact secondaryContact;

    private String directorate;

    public User() {

    }
}
