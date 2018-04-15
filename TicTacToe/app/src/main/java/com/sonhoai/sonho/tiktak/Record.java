package com.sonhoai.sonho.tiktak;

/**
 * Created by sonho on 3/21/2018.
 */

//chứa 1 nước đi kèm với score, chứa 1 giá trị trả về là 1 nước đi.
    //diểm có 3 khả năng 0, 1 và -1;
public class Record {
    private Move move;
    private int score;

    public Record(Move move, int score) {
        this.move = move;
        this.score = score;
    }
    public Record(){
    }
    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
