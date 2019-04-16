package core.serialization;

import java.io.Serializable;

public class Developer implements Serializable {
    private String name;
    private String speciality;
    private int expirience;
    transient private int salary;

    public Developer(String name, String speciality, int expirience, int salary) {
        this.name = name;
        this.speciality = speciality;
        this.expirience = expirience;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void doJob() {
        System.out.println(this.speciality + " developer " + this.name + " is writing code...");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                ", expirience=" + expirience +
                ", salary=" + salary +
                '}';
    }
}
