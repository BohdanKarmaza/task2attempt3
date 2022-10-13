package com.company.entities;

public class Person {

    public Person(String fullName, int age, String sex, String telephoneNumber) {
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
        this.telephoneNumber = telephoneNumber;
    }
    private String fullName;
    public String getFullName(){
        return this.fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    private int age;
    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    private String sex;
    public String getSex(){
        return this.sex;
    }
    public void setSex(String Sex) {
        this.sex = sex;
    }
    private String telephoneNumber;
    public String getTelephoneNumber(){
        return this.telephoneNumber;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

}
