public class HeapSort
{
    public void sort(int arr[])
    {
        int n = arr.length;
 
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    void heapify(int arr[], int n, int i)
    {
        int largest = i;  
        int l = 2*i + 1;  
        int r = 2*i + 2;  
 
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    public static int[] copyArray(int[] a)
	{
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		return b;
	}
    // Driver program
    public static void main(String args[])
    {
        int arr[] = {1,2,6,5,5,8,9};
        int n = arr.length;
        int[] b= new int[arr.length];
        b= copyArray(arr);
        
 
        HeapSort ob = new HeapSort();
        ob.sort(b);
 
        System.out.println("Sorted array is");
        printArray(arr);
        printArray(b);
        int initial = 0;
        int finalIndex= 0;
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i] != b[i])
        	{
        		initial = i+1;
        		break;
        	}
			
		}
        for (int i = arr.length-1; i >= 0; i--) {
        	if(arr[i] != b[i])
        	{
        		finalIndex = i+1;
        		break;
        	}
			
		}
        int length = (arr.length - initial) - (arr.length-finalIndex)+1;
        System.out.println(length);
        System.out.println(initial+":"+finalIndex);

        
    }
}