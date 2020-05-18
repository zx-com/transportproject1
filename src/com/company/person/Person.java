package com.company.person;

import com.company.transport.Aircraft;

public class Person {
    private String id;
    private String p_Name;

    public void driveTransport(Aircraft aircraft){
        System.out.println(id+" ");
        aircraft.drivingMethod();
    }

    public Person(String id) {
        this.id = id;
    }

    public Person() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

}
