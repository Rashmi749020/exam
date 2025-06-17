public class Demo1
{
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			sum+=i;
		}
		double avg=sum/10;
		System.out.println("sum of first 10:"+sum);
		System.out.println("Avg:"+avg);
	}
}
