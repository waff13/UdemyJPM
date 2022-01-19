package CE047_Interface;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public List<String> write() {
        List<String> monsterList = new ArrayList<>();
        monsterList.add(0, this.name);
        monsterList.add(1, "" + this.hitPoints);
        monsterList.add(2, "" + this.strength);
        return monsterList;
    }

    @Override
    public void read(List<String> list) {
        if ((list != null) && (list.size() > 0)) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" + hitPoints +", strength=" + strength + "}";
        /*return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';*/
    }
}
