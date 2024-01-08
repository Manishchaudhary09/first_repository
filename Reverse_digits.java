public class Reverse_digits {
    public static void main(String[] args) {
        rev(15678765);
    }

    static void rev(int n){
        if(n < 10){
            System.out.println(n);
            return;
        }
        else{
            System.out.print(n%10);
            rev(n/10);
        }
    }

// public static void main(String[] args) {
//     fun(5432);
//     System.out.println(sum);
// }
//    static int sum =0;


//     static void fun(int n){
//         if(n == 0){
//          return;
//         }
//         int rem = n%10;
//         sum = sum*10 + rem;
//         fun(n/10);

       
//     }
}
