package com.ba.volunteer.data.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 26/01/2016.
 */
public class Errors implements Serializable {

    List<Error> errors = new ArrayList<Error>();

    public Errors() {

    }

    public List<Error> getErrors() {
        return errors;
    }
}
