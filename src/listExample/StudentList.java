package listExample;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.get;

public class StudentList {
    public static void main(String args[]){
        Student stud = new Student();
        stud.showDetails();

        stud.rollNo = 45;
        Integer rollNo = stud.getRollNo();
        System.out.println("rollNo is "+rollNo);

    }
}
