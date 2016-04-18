package testab;

import java.util.Random;

public class quicksort {
	public static void main(){
		System.out.println("aa");
	}
	public static void main(String[] args) {
           int a[] = {3,4,2,7,1,8,5,9,6};
           quickSort(a);
           for(int i = 0; i < a.length; i++)
        	   System.out.print(a[i] + "");
           
	}
	
	public static void quickSort(int a[]){
		qS(a, 0, a.length - 1);
	}
	
	public static void qS(int a[], int left, int right){
		if(left == right)
			return;
		int index = Partition(a, left, right);
		if(index > left)
			qS(a, left, index -1);
		if(index < right)
			qS(a, index + 1, right);
	}
	
	public static int Partition(int a[], int left, int right){
		int index = random(left, right);
		Swap(a, index, right);
		int small = left - 1;	
		for(index = left; index < right; index++){
			if(a[index] < a[right]){
				++small;
			//	if(index != small){
					Swap(a, index, small);
			//	}
			}
		}
		++small;
		Swap(a, small, right);
		return small;
	}
	
	public static int random(int left, int right){
		return new Random().nextInt(right - left + 1) + left;
		
	}
	public static void Swap(int a[], int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}

