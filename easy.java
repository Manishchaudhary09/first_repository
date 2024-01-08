public class easy {
    public static void main(String[] args) {
         //fun(7);
         //funrev(7);
         funboth(9);
    }
    static void fun(int n)
    {
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
     
    
     static void funrev(int n){
        if(n == 0){
            return;
        }
            funrev(n-1);
            System.out.println(n);
        }
        static void funboth(int n){
            System.out.println(n);
            fun(n-1);

            funrev(n-1);
            System.out.println(n);
    }
}