import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of limit to check: ");
        int numberOfLimit = scanner.nextInt();
        for (int number = 1; number <= numberOfLimit; number++){
            boolean check = true;
            if (number < 2) check = false;
            else{
                int i = 2;
                while (i<=Math.sqrt(number)){
                    if (number%i==0){
                        check = false;
                        break;
                    }
                    i++;
                }
        }
            if (check){
                System.out.println(number);
            }
        }
    }
}
