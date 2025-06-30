import java.util.*;

interface Lambdaa{
    public int display(int a, int b);
}

class LamdaConcept{
    public static void main(String[] args){

       Lambdaa l  = (a, b) -> a+b;  {
       
           System.out.println("The sum is: " + l.display(10, 20));
       };
       
       
    }
}