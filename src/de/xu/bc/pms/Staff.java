package de.xu.bc.pms;

interface entriesManagemnt {
    //interface that will be implemented by the class Staff
    //need Appointment and Patient classes to code this up
}


public class Staff {
    final private int id;
    private int age;
    final private String name;
    final private String Surname;
    private double salary; 
    AccessLevel accessLevel;
    String title = "";

    Staff(int id, int age, String name, String Surname, double salary, AccessLevel accessLevel) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.Surname = Surname;
        this.salary = salary;
        this.accessLevel = accessLevel;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    public int getAge() {
        return age;
    }
    void updateAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public String getFullName() {
        return title + " " + name + " " + Surname;
    }
    
}

enum AccessLevel {
    BASIC,
    HIGH
}
