package id.co.blogspot.abdullahxcreator.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import android.widget.TextView;

class SplashScreenAnimation extends Animation {

    private Context context;
    private ProgressBar pb;
    private TextView txtpb;
    private float to;
    private float from;
    public SplashScreenAnimation(SplashScreen splashScreen, ProgressBar progressBar, TextView textView, float from, float to) {

        this.context = splashScreen;
        this.pb = progressBar;
        this.txtpb = textView;
        this.to = to;
        this.from = from;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);

        float value = from + (to - from) *interpolatedTime;

        pb.setProgress((int) value);

        txtpb.setText((int)value + " %");

        if (value == to){
            Intent newIntent = new Intent(context,MenuUtama.class);
            newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            newIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(newIntent);
        }
    }
}
