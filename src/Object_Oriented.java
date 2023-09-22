
// Creating a Class
//
//class Pen {
//    String color;
//    String type;
//
//    public static void Write() {
//        System.out.println("Hello");
//    }
//
//    public void color() {
//        //this keyword tells which object calls this function
//        System.out.println(this.color);
//    }
//
//}

class Student {
    String name;
    int age;

    double Cgpa;

//    public void info() {
//        System.out.println(this.name);
//        System.out.println(this.age);
//        System.out.println(this.Cgpa);
//    }

    //Non Parameterized Constructor
//    Student(){
//        //(In java Constructor Called itself w.r.t Object Creation )
//        System.out.println("This is a Non Parameterized Constructor");
//    }

    //Parameter Constructor
//    Student(String name, int age, float Cgpa){
//
//        //this.name= object name , name=Constructor Parameter name
//        this.name=name;
//        this.age=age;
//        this.Cgpa=Cgpa;
//    }

    //Copy Constructor
    //In Constructor we passed an s2 object parameter
//    Student(Student s2){
//        //this.name tells the current object and s2.name is stored in this.name
//        this.name=s2.name;
//        this.age=s2.age;
//        this.Cgpa=s2.Cgpa;
//    }

    //Dummy Constructor in order to run Copy Constructor
//    Student(){
//
//    }

    //Polymorphism Function OverLoading (Compile Type Polymorphism)
    //In order to do Compile Time Polymorphism we should follow the steps:
    //if doing function overloading then try to add different parameters in one function and other parameters in 2nd function
    //or function type must be different if both functions have same parameters
    //if don't follow the above steps then you face error during compilation time
    //that's why it is called Complie type Polymorphism
    public void PrintInfo(String name){
        System.out.println(name);
    }

    public void PrintInfo(int age){
        System.out.println(age);
    }

    public void PrintInfo(String name, int age){
        System.out.println(name + " " + age);

    }


}


// Main Class
public class Object_Oriented {
    public static void main(String[] args) {

        //Creating Pen Object
        //new keyword is used to allocate heap memory according to object
        //Pen(); is a constructor in Java and used to create objects
//        Pen p1 = new Pen();

        //Defining Pen Class Properties
//        p1.color="blue";
//        System.out.println(p1.color = "blue");
//        p1.type="gel";
//        System.out.println(p1.type = "gel");

//        p1.color = "black";
//        p1.type = "bolpoint";
//
//        Pen p2 = new Pen();
//        p2.color = "blue";
//        p2.type = "gel";

        //this keyword will tell which object calls the color method like p1 calls the color so it prints black first then p2 call the color so it print blue
//        p1.color();
//        p2.color();

        //Calling Pen Class Function
//        p1.Write();


        //Student Class
        //Student(); is a constructor created by java by default if we create our own constructor then java ignores the default constructor
//        Student s1 = new Student();

        //Object 1 prop
//        s1.name = "Munir";
//        s1.age = 23;
//        s1.Cgpa = 3.1F;


        //Object 2 creation and Prop
//        Student s2 = new Student();
//        s2.name = "Hamza";
//        s2.age = 22;
//        s2.Cgpa = 3.1F;

        //Calling info Function(this keyword used)
//        s1.info();
//        s2.info();

        //Object 3 with Parameter constructor
//        Student s3=new Student("Munir",23,3.1F);
//        s3.info();

        //Copy Constructor
//        Student s1 = new Student();
//        s1.name="Munir";
//        s1.age=22;
//        s1.Cgpa=3.1F;


        //s2 is using s1 properties
//        Student s2=new Student(s1);
//        s2.info();


        //In Java There is no need of Destructor bcz in java there exists a garbage collector that automatically destroys those variables or objects that are not in use and taking memory


        //1. Polymorphism (Poly=many, morphism=forms)
        //Polymorphism performs function overloading(Compile type Polymorphism) and overriding(Runtime Polymorphism)

//Function overloading=different functions(different working) with same name

        //1.Function Overloading (Function Overloading)

        Student s1=new Student();
        s1.name="Munir";
        s1.age=23;
//        s1.PrintInfo("Munir");

        //It identifies the function Type through the parameters we are passing

        //Function Overload 1
        s1.PrintInfo(s1.name);

        //Function Overload 2
        s1.PrintInfo(s1.age);

        //Function Overload 3
        s1.PrintInfo(s1.name, s1.age);


    }
}
