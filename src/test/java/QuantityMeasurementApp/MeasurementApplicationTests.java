package QuantityMeasurementApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;
=======
>>>>>>> d0b76d9a0491ec5c5b6bfb214c4a1c2f69bf5afc

@SpringBootTest
class MeasurementApplicationTests {

<<<<<<< HEAD
    @Test
    void contextLoads() {
    }

    @Test
    void testEquality_SameValue() {
        MeasurementApplication.Feet f1 = new MeasurementApplication.Feet(12.2);
        MeasurementApplication.Feet f2 = new MeasurementApplication.Feet(12.2);
        assertEquals(f1, f2);
    }

    @Test
    void testEquality_DifferentValue() {
        MeasurementApplication.Feet f1 = new MeasurementApplication.Feet(12.2);
        MeasurementApplication.Feet f2 = new MeasurementApplication.Feet(13.2);
        assertNotEquals(f1, f2);
    }

    @Test
    void testEquality_NullComparison() {
        MeasurementApplication.Feet f1 = new MeasurementApplication.Feet(12.2);
        //  assertNotNull(f1);
        assertFalse(f1.equals(null));
    }

    @Test
    void testEquality_NonNumericInput() {
        MeasurementApplication.Feet f1 = new MeasurementApplication.Feet(12.2);
        String name = "NR";
        assertFalse(f1.equals(name));
    }

    @Test
    void testEquality_SameReference() {
        MeasurementApplication.Feet f1 = new MeasurementApplication.Feet(10.1);
        assertTrue(f1.equals(f1));
    }
}
=======
	@Test
	void contextLoads() {
	}

}
>>>>>>> d0b76d9a0491ec5c5b6bfb214c4a1c2f69bf5afc
