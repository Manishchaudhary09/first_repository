public class product_of_digits {
        public static void main(String[] args) {
            int ans = product(2355);
            System.out.println(ans);
        }
        
        static int product(int n){
            if (n%10 == n){
                return n;
            }
           
           return (n%10) *  product(n/10);
        } 
        }
        

