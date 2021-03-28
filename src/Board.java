import javax.swing.text.html.HTMLDocument;

public class Board {
    private String[][] gameBoard = new String[3][3];

    public void buildBoard() {
        for(int i = 0; i<gameBoard.length; i++){
            for(int j = 0; j<gameBoard[i].length; j++){
                gameBoard[i][j]=" ";
            }
        }
    }

    public void outputGameBoard(){
        String base = "";
        int rowsToPrint = 2;
        for(int i = 0; i<gameBoard.length; i++){
            base = gameBoard[i][0]+"|"+gameBoard[i][1]+"|"+gameBoard[i][2];
            System.out.println(base);
            if(rowsToPrint > 0){
                System.out.println("-----");
                rowsToPrint--;
            }
            base="";
        }
    }

    public void updateBoard(int[] location,String type){
        gameBoard[location[0]][location[1]]=type;
    }

    public String[][] getGameBoard() {
        return gameBoard;
    }
    public void setGameBoard(String[][] gameBoard) {
        this.gameBoard = gameBoard;
    }
}
