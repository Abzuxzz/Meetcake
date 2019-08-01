package id.co.blogspot.abdullahxcreator.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class Adaptercake extends BaseAdapter {
    private String [] namacake ;
    private Integer[] gambarcake;
    private String[] asalcake;
    Context tempattampil;
    public Adaptercake(MenuCake menuCake, String[] namacake, Integer[] gambarcake, String[] asalcake) {

        this.namacake = namacake;
        this.gambarcake = gambarcake;
        this.asalcake = asalcake;
        tempattampil = menuCake;
    }

    @Override
    public int getCount() {return namacake.length;}

    @Override
    public Object getItem(int position) {return null;}

    @Override
    public long getItemId(int position) {return 0;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //memasukkan layout item ke dalam customlistactivity
        View tampilan = LayoutInflater.from(tempattampil).inflate(R.layout.item2,null);
        //konekan komponen pada layout item ke adapterbuah
        TextView txtitem = (TextView) tampilan.findViewById(R.id.txtitem2);
        TextView txtitems = (TextView) tampilan.findViewById(R.id.txtitems2);
        ImageView imgitem  = (ImageView) tampilan.findViewById(R.id.imgitem2);
        //tampikan data ke komponen di dalam layout
        txtitem.setText(namacake[position]);
        txtitems.setText(asalcake[position]);
        imgitem.setImageResource(gambarcake[position]);
        //tampilkan ke listview
        return tampilan;
    }
}
