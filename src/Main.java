import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeSet<Student1> student1s = new TreeSet<>(Arrays.asList(
                new Student1("Aidana",1,2,4),
                new Student1("Tagaeva",2,4,3),
                new Student1("Yulia",4,1,5),
                new Student1("Melnik",2,3,4),
                new Student1("Jama",4,1,6),
                new Student1("Dasha",3,2,4),
                new Student1("Aza",4,3,6),
                new Student1("Polina",3,4,5),
                new Student1("Zura",1,2,4),
                new Student1("Selin",3,4,6)));

//       Collections.sort(student1s, new Student1().compareByName);
//        System.out.println(student1s);
//        for (Student1 student : student1s){
//
//        }
//        System.out.println();



        TreeSet<Student> students = new TreeSet<>(Arrays.asList(
                new Student("Aidana",1,2,3),
                new Student("Tagaeva",2,3,2),
                new Student("Asan",3,4,2),
                new Student("Uson",2,3,1),
                new Student("Diana",3,2,4),
                new Student("Dasha",4,3,2),
                new Student("Yana",2,4,3),
                new Student("Masha",3,4,2),
                new Student("Vova",4,2,3),
                new Student("Pasha",3,4,1)));

        System.out.println(students);
        for (Student stud : students){
            if (stud.getGrade()<3){
                System.out.println(stud.getGrade().remove);
            }
        }


    }
}