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
		order1.orderDate = "2018�� 3�� 12��";
		order1.orderName = "ȫ���";
		order1.orderProductNumber = "PD0345-12";
		order1.orderAddress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ:"+ order1.orderNumber);
		System.out.println("�ֹ��� ���̵�:"+ order1.orderID);
		System.out.println("�ֹ� ��¥:"+ order1.orderDate);
		System.out.println("�ֹ��� �̸�:"+ order1.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ:"+ order1.orderProductNumber);
		System.out.println("��� �ּ�:"+ order1.orderAddress);
	}

}
