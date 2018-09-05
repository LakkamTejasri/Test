package mydatatype.entertainment;

public class Movie {
	static String name;
    static int id;
	float rate ;
	public static void start()
	{
		
	}
	public static void watch()
	{
	}
	public static void Break()
	{
	}
	public  Movie(String name,int id,float  f)
	{
		this.name=name;
		this.id=id;
		this.rate=f;
		System.out.print(name+ " ");
		System.out.print(id+ " " );
		System.out.print(f+ " ");
		
	}
}
	