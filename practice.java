class Manish{
    int x;
    int y;
    void fun1(int n){
        System.out.println(n+1);
        return;
    }
    void fun2(int n){
        System.out.println(n+2);
        return;
    }
}
public class practice {
int x;
int y;
static void fun1(){
    System.out.println("fun3");
}
static void fun2(){
    System.out.println("fun3");
}
public static void main(String[] args) {

Manish m1 = new Manish();
m1.x = 5;
m1.y = 7;
Manish m2 = new Manish();
m2.x = 7;
m2.y = 5;
m1.fun1(5);    
m1.fun1(6);
}


}
