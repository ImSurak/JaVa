package practice;

public class 연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j = 0;
		for(i=1; i<=9; i++) 
			for(j=1; ; j++) 
				if(i>j)
					break;
		
		System.out.println(i+"X"+j + "=" + i*j);
	}
}