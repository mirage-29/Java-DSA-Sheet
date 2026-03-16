package Arrays.Two_Pointers;

public class mergetwosortedarray {
    static void main(String[] args) {
        int[] arr={1,222,44,51,59,566,599};
        int[] arr1={23,32,33,45,49,53,553};
        int[] arr2 = new int[arr1.length+arr.length];
        int i=0,j=0,k=0;
        while(i<arr.length && j<arr1.length){
            if(arr[i]<=arr1[j]){
                arr2[k]=arr[i];
                k++;
                i++;
            }
            else{
                arr2[k]=arr1[j];
                k++;
                j++;
            }
            
        }
        if(arr.length>arr1.length) {
            while (i < arr.length) {
                arr2[k] = arr[i];
                k++;
                i++;
            }
        }
        else while(j<arr1.length){
            arr2[k]=arr1[j];
            j++;
            k++;
        }
        for(int l:arr2)
        {
            System.out.print(l+" ");
        }
    }
}
