package var3.Enum;

public enum SportType {

    FootBall("Football"),
    BasketBall("BasketBall"),
    Box("Box"),
    Tennis("Tennis");

    private String value;

    SportType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
