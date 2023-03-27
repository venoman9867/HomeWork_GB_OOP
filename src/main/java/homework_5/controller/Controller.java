package homework_5.controller;

import homework_5.StudyGroup;
import homework_5.StudyGroupService;
import homework_5.model.Student;
import homework_5.model.Teacher;

import java.util.List;

public class Controller {

    public StudyGroup getGroup(List<Student> studentList, Teacher teacherID){
       return new StudyGroupService().makeStudyGroup(teacherID,studentList);
    }
}
