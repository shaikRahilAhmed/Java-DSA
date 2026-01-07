// import java.util.*;
// public class Main{ 
//     public static void method(){
//         System.out.println("method1");
//     }
//         public static int sum(int num1 , int num2){
//             int sum = num1+num2;
//             return sum;
//         }
//         public static void main(String args[]){
//             Scanner sc = new Scanner(System.in);
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int sum = sum(a,b);
//             System.out.println("sum is : "+sum);

//         }
//     }





// import java.util.*;
// public class Main{ 
   
//         public static void main(String args[]){
//          int a = 5;
//          int b = 6;

//          int temp = a;
//          a= b;
//          b=temp;

//          System.out.println("a= "+a);
//          System.out.println("b= "+b);

//         }
//     }




public class Main{
    public static int mull(int a, int b){
        int mull = a*b;
        return mull;
    }
    public static void main(String args[]){
        int a = 2;
        int b = 3;
        int prod = mull(a,b);

        System.out.println("a*b="+prod);
    }
}