import java.util.Scanner;
class vote_2{
 public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your age: ");
int age = sc.nextInt();

if(age>=18)
System.out.println("Hurrah! You can Vote, Put your Vote wisely...") ;
else
System.out.println("Sorry, You can't vote...");
}}
