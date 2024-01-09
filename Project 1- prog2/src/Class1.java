/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* Yumna Mohammad Adnan Salaas
    ID: 1084572 */
import java.util.*;  
    public class Class1 { 
        public static void main(String[] args){
            String name = "Yumna Salaas";
        int ID = 1084572; //assign your actual ID to the ID variable 
        System.out.println("My full name is " + name + " and ID is: " + ID);
        System.out.println("Develop a passion for learning. If you do, you will never cease to grow");
        
  /*********************************** Multiple Data Types *****************************/
        
       double x = 9/2;
        System.out.println(9/2); //the output is an integer since we are dividing int/int (integral primitive types)
        System.out.println(x); 
/*the output is 4.0 instead of 4.5 even though x is double (Floating point type)  ...... Why?
because 9/2 will result in an integral type which is 4. Then we will convert this 4 to Floating point type which is 4.0 */
        
        System.out.println(9.0/2);
//since one of the numbers is Floating point type, the result will be Floating point type
        System.out.println(9/2.0);
//since one of the numbers is Floating point type, the result will be Floating point type
        
        
 /**************************************** Java User input **************************************/
        Scanner input  = new Scanner(System.in);
        
        System.out.print("Enter your ID: ");
        int num1 = input.nextInt(); //to ask the user to input an integer
        
        System.out.print("Enter your weight in kg: ");
        double num2 = input.nextDouble(); //to ask the user to input a double
        
        System.out.print("Enter your first Name: ");
        String firstName = input.next(); //to ask the user to enter a String. It will take only the characters up to the first space
        System.out.println("Your fisrt name is "+ firstName +"\n");
        
        System.out.print("Enter the first letter of your name: ");
        char letter = input.next().charAt(0); // to ask the user to enter a character
    }
  }


