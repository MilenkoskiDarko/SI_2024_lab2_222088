import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class SILab2Test {

    private List<Item> create(Item... items)
    {
        return new ArrayList<Item>(Arrays.asList(items));

    }
    @Test
    void checkMultipleCondition() {
        assertTrue(SILab2.checkCart(create(new Item("bkw","043046",600,0.3f)),10000));
        assertFalse(SILab2.checkCart(create(new Item("bkw","143046",600,0.3f)),2));
        assertFalse(SILab2.checkCart(create(new Item("bkw","043046",600,-3f)),2));
        assertFalse(SILab2.checkCart(create(new Item("bkw","043046",130,0.3f)),2));
    }
    @Test
    void checkEveryBranch() {
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(null,0));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));
        assertTrue(SILab2.checkCart(new ArrayList<Item>(), 0));
        assertFalse(SILab2.checkCart(new ArrayList<Item>(), -3));
        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(create(new Item("",null,20,0.3f)),0));

        assertTrue(ex.getMessage().contains("No barcode!"));

        assertFalse(SILab2.checkCart(create(new Item("","853124",365,0.3f)),0));

        ex=assertThrows(RuntimeException.class, ()-> SILab2.checkCart(create(new Item("","345kg",365,0.3f)),0));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));
        assertFalse(SILab2.checkCart(create(new Item("bkw","853124",220,-0.3f)),0));

    }


}