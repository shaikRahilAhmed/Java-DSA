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




// public class Main{
//     public static int mull(int a, int b){
//         int mull = a*b;
//         return mull;
//     }
//     public static void main(String args[]){
//         int a = 2;
//         int b = 3;
//         int prod = mull(a,b);

//         System.out.println("a*b="+prod);
//     }
// }




// public class Main{
//     public static int fac (int n){
//         int f = 1;
//         for (int i = 1; i<=n; i++){
//             f=f*i;
//         }
//         return f;
//     }
//     public static void main(String args[]){
//         System.out.println(fac(4));
//     }
// }



// public class Main{
//     public static int fac(int n){
//         int f = 1;
//         for(int i =1; i<=n; i++){
//             f=f*i;
//         }
//         return f;
//     }
//     public static int binCoff(int n, int r){
//         int fac_n = fac(n);
//         int fac_r = fac(r);
//         int fac_nmr = fac(n-r);

//         int binCoff = fac_n / (fac_r *fac_nmr);

//         return binCoff;
//     }
//     public static void main(String args[]){
//         System.out.println(binCoff(5,2));
//     }
// }



// public class Main{
//     public static int sum(int a , int b){
//         return a+b;
//     }
//     public static int sum(int a, int b, int c){
//         return a+b+c;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(2,3));
//         System.out.println(sum(2,3,6));
//     }
// }


// import java.util.*;
// public class Main{
//     public static boolean isPrime(int n){

//         for (int i =2; i<=Math.sqrt(n); i++){ /// i<=n-1 also can be use but it wont check the iterative numbers..
//             if(n%i == 0){
//                 return false;
//             }
//         }return true;
//     }
//     public static void main(String args[]){
//         System.out.println(isPrime(2));
//     }
// }


// import java.util.*;
// public class Main{
//     public static boolean isPrime(int n){
//         for (int i =2; i<=Math.sqrt(n); i++){
//             if(n%i == 0){
//               return false;
//             }
//         }return true;
//     }
//     public static void tillPrime(int n){
//         for (int i = 2; i<=n-1; i++){
//             if(isPrime(i)){

//                 System.out.println(i+" ");
//             }
//         }
//     }
//     public static void main(String args[]){
//         tillPrime(20);
//     }
// }  





// public class Main{

//     public static void binToDec(int n){
//         int myNum = n;
//         int pow = 0;
//         int decNum = 0;
//         while(n>0){
//             int lastDigit = n%10;
//             decNum = decNum+(lastDigit*(int)Math.pow(2,pow));

//             pow++;
//             n=n/10;
//         }
//         System.out.println("decimal of "+myNum+"="+decNum);
//     }
//     public static void main(String args[]){
//         binToDec(101);
//     }
// }




// public class Main{

//     public static void decToBin(int n){
//         int myNum = n;
//         int pow = 0;
//         int binNum = 0;
//         while(n>0){
//             int rem = n%2;
//             binNum = binNum+(rem*(int)Math.pow(10,pow));

//             pow++;
//             n=n/2;
//         }
//         System.out.println("binary of "+myNum+"="+binNum);
//     }
//     public static void main(String args[]){
//         decToBin(5);
//     }
// }



// import java.util.*;
// public class Main{

//     public static void main(String args[]){
//         int marks[] = new int[100];
//         Scanner sc = new Scanner(System.in);
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();
    
//     System.out.println("phy mark = "+marks[0]);
//     System.out.println("che mark = "+marks[1]);
//     System.out.println("math mark = "+marks[2]);

//     int percentage = (marks[0]+marks[1]+marks[2])/3;
//     System.out.println("percentage = "+percentage+"%");
// }}




// import java.util.*;
// public class Main{
//     public static void Update(int marks[]){
//         for(int i = 0; i<marks.length;i++){
//             marks[i]=marks[i]+1;
//         }}
//         public static void main(String args[]){
//             int marks[] = {97,98,99};
//             Update(marks);
//             for(int i = 0; i<marks.length; i++){
//                 System.out.println(marks[i]+" ");
//             }
//         System.out.println();
//     }
// }





// import java.util.*;
// public class Main{
//     public static int linearSearch(int numbers[], int key){
//         for(int i = 0; i<numbers.length;i++){
//         if(numbers[i] == key){
//             return i;}}
//             return -1;
//         }
//         public static void main(String args[]){
//            int numbers [] = {2,3,4,5,6,7,8};
//            int key = 7;
//            int index = linearSearch(numbers,key);
//            if(index == -1){
//             System.out.println("key is not present");
//            }else{
//             System.out.println("key is at "+index+"th index");
//            }
//     }
// }




// import java.util.*;
// public class Main{
//     public static int largestNumber(int numbers[]){
//         int larger = Integer.MIN_VALUE;
//         for(int i = 0; i < numbers.length; i++){
//             if (larger < numbers[i]){
//                 larger = numbers[i];
//             }
//         }return larger;}
//         public static void main(String args[]){
//             int number[] = {1,2,3,6,5,4};
//             System.out.println(largestNumber(number));
//         }
//     }




// import java.util.*;
// public class Main{
//     public static int binSearch(int number[], int key){
//         int start = 0; int end = number.length-1;
//         while(start<=end){
//             int mid = (start + end)/2;
            
//             if (number[mid] == key){
//                 return mid;
//             }
//             if (number[mid] < key){
//                 start = mid + 1;
//             }else{
//                  start = mid - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,9,10};
//         int key = 9;
        
//         System.out.println(binSearch(numbers, key));
//     }
// }




// import java.util.*;
// public class Main{
//     public static void reverse(int number[]){
//         int start = 0;
//         int end = number.length-1;
        
//         while(start < end){
//             int temp = number[end];
//             number[end] = number[start];
//             number[start] = temp;
//             start++;
//             end--;
//         }
//         }
//     public static void main(String args[]){
//         int numbers[] = {9,8,7,6,5,4,3,2,1};
        
//         reverse(numbers);
        
//         for(int i = 0; i < numbers.length; i++){
//             System.out.print(numbers[i]+ " ");
//         }
//         System.out.println();
       
//     }
// }



// import java.util.*;
// public class Main{
//     public static void pairsNum(int numbers[]){
//         for(int i=0; i<numbers.length; i++){
//             int curr = numbers[i];
//             for(int j=i+1; j<numbers.length; j++){
//                 System.out.print("("+curr+","+numbers[j]+")");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,3,4,5,6,7};
//         pairsNum(numbers);
    
//     }
// }




// import java.util.*;
// public class Main{
//     public static void subArray(int numbers[]){
//         int totalSubArrays = 0;
//         for(int i = 0; i < numbers.length; i++){
//             int start = i;
//             for(int j = i; j < numbers.length; j++){
//                 int end = j;{
//                     for(int k = start; k<=end; k++){
//                         System.out.print(numbers[k]+ " ");
//                     }
//                     totalSubArrays++;
//                     System.out.println();
//                 }
//             }System.out.println();
//         }System.out.println("total SubArrays= "+ totalSubArrays);
        
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,3,4,5,6};
//         subArray(numbers);
    
//     }
// }





// import java.util.*;
// public class Main{
//     public static void maxSubarraySum(int numbers[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;


//         for(int i =0; i<numbers.length; i++){
//             int start = i;

//             for (int j = i; j<numbers.length; j++){
//                 int end = j;
//                 currSum = 0;
//                 for(int k = start; k<=end; k++){
//                     currSum += numbers[k];
//                 }
//                 System.out.println(currSum);
//                 if(maxSum<currSum){

//                     maxSum=currSum; 
//                 }
//             }
//         }
//         System.out.println("max sum = "+maxSum);
//     }
//     public static void main(String args[]){
//         int numbers[] = {1,-2,6,-1,3};
//         maxSubarraySum(numbers);
//     }
// }

