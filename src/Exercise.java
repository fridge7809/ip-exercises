public abstract class Exercise extends ObjectPrinter {
	private final ObjectPrinter objectPrinter;

	private final int id;

    public Exercise(int id, ObjectPrinter printer){
		this.objectPrinter = printer;
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
