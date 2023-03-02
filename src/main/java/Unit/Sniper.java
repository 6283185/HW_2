package Unit;

import Unit.Character;

public class Sniper extends Character {
    int accuracy = 5;
    int cartridges = 5;
    int disguise = 20;

    public Sniper(String name, int hp, int attack) {
        super(name, hp, attack);
    }
    @Override
    public int getAttack() {
        return 15;
    }

}