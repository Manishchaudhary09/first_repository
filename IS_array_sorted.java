public class IS_array_sorted {
    

     static int cheak(int [] arr , int i ){ 
        if (i == arr.length-1){
            return 1;
        }                    
        if (arr[i] < arr[i+1]){                                   //int "i" is the index of the array .
            return cheak( arr , i+1 );
        }
         return 0;
     }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,1};
        int ans = cheak( arr , 0);
        if (ans == 1){
            System.out.println("array is sorted ");
        }
                System.out.println("array is not sorted");
        }
         
 }

