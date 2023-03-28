package homework_6;

import homework_5.StudyGroup;
import homework_5.model.Student;
import homework_5.model.Teacher;

import java.util.List;

public class StudyGroupService {
    public homework_5.StudyGroup makeStudyGroup(Teacher teacherID, List<Student> studentList){
        return new StudyGroup(teacherID,studentList);
    }
}
