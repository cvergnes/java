import java.util.Arrays;

public class InsertionSort
{
  public static void main(String [] args)
  {
     	int[] toSort = new int[5];
     	toSort[0] = 5;
     	toSort[1] = 3;
     	toSort[2] = 1;
     	toSort[3] = 4;
     	toSort[4] = 2;
     	insertionSort(toSort);
  }

  private static void insertionSort(int[] toSort)
  {
     	for(int i = 1 ; i < toSort.length ; i++)
	{
		int key = toSort[i];
		int j = 1;
		while ( i-j >= 0 && toSort[i-j] > key)
		{
			int temp = toSort[i-j];
			toSort[i-j] = key;
			toSort[i-j+1] = temp;
			j++;
		}
	}
	System.out.println(Arrays.toString(toSort));
  }

}
