package week1.day1;

public class Mobile {

	public String mobileBrandName = "Oppo";
	public char mobileLogo = '$';
	public short noOfMobilePiece = 10;
	public int modelNumber = 2021;
	public long mobileImeiNumber = 1009098231230890L;
	public float mobilePrice = 15000.29f;
	public boolean isDamaged = false;
	
	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		System.out.println(myMobile.mobileBrandName);
		System.out.println(myMobile.mobileLogo);
		System.out.println(myMobile.noOfMobilePiece);
		System.out.println(myMobile.modelNumber);
		System.out.println(myMobile.mobileImeiNumber);
		System.out.println(myMobile.mobilePrice);
		System.out.println(myMobile.isDamaged);
	}
	
}
