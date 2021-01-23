package JavaLambadas;

interface inter {
	public void m1();
}

public class JavaLambadas {

	public static void main(String[] args) {

		inter i = () -> System.out.println("welcome to java");
		i.m1();
	}

}
