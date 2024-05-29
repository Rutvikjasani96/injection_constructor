package com.injecting_collection;

import java.util.List;

public class Person {
    private int personId;
    private String name;
    private Certificate certi;
    private List<String> courses;

    public Person(int personId,String name,Certificate certi,List<String> courses){
        this.personId = personId;
        this.name = name;
        this.certi = certi;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Person id : "+this.personId+"\nname : "+this.name+"\nCertificate : "+this.certi.name+"\ncourses : "+this.courses;
    }
}
