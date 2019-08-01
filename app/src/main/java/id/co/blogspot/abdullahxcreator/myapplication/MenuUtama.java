package id.co.blogspot.abdullahxcreator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MenuUtama extends AppCompatActivity {

    CarouselView carouselView;

    int images [] = {R.drawable.muffin, R.drawable.muffin, R.drawable.muffin};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        carouselView = (CarouselView)  findViewById(R.id.cv);
        carouselView.setPageCount(images.length);
        carouselView.setImageListener(imageListener);
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(images[position]);
        }

    };

    public void TypesCake(View view) {
        startActivity(new Intent(MenuUtama.this, MenuCake.class));
    }

    public void tutorial(View view) {
        startActivity(new Intent(MenuUtama.this, MenuTutorial.class));
    }

}
