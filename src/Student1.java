import java.util.Comparator;

public class Student1  {
    private String name;
    private int course;
    private int group;
    private int grade;
    Comparator<Student1> compareByName = new Comparator<Student1>() {
        @Override
        public int compare(Student1 o1, Student1 o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    public Student1(String name, int course, int group, int grade) {
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
        return "Student1{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", grade=" + grade +
                '}';
    }

}
