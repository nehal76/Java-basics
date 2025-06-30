class Student{
    String name;
    int age;
    public void studentinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
                // Parametrise Constructor

    Student(String name, int age){
    this.name = name;
    this.age = age;
}
        //   Copy properties from one cunstructor to another
    Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
    }

    Student(){
        
    }
}



class Constructor{
    public static void main(String[]args){
        Student s1 = new Student();
        s1.name="Nehal";
        s1.age = 23;
        s1.studentinfo();

        Student s2 = new Student(s1);
        s2.studentinfo();
    }
}