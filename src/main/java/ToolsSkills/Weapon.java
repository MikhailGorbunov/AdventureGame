package ToolsSkills;

public class Weapon {

    private WeaponType type;
    private double damage;
    private double actualDamage;


    public Weapon(WeaponType type, double damage, double actualDamage) {
        this.type = type;
        this.damage = damage;
        this.actualDamage = actualDamage;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

//    public void setDamage(double damage) {
//        this.damage = type.damage/type.weight * 10;
//    }

    public double getDamage() {
        return damage;
    }
}