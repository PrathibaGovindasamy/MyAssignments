package week3.day1.assignments;

public class Desktop extends Computer {
 public void desktopSize() {
	System.out.println("1008px and larger");
}
 public static void main(String[] args) {
	Desktop pc = new Desktop();
	pc.computerModel();
	pc.desktopSize();
}
}
