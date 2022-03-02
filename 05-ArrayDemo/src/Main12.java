
public class Main12 {

	public static void main(String[] args) {
		double[]price= {10.0,5.0,7.0,8.0};
		double sum=0,max=0,min=price[0],avg=0,m = 0;
		for(double arr:price)
		{
			sum=sum+arr;
			if(max<arr)
			{
				max=arr;
			}
			if(min>arr)
			{
				min=arr;
			}
			avg=sum/price.length;
		}
		System.out.println("Sum="+sum);
		System.out.println("Max="+max);
		System.out.println("Min="+min);
		System.out.println("Aveage="+avg);


	}

}
