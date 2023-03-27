package homework_5;

import homework_5.model.Student;
import homework_5.model.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup makeStudyGroup(Teacher teacherID, List<Student> studentList){
        return new StudyGroup(teacherID,studentList);
    }
}
