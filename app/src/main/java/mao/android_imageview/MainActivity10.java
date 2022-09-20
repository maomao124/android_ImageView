package mao.android_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity10 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        ImageView imageView1 = findViewById(R.id.ImageView1);
        imageView1.setScaleType(ImageView.ScaleType.CENTER);
    }
}