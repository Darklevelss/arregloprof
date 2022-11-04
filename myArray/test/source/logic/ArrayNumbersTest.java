package logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayNumbersTest {
    private ArrayNumbers array;

    void setup(){
        array = new ArrayNumbers( new int[]{20,6,18,10,23,14,23,10,9,10,19,72});
    }

    @Test
    void findNumber() {
        setup();
        assertEquals(-1,array.findNumber(79));
        assertEquals(0,array.findNumber(20));
        assertEquals(11,array.findNumber(72));
        assertEquals(3,array.findNumber(10));
        assertEquals(4,array.findNumber(23));
        assertEquals(2,array.findNumber(18));
        assertEquals(-1,array.findNumber(200));

        assertEquals(20,array.getMyArray()[array.findNumber(20)]);
        assertEquals(3,array.getMyArray()[array.findNumber(3)]);
        assertEquals(11,array.getMyArray()[array.findNumber(11)]);
        assertEquals(23,array.getMyArray()[array.findNumber(23)]);
    }

    @Test
    void existsNumber() {
        setup();
        assertFalse( array.existsNumber( 100 ) );
        assertFalse( array.existsNumber( 300 ) );
        assertFalse( array.existsNumber( 7 ) );
        assertTrue( array.existsNumber( 10 ));
        assertTrue( array.existsNumber( 19 ));
        assertTrue( array.existsNumber( 23 ));
        assertTrue( array.existsNumber( 20 ));
        assertTrue( array.existsNumber( 18 ));
    }

    @Test
    void getPosFrecuence() {
        setup();
        assertEquals(3, array.getPosFrecuence(10).length);
        assertNull( array.getPosFrecuence(800));
        assertArrayEquals(new int[]{3,7,9},array.getPosFrecuence(10));
        assertArrayEquals(new int[]{4,6},array.getPosFrecuence(23));
        assertNull( array.getPosFrecuence(800));
    }

    @Test
    void getFrecuence(){
        setup();
        assertEquals(3,array.getFrecuence(10));
        assertEquals(2,array.getFrecuence(23));
        assertEquals(1,array.getFrecuence(18));
        assertEquals(0,array.getFrecuence(100));
    }

    @Test
    void findBinary(){
        setup();
        int[] aux = array.sortBurbble();
        assertEquals(6,array.findBinary(18));
        assertEquals(11,array.findBinary(72));
        assertEquals(0,array.findBinary(6));
        assertEquals(18,aux[6]);
        assertEquals(-1,array.findBinary(5));
        assertEquals(-1,array.findBinary(55));
        assertEquals(-1,array.findBinary(120));
        assertEquals(2,array.findBinary(10));
    }
    
}