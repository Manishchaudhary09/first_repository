public class searching_in_array {
    
    static int search(int [] arr ,int t, int i){
        if (i == arr.length){
           return -1;
         }
        if(arr[i] == t){
            return i;
        }
        return search(arr , t , i+1);
        }


        public static void main(String[] args){
            int arr[] = { 1,2,3,4,5,6};
            int ans = search(arr , 3 , 0);

            if (ans == -1){
                System.out.println("not in array");
                }
                else{
                    System.out.println("found at "+ans +"th index");
                }
                
            }
 }


    

