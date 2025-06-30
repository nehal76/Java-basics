class Family{
    int age= 23;
    String name = "Nehal";
    String child_number = "43";
    public void familyinfo(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.child_number);
    }
}

public class Methods{
    public static void main(String[] args){
       Family f1 = new Family();
    //    f1.age = 65;
    //    f1.name = "Granfather";
    //    f1.child_number= "7";

       f1.familyinfo();
    }
}