public class ObjectPrinter implements Printer {
	@Override
	public void print(Object object) {
		System.out.println(object.toString());
	}
}
