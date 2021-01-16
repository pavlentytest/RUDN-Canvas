package ru.samsung.itschool.mdev.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Paint paint = new Paint();
        //paint.setColor(Color.RED);
        paint.setColor(Color.parseColor("#00ffcc"));
        //paint.setColor(Color.rgb(5,6,7));
        // CMYK - для печати
        paint.setAntiAlias(true); // сглаживание
        paint.setStrokeWidth(10); // толщина маркера
        paint.setStyle(Paint.Style.STROKE); // тип заливки
        canvas.drawColor(Color.YELLOW); // фон
        canvas.drawRect(400,400,800,800,paint);
        paint.setColor(Color.GREEN);
        Rect rect = new Rect(400,800,900,400);
        canvas.drawRect(rect, paint);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(100,900,100,paint);

        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path.moveTo(100,100);
        path.lineTo(200,200);
        path.lineTo(400,100);
      //  path.lineTo(400,200);
        canvas.drawPath(path,paint);

       // Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.bee);
      //  canvas.drawBitmap(bitmap,0,0,paint);

        // сначала поворачиваем холст
        float rotate_center_x = 200; //центр поворота холста по оси X
        float rotate_center_y = 200; // центр поворота холста по оси Y
        float rotate_angle = 45; //угол поворота
        canvas.rotate(rotate_angle,rotate_center_x,rotate_center_y);

        // пишем текст
        paint.setTextSize(50);
        canvas.drawText("Samsung IT school", 50, 100, paint);

        // возвращаем холст обратно
        canvas.rotate(-rotate_angle,rotate_center_x,rotate_center_y);


    }
}
