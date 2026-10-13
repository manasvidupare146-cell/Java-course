/*
Scanner class is used to take user input in java.

Remember Scanner class can't access directly we have to first
import our java util package from that we can call our java
Scanner class methods.

1)import java.util.Scanner;
2) Object of Scanner class using new keyword.
note: new keyword means a new instance of class will be
created in java heap memory.
3)By default user input will be in String.
4)So when we call different data we convert it using next()
method which is inside a Scanner class.
1)String ->next()
2)int->nextInt()
3)float ->nextFloat()

 */
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
       //object of Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        System.out.print("Enter your percent: ");
        float percent=sc.nextFloat();
        System.out.println("Age: "+age+" Percent: "+percent);
        System.out.printf("Age is %d and percent is %f",age,percent);

    }
}
