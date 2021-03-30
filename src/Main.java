public class Main {
    public static void main(String[] args){
        Board gb = new Board();
        userInput userIn = new userInput();
        OpponentInput oppIn = new OpponentInput();
        boolean gameEnded = false;
        gb.buildBoard();
        //gb.outputGameBoard();
        while(!gameEnded) {
            //player takes their go
            gb.outputGameBoard();
            gameEnded = gb.checkForWin();
            if(gameEnded){
                break;
            }
            gb.updateBoard(userIn.takeInput(), "x");
            gameEnded = gb.checkForWin();
            if(gameEnded){
                gb.outputGameBoard();
                break;
            }


            //Opponent takes their go
            oppIn.makeMove(gb.getGameBoard());
        }
    }
}
