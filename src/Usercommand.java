import java.util.Scanner;

public class Usercommand {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=0;
        int z=0;
        while(n>=0)
        {
            //add a message here for the user that when you enter negative digit, program is going to end.
            System.out.println("Enter the number");
            n=s.nextInt();
            if(n>0){
            z=z+n;}

        }
        System.out.println("Sum of numbers you entered is " + z);
    }
}
