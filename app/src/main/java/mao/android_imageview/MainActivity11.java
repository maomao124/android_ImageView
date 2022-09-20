package mao.android_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity11 extends AppCompatActivity
{

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        TextView textView1 = findViewById(R.id.TextView1);

        int processors = Runtime.getRuntime().availableProcessors();
        textView1.setText("线程总数：" + processors);
        for (int i = 0; i < processors; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    while (true)
                    {

                    }
                }
            }).start();
        }

    }
}