package com.example.d1mys1klapo4ka.chinacalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;

public class MainChinaActivity extends AppCompatActivity {
    //12знаков Крыса, Бык, Тигр, Кролик, Дракон, Змея, Лошадь, Коза, Обезьяна, Петух, Собака, Свинья.

    private static final int YEAR_COUNT = 5000;

    private EditText mEtPuttInt, mEtYear;
    private GifImageView mGivGif;
    private Button button;
    private LinearLayout llDisp;

    private int year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_china);

        mEtPuttInt = (EditText)findViewById(R.id.et_putt_int);
        mEtYear = (EditText)findViewById(R.id.et_year);
        mGivGif = (GifImageView)findViewById(R.id.giv_gif);
        button = (Button)findViewById(R.id.button);
        llDisp = (LinearLayout)findViewById(R.id.ll_disp);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mEtPuttInt.length() == 0){
                    return;
                }

                try {
                    year = Integer.parseInt(mEtPuttInt.getText().toString());
                    if (year > YEAR_COUNT){
                        Toast.makeText(MainChinaActivity.this,"Введите число не превышающее 5000 тис", Toast.LENGTH_SHORT).show();
                        mEtPuttInt.setText(null);
                        return;
                    }
                }catch (Exception e){
                    Toast.makeText(MainChinaActivity.this,"Введите число не превышающее 5000 тис", Toast.LENGTH_SHORT).show();
                    mEtPuttInt.setText(null);
                    return;
                }
                nameChinaYears(year % 12);
            }
        });
    }

    private void nameChinaYears(int year){

        switch (year){
            case 0:
                mEtPuttInt.setText(null);
                mEtYear.setTextColor(getResources().getColor(R.color.witeColor));
                button.setTextColor(getResources().getColor(R.color.witeColor));
                mEtYear.setText("Обезьяна");
                llDisp.setBackgroundResource(R.color.monkeyColor);
                button.setBackgroundResource(R.color.monkeyColor);
                mGivGif.setImageResource(R.drawable.monkey);
                break;
            case 1:
                mEtPuttInt.setText(null);
                mEtYear.setTextColor(getResources().getColor(R.color.blackColor));
                button.setTextColor(getResources().getColor(R.color.blackColor));
                button.setBackgroundResource(R.color.witeColor);
                llDisp.setBackgroundResource(R.color.witeColor);
                mGivGif.setImageDrawable(null);
                mEtYear.setText("Петух");
                break;
            case 2:
                mEtPuttInt.setText(null);
                mEtYear.setTextColor(getResources().getColor(R.color.witeColor));
                button.setTextColor(getResources().getColor(R.color.witeColor));
                mEtYear.setText("Собака");
                llDisp.setBackgroundResource(R.color.dogColor);
                button.setBackgroundResource(R.color.dogColor);
                mGivGif.setImageResource(R.drawable.dog);
                break;
            case 3:
                mEtPuttInt.setText(null);
                mEtYear.setTextColor(getResources().getColor(R.color.blackColor));
                button.setTextColor(getResources().getColor(R.color.blackColor));
                button.setBackgroundResource(R.color.witeColor);
                llDisp.setBackgroundResource(R.color.witeColor);
                mGivGif.setImageDrawable(null);
                mEtYear.setText("Свинья");
                break;
            case 4:
                mEtPuttInt.setText(null);
                mEtYear.setTextColor(getResources().getColor(R.color.blackColor));
                button.setTextColor(getResources().getColor(R.color.blackColor));
                button.setBackgroundResource(R.color.witeColor);
                llDisp.setBackgroundResource(R.color.witeColor);
                mGivGif.setImageDrawable(null);
                mEtYear.setText("Крыса");
                break;
            case 5:
                mEtPuttInt.setText(null);
                mEtYear.setTextColor(getResources().getColor(R.color.blackColor));
                button.setTextColor(getResources().getColor(R.color.blackColor));
                mEtYear.setText("Бык");
                llDisp.setBackgroundResource(R.color.bullColor);
                button.setBackgroundResource(R.color.bullColor);
                mGivGif.setImageResource(R.drawable.bull);
                break;
            case 6:
                mEtPuttInt.setText(null);
                mEtYear.setTextColor(getResources().getColor(R.color.blackColor));
                button.setTextColor(getResources().getColor(R.color.blackColor));
                button.setBackgroundResource(R.color.witeColor);
                llDisp.setBackgroundResource(R.color.witeColor);
                mGivGif.setImageDrawable(null);
                mEtYear.setText("Тигр");
                break;
            case 7:
                mEtPuttInt.setText(null);
                mEtYear.setTextColor(getResources().getColor(R.color.blackColor));
                button.setTextColor(getResources().getColor(R.color.blackColor));
                mEtYear.setText("Кролик");
                llDisp.setBackgroundResource(R.color.rabbitColor);
                button.setBackgroundResource(R.color.rabbitColor);
                mGivGif.setImageResource(R.drawable.rabbit);
                break;
            case 8:
                mEtPuttInt.setText(null);
                mEtYear.setTextColor(getResources().getColor(R.color.witeColor));
                button.setTextColor(getResources().getColor(R.color.witeColor));
                mEtYear.setText("Дракон");
                llDisp.setBackgroundResource(R.color.dragonColor);
                button.setBackgroundResource(R.color.dragonColor);
                mGivGif.setImageResource(R.drawable.dragon);
                break;
            case 9:
                mEtPuttInt.setText(null);
                mEtYear.setTextColor(getResources().getColor(R.color.blackColor));
                button.setTextColor(getResources().getColor(R.color.blackColor));
                button.setBackgroundResource(R.color.witeColor);
                llDisp.setBackgroundResource(R.color.witeColor);
                mGivGif.setImageDrawable(null);
                mEtYear.setText("Змея");
                break;
            case 10:
                mEtPuttInt.setText(null);
                mEtYear.setTextColor(getResources().getColor(R.color.blackColor));
                button.setTextColor(getResources().getColor(R.color.blackColor));
                mEtYear.setText("Лошадь");
                llDisp.setBackgroundResource(R.color.horseColor);
                button.setBackgroundResource(R.color.horseColor);
                mGivGif.setImageResource(R.drawable.horse);
                break;
            case 11:
                mEtPuttInt.setText(null);
                mEtYear.setTextColor(getResources().getColor(R.color.blackColor));
                button.setTextColor(getResources().getColor(R.color.blackColor));
                button.setBackgroundResource(R.color.witeColor);
                llDisp.setBackgroundResource(R.color.witeColor);
                mGivGif.setImageDrawable(null);
                mEtYear.setText("Коза");
                break;
        }
    }
}
