package githubDemo;

public class SampleClass
{

	public static void main(String[] args)
	{
		int data[]= {0,4,42};
		int sum=0;
		for (int i = 0; i < data.length; i++)
		{
			System.out.println(data[i]);
			sum+=data[i];
		}
		System.out.println(sum);

	}

}