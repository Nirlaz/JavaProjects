public class Student {
    private double id;
    private String name;
    private double rollno;

    public Student(double id, String name, double rollno) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}

