package PriorityQueues;

public class InplaceHeapSort {
    public static void downheapify(int arr[],int i,int n){
        int parentindex=i;
        int leftchildindex=parentindex*2+1;
        int rightchildindex=parentindex*2+2;
        while(leftchildindex<n){
            int minindex=parentindex;
            if(arr[leftchildindex]<arr[minindex]){
                minindex=leftchildindex;
            }
            if(rightchildindex<n&&arr[rightchildindex]<arr[minindex]){
                minindex=rightchildindex;
            }
            if(minindex==parentindex){
                return;
            }
            int temp=arr[minindex];
            arr[minindex]=arr[parentindex];
            arr[parentindex]=temp;
            parentindex=minindex;
            leftchildindex=2*parentindex+1;
            rightchildindex=2*parentindex+2;
        }
    }
    public static void heapsort(int []arr){
        //Build the heap
        int n=arr.length;
        for(int i=(n/2)-1;i>=0;i--){
            downheapify(arr,i,n);
        }
        //remove elements from starting one by one and put them at respective last position
        for(int i=n-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            downheapify(arr,0,i);
        }

    }
    public static void main(String[]args){
        int []arr={4,7,3,2,8,9,6,1};
        heapsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
