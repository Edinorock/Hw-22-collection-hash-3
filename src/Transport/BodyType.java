package Transport;

public enum BodyType {
    SEDAN("Седан"), HATCHBACK("Хетчбэк"), UNIVERSAL("Универсал"), SUV("Внедорожник"), CROSSOVER("Кроссовер"), COUPE("Купе"), VAN("Фургон"), MINIVAN("Минивэн"), PICKUP("Пикап");
    private final String BodyType;

    BodyType(String BodyType) {
        if(BodyType == null || BodyType.isBlank()) {
            this.BodyType = "Нет информации";
        } else {
            this.BodyType = BodyType;
        }

    }

    public String getBodyType() {

        return BodyType;
    }
}