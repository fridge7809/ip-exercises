public class TestExercise extends ExerciseTemplate<Integer> {
	public TestExercise(String description) {
		super(description);
	}

	public void addTwoNumbers(int firstNumber, int secondNumber) {
		setResult(firstNumber + secondNumber);
	}
}
