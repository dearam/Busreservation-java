package pack;
import java.text.*;
import java.util.*;
public class Booking{
	private String passengername;
	private int busNo;
	private Date date;
	private String from_to;

	public Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("----------------BOOKING-----------------");
		System.out.print("Enter name of passenger : ");
		passengername=sc.nextLine();
		System.out.println("----------------------------------------");
		System.out.print("Enter bus no : ");
		busNo=sc.nextInt();
		System.out.println("----------------------------------------");
		System.out.print("Enter travel date dd-mm-yy : ");
		String dateInput=sc.next();
		System.out.println("----------------------------------------");
		System.out.print("Enter travel from - to fromat : ");
		from_to=sc.next();
		System.out.println("----------------------------------------");
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
		try{
			date=df.parse(dateInput);
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
	public int getbusNo(){
		return busNo;
	}
	public String getfrom_to(){
		return from_to;
	}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
		int capacity=0;
		for(Bus i:buses){
			if(i.getbusno()==busNo){
				capacity=i.getCapacity();
			}
		}

		int booked_orders=0;
		for(Booking i:bookings){
			if(i.busNo == busNo && i.date.equals(date)){
				booked_orders++;
			}
		}
		if(capacity-booked_orders>=1){
			return true;
		}else{
			return false;
		}
	}

}