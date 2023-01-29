package Characters;

import ToolsSkills.Creature;

import java.util.HashMap;
import java.util.Hashtable;

public class Barbarian extends CharacterBuild {
    String type;


    public Barbarian(int height, int weight, int stamina, int magicka, int health, int armor, HashMap equipment, Creature pets, String type) {
        super(height, weight, stamina, magicka, health, armor, equipment, pets);
        this.type = type;
    }
    public String getType() {
        return type;
    }



}
