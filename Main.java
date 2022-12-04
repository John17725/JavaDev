class Main{
    public static void main(String[] args){
        Car auto = new Car();
        auto.licence = "amd123";
        auto.driver = "Andres Herrera";
        auto.passenger = 4;
        Car auto2 = new Car();
        auto2.licence = "amd223";
        auto2.driver = "Davvid";
        auto2.passenger = 100;
        System.out.println("Car licence: "+auto.licence);
        System.out.println("Car2 licence: "+auto2.licence);
    }
}