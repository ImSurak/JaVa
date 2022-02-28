package practice;

public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		for(i=1; i<=9; i++) {
			for(j=1; j<=9; j++) {
				if(i%2==1)
					continue;
		System.out.println(i+"X" + j + "=" + i*j);
	}
	}
}
}