

public class JavaPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find missing number from an array of 10 integers
		int sum,sum1=0;
		int[] a = {4,6,5,8,7,9,1,2,3};
	/*	int i = a.length;
		sum = ((i+1)(i+2))/2;
		for(int j=0; j<i;j++)
		{
			sum- =i[j];
		}
		System.out.println(sum);   */
		
		isPossibleTriangle(a);
	}
	

		


	private static boolean isPossibleTriangle(int[] a)
	{
		int arrSize = a.length;
		if(arrSize<3)
			return false;
		Sort(a);
		for(int i=0;i<arrSize-2; i++)
		{
			if(a[i] + a[i+1] > a[i+2])
				return true;
		}
		return false;
		
		
	}





	private static void Sort(int[] a) {
		// TODO Auto-generated method stub
		
	}
	

}
