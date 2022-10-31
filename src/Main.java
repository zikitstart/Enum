import Transport.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Audi","A8 50 L TDI quattro",3.0,BodyType.SEDAN);
        Car car2 = new Car("BMW","Z8",3.0,BodyType.CROSSOVER);
        Car car3 = new Car("Kia","Sportage 4",2.4,BodyType.HATCHBACK);
        Car car4 = new Car("Hyundai","Avante",1.6,BodyType.SEDAN);

        Trucks trucks1 = new Trucks ("Mercedes-Benz","B-901" , 6.6, LoadCapacity.N1);
        Trucks trucks2 = new Trucks("Nissan", "399", 6.2,LoadCapacity.N2);
        Trucks trucks3 = new Trucks("Chevrolet","M700", 7.5,LoadCapacity.N1);
        Trucks trucks4 = new Trucks("Scania","T540", 8.7,LoadCapacity.N3);

        Bus bus1 = new Bus("Hyundai","Н350",5.5,Capacity.SMALL);
        Bus bus2 = new Bus("Kia","Н508",4.6,Capacity.ESPECIALLY_SMALL);
        Bus bus3 = new Bus("Икарус","399",4.8,Capacity.SMALL);
        Bus bus4 = new Bus("Iveco","320",5.1,Capacity.LARGE);

        System.out.println("#############");
        System.out.println(car1);
        car1.pitStop();
        car1.bestLapTime();
        car1.maxSpeed();
        car1.printType();
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        System.out.println("#############");
        System.out.println(trucks1);
        trucks1.pitStop();
        trucks1.bestLapTime();
        trucks1.maxSpeed();
        trucks1.printType();
        System.out.println(trucks2);
        System.out.println(trucks3);
        System.out.println(trucks4);

        System.out.println("#############");
        System.out.println(bus1);
        bus1.pitStop();
        bus1.bestLapTime();
        bus1.maxSpeed();
        bus1.printType();
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
    }
}