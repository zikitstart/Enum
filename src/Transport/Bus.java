package Transport;

public class Bus extends Transport implements Competing {
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume,Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение");
    }
    @Override
    public void finishTheMovement() {
        System.out.println("Автобус закончил движение");
    }

    @Override
    public void printType() {
        if(capacity == null) {
            System.out.println("Данных по авто недостаточно.");
        }else {
            System.out.println("Вместимость авто: от " + capacity.getFrom() + " до " + capacity.getTo() + " человек.");
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