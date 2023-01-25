
import Characters.Barbarian;
import Characters.CharacterBuild;
import ToolsSkills.Creature;
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
        equipment.put("left-hand", "");
        equipment.put("right-hand", "");
        equipment.put("second-weapon", "");
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


}




