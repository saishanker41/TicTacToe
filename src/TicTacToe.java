import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class TicTacToe {

   public static void main(String[] args) {
       System.out.println("Welcome to TicTacToe game");
       char[] board = createBoard();
       char UserLetter = chooseLetter();
       char ComputerLetter;
       if(UserLetter=='X')

           ComputerLetter='O';

       else

           ComputerLetter='X';

       System.out.println("Computer Letter is: " + ComputerLetter+" User Letter is : " + UserLetter);
       System.out.println("Current Board");
       showBoard(board);
       int first=toss();
       if(first==1) {

           getUserMove(board,UserLetter);
       }
       else {

           getUserMove(board,ComputerLetter);
       }
       System.out.println("Current Board:");
       showBoard(board);
   }

    public static int toss() {

        Random random=new Random();
        int value = 1+random.nextInt(2-1+1);
        if (value==1) {

            System.out.println("User will play first");
            return value;
        }
        else {

            System.out.println("Computer will play first ");
            return value;
        }
    }

    public static void getUserMove(char[] board, char symbol) {
        Scanner sc = new Scanner(System.in);
        Integer[] validCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Boolean occupied;
        while (occupied = false) {
            System.out.println("What is your next move ? (1-9)");
            int index = sc.nextInt();
            if (Arrays.asList(validCells).contains(index) && isSpaceFree(board, index)) {

                board[index] = symbol;
                occupied = true;
            }

        }
    }

    private static boolean isSpaceFree(char[] board, int index) {
        return board[index] == ' ';
    }

    public static char chooseLetter() {
        char symbol;
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter your symbol");
        symbol=UserInput.next().toUpperCase().charAt(0);
        return symbol;
    }

    public static void showBoard(char[] board)
    {
        System.out.println("\n" + board[1] + "  |  "  + board[2] + "  |  " + board[3]);
        System.out.println("--------------");
        System.out.println(" " + board[4] + "  |  "  + board[5] + "  |  " + board[6]);
        System.out.println("--------------");
        System.out.println(" " + board[7] + "  |  "  +board[8] + "  |  " + board[9]);
        System.out.println("--------------");
    }




    public static char[] createBoard() {

        char[] board = new char[10];
        for(int index = 0; index < board.length; index++)
        {
            board[index] = ' ';
        }
        return  board;
    }

}
