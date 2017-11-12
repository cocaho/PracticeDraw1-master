package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        canvas.drawArc(450,250,950,750,0,-45,true,paint );
        paint.setColor(Color.GRAY);
        canvas.drawArc(450,250,950,750,3,10,true,paint );
        paint.setColor(Color.GREEN);
        canvas.drawArc(450,250,950,750,16,50,true,paint );
        paint.setColor(Color.BLUE);
        canvas.drawArc(450,250,950,750,70,110,true,paint );
        paint.setColor(Color.CYAN);
        canvas.drawArc(430,230,930,730,180,135,true,paint);
    }
}
