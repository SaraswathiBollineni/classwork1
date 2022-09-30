import java.util.Scanner;
public class BinarySearch {
	int search(int a[],int n,int x) {
		int l=0,h=n-1;
        while (l < h) {
            int m = (l + h) / 2;
            if (a[m] == x)
                return m;
            else if (a[m] < x) 
                l = m + 1;
            else
                h = m - 1;
        }
        return -1;
	}

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	BinarySearch ob = new BinarySearch();
        int a[] = { 2, 3, 4, 10, 40 };
        int n = a.length;
        System.out.print("Enter the element:");
        int x = sc.nextInt();
        int result = ob.search(a,n,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                           + "index " + result);
    }
}

