package com.legionhamz.xoxgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    TextView pointer1, pointer2 ;
    int get_pointer1 = 0, get_pointer2 = 0;
    ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int bt1 = 0, bt2 = 0, bt3 = 0, bt4 = 0, bt5 = 0, bt6 = 0, bt7 = 0, bt8 = 0, bt9 = 0;
    Button tekrar_btn, sifirla_btn;

    Boolean siraKimde = false;
    TextView player_1, player_2;


    public void kontrolEt()
    {
        //player 1 kazanırsa
        if( ((bt1 == 10) && (bt2 == 10) && (bt3 == 10)) || ((bt4 == 10) && (bt5 == 10) && (bt6 == 10)) || ((bt7 == 10) && (bt8 == 10) && (bt9 == 10))
                || ((bt1 == 10) && (bt4 == 10) && (bt7 == 10)) || ((bt2 == 10) && (bt5 == 10) && (bt8 == 10)) || ((bt3 == 10) && (bt6 == 10) && (bt9 == 10))
                || ((bt1 == 10) && (bt5 == 10) && (bt9 == 10)) || ((bt3 == 10) && (bt5 == 10) && (bt7 == 10)))
        {
            get_pointer1 += 1;
            pointer1.setText(String.valueOf(get_pointer1));

            Toast.makeText(this, "1.oyuncu kazandı", Toast.LENGTH_SHORT).show();

            siraKimde = false;
            btn1.setImageResource(R.drawable.squre_icon);
            btn2.setImageResource(R.drawable.squre_icon);
            btn3.setImageResource(R.drawable.squre_icon);
            btn4.setImageResource(R.drawable.squre_icon);
            btn5.setImageResource(R.drawable.squre_icon);
            btn6.setImageResource(R.drawable.squre_icon);
            btn7.setImageResource(R.drawable.squre_icon);
            btn9.setImageResource(R.drawable.squre_icon);
            btn8.setImageResource(R.drawable.squre_icon);

            bt1 = 0;
            bt2 = 0;
            bt3 = 0;
            bt4 = 0;
            bt5 = 0;
            bt6 = 0;
            bt7 = 0;
            bt8 = 0;
            bt9 = 0;

            player_1.setTextColor(Color.RED);

        }

        //player 2 kazanırsa
        else if( ((bt1 == 20) && (bt2 == 20) && (bt3 == 20)) || ((bt4 == 20) && (bt5 == 20) && (bt6 == 20)) || ((bt7 == 20) && (bt8 == 20) && (bt9 == 20))
                || ((bt1 == 20) && (bt4 == 20) && (bt7 == 20)) || ((bt2 == 20) && (bt5 == 20) && (bt8 == 20)) || ((bt3 == 20) && (bt6 == 20) && (bt9 == 20))
                || ((bt1 == 20) && (bt5 == 20) && (bt9 == 20)) || ((bt3 == 20) && (bt5 == 20) && (bt7 == 20)))
        {
            get_pointer2 += 1;
            pointer2.setText(String.valueOf(get_pointer2));

            Toast.makeText(this, "2.oyuncu kazandı", Toast.LENGTH_SHORT).show();

            siraKimde = false;
            btn1.setImageResource(R.drawable.squre_icon);
            btn2.setImageResource(R.drawable.squre_icon);
            btn3.setImageResource(R.drawable.squre_icon);
            btn4.setImageResource(R.drawable.squre_icon);
            btn5.setImageResource(R.drawable.squre_icon);
            btn6.setImageResource(R.drawable.squre_icon);
            btn7.setImageResource(R.drawable.squre_icon);
            btn9.setImageResource(R.drawable.squre_icon);
            btn8.setImageResource(R.drawable.squre_icon);

            bt1 = 0;
            bt2 = 0;
            bt3 = 0;
            bt4 = 0;
            bt5 = 0;
            bt6 = 0;
            bt7 = 0;
            bt8 = 0;
            bt9 = 0;

            player_1.setTextColor(Color.RED);

        }

        else if( (bt1 != 0) && (bt2 != 0) && (bt3 != 0) && (bt4 != 0) && (bt5 != 0) && (bt6 != 0) && (bt7 != 0) && (bt8 != 0) && (bt9 != 0) )
        {
            Toast.makeText(this, "Kazanan Yok", Toast.LENGTH_SHORT).show();

            siraKimde = false;
            btn1.setImageResource(R.drawable.squre_icon);
            btn2.setImageResource(R.drawable.squre_icon);
            btn3.setImageResource(R.drawable.squre_icon);
            btn4.setImageResource(R.drawable.squre_icon);
            btn5.setImageResource(R.drawable.squre_icon);
            btn6.setImageResource(R.drawable.squre_icon);
            btn7.setImageResource(R.drawable.squre_icon);
            btn9.setImageResource(R.drawable.squre_icon);
            btn8.setImageResource(R.drawable.squre_icon);

            bt1 = 0;
            bt2 = 0;
            bt3 = 0;
            bt4 = 0;
            bt5 = 0;
            bt6 = 0;
            bt7 = 0;
            bt8 = 0;
            bt9 = 0;

            player_1.setTextColor(Color.RED);


        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sifirla_btn = findViewById(R.id.reset_btn);
        tekrar_btn = findViewById(R.id.tekrar_btn);

        btn1 = findViewById(R.id.squre1);
        btn2 = findViewById(R.id.squre2);
        btn3 = findViewById(R.id.squre3);
        btn4 = findViewById(R.id.squre4);
        btn5 = findViewById(R.id.squre5);
        btn6 = findViewById(R.id.squre6);
        btn7 = findViewById(R.id.squre7);
        btn8 = findViewById(R.id.squre8);
        btn9 = findViewById(R.id.squre9);

        pointer1 = findViewById(R.id.player1point);

        pointer2 = findViewById(R.id.player2point);

        player_1 = findViewById(R.id.player1);
        player_2 = findViewById(R.id.player2);



        player_1.setTextColor(Color.RED);
        player_2.setTextColor(Color.BLACK);



        int[][] kazanmaDurumu = {{1,2,3}, {4,5,6}, {7,8,9}, {1,4,7}, {2,5,8}, {3,6,9}, {1,5,9},{3,5,7}};



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(bt1 == 0)
                {
                    if(siraKimde == false)
                    {
                        btn1.setImageResource(R.drawable.x_game);
                        siraKimde = true;
                        player_1.setTextColor(Color.BLACK);
                        player_2.setTextColor(Color.RED);
                        bt1 +=10;
                    }
                    else
                    {
                        btn1.setImageResource(R.drawable.o_game);
                        siraKimde = false;
                        player_1.setTextColor(Color.RED);
                        player_2.setTextColor(Color.BLACK);
                        bt1 += 20;
                    }
                    kontrolEt();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Boş kutucukları deneyin", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(bt2 == 0)
                {
                    if(siraKimde == false)
                    {
                        btn2.setImageResource(R.drawable.x_game);
                        siraKimde = true;
                        player_2.setTextColor(Color.RED);
                        player_1.setTextColor(Color.BLACK);
                        bt2 += 10;
                    }
                    else
                    {
                        btn2.setImageResource(R.drawable.o_game);
                        siraKimde = false;
                        player_1.setTextColor(Color.RED);
                        player_2.setTextColor(Color.BLACK);
                        bt2 +=20;
                    }
                    kontrolEt();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Boş kutucukları deneyin", Toast.LENGTH_SHORT).show();
                }

            }
        });btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(bt3 == 0)
            {
                if(siraKimde == false)
                {
                    btn3.setImageResource(R.drawable.x_game);
                    siraKimde = true;
                    player_2.setTextColor(Color.RED);
                    player_1.setTextColor(Color.BLACK);
                    bt3 += 10;
                }
                else
                {
                    btn3.setImageResource(R.drawable.o_game);
                    siraKimde = false;
                    player_1.setTextColor(Color.RED);
                    player_2.setTextColor(Color.BLACK);
                    bt3 += 20;
                }
                kontrolEt();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Boş kutucukları deneyin", Toast.LENGTH_SHORT).show();
            }

        }
    });btn4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(bt4 == 0)
            {
                if(siraKimde == false)
                {
                    btn4.setImageResource(R.drawable.x_game);
                    siraKimde = true;
                    player_2.setTextColor(Color.RED);
                    player_1.setTextColor(Color.BLACK);
                    bt4 += 10;
                }
                else
                {
                    btn4.setImageResource(R.drawable.o_game);
                    siraKimde = false;
                    player_1.setTextColor(Color.RED);
                    player_2.setTextColor(Color.BLACK);
                    bt4 += 20;
                }
                kontrolEt();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Boş kutucukları deneyin", Toast.LENGTH_SHORT).show();
            }

        }
    });btn5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(bt5 == 0)
            {
                if(siraKimde == false)
                {
                    btn5.setImageResource(R.drawable.x_game);
                    siraKimde = true;
                    player_2.setTextColor(Color.RED);
                    player_1.setTextColor(Color.BLACK);
                    bt5 += 10;
                }
                else
                {
                    btn5.setImageResource(R.drawable.o_game);
                    siraKimde = false;
                    player_1.setTextColor(Color.RED);
                    player_2.setTextColor(Color.BLACK);
                    bt5 += 20;
                }
                kontrolEt();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Boş kutucukları deneyin", Toast.LENGTH_SHORT).show();
            }

        }
    });btn6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(bt6 == 0)
            {
                if(siraKimde == false)
                {
                    btn6.setImageResource(R.drawable.x_game);
                    siraKimde = true;
                    player_2.setTextColor(Color.RED);
                    player_1.setTextColor(Color.BLACK);
                    bt6 += 10;
                }
                else
                {
                    btn6.setImageResource(R.drawable.o_game);
                    siraKimde = false;
                    player_1.setTextColor(Color.RED);
                    player_2.setTextColor(Color.BLACK);
                    bt6 += 20;
                }
                kontrolEt();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Boş kutucukları deneyin", Toast.LENGTH_SHORT).show();
            }

        }
    });btn7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(bt7 == 0)
            {
                if(siraKimde == false)
                {
                    btn7.setImageResource(R.drawable.x_game);
                    siraKimde = true;
                    player_2.setTextColor(Color.RED);
                    player_1.setTextColor(Color.BLACK);
                    bt7 += 10;
                }
                else
                {
                    btn7.setImageResource(R.drawable.o_game);
                    siraKimde = false;
                    player_1.setTextColor(Color.RED);
                    player_2.setTextColor(Color.BLACK);
                    bt7 += 20;
                }
                kontrolEt();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Boş kutucukları deneyin", Toast.LENGTH_SHORT).show();
            }

        }
    });btn8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(bt8 == 0)
            {
                if(siraKimde == false)
                {
                    btn8.setImageResource(R.drawable.x_game);
                    siraKimde = true;
                    player_2.setTextColor(Color.RED);
                    player_1.setTextColor(Color.BLACK);
                    bt8 += 10;
                }
                else
                {
                    btn8.setImageResource(R.drawable.o_game);
                    siraKimde = false;
                    player_1.setTextColor(Color.RED);
                    player_2.setTextColor(Color.BLACK);
                    bt8 += 20;
                }
                kontrolEt();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Boş kutucukları deneyin", Toast.LENGTH_SHORT).show();
            }

        }
    });btn9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if(bt9 == 0)
            {
                if(siraKimde == false)
                {
                    btn9.setImageResource(R.drawable.x_game);
                    siraKimde = true;
                    player_2.setTextColor(Color.RED);
                    player_1.setTextColor(Color.BLACK);
                    bt9 += 10;
                }
                else
                {
                    btn9.setImageResource(R.drawable.o_game);
                    siraKimde = false;
                    player_1.setTextColor(Color.RED);
                    player_2.setTextColor(Color.BLACK);
                    bt9 += 20;
                }
                kontrolEt();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Boş kutucukları deneyin", Toast.LENGTH_SHORT).show();
            }

        }
    });
    }

    public void tekrar_click(View view)
    {
        siraKimde = false;
        btn1.setImageResource(R.drawable.squre_icon);
        btn2.setImageResource(R.drawable.squre_icon);
        btn3.setImageResource(R.drawable.squre_icon);
        btn4.setImageResource(R.drawable.squre_icon);
        btn5.setImageResource(R.drawable.squre_icon);
        btn6.setImageResource(R.drawable.squre_icon);
        btn7.setImageResource(R.drawable.squre_icon);
        btn9.setImageResource(R.drawable.squre_icon);
        btn8.setImageResource(R.drawable.squre_icon);

        bt1 = 0;
        bt2 = 0;
        bt3 = 0;
        bt4 = 0;
        bt5 = 0;
        bt6 = 0;
        bt7 = 0;
        bt8 = 0;
        bt9 = 0;

        player_1.setTextColor(Color.RED);
    }

    public void reset_click(View view)
    {
        siraKimde = false;
        btn1.setImageResource(R.drawable.squre_icon);
        btn2.setImageResource(R.drawable.squre_icon);
        btn3.setImageResource(R.drawable.squre_icon);
        btn4.setImageResource(R.drawable.squre_icon);
        btn5.setImageResource(R.drawable.squre_icon);
        btn6.setImageResource(R.drawable.squre_icon);
        btn7.setImageResource(R.drawable.squre_icon);
        btn9.setImageResource(R.drawable.squre_icon);
        btn8.setImageResource(R.drawable.squre_icon);

        bt1 = 0;
        bt2 = 0;
        bt3 = 0;
        bt4 = 0;
        bt5 = 0;
        bt6 = 0;
        bt7 = 0;
        bt8 = 0;
        bt9 = 0;

        player_1.setTextColor(Color.RED);
        pointer1.setText("0");
        pointer2.setText("0");
        get_pointer1 = 0;
        get_pointer2 = 0;
    }

}














