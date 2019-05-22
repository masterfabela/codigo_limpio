package model;

public class Cell {
    final int FLAGGED_STATE = 4;
    private int status = 0;

    public boolean isFlagged(){
        return status == FLAGGED_STATE;
    }

}
