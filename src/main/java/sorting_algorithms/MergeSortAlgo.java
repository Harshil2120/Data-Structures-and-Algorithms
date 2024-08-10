package sorting_algorithms;

public class MergeSortAlgo {
	
	static void merge(int[] arr,int[] left,int[] right) {
		int i=0;
		int j=0;
		int k=0;
		int nl=left.length;
		int nr=right.length;
		
		while(i <nl && j<nr) {
		  	if(left[i]<=right[j]) {
		  		arr[k]=left[i];
		  		i++;
		  	}else {
		  		arr[k]=right[j];
		  		j++;
		  	}
		  	k++;
		}
		while(i<nl) {
			arr[k]=left[i];
			k++;
			i++;
		}
		while(j<nr) {
			arr[k]=right[j];
			k++;
			j++;
		}
	}
	
    static void mergeSort(int[] arr) {
    	int n=arr.length;
    	if(n<2) {
    		return;
    	}
    	int mid=n/2;
    	int[] left=new int[mid];
    	int[] right=new int[n-mid];
    	for(int i=0;i<mid;i++) {
    		left[i]=arr[i];
    	}
    	for(int i=mid;i<n;i++) {
    		right[i-mid]=arr[i];
    	}
    	mergeSort(left);
    	mergeSort(right);
    	merge(arr,left,right);
    }

    
	public static void main(String[] args) {
		int[] arr= {2,4,1,6,8,5,3,7,12,32,24,11};
		
		mergeSort(arr);
        for(int i=0;i<arr.length;i++) {
          System.out.println(arr[i]);
        }
	}

}
