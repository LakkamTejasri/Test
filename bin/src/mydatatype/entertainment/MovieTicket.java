package mydatatype.entertainment;

public class MovieTicket {
	int snumber;
	int cost;
	
	String time;
	public MovieTicket(int snumber,int cost, String time)
	{
	 this.snumber=snumber;
	 this.cost=cost;
	 this.time=time;
	 System.out.print(snumber+ "");
	 System.out.print(cost+" ");
	 System.out.print(time+"");
	 
	}
	 public static void bookTicket()
	 {
		 
	 }
     public static void changeTicket()
     {
    	 
     }
     public static void cancelTicket()
     {
     }
}
