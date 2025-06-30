class Shap {
    String color = "Black";
}

class Triangle extends Shap{
    public void Area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

public class Inheritence{
    public static void main(String[] args){
        Triangle T1 = new Triangle();
        T1.Area(2,6);
    }
}