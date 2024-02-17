import java.util.Scanner;
public class StudentsMark {
   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter Your Marks: ");
       int num=input.nextInt(); if (num>=85 && num<=100) {
           System.out.println("Congratulations You Scored Grade A"); }
       else if (num>=60 && num<=85) {
           System.out.println("You Scored Grade B"); }
       else if (num>=40 && num<=60) {
           System.out.println("You Scored Grade C"); }
       else{ System.out.println("You are Fail");
       }
   }
}

