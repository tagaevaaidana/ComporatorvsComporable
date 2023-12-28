import java.util.Comparator;

public class Student implements Comparable<Student>{
    private String name;
    private int course;
    private int group;
    private int grade;

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }

    public Student(String name, int course, int group, int grade) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", grade=" + grade +
                '}';
    }

}
