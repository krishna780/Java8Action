package JavaLambadas;

interface inte {
	public void add(int a, int b);
}

public class JavaLambadaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inte in = (a, b) -> System.out.println(a + b);
		in.add(10, 28);
		
		Runnable r=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread");
			}
		};
		
        Thread thread= new Thread(r);
        thread.start();
        for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}