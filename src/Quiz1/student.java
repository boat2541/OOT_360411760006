package Quiz1;

public class student {
    private String name;
    private String id;
    private String major;
    private double gpa;

    public student(String name, String id, String major, double gpa) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void getstudentinfo() {
        System.out.println(name + id + major + gpa);
    }


    public String showgrade() {
        return "student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                '}';
    }

}//class
