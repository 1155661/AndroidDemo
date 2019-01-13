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
        Button button = (Button) findViewById(R.id.id_buy);

        //创建一个监听器
        MyListener listener = new MyListener();

        //给按钮设置一个监听器，当按钮被点击时，系统将调用listener.onClick()方法处理
        button.setOnClickListener(listener);
    }

    //在View类里定义了一个内部接口：OnClickListener
    private class MyListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText edit = (EditText) MainActivity.this.findViewById(R.id.id_count);
            String amount = edit.getText().toString();
            String message = "购买" + amount + "件商品";

            Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();

        }
    }
}
