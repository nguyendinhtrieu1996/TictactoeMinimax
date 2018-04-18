package com.sonhoai.sonho.tiktak;

/**
 * Created by sonho on 3/21/2018.
 */

public class Minimax {


    public Record minimaxRecode(ChessBoard chessBoard,int currentDept, int maxDept) {
        Move bestMove=null;//
        int bestScore;//giá trị điểm tốt nhất

        if(chessBoard.isGameOver() || currentDept == maxDept) {
            int score = chessBoard.evaluate();
            if (score > 0) {
                score -= currentDept;
            } else if (score < 0) {
                score += currentDept;
            } else {
                score = currentDept;
            }
            return new Record(null, score);
        }


        bestScore=Integer.MIN_VALUE;


        for(Move move:chessBoard.getMove()){
            ChessBoard newChess = new ChessBoard(chessBoard.getContext(),chessBoard.getBitmapWidth(), chessBoard.getBitmapHeight(),chessBoard.getColQty(),chessBoard.getRowQty());
            newChess.setBoard(chessBoard.getNewBoard());
            newChess.setPlayer(chessBoard.getPlayer());

            newChess.makeMove(move);
            Record record = minimaxRecode(newChess, currentDept+1, maxDept);

            int currentScore = -record.getScore();

            if(currentScore > bestScore) {
                bestScore = currentScore;
                bestMove = move;
            }

        }

        return new Record(bestMove,bestScore);
    }

}
