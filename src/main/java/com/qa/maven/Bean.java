package com.qa.maven;

import java.io.Serializable;

public class Bean implements Serializable {

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
