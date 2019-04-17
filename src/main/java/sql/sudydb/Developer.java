package sql.sudydb;

public class Developer {
    private int id;
    private String name;
    private String speciality;
    private int experience;
    private int salary;

    public Developer(int id, String name, String speciality, int experience, int salary) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.experience = experience;
        this.salary = salary;
    }

    public Developer(String name, String speciality, int experience, int salary) {
        this.name = name;
        this.speciality = speciality;
        this.experience = experience;
        this.salary = salary;
    }

    public Developer() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }
}
