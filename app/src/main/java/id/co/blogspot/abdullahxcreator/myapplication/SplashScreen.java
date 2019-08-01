package id.co.blogspot.abdullahxcreator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        progressBar = (ProgressBar) findViewById(R.id.pb);
        textView = (TextView) findViewById(R.id.txtpb);

        progressBar.setMax(100);
        progressBar.setScaleY(3f);

        progressAnimation();
    }

    private void progressAnimation() {
        SplashScreenAnimation anim = new SplashScreenAnimation(this,progressBar,textView,0f,100f);

        anim.setDuration(8000);

        progressBar.setAnimation(anim);
    }
}
