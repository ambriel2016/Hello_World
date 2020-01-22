import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Today is Jan 22, 2020. I am alive!");
        // single comment
        /*
        block comment
        */
        // declare a string named y
        String y;
        // declare a boolean named EOO
        boolean evenOrOdd;
        // declare a int named maxNum and initialized it as 12
        int maxNum = 12;
        // initialized an already declared variable
        y = "Hello World";
        // printed out the declared variable y
        System.out.println(y);
        // printed out the declared int variable
        System.out.print(maxNum);
        // declare a boolean evenOrOdd and initialized as True
        evenOrOdd = true;
        // printed out the declared boolean variable
        System.out.println(evenOrOdd);
        // import the Scanner class
        Scanner sc = new Scanner(System.in);
        // printed out the sentence "Please tell me about your day: "
        System.out.println("Please tell me about your day: ");
        // String input
        String input = sc.nextLine();
        // printed out String input
        System.out.println(input);


    }
}
