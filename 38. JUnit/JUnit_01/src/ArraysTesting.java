import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTesting {

	@Test
	void test() {
		int actual[] = {4, 8, 6, 2};
		int expected[] = {2, 4, 6, 8};
		
		Arrays.sort(actual);  //2, 4, 6, 8
		
		// assertEquals(expected, actual);    It will fail because it will check reference of both arrays
		assertArrayEquals(expected, actual);
	}

}
