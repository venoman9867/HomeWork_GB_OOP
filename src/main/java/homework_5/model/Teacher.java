package homework_5.model;

import java.util.List;

public class Teacher extends User{
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
}
