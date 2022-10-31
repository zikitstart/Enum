package Transport;

public class Car extends Transport implements Competing {
    private BodyType type;

    public Car(String brand, String model, double engineVolume, BodyType type) {
        super(brand, model, engineVolume);
        this.type = type;
    }

    public BodyType getType() {
        return type;
    }

    public void setType(BodyType type) {
        this.type = type;
    }

    @Override
    public void startMoving() {
        System.out.println("Легковой автомобиль начал движение");
    }
    @Override
    public void finishTheMovement() {
        System.out.println("Легковой автомобиль закончил движение");
    }

    @Override
    public void printType() {
        if(type == null) {
            System.out.println("Данных по авто недостаточно.");
        }else {
            System.out.println("Тип кузова: " + type.getName() + ".");
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
                " / Объем двигателя: " + getEngineVolume() + " литра.";
    }
}