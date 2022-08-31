package pack;
import java.util.*;
public class Bus{
	private int busno;//private vachuta classs veliya irunthu access pana mudiyathu
	private boolean ac;
	private int capacity;
	private String route;
	String[] list={"chennai-madurai","madurai-chennai","coimbatore-madurai","chennai-madurai","coimbatore-kannyakumari","kannyakumari-rameshwaram","rameshwaram-erkad","erkad-pondycheri","madurai-chennai","coimbatore-madurai","thirunelveli-thanjavur","madurai-chennai","pabanasam-madurai","madurai-nagarkovil","nagarkovil-chennai","erkad-pondycheri","karur-coimbatore","pondycheri-madurai","pondycheri-chennai","chennai-nagarkovil","nagapatinam-thirunelveli","erode-vilupuram","vilupram-ramanathpuram","madurai-ramanathapuram","perambaloor-nagarkovil","kadaloor-coimbatore","neelagiri-kodaikanal","krishnagiri-thamjavur","thiruchi-neelagiri","madurai-rameshwaram"};

	public Bus(int no,boolean ac,int cap,String r){//ithu user ta vangura input ku intialiaze pani vida
		this.busno=no;
		this.ac=ac;
		this.capacity=cap;
		this.route=r;
	}

	public int getbusno(){//access
		return busno;
	}
	public void setbusno(int a){//setmethod
		busno=a;
	}
	public boolean getAc(){//access
		return ac;
	}
	public void setAc(boolean b){//setmethod
		ac=b;
	}
	public int getCapacity(){//access
		return capacity;
	}
	public void setCapacity(int c){//setmethod
		capacity=c;
	}
	public String getroute(){//access
		return route;
	}
	public void setroute(String s){//setmethod
		route=s;
	}

	public void displayBusInfo(){
		System.out.println("Bus no:"+busno+" Ac:"+ac+" Total capacity:"+capacity+" Route : "+route);
	}	
}
