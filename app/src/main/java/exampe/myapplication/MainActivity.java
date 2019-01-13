package exampe.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //view指的是被点击的按钮Button
    public void onLogin(View view){

        //获取用户名和密码的控件
        EditText username = (EditText) findViewById(R.id.id_name);
        EditText password = (EditText) findViewById(R.id.id_password);

        //接收两个控件的内容(getText())，并转换成字符串(toString())，把空格去掉(trim())
        String usernString = username.getText().toString().trim();
        String passwordString = password.getText().toString().trim();

        //模拟用户登录
        if(usernString.equals("mmm") && passwordString.equals("123")){
            Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"用户名/密码错误",Toast.LENGTH_SHORT).show();
        }



//        Toast.makeText(this,"登录处理..",Toast.LENGTH_SHORT).show();
    }
}
