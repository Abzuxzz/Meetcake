package id.co.blogspot.abdullahxcreator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailCake extends AppCompatActivity {

    @BindView(R.id.imgcake)
    ImageView imgcake;
    @BindView(R.id.txtcake)
    TextView txtcake;
    @BindView(R.id.asalcake)
    TextView asalcake;
    @BindView(R.id.txtdetailcake)
    TextView txtdetailcake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cake);
        ButterKnife.bind(this);

        Intent ok = getIntent();

        String cake = ok.getStringExtra("cake");
        Integer caker = ok.getIntExtra("caker",0);
        String cakel = ok.getStringExtra("cakel");
        String detail = ok.getStringExtra("details");

        txtcake.setText(cake);
        imgcake.setImageResource(caker);
        asalcake.setText(cakel);
        txtdetailcake.setText(detail);
    }
}
