import java.util.Arrays;
import java.util.Scanner;

public class Main {


    //Function Definations
    public static void PrintHello() {
        System.out.println("Hello");
    }

    public static void PrintName(String name) {
        System.out.println(name);
    }

    public static void Sum(float a, float b) {
        float sum = a + b;
        System.out.println("Your sum is: " + sum);
    }

    public static void main(String[] args) {

        //->     Simple Print
        //System.out.println("Hello world!");

        //-> Important DataTypes (Primtive i.e limitations)
        /*int age = 12;
        byte t = 120;
        long big = 1234567L;
        float f = 3.14F;
        char letter = 'c';
        boolean isGen = true;

        System.out.println(isGen); */


        //Non-primitive DataType (we use new keyword in non-prim data type)

        /*
        //-> Strings
        String name1="Munir";
        String name2=new String(" Butt");

        //Concatination
        String FullName = name1+name2;
        System.out.println(FullName);

        //Length
        System.out.println(name1.length());

        //To find the character at given index
        System.out.println(name2.charAt(2));

        //replacing single character u with i and storing in output and it not chngs the orginal string
        //In Java, string is not changeable when it's created although you can create or change through another string(variable)
        String output = name1.replace('u','i');
        System.out.println(output);

        //Substring to find short string from long string (no change in original string it just creating new string because string are immutable)
        String Long = "Munir Butt Loves Coding";
        //it means 0 is included while 5 is excluded
        System.out.println(Long.substring(0,5));


         */


        //-> Arrays
/*
        //Method-1
        //initializing and declareing a string int marks[] means declareing and new int[3] means we need integer array of 3 size
        int marks[] = new int[3];

        //Initializing
        marks[0] = 56;
        marks[1] = 76;
        marks[2] = 44;
        //we print array values through their index not by variable name alone
        //if we don't initialize the array with value then it will store 0,null,false according to datatype in array just like garbage values in C++
        //System.out.println(marks[3]);

        //->Array Functions

        //Length
        //in array we dont use () with length bcz in array length is a property
        //System.out.println(marks.length);

        //Sort
        //before sort
        System.out.println(marks[0]);
        //sorting
        Arrays.sort(marks);
        //after sort
        System.out.println(marks[0]); */

        //Method-2 to create array (if we know the values)
//        int [] marks = {98,56,38};
//        System.out.println(marks[2]);


//        //2D Arrays (Data Structure)
//        int [][] finalMarks = { {97,67,54} , {35,67,89} };
//
//        //it means finalMarks of student1[0] with marks at [0] index
//        System.out.println(finalMarks[0][0]);
//        //it means finalMarks of student2[1] with marks at [2] index
//        System.out.println(finalMarks[1][2]);


        //Casting (Conversion from 1 data type to another Data Type)

        //normal way to print sum (Implicit casting) allowed in java bcz double size is bigger and we are summing with 18 which is int with low bit
//        double price = 100.00;
//        double FinalPrice = price + 18;
//        System.out.println(FinalPrice);

        //Explicit Casting (less data loss)
        // integer size is less than double thats why it shows error when summing up with 18.0
//        int p = 100;
//        int finalPrice = p + 18.0;

        // to fix the error doing casting (decimal values are ignored thats why ans is 36)
//        int p = 18;
//        int fp = p + (int) 18.35;
//        System.out.println(fp);
//
//        //We can't convert string into integer although we can convert numbers into numbers
//
//        int t = 189;
//        System.out.println();


        //-> Constants

        //Eg age value change every year while some values remains constant like Pi
//        int age = 30;
//        age = 31;
//        age=32;

//        final float Pi = 3.14F;
//
//        //if we try to change Pi value it will show error
////        Pi=2.1F;
//
//        float a = Pi+1.56F;
//        System.out.println(a);


        //-> Operators

        //1. Arithmetic Op (+, -, *, /, %)
//        float a = 10.0F;
//        float b = 5.0F;
//
//        float sum = a+b;
//        float dif = a-b;
//        float mult = a*b;
//        float div = a/b;
//        float modulo = a%b;
//
//        System.out.println(sum + " " + dif + " " + mult + " " + div + " " + modulo);

        //2. Assignment Op (+=, -=, *=, /=, ++, --)

//        float sum = a+b;
//        System.out.println(sum);
//        sum+=10;
//        System.out.println(sum);

//        float div = a/b;
//        div/=10;
//        System.out.println(div);


//        a++;
//        System.out.println(a);
//        a--;
//        System.out.println(a);


        //Math Class
//        float a = 5.0F;
//        float b =10.0F;

        //To find Max Value
//        System.out.println(Math.max(a,b));
//
//        //To find Min Value
//        System.out.println(Math.min(a,b));

        //To get Random Value (it returns random value from 0.0 to 1.0 each time we run)
        //first it do (Math.random()*100)) then do type cast
//        System.out.println((int) (Math.random()*100));


        //-> Taking input in Java

        //creating scanner object for input
//        Scanner sc = new Scanner(System.in);

//        //displaying message
//        System.out.println("Enter your Age: ");
//
//        //storing input in age variable and nextInt for integer input
//        int age = sc.nextInt();
//        System.out.println(age);

        //Inputting String
        //1. this will only print Munir not Munir Butt bcz of next() function
//        System.out.println("Enter your Name: ");
//        String name = sc.next();
//        System.out.println(name);

        //2. this will print Munir Butt bcz of nextLine() function
//        System.out.println("Enter your Name: ");
//        String nameF = sc.nextLine();
//        System.out.println(nameF);


        //-> 3.Comparison Op (a==b (true,false), != (true,false), a>b, a<b, a>=b, a<=b)

//        int a = 10;
//        int b = 20;
//
//        System.out.println(a==b);
//        System.out.println(a!=b);
//        System.out.println(a<b);


        //4. Conditional Operators(if-else, if-elseif-else)

//        System.out.println("Enter your Value in Boolean: ");
//        boolean isSunUp = sc.hasNext();
//        if (isSunUp==true){
//            System.out.println("Day");
//        }else {
//            System.out.println("Night");
//        }


        //5. Logical Operators (&&(true if both statement true), || (atleast one statement true is true), ! (it show opposite result i.e true = false and false=true))

//        int a = 50;
//        int b = 60;

//        if(a>100 && b>100){
//            System.out.println("False");
//        } else if (a>100 || b<100) {
//            System.out.println("True");
//        }

//        boolean isAdult = false;
//
//        //java by default compare !Adult with ==true so if we dont write ==true no issue
//        if (!isAdult) {
//            System.out.println("Adult");
//        } else {
//            System.out.println("Not Adult");
//        }


        //5. Switch Statements
//        System.out.println("Enter your Day: ");
//        int day = sc.nextInt();
//
//        switch (day){
//
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Wednesday");
//                break;
//
//            case 4:
//                System.out.println("Thursday");
//                break;
//
//            case 5:
//                System.out.println("Saturday");
//                break;
//
//            case 6:
//                System.out.println("Sunday");
//                break;
//
//            default:
//                System.out.println("Write input in integer form");
//
//        }


        //6. Loops

        //a. for Loop
//        for (int i=0; i<=10; i++){
//            System.out.println(i*10);
//        }


        //b. While Loop (first we check condition then run code)

//        //initializeS
//        int i=10;
//
//        //condition
//        while (i>0){
//
//            //printing
//            System.out.println(i*10);
//
//            //increment
//            i--;
//        }


        //c. Do while loop (first we run code then check condition)

        //initialize
//        int a=10;
//
//        do {
//
//            System.out.println(a);
//
//            //decrement
//            a=a-1;
//
//            //condition
//        }while (a>0);


//        //mostly used for multiple input
//        int num;
//
//        do {
//            System.out.println("Enter your number: ");
//            num = sc.nextInt();
//            System.out.print("Here is your Number: " );
//            System.out.println(num);
//        }while (num>=0);
//
//        System.out.println("The End");


        //-> Break and Continue

//        int i=0;
//        while (true){
//
//            //it will skip 3 and increment to 4
//            if (i==3){
//                i=i+1;
//                continue;
//            }
//
//            System.out.println(i);
//            i++;
//
//            if (i>5){
//                System.out.println("Loop ended");
//                break;
//            }
//
//        }


        //Exception Handling (TRY -CATCH)

        //(We cannot catch errors but we can catch exceptions )

//        int [] marks = new int[3];
//        marks[0]=56;
//        marks[1]=76;
//        marks[2]=25;
//
//        //printing with error bcz array size is 3 n we r printing 5 index and display msg after this will also not printed
////        System.out.println(marks[5]);
////        System.out.println("Hello");
//
//        //if we want to print "Hello" then we use Try and Catch
//
//        try{
//            //where exception can occur
//            System.out.println(marks[5]);
//
//            //we can exception object with the help of Exception class
//        }catch (Exception exception){
//            //do something whatever you want after catching
//        }
//        //Now after catching exception we can print hello
//        System.out.println("Hello");


        //-> Methods/Functions

        //Function Definations above

        //Function Calling
//        PrintHello();
//        PrintHello();
//        PrintHello();
//        PrintName("Munir");
//        Sum(10.0F, 5.0F);


    }
}



