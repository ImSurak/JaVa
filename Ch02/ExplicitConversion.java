package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dNUM1 = 1.2;
		float fNUM2 = 0.9F;
		
		int iNUM3 = (int)dNUM1 + (int)fNUM2;
		int iNUM4 = (int)(dNUM1 + fNUM2);
		System.out.println(iNUM3);
		System.out.println(iNUM4);
	}

}
