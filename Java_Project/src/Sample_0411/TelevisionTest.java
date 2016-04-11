package Sample_0411;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv = new Television();
		Television yourtv = new Television();
		Television testtv = mytv;
		
		mytv.channel = 18;
		mytv.volume = 8;
		mytv.onOff = true;
		mytv.volumeup();		
				
		yourtv.channel = 10;
		yourtv.volume = 7;
		yourtv.onOff = true;
		yourtv.onOff = false ;
		yourtv.volumeup(2);
		/*
		System.out.println("channel:" + mytv.channel +" volume:" + mytv.volume + " " + mytv.onOff);
		System.out.println("channel:" + yourtv.channel + " volume:" + yourtv.volume + " " + yourtv.onOff);	
		*/
		
		mytv.print();
		yourtv.print();
		//주소값을 불러오는 참조변수
		mytv.channel = 200;
		
		//System.out.println("channel:" + testtv.channel + " volume:" + testtv.volume + " " + testtv.onOff);
		testtv.print();
		
		testtv = null;	
	}

}
