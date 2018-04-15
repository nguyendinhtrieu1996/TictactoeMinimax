package com.sonhoai.sonho.tiktak;

/**
 * Created by sonho on 3/21/2018.
 */

public class Minimax {


    public Record minimaxRecode(ChessBoard chessBoard, int player,int currentDept, int maxDept) {
        Move bestMove=null;//
        int bestScore;//giá trị điểm tốt nhất

        if(chessBoard.isGameOver() || currentDept == maxDept) {
            return new Record(null, chessBoard.evaluate(player));
        }

        if(chessBoard.getPlayer()==player){
            bestScore=Integer.MIN_VALUE;
        }else {
            bestScore=Integer.MAX_VALUE;
        }

        for(Move move:chessBoard.getMove()){
            ChessBoard newChess = new ChessBoard(chessBoard.getContext(),chessBoard.getBitmapWidth(), chessBoard.getBitmapHeight(),chessBoard.getColQty(),chessBoard.getRowQty());
            newChess.setBoard(chessBoard.getNewBoard());
            newChess.setPlayer(chessBoard.getPlayer());

            newChess.makeMove(move);
            Record record = minimaxRecode(newChess, player, currentDept+1, maxDept);

            //Bot
             if(chessBoard.getPlayer() == player){
                if(record.getScore() > bestScore) {
                    bestScore = record.getScore();
                    bestMove = move;
                }
            } else {
                if(record.getScore() < bestScore){
                    bestScore = record.getScore();
                    bestMove = move;
                }
            }
        }

        return new Record(bestMove,bestScore);
    }

}
