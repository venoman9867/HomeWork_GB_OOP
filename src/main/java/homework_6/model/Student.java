package homework_6.model;

import homework_5.model.User;

import java.util.List;

public class Student extends User implements StudentActions{
    private int groupID;
    private List<Integer> listMarks;

    public Student(String name, int groupID, List<Integer> listMarks) {
        super(name);
        this.groupID = groupID;
        this.listMarks = listMarks;
    }

    @Override
    public String toString() {
        return "id:"+getUserID()+" name:"+super.getName()+" marks:"+listMarks;
    }

    @Override
    public void changeGroup(int group) {
        this.groupID=group;
    }
}
