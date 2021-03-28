import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

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
       showBoard(board);
       int userMove = getUserMove(board);

       showBoard(board);
   }

    public static int getUserMove(char[] board) {
        Scanner sc = new Scanner(System.in);
        Integer[] validCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        while (true) {
            System.out.println("What is your next move ? (1-9)");
            int index = sc.nextInt();
            if (Arrays.asList(validCells).contains(index))
                return index;

        }
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
