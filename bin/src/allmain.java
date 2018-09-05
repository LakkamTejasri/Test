
import mydatatype.*;
import mydatatype.entertainment.Movie;
import mydatatype.entertainment.MovieTicket;
import mydatatype.entertainment.social.Mail;
import mydatatype.entertainment.social.Whatsapp;
import mydatatype.entertainment.social.employee.Employee;
public class allmain {
	public static void main(String[] args)
	{
		Movie m=new Movie("ninnukori",111,4.7f);
		MovieTicket me=new MovieTicket(111,150,"12:30");
		Mail m2=new Mail(20,30);
		Whatsapp w=new Whatsapp(120,3,"teju");
		Employee e=new Employee(122,"teju",1.3f);
	    
}
}

