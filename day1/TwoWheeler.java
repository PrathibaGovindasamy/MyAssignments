package week1.day1;

public class TwoWheeler {

	public int noOfWheels = 2;
	public short noOfMirrors = 2;
	public long chassisNumber = 5210380989L ;
	public boolean isPunctured = true;
	public String bikeName = "Plusar";
	public double runningKM = 5000.45;
	
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		System.out.println(obj.noOfWheels);
		System.out.println(obj.noOfMirrors);
		System.out.println(obj.chassisNumber);
		System.out.println(obj.isPunctured);
		System.out.println(obj.bikeName);
		System.err.println(obj.runningKM);
	}
}
