public class fibbo {
    
    public static void main(String[] args) {
        //int ans = fibbo(8);
       System.out.println(fibbo(8)); 
    }
    static int fibbo(int n) {
        if (n<2){
            return n;
        }
        
            return fibbo(n-1) + fibbo(n-2);
        }   
    }