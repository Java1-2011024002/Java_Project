package Sample_0328;

public class For_multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=9; i++){
			for(int j = 2; j<=9; j++){
				System.out.printf("%d * %d= %d\t ", j, i, i*j);
			}
			System.out.println("");
		}
	}

}
