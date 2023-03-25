
public class ipaddress
{
	public static void main(String[] args) {
	    String ipAddress="192.168.10.127";
	    String [] numbers=ipAddress.split("\\.");
	    for (int i=0;i<numbers.length;i++)
	    {
	         System.out.println(numbers[i]);
	    }
	}
}
