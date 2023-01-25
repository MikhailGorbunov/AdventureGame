package Characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public abstract class CharacterBuild {
    private int height;
    private int weight;

    private int stamina;
    private int magicka;
    private int health;
    private int armor;
//    private String equipment;

    private Hashtable<String, String> equipment;
    private String pets;

    public CharacterBuild(int height, int weight, int stamina, int magicka, int health, int armor, Hashtable<String, String> equipment, String pets) {
        this.height = height;
        this.weight = weight;
        this.stamina = stamina;
        this.magicka = magicka;
        this.health = health;
        this.armor = armor;
        this.equipment = equipment;
        this.pets = pets;
        equipment.put("left-hand","");
        equipment.put("right-hand","");
        equipment.put("second-weapon","");

    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMagicka() {
        return magicka;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public Hashtable<String, String> getEquipment() {
        return equipment;
    }

    public String getPets() {
        return pets;
    }

}

