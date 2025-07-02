import java.util.*;

class Student {

    public static int count = 1;

    private String rollNumber;

    @Deprecated
    private String generatRollnumber() {
        Date date = new Date();
        String rn = "univ" + (date.getYear() + 1900) + "-" + count;
        count++;
        return rn;
    };

    Student() {
        rollNumber = generatRollnumber();
    }
    public  String getRollNumber(){
        return rollNumber;
    }

} 

public class Challenge {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Roll Number: " + s1.getRollNumber());
        System.out.println("Roll Number: " + s2.getRollNumber());

    }

}
