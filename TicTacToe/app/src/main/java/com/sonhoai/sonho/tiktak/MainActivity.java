package com.sonhoai.sonho.tiktak;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private ChessBoard chessBoard;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.img);

        chessBoard = new ChessBoard(MainActivity.this, 600,600,3,3);
        chessBoard.init();
//        Line line = new Line(300,300, 3,3);
//        ChessBoard chessBoard = new ChessBoard(line);
        img.setImageBitmap(chessBoard.drawBoard());
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
               return chessBoard.onTouch(view, motionEvent);
            }
        });
    }
}
