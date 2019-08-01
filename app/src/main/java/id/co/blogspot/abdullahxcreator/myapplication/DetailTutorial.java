package id.co.blogspot.abdullahxcreator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailTutorial extends AppCompatActivity {

    @BindView(R.id.img)
    ImageView img;
    @BindView(R.id.nama)
    TextView nama;
    @BindView(R.id.asal)
    TextView asal;
    @BindView(R.id.txttutorial)
    TextView txttutorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tutorial);
        ButterKnife.bind(this);

        Intent siap = getIntent();

        String nama = siap.getStringExtra("nama");
        Integer gambar = siap.getIntExtra("gambar",0);
        String asal = siap.getStringExtra("asal");
        String cara = siap.getStringExtra("cara");

//        Toast.makeText(getApplicationContext(), "data :  " + nama + gambar + asal + cara,
//                Toast.LENGTH_LONG).show();


        this.nama.setText(nama);
        img.setImageResource(gambar);
        this.asal.setText(asal);
        txttutorial.setText(cara);
    }

}
