package Transport;

public class Trucks extends Transport implements Competing {
    private LoadCapacity load;
    public Trucks(String brand, String model, double engineVolume,LoadCapacity load) {
        super(brand, model, engineVolume);
        this.load = load;
    }

    public LoadCapacity getLoad() {
        return load;
    }

    public void setLoad(LoadCapacity load) {
        this.load = load;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль начал движение");
    }
    @Override
    public void finishTheMovement() {
        System.out.println("Грузовой автомобиль закончил движение");
    }

    @Override
    public void printType() {
        if(load == null) {
            System.out.println("Данных по авто недостаточно.");
        }else {
            System.out.println("Грузоподъемность авто: от " + load.getFrom() + " до " + load.getTo() + " Тонн.");
        }
    }

    @Override
    public double pitStop() {
        System.out.println("Пит-стоп.");
        return 0;
    }
    @Override
    public double bestLapTime() {
        System.out.println("Лучшее время круга.");
        return 0;
    }
    @Override
    public int maxSpeed() {
        System.out.println("Максимальная скорость.");
        return 0;
    }
    @Override
    public String toString() {
        return "{Брэнд: " + getBrand() +
                " / Модель: " + getModel() +
                " / Объем двигателя: " + getEngineVolume() + " литра}";
    }
}