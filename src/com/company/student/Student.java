package com.company.student;

/**
 * Created by pavlo on 12/8/2017.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String group;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }
}
