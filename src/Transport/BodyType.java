package Transport;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COMPARTMENT("Купе"),
    STATION_WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP_TRUCK("Пикап"),
    THE_VAN("Фургон"),
    MINIVAN("Минивэн");

    private String type;

    BodyType(String type) {
        this.type = type;
    }

    public String getName() {
        return type;
    }
}
