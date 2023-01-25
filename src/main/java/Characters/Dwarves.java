package Characters;

import ToolsSkills.Creature;

import java.util.HashMap;

public class Dwarves extends CharacterBuild {
    String race;

    public Dwarves(int height, int weight, int stamina, int magicka, int health, int armor, HashMap equipment, Creature pets, String race) {
        super(height, weight, stamina, magicka, health, armor, equipment, pets);
        this.race = race;
    }

    public String getRace() {
        race = "dwarves";
        return race;
    }
}