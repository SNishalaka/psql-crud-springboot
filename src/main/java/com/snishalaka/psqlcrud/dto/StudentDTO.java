package com.snishalaka.psqlcrud.dto;

public class StudentDTO {
    private String sid;
    private String name;
    private String address;
    private String age;

    public StudentDTO() {
    }

    public StudentDTO(String sid, String name, String address, String age) {
        this.sid = sid;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
