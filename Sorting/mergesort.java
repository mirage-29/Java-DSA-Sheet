package Sorting;

public class mergesort {
    public static void main(String[] args) {
        int[] arr ={3,5,2,56,22,45,24};
        mergesort1(arr,0,arr.length-1);
        for (int i :arr) {
            System.out.println(i);
        }
    }

    public static void mergesort1(int[] arr, int left,int right){
        if(left>=right) return;
        int mid = left+(right-left)/2;
        mergesort1(arr,left,mid);
        mergesort1(arr,mid+1,right);

        merge(arr,left,mid,right);
    }
    public static void merge(int[] arr , int left,int mid,int right){
        int[] temp = new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=right){
            if(arr[i]<=arr[j]) temp[k++]=arr[i++];
            else 
                temp[k++]= arr[j++];
        }
        while(i<=mid){
            temp[k++]=arr[i++];
            
        }
        while(j<=right){
            temp[k++]=arr[j++];
        }
     for(int x =0;x<temp.length;x++){
        arr[left+x]=temp[x];

     }
    }

    
}
