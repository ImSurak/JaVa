package classpart;

public class Man {
	int manAge;
	String manName;
	boolean ismarried;
	int children;
	
	public int getManage() {
		return manAge;
			}
	public String getManname() {
		return manName;
			}
	public boolean getismarried() {
		return ismarried;
			}
	public int getchildren() {
		return children;
			}
	public static void main(String[] args) {
		Man manJames = new Man();
		manJames.manName = "James";
		manJames.manAge = 40;
		manJames.ismarried = true;
		manJames.children = 3;
		
		System.out.println(manJames.manName);
		System.out.println(manJames.manAge);
		System.out.println(manJames.ismarried);
		System.out.println(manJames.children);

	}

}
