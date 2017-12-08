package com.company.employer;

/**
 * Created by pavlo on 12/8/2017.
 */
public class Teacher extends Employer {
    private String cource;

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }
}
