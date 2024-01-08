public class pallindrome {
    public static void main(String[] args) {

        int[] arr ={1,2,4,3,2,1};

       int ans =fun(arr , 0 , (arr.length-1) );
       if (ans == 0){
        System.out.println("the array is not a pallindrome");
       }
       else{
        System.out.println("the array is a pallindrome");
       }

       }

    
        static int fun(int [] arr , int s ,int e){
        
            
            if ( s == e)
            {
                return 1;
            }
            if( arr[s] == arr[e]){
            
                return fun(arr , s = s+1 ,e = e-1);
                
            }
            else
            {
                return 0;
            }

         }
        }

