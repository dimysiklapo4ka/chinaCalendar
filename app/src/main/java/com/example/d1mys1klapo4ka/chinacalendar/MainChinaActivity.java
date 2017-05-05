package com.example.d1mys1klapo4ka.chinacalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pl.droidsonroids.gif.GifImageView;

public class MainChinaActivity extends AppCompatActivity {
    //12знаков Крыса, Бык, Тигр, Кролик, Дракон, Змея, Лошадь, Коза, Обезьяна, Петух, Собака, Свинья.

    private EditText mEtPuttInt, mEtYear;
    private GifImageView mGivGif;
    private Button button;

    private int year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_china);

        mEtPuttInt = (EditText)findViewById(R.id.et_putt_int);
        mEtYear = (EditText)findViewById(R.id.et_year);
        mGivGif = (GifImageView)findViewById(R.id.giv_gif);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mEtPuttInt.length() == 0){
                    return;
                }

                year = Integer.parseInt(mEtPuttInt.getText().toString());
                nameChinaYears(year % 12);
            }
        });
    }

    private void nameChinaYears(int year){

        switch (year){
            case 0:
                mEtYear.setText("Обезьяна");
                break;
            case 1:
                mEtYear.setText("Петух");
                break;
            case 2:
                mEtYear.setText("Собака");
                break;
            case 3:
                mEtYear.setText("Свинья");
                break;
            case 4:
                mEtYear.setText("Крыса");
                break;
            case 5:
                mEtYear.setText("Бык");
                break;
            case 6:
                mEtYear.setText("Тигр");
                break;
            case 7:
                mEtYear.setText("Кролик");
                break;
            case 8:
                mEtYear.setText("Дракон");
                break;
            case 9:
                mEtYear.setText("Змея");
                break;
            case 10:
                mEtYear.setText("Лошадь");
                break;
            case 11:
                mEtYear.setText("Коза");
                break;
        }
    }
}
