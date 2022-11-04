package logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceDishTest {

    @Test
    void add() {
        ServiceDish service = new ServiceDish();
        assertTrue( service.add( new Dish("03","Pollo",false,450,32000)));
        assertFalse( service.add( new Dish("03","Carne",false,560,45000)));
        assertEquals(1, service.getSize());
        assertTrue( service.add( new Dish("05","Carne",false,560,45000)));
    }

    @Test
    void findDish() {
        ServiceDish service = new ServiceDish();
        assertNull(service.findDish("03"));
        assertTrue( service.add( new Dish("03","Pollo",false,450,32000)));
        assertNotNull(service.findDish("03"));
        assertEquals("Pollo",service.findDish("03").getName());
    }
}