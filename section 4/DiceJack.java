import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        
    
        Scanner scanner = new Scanner(System.in);
         int roll1 = rollDice();
         int roll2 = rollDice();
         int roll3 = rollDice();

         System.out.println(roll1);
         System.out.println(roll2);
         System.out.println(roll3);



         System.out.println("Enter 3 numbrs b/w 1 and 6:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            if(arelessthan1(num1, num2, num3)){
                System.out.println(" invalid number");
                System.exit(0);
            }
            else if (areGreaterThan6(num1, num2, num3)){
                System.out.println(" invalid number");
                System.exit(0);
            }
            int a=sumOfRolls(roll1, roll2, roll3);
            int b=sumOfIntputnumbers(num1, num2, num3);
            compare(a, b);
 scanner.close();
}

public static int rollDice() {
    double randomNumber = Math.random()*6;
    randomNumber += 1;
    return (int)randomNumber;

 } 
 public static boolean arelessthan1(int num1, int num2, int num3) {
    return (num1 < 1 || num2 < 1 || num3 < 1);
 }
  public static boolean areGreaterThan6(int num1, int num2, int num3) {
    return (num1 > 6 || num2 > 6 || num3 > 6);
 }

 public static int sumOfRolls(int num1, int num2, int num3){
    int sum = num1 + num2 + num3;
    return sum;
 }
 public static int sumOfIntputnumbers( int num1 ,int num2, int num3){
    int sum = num1+ num2 + num3;
    return sum;
 }
 public static void compare(int num1, int num2){
     if(num1 < num2 && (num2 - num1) < 3 ){
        System.out.println(" congrajulations you win");

    }else{
        System.out.println(" try again");
    }
       
 }
}
