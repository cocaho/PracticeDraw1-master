package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        paint.setStrokeWidth(10);
        paint.setTextSize(36);

        canvas.drawLine(200,200,200,700,paint);
        canvas.drawLine(200,700,1200,700,paint);

        canvas.drawText("Froyo",300,800,paint);
        canvas.drawText("GB",450,800,paint);
        canvas.drawText("ICS",600,800,paint);
        canvas.drawText("JB",720,800,paint);
        canvas.drawText("   KITKAT",800,800,paint);
        canvas.drawText(" L",1000,800,paint);
        canvas.drawText("M",1100,800,paint);

        canvas.drawRect(300,690,400,700,paint);
        canvas.drawRect(420,680,520,700,paint);
        canvas.drawRect(580,680,680,700,paint);
        canvas.drawRect(700,550,800,700,paint);
        canvas.drawRect(840,450,940,700,paint);
        canvas.drawRect(950,400,1050,700,paint);
        canvas.drawRect(1060,450,1160,700,paint);


    }
}
