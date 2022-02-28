package loopexample;

public class breakEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j = 0;
		int k = 0;
		for(i = 1;  i<=9; i++ ) 
			for(j = 1; j<9; j++) {
				k = i*j;
				System.out.println(i + "x" + j + "=" + k );
				if(i<j)
					break;
		}
		
	}

}
