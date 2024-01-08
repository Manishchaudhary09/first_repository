public class binarysearch {
    public static void main(String[] args) {  
        int[] arr = { 5,9,12,15,56,78,92};
        int t = 56;
        System.out.println(search(arr, t  ,0 , arr.length - 1));
    }

    static int search(int [] arr , int t , int s , int e)
    {
        if (s > e){
            return -1;
        }
        int m = (e - s)-1 / 2;
        if(arr[m] == t)           //---------t = target
        {
            return m;
        }  
        if ( t < arr[m]){
            return search (arr , t , s , e = m-1 );
        }    
            return search (arr , t , s = m +1 , e );
        }
        
    }
