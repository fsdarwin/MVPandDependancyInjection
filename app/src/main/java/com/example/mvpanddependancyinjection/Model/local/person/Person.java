package com.example.mvpanddependancyinjection.Model.local.person;

public class Person {
    private String firstName;
    private String lastName;
    private String age;
    private String gender;
    private String birthDate;
    private boolean isSane;

    public Person() {
    }

    public Person(String firstName, String lastName, String age, String gender, String birthDate, boolean isSane) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
        this.isSane = isSane;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isSane() {
        return isSane;
    }

    public void setSane(boolean sane) {
        isSane = sane;
    }
}
