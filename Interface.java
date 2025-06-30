interface Animal{
    int eyes = 2;
    void walks();
}
class Horse implements Animal{
    public void Walks(){
        System.out.println("walks on 4 legs");
    }
}

Public Interface{
    public static void main(String[]args){
        Horse horse = new Horse();
        horse.Walks();
    }
}