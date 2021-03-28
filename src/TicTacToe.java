

public class TicTacToe {

   public static void main(String[] args) {
       System.out.println("Welcome to TicTacToe game");
       char[] board = createBoard();

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
