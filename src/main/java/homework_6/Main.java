package homework_6;

import homework_5.controller.Controller;
import homework_5.model.Student;
import homework_5.model.Teacher;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Саша", 1, Arrays.asList(5, 4, 5, 2, 3));
        Student student1 = new Student("Марк", 1, Arrays.asList(5, 4, 5, 2, 3));
        Student student2 = new Student("Кирил", 2, Arrays.asList(5, 4, 5, 2, 3));
        Student student3 = new Student("Даша", 2, Arrays.asList(5, 4, 5, 2, 3));
        Teacher teacher1 = new Teacher("Борис Петрович", 20, List.of(1));
        Teacher teacher2 = new Teacher("Елена Михайловна", 20, List.of(2));
        Controller controller=new Controller();
        System.out.println(controller.getGroup(Arrays.asList(student,student1),teacher1));
        System.out.println(controller.getGroup(Arrays.asList(student2,student3),teacher2));
    }
}
