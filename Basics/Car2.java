class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}

class Car2 extends Vehicle {
    private String modelName = "Mustang";
    public static void main (String[] args){

        Car2 myCar = new Car2();

        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}