class Car {
    String color = "Red";
    void display() {
        System.out.println("Car color: " + color);
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display();
    }
}