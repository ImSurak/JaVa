package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bNUM = 10;
		int iNUM = bNUM;
		
		System.out.println(bNUM);
		System.out.println(iNUM);
		int iNUM2 = 20;
		float fNUM = iNUM2;
		
		System.out.println(iNUM);
		System.out.println(fNUM);
		
		double dNUM;
		dNUM = fNUM + iNUM;
		System.out.println(dNUM);
		}
}
