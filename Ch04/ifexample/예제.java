package ifexample;

public class 예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int floor = 5;
		String name;
		 switch(floor) {
		 case 1 : name = "약국";
		 break;
		 case 2 : name = "정형외과";
		 break;
		 case 3 : name = "피부과";
		 break;
		 case 4 : name = "치과";
		 break;
		 case 5 : name = "헬스 클럽";
		 break;
		 default:
			 name = "이 건물에는 없습니다.";
			
		 }
		 System.out.println(floor + "층 " + name + "입니다.");		 
	}

}
