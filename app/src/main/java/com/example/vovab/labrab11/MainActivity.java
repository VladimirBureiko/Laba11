package com.example.vovab.labrab11;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Bitmap bm;
    int x;
    int y;
    Rect R1;
    Rect R2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bm = BitmapFactory.decodeResource(getResources(), R.drawable.ui);
        x=bm.getWidth();
        y=bm.getHeight();
        R2 = new Rect(100,200, 800,900);
        R1 = new Rect(400, 3, 900, 600);
        MyActivyty mv = new MyActivyty(this);
        setContentView(mv);
    }

    public class MyActivyty extends View
    {

        public MyActivyty(Context context)
        {

            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawBitmap(bm, R1, R2, new Paint());
        }
    }

}
