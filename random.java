import java.util.*;

public class random
{
	public static void main(String[] args) {
		
		int [] arr=new int[1000];
    Random numbers=new Random();
    for (int i=0;i<arr.length;i++) {
    arr[i]=numbers.nextInt();
    }
    
        long startTime = System.nanoTime();
    
int min=arr[0];
int max=arr[0];

for(int i=1;i<arr.length;i++)
{
if(arr[i]<min)
{
 min=arr[i];
}
if(arr[i]>max)
{
max=arr[i];
}
}
 System.out.println(min);
 System.out.println(max);
		
        long  endTime = System.nanoTime();
        long  searchtime = endTime - startTime;
        
        System.out.println("Search running time: " + searchtime);	
		
	}
}
