package test.java.packages.aircrafts.base;

import main.java.packages.aircrafts.base.Affiliation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AffiliationTest {

    @Test
    void getNameTest() {
        Affiliation affiliation = Affiliation.BLOOD_ANGELS;
        String result = affiliation.getName();

        assertEquals("Blood Angels", result);
    }

    @Test
    void testToString() {
        Affiliation affiliation = Affiliation.IMPERIAL_FISTS;
        String result = affiliation.toString();

        assertEquals("Imperial Fists", result);
    }
}