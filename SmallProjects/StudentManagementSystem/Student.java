package SmallProjects.StudentManagementSystem;

public class Student {

    private int id;
    private String name;
    private double percentage;

    public Student(int id,String name,double percenatage)
    {
        this.id = id;
        this.name = name;
        this.percentage = percenatage;
    }

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

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
}
