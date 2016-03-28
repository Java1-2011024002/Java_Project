package Sample_0328;

public class For_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1, j = 1; j<= 6; j++){
			if(j<4){
				System.out.println("i : "+i+" j : "+j);
			}
			else{
				System.out.println("i : "+(i+1)+" j : "+(j-3));
			}
		}
		
		System.out.println("");
		
		for(int x = 1 ; x<=2; x++){
			for(int y=1; y<=3 ; y++){
				System.out.println("x : " + x + " y : " + y);
			}
		}
	}

}
