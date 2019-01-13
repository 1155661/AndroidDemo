package exampe.myapplication;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //用于存储图片的数组
    Drawable[] image = new Drawable[3];

    //计算图片
    int index = 0;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //存储图片
        image[0] = getDrawable(R.drawable.gamersky_01origin_01_201711102042848);
        image[1] = getDrawable(R.drawable.gamersky_01origin_01_201712231824635);
        image[2] = getDrawable(R.drawable.gamersky_01origin_01_201811111229284);

        //初始化图片
        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageDrawable(image[index]);

        Button btn = (Button) findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onImg();
            }

        });
    }

    private void onImg() {

        index++;

        if(index > 2){ index = 0;}
        //获取图片控件对象
        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageDrawable(image[index]);

        img.setImageDrawable(image[index]);
    }


}
