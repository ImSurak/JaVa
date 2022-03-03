package thisex;

class Person//오류 이유 찾기 {
	String name;
	int age;
	
	Person(){
		this("이름 없음", 1);
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	Person returnItSelf() {
		return this;
		
	}
}
public class CallAnotherConst1 {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		
	}
}

