package com.example.ngay10_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
// 1: khai báo biến
    Button mBtnAhowAlert ;
    TextView mTvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 2 : ánh xạ
        mBtnAhowAlert = findViewById(R.id.butonshow);
        mTvTitle - findViewById(R.id.textshow)

    // chạy code
    // in ra tren may ao thong bao

        Toast.makeText(contex)
    }
}
