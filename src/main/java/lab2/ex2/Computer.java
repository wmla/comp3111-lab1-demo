package lab2.ex2;

public class Computer implements Chargeable {
	protected String secret;
	public Computer() {
		secret = "computer secret";
	}
	public void work() {
		System.out.println("A computer is working");
	}
	public void charge() {}

}
