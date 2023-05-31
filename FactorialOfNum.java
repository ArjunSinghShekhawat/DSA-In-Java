import java.util.Scanner;

class FactorialOfNum{

    public static int fact(int num){
        //base condition
        if(num==1 || num==0){
            return 1;
        }
        else{
        //recursive call
            return num * fact(num-1);
        }
    }
    public static void main(String[] args) {
        int num;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = scan.nextInt();

        int result = fact(num);

        System.out.println("The factorial of "+ num+ " is :" + result);

        scan.close();

    }
}