package Transport;

public enum TruckWeight {
    N_1(0D,3.5D), N_2(3.5D,12D), N_3(12D, null);
    private final Double from;
    private final Double to;

    TruckWeight(Double from, Double to) {
        this.from = from;
        this.to = to;
    }

    public Double getFrom() { return from;}

    public Double getTo() { return to;}
}