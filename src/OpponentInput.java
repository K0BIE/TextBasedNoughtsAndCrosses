import java.util.Random;

public class OpponentInput {
    public void makeMove(String[][] board){
        boolean moveMade = complete(board, "x");
        if(!moveMade){
            moveMade = complete(board, "o");
        }
        if(!moveMade){
            randomMove(board);
        }

    }
    public boolean complete(String[][] board, String shape){
        //check for 2 x's in the same row
        boolean gap;
        int totalFound;
        int[] gapIndex = new int[2];
        for(int i=0; i<3; i++){
            totalFound = 0;
            gap = false;
            gapIndex[0] = 2;
            gapIndex[1] = 2;
            for(int j=0; j<3; j++){
                if(board[i][j].equals(shape)){
                    totalFound++;
                }
                if(board[i][j].equals(" ")){
                    gapIndex[0] = i;
                    gapIndex[1] = j;
                    gap = true;
                }
                if(gap && totalFound==2){
                    board[gapIndex[0]][gapIndex[1]] = "o";
                    return true;
                }

            }
        }

        //check for 2 x's in the same column
        for(int i=0; i<3; i++) {
            totalFound = 0;
            gap = false;
            gapIndex[0] = 2;
            gapIndex[1] = 2;
            for (int j = 0; j < 3; j++) {
                if (board[j][i].equals(shape)) {
                    totalFound++;
                }
                if (board[j][i].equals(" ")) {
                    gapIndex[0] = j;
                    gapIndex[1] = i;
                    gap = true;
                }
                if (gap && totalFound == 2) {
                    board[gapIndex[0]][gapIndex[1]] = "o";
                    return true;
                }

            }
        }

        //check for 2 diagonal x
        boolean dir = true;
        int j;
        for(int directionLoop=0; directionLoop<2; directionLoop++){
            //dir = direction of horizontal, true = top left to bottom right
            if(directionLoop == 1){
                dir = false;
            }
            totalFound = 0;
            gap = false;
            gapIndex[0] = 2;
            gapIndex[1] = 2;
            for(int i=0; i<3; i++){
                if(dir){ j=i; }
                else{ j=2-i; }
                //#############
                if (board[j][i].equals(shape)) {
                    totalFound++;
                }
                if (board[j][i].equals(" ")) {
                    gapIndex[0] = j;
                    gapIndex[1] = i;
                    gap = true;
                }
                if (gap && totalFound == 2) {
                    board[gapIndex[0]][gapIndex[1]] = "o";
                    return true;
                }
            }
        }

        return false;
    }
    public void randomMove(String[][] board){
        Random rand = new Random();
        int randRow;
        int randCol;
        boolean madeRandMove = false;
        while(!madeRandMove){
            randRow = rand.nextInt(3);
            randCol = rand.nextInt(3);
            if(board[randRow][randCol].equals(" ")){
                board[randRow][randCol]="o";
                madeRandMove = true;
            }
        }

    }
}
