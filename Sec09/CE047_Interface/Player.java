package CE047_Interface;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    //@Override
    public List<String> write() {

        List<String> playerList = new ArrayList<>();
        playerList.add(0, getName());
        playerList.add(1, Integer.toString(getHitPoints()));
        playerList.add(2, Integer.toString(getStrength()));
        playerList.add(3, getWeapon());
        return playerList;
    }

    @Override
    public void read(List<String> list) {
        if ((list != null) && (list.size() > 0)) {
            name = list.get(0);
            hitPoints = Integer.parseInt(list.get(1));
            strength = Integer.parseInt(list.get(2));
            weapon = list.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + getName() + "', hitPoints=" + getHitPoints() +", strength=" + getStrength() + ", weapon='" + getWeapon() + "'}";
        /*return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';*/
    }
}
