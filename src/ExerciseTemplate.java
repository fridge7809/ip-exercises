import java.util.Scanner;

public abstract class ExerciseTemplate<T> {

	private static int nextId = 1;
	private int id;
	private String description;
	private T result;

	private static Scanner scanner;

	public ExerciseTemplate(String description){
		this.description = description;
		this.id = nextId++;
	}

	public void printResult(){
		String output = String.format("""
        Exercise %d)
        Description %s
        Result %s
		""", id, getDescription(), getResult());
		System.out.println(output);
	}

	public int getId() {
		return id;
	}

	public T getResult() {
		return result;
	}

	protected void setResult(T result) {
		this.result = result;
	}

	public String getDescription() {
		return description;
	}
}
