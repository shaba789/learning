
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =new int[]{20,25,12,5,10};
		
		System.out.print("initial array:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println("\n");
		int temp;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("sorted array : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
	

}
