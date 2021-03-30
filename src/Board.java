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
    public boolean checkForWin(){
        int blankSpaces = 0;
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                if(gameBoard[i][j].equals(" ")){
                    blankSpaces++;
                }
            }
            if(gameBoard[i][0].equals(gameBoard [i][1]) && gameBoard [i][1].equals(gameBoard[i][2]) && !gameBoard[i][0].equals(" ")){
                //win horizontally
                System.out.println(gameBoard[i][0]+" has won");
                return true;
            }
            if(gameBoard[0][i].equals(gameBoard [1][i]) && gameBoard [1][i].equals(gameBoard[2][i]) && !gameBoard[0][i].equals(" ")){
                //win vertically
                System.out.println(gameBoard[0][i]+" has won");
                return true;
            }
        }
        if(gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2]) && !gameBoard[1][1].equals(" ")){
            //win diagonally
            System.out.println(gameBoard[1][1]+" has won");
            return true;
        }
        if(gameBoard[2][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[0][2]) && !gameBoard[1][1].equals(" ")){
            //win diagonally
            System.out.println(gameBoard[1][1]+" has won");
            return true;
        }
        return false;
    }
}
