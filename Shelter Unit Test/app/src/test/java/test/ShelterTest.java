package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShelterTest {

    @Test void shouldSetShelterOccupancy() {
        Shelter.SetStatus status;
        Shelter classUnderTest = new Shelter();
        
        status = classUnderTest.setShelterOccupancy(50);

        assertEquals(Shelter.SetStatus.GOOD, status);
        assertEquals(50, classUnderTest.getShelterOccupancy());
    }

    @Test void shouldSetShelterOccupancyAtMinLimit() {
        Shelter.SetStatus status;
        Shelter classUnderTest = new Shelter();
        
        status = classUnderTest.setShelterOccupancy(0);

        assertEquals(Shelter.SetStatus.GOOD, status);
        assertEquals(0, classUnderTest.getShelterOccupancy());
    }

    @Test void shouldSetShelterOccupancyAtMaxLimit() {
        Shelter.SetStatus status;
        Shelter classUnderTest = new Shelter();
        
        status = classUnderTest.setShelterOccupancy(100);

        assertEquals(Shelter.SetStatus.GOOD, status);
        assertEquals(100, classUnderTest.getShelterOccupancy());
    }

    @Test void shouldNotSetShelterOccupancyWhenTooLarge() {
        Shelter.SetStatus status;
        Shelter classUnderTest = new Shelter();

        status = classUnderTest.setShelterOccupancy(100);
        status = classUnderTest.setShelterOccupancy(101);

        assertEquals(Shelter.SetStatus.OVER, status);
        assertEquals(100, classUnderTest.getShelterOccupancy());
    }
    @Test void shouldNotSetShelterOccupancyWhenTooSmall() {
        Shelter.SetStatus status;
        Shelter classUnderTest = new Shelter();

        status = classUnderTest.setShelterOccupancy(0);
        status = classUnderTest.setShelterOccupancy(-1);

        assertEquals(Shelter.SetStatus.UNDER, status);
        assertEquals(0, classUnderTest.getShelterOccupancy());
    }
}



