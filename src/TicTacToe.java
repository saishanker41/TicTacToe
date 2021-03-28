import java.util.Locale;
import java.util.Scanner;

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
   }

    public static char chooseLetter(){
        char symbol;
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter your symbol");
        symbol=UserInput.next().toUpperCase().charAt(0);
        return symbol;
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
