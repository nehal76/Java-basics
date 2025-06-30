// How to create a method inside class with besic adding two numbers

public class Class{
    public int calculator(int num1, int num2){
        return num1+num2;
    }

    public static void main(String[] args){
        
        Class hello = new Class();

        int num1 = 20;
        int num2 = 30;

        int sum=hello.calculator(num1,num2);
        System.out.println(sum);
    }
}