public class count_steps {
    
    static int step(int n , int s){
        if (n == 0){
            return s;
        }
        if (n%2 == 0){

        return step(n/2, s+1);
        
        }

        return step(n-1 , s+1);
    }
    
    

public static void main(String[] args) {
    int ans = step(123,0);
    System.out.println(ans);
}
}
