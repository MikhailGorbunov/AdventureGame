package Characters;

import ToolsSkills.Creature;

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

    private HashMap<String, String> equipment;
    private Creature pets;

    public CharacterBuild(int height, int weight, int stamina, int magicka, int health, int armor, HashMap<String, String> equipment, Creature pets) {
        this.height = height;
        this.weight = weight;
        this.stamina = stamina;
        this.magicka = magicka;
        this.health = health;
        this.armor = armor;
        this.equipment = equipment;
        this.pets = pets;


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

    public HashMap<String, String> getEquipment() {
        return equipment;
    }

    public Creature getPets() {
        return pets;
    }

}

