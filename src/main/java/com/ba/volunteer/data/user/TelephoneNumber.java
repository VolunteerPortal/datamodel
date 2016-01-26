package com.ba.volunteer.data.user;

import java.io.Serializable;

/**
 * Created by John on 26/01/2016.
 */
public class TelephoneNumber implements Serializable {

    private String number;

    private String countryCode;

    public TelephoneNumber() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
