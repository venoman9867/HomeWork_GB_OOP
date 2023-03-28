package homework_6;

import homework_5.model.Student;
import homework_5.model.Teacher;

import java.util.List;

public class StudyGroup {
    private static int counter;
    private int numberOfGroup;
    private Teacher teacherID;
    private List<Student> studentList;

    public StudyGroup(Teacher teacherID, List<Student> studentList) {
        numberOfGroup = counter;
        this.teacherID = teacherID;
        this.studentList = studentList;
        counter++;
    }

    @Override
    public String toString() {
        return "Номер группы: " + numberOfGroup + ".\nПреподаватель: " + teacherID + ". \nСписок студентов: " + studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
