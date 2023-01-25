package Characters;

public class Barbarian extends CharacterBuild {
    String race;

    public Barbarian(int height, int weight, int stamina, int magicka, int health, int armor, String equipment, String pets, String race) {
        super(height, weight, stamina, magicka, health, armor, equipment, pets);
        this.race = race;
    }

    public String getRace() {
        race = "barbarian";
        return race;
    }
}
