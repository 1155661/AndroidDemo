package exampe.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //取得按钮对象
        Button b1 = (Button) findViewById(R.id.id_buy);

        //设置监听器
        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                //方法名没有重复的现象可以直接调用
                onBuy();
                //如果方法名冲突则加上前缀
//                MainActivity.this.onBuy();
            }
        });

    }

    public void onBuy(){
        EditText editText = (EditText) findViewById(R.id.id_count);
        String amout = editText.getText().toString();
        String massage = "购买"+ amout +"件商品";

        Toast.makeText(this,massage,Toast.LENGTH_SHORT).show();
    }

    private class MyListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {



        }
    }
}
