public class Main {
    public static void main(String[] args){
        Board gb = new Board();
        userInput userIn = new userInput();
        OpponentInput oppIn = new OpponentInput();
        gb.buildBoard();
        gb.outputGameBoard();

        //player takes their go
        gb.updateBoard(userIn.takeInput(),"x");
        gb.outputGameBoard();

        //Opponent takes their go

    }
}
