package com.ba.volunteer.data.common;

import java.io.Serializable;

/**
 * Created by John on 26/01/2016.
 */
public class Error implements Serializable {

    private String code;

    private String reason;

    private String timeStamp;

    public Error() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
