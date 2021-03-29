package fibo;

public class Executed {

	public static void main(String[] args)
	{
	  Fibonacci bus = new Fibonacci();
	  bus.busdata(10);
	}
}
class Fibonacci 
{
	public void busdata(int number)
	
	{
       System.out.println("Fibonacci series upto " + number +" numbers : ");

       for(int i=1; i<=number; i++)
       {
         System.out.println(FibonacciRecusion(i) +" ");
       }
    }
    public static int FibonacciRecusion(int number)
       {
        if(number == 1 || number == 2){
        return 1;
       }
    return FibonacciRecusion(number-1) + FibonacciRecusion(number -2);
       }
}