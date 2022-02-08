package loopexample;

public class BreakExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) { // 조건식을 생량하는 대신 break문을 사용한다.
			sum += num;
			if(sum>=100)
				break;
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
	}

}
