package com.example.mirim_0324_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //이 문장이 실행되어야 Button,checkbox 객체 등이 생김
        Button btn = findViewById(R.id.btn); //Button 객체를 ID로 찾아라! ID는 xml 파일에서 선언
        btn.setOnClickListener(btnListener); //버튼을 클릭했을때
        //1. new ... 탭
        //2. OnClickListener 함수를 참조 변수에 넣기 //지금 이거
        checkBox = findViewById(R.id.check);
        checkBox.setOnClickListener(checkListener);
    }

    View.OnClickListener checkListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast t = Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT);

            if(checkBox.isChecked())
                t.setText(R.string.checked_text);
            else
                t.setText(R.string.unchecked_text);

            t.show();
        }
    };

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //Toast t = Toast.makeText(MainActivity.this, R.string.toast_text, Toast.LENGTH_SHORT);
            //t.show();
            //위에 내용을 아래처럼 바꿀 수 있음
            Toast.makeText(MainActivity.this, R.string.toast_text, Toast.LENGTH_SHORT).show();

            //MainActivity.을 안 쓰면 BtnListener의 this를 가르키게 됨. 문맥이라 생각해! 저 객체가 나오는 곳?
        }
    };
    //위에 함수는 익명 함수인데 원래대로 클래스가 구현된다면 이렇게!
    //class BtnListener implementty OnClickLisener{
    //  public void onClick(View view){
    //      BtnListener btnlistener = new BtnListener();
}