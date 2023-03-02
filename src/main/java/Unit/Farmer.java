package Unit;

public class Farmer extends Character {

    int feed;
    int cartridges;

    public Farmer(String name, int hp, int attack) {
        super(name, hp, attack);

    }
    public int getCartridges() {
        return 10;
    }
    public int getFeed() {
        return 0;
    }

}