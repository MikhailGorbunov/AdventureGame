
import Characters.Barbarian;
import ToolsSkills.WeaponType;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    WeaponType weapon;

    HashMap equipment;

    @Before
    public void setUp() {
//        character = new Bedroom(1, RoomType.DOUBLE, 55.00);
        equipment = new HashMap();
        equipment.put("left-hand", "Dagger");
        equipment.put("right-hand", "Dagger");
        equipment.put("second-weapon", "Dagger");
        barbarian = new Barbarian(180, 80, 55, 39, 100, 50, equipment, null, "Barbarian");
    }

        @Test
        public void hasHeight(){
            assertEquals(180, barbarian.getHeight());
        }

        @Test
        public void hasWeight() {
            assertEquals(80, barbarian.getWeight());
        }
        @Test
        public void hasStamina() {
            assertEquals(55, barbarian.getStamina());
    }
        @Test
        public void hasMagicka() {
            assertEquals(39, barbarian.getMagicka());
    }
        @Test
        public void hasHealth() {
            assertEquals(100, barbarian.getHealth());
    }
        @Test
        public void hasArmor() {
            assertEquals(50, barbarian.getArmor());
    }
        @Test
        public void hasEquipment() {
            assertEquals(80, barbarian.getEquipment());
    }
        @Test
        public void hasPets() {
            assertEquals(null, barbarian.getPets());
    }
        @Test
        public void hasType() {
            assertEquals("Barbarian", barbarian.getType());
    }




}




