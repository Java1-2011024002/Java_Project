package Sample_0328;

public class Apart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------");
		for(int i=9; i>= 1; i--){
			System.out.print("|");
			for(int j=1; j<=8; j++){
				System.out.print(i+"0"+j+"ȣ\t");
				if(i>=6 && j==5) break;
			}
			if(i==6) System.out.print("------------------------");
			System.out.println("|");
		}
		System.out.println("-----------------------------------------------------------------");
	}

}
