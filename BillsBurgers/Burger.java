public class Burger {
    private String name;
    private String breadRollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;


    public Burger(String breadRollType, String meat, boolean lettuce, boolean tomato, boolean carrot) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }
}
