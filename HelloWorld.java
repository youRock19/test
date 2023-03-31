public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello");
		for (String s : args) {
			System.out.println(s);
		}
	}
}