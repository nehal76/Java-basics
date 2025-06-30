class Student{

    String name= "Nehal";
    int age = 23;
    public void printinfo(String name, int age){
        System.out.println(name);
         System.out.println(age);

    }
    // public void printinfo(int age){
    //     System.out.println(age);
        
    // }
}

class Polymo{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.printinfo(s1.name);
        s1.printinfo(s1.age);

    }
}