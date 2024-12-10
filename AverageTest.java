package average;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AverageTest {

	@Test
	void testAverage() {
		//instance of average class
		Average avg = new Average();
		
		assertEquals(0, avg.average(4, new int[]{}), "Test Case 1 Failed");
        assertEquals(0, avg.average(0, new int[]{1, 2, 3, 4, 5}), "Test Case 2 Failed");
        assertEquals(2, avg.average(3, new int[]{1, 2, 3, 4, 5}), "Test Case 3 Failed");
        assertEquals(3, avg.average(5, new int[]{1, 2, 3, 4, 5}), "Test Case 4 Failed");
        assertEquals(3, avg.average(10, new int[]{1, 2, 3, 4, 5}), "Test Case 5 Failed");
	}

}
