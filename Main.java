import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Students> javaStudent = new ArrayList<>();

        System.out.println("Now the array is empty " + javaStudent);

        javaStudent.add(new Students("Alice", 20));
        javaStudent.add(new Students("Bob", 22));
        javaStudent.add(new Students("Sergio", 21));
        javaStudent.add(new Students("Davide", 19));

        System.out.println("The array after the add of names : ");
        popolateStudentArray(javaStudent);
    }

    public static void popolateStudentArray(ArrayList<Students> students) {
        for (Students student : students) {
            System.out.println("Name : " + student.getName() + "\n" + "Age : " + student.getAge());
        }
    }

}
