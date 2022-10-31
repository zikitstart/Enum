package Transport;

public enum LoadCapacity {
    N1(0,3.5),
    N2(3.5,12.0),
    N3(12.0,0.0);

    private final double from;
    private final double to;

    LoadCapacity(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }
    public double getTo() {
        return to;
    }
}