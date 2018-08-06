
public class QuickSort {
	
	private int[] arr;
	private int length;

	
	private void swap(int i, int j)
	{
		int temp = arr[i];
		arr[j] = arr[i];
		arr[i] = temp;
 	}
	
	public void sort(int[] arr1)
	{
		if(arr1 == null || arr1.length==0)
			return;
		
		this.arr = arr1;
		length = arr.length;
		quickSort(0, length-1);
		
	}
	
	private void quickSort(int lowerIndex, int higherIndex)
	{
		int i = lowerIndex;
		int j= higherIndex;
		int pivot = arr[lowerIndex + (higherIndex-lowerIndex)/2];
		
		while(i<=j)
		{
			while(arr[i]<pivot)
			{
				i++;
			}
			while(arr[j]>pivot)
			{
				j--;
			}
			
			if(i <= j)
			{
				swap(i, j);
				i++;
				j--;
			}
			
			if(lowerIndex < j)
				quickSort(lowerIndex, j);
			if(i < higherIndex)
				quickSort(i, higherIndex);
		}
	}
	
	public static void main(String[] args) {
		QuickSort sorter = new QuickSort();
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input)
        {
            System.out.print(i);
            System.out.print(" ");
        }
	}
}
