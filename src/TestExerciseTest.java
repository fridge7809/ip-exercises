import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestExerciseTest {

	@Test
	void testAddTwoNumbers() {
		TestExercise testExercise = new TestExercise("Test");
		testExercise.addTwoNumbers(5, 3);
		int result = testExercise.getResult();
		assertEquals(8, result);
	}
}