package classpart;

public class Order {
	String orderNumber;
	String orderID;
	String orderDate;
	String orderName;
	String orderProductNumber;
	String orderAddress;
	
	public String getorderNumber(){
		return orderNumber;
	}
	public String getorderID() {
		return orderID;
	}
	public String getorderDate() {
		return orderDate;
	}
	public String getorderName() {
		return orderName;
	}
	public String getorderProductNumber() {
		return orderProductNumber;
	}
	public String getorderAddress() {
		return orderAddress;
	}
	
	public static void main(String[] args) {
		Order order1 = new Order();
		order1.orderNumber = "201803120001";
		order1.orderID = "abc123";
		order1.orderDate = "2018년 3월 12일";
		order1.orderName = "홍길순";
		order1.orderProductNumber = "PD0345-12";
		order1.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호:"+ order1.orderNumber);
		System.out.println("주문자 아이디:"+ order1.orderID);
		System.out.println("주문 날짜:"+ order1.orderDate);
		System.out.println("주문자 이름:"+ order1.orderName);
		System.out.println("주문 상품 번호:"+ order1.orderProductNumber);
		System.out.println("배송 주소:"+ order1.orderAddress);
	}

}
