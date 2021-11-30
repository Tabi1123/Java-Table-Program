import java.util.Scanner;

public class Table {

public static void main (String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the Number which you wants Table ???\n");
    int number = input.nextInt();

    System.out.println("Enter the number which table prints Starts from ???\n");
    int start = input.nextInt();


    System.out.println("Enter the number which table prints End till ???\n");
    int end = input.nextInt();

    for(int x = start; x<=end; x++){
        System.out.println(number*x);
    }

}
    
}
