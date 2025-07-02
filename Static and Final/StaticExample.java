// Static member can access by class directly
// Static member can be accessed by object also
// Static member is shared by all objects of the class
// Static member is stored in the class area of memory

class HondaCity {

    static float price = 1000000;

    public void displayPrice() {
        System.out.println(price);
    }

}

class StaticExample {
    public static void main(String[] args) {
        System.out.println(HondaCity.price); // Accessing static member using class name

        HondaCity h1 = new HondaCity();
        h1.displayPrice();
        

    }
}