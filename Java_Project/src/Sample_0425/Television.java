package Sample_0425;

public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	public Television(int c, int v, boolean o) {
		// TODO Auto-generated constructor stub
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print(){
		System.out.println("channel : " + channel + " & volume : "+ volume );
	}
}

