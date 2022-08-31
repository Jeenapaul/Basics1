package listExample;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int rollNo;
    String name;
    int mark;


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo() {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void showDetails(){
        List<String> studentName = new ArrayList<>();
        studentName.add("jeena");
        studentName.add("Riya");
        studentName.add("sheeba");
        studentName.remove("jeena");
        System.out.println(studentName.contains("Riya"));
        System.out.println("Student name list "+studentName);


       List<Integer> stuentMarks = new ArrayList<>();
        stuentMarks.add(45);
        stuentMarks.add(46);
        stuentMarks.add(48);
        System.out.println("Student Marks are "+stuentMarks);

    }
}

