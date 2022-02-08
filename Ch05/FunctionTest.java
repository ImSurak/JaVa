package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2); // add() 함수를 호출
		System.out.println(num1 + "+" + num2 + "=" + sum + "입니다.");
		
	}
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result; // result의 값을 sum으로 반환한다. 
		// 함수를 만들고 그 뒤에 이 함수는 어떤 함수이다~ 라는 느낌으로 구현한다.
	}

}
