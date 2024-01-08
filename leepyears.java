public class leepyears {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
    }


    
    static boolean isLeapYear(int n) {
        String str = Integer.toString(n);
        int size = str.length();

        if (size == 4) {
            if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
                System.out.println(n + " is a leap year");
                return true;
            } else {
                System.out.println(n + " is not a leap year");
                return false;
            }
        } else {
            System.out.println("Please enter the correct year");
            return false;
        }
    }
}