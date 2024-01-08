public class count_zeros {
    
    static int count(int n , int c ){       // n is any number and c is count of zeroes adding in this c 
        if (n == 0 ){
            return c;                       // if number is zero then it will return the count 
        }                                       
        int rem = n%10;
        if( rem == 0){                          // if the remainder is zero then count will exceeds by one 
            return count(n/10, c+1);
        }                                      //and if the remaider is not zero then it will call then count
                                                  // function         
            return count(n/10 , c);
        }
        
    

    public static void main(String[] args) {
    
        System.out.println(count(1023040000 , 0));
   
    }
}
