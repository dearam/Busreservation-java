import pack.Bus;
import pack.Booking;
import java.util.*;
class BusDemo{
	public static void main(String[] args){
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();

		int capacity=30;
		//Datas appending
		String[] list={"chennai-madurai","madurai-chennai","coimbatore-madurai","chennai-madurai","coimbatore-kannyakumari","kannyakumari-rameshwaram","rameshwaram-erkad","erkad-pondycheri","madurai-chennai","coimbatore-madurai","thirunelveli-thanjavur","madurai-chennai","pabanasam-madurai","madurai-nagarkovil","nagarkovil-chennai","erkad-pondycheri","karur-coimbatore","pondycheri-madurai","pondycheri-chennai","chennai-nagarkovil","nagapatinam-thirunelveli","erode-vilupuram","vilupram-ramanathpuram","madurai-ramanathapuram","perambaloor-nagarkovil","kadaloor-coimbatore","neelagiri-kodaikanal","krishnagiri-thamjavur","thiruchi-neelagiri","madurai-rameshwaram"};
		int a=5;
		for(int i=0;i<30;i++){
			boolean ac=true;
			if(i%2==0){
				capacity++;
				ac=false;
			}
			if(a==5){
				a=1;
			}
			buses.add(new Bus(i+1,ac,a,list[i]));
			a++;
		}
		//Datas showing


		int usropt=1;
		Scanner sc=new Scanner(System.in);	
		while(usropt==1){
			System.out.println("-----------------------------------------");
			System.out.print("Enter 1 to book and 0 to exit and 2 to show available sheets : ");
			usropt=sc.nextInt();
			System.out.println("-----------------------------------------");
			if(usropt==1){
				Booking book=new Booking();
				if(book.isAvailable(bookings,buses)){
					bookings.add(book);
					System.out.println("Your booking is confirmed.Enjoy journey!");
				}
				else{
					System.out.println("Sorry. Bus is full. Try another bus or date");
					System.out.println("---busno----capacity--------route---------");
					for(Bus i:buses){
						if(i.getroute().equals(book.getfrom_to()) && book.getbusNo()!=i.getbusno()){
							System.out.println("    "+i.getbusno()+"            "+i.getCapacity()+"         "+i.getroute());
						}
					}
					System.out.println("---------------------------------------------");
				}
			}
			else if(usropt==2){
				for(Bus b:buses){
					b.displayBusInfo();
				}
				usropt=1;
			}
			else if(usropt==0){
				System.out.println("Cancelled");
				break;
			}
		}
	}
}