package hwTask6;

public class Hw4Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1; //proverka na prostotu 
		for (int i=2; i<=100; i++) {
			k=1;
			for (int j=2; j<i; j++ ) {			
			if ((i%j==0)&&(i!=j)) {
				k=0;
			}
			}
			if(k==1)
			System.out.println(i+" prostoe");
		}

	}

}
