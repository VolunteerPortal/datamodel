package com.ba.volunteer.data.user;

import java.io.Serializable;

/**
 * Created by John on 26/01/2016.
 */
public class Contact implements Serializable {

    private TelephoneNumber telephoneNumber;

    private String email;

    public Contact() {

    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(TelephoneNumber telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
