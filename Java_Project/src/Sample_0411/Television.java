package Sample_0411;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	void print(){
		if(onOff == false){
			System.out.println("Tv is die");
			return;
		}
		
		System.out.println("channel : " + channel + " volume : " + volume + " on&off : " + onOff);
	}
	
	void volumeup(int up){
		if(onOff == false){
			System.out.println("Tv is die");
			return;
		}
		
		volume += up;
	}
	
	void volumeup(){
		if(onOff == false){
			System.out.println("Tv is die");
			return;
		}
		volume += 1;
	}
}

