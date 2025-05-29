package SandwichShop;

import static org.junit.jupiter.api.Assertions.*;

class ChipsTest {

    @org.junit.jupiter.api.Test
    void calculatePriceMultipleChips() {
        Chips chips = new Chips();
        chips.setQuantity(7);
        assertEquals(7, chips.getQuantity());
    }
}