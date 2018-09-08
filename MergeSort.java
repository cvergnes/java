import java.util.Arrays;

public class MergeSort
{
	public static void main(String[] args)
	{
		int[] toSort = new int[5];
		toSort[0] = 5;
		toSort[1] = 2;
		toSort[2] = 4;
		toSort[3] = 3;
		toSort[4] = 1;
		mergeSort(toSort, 0, toSort.length-1);
		System.out.println(Arrays.toString(toSort));
	}


	public static void mergeSort(int[] toSort, int p, int r)
	{
		if (p < r)
		{
			int l = (r+p) / 2;
			System.out.println(l);
			mergeSort(toSort, p, l);
			mergeSort(toSort, l+1, r);
			merge(toSort, p, l, r);
		}
	}

	public static void merge(int[] a, int p, int q, int r)
	{
		int[] la = new int[q-p+1];
		int[] ra = new int[r-q];
		for (int i = 0; i < (q-p)+1; i++)
		{
			la[i] = a[i+p];
		}

		for (int i = 0; i < r-q ; i++)
		{
			ra[i] = a[q+i+1];
		}

		int i = 0;
		int j = 0;

		for (int k = p ; k <= r ; k++) 
		{
			if (j>=(r-q) || la[i]<ra[j])
			{
				a[k] = la[i];
				i++;
			}
			else
			{
				a[k] = ra[j];
				j++;
			}
		}
	}
}
