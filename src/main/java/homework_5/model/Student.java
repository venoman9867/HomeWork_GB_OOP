package homework_5.model;

import java.util.List;

public class Student extends User {
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
}
