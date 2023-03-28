package homework_6.model;

import homework_5.model.User;

import java.util.List;

public class Teacher extends User implements TeacherActions{
    private int stageExperience;
    private List<Integer> groups;

    public Teacher(String name, int stageExperience, List<Integer> group) {
        super(name);
        this.stageExperience = stageExperience;
        this.groups = group;
    }
    @Override
    public String toString() {
        return "id:"+getUserID()+" name:"+super.getName()+" "+"stage: "+stageExperience+" groups:"+groups;
    }

    @Override
    public void changeExperience(int experience) {
        this.stageExperience=experience;
    }
}
