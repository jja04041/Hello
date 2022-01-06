package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity {

    int count = 1;
    int[] picture = {
            R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5
    };

    Button btn1, btn2, btn3;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        this.setContentView(R.layout.activity_main);

        iv = this.findViewById(R.id.ivPicture);
        //btn1 = this.findViewById(R.id.btImageChange);
    }

    public void move(View vw){
        int sel = vw.getId();
        if(sel == R.id.btImageChange){
            iv.setImageResource(picture[count]);
            count++;
            if (count>4) {count=0;}
        }else if(sel == R.id.btClose){
            Log.i("kim","move: close 닫기처리");
            String msg = "현재 화면을 닫기 close 합니다";
            String msg123 = "이번학기도 화이팅!";

            Toast tt = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG);
            Toast pp =Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
            pp.show();
            tt.show();
            this.finish();
        }
    }
}