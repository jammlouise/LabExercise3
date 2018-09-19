package jamme.presnillo.com.presnillojammelab3;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t = (TextView) findViewById(R.id.hktext);
        TextView a = (TextView) findViewById(R.id.usttext);
        TextView b = (TextView) findViewById(R.id.distancetext);
        TextView c = (TextView) findViewById(R.id.locationtext);
        TextView d = (TextView) findViewById(R.id.chinatext);


        Typeface CustomFont1 = Typeface.createFromAsset(getAssets(),"fonts/orange juice 2.0.ttf");
        Typeface CustomFont2 = Typeface.createFromAsset(getAssets(),"fonts/Otterly Adorable - TTF.ttf");

        t.setTypeface(CustomFont1);
        a.setTypeface(CustomFont2);
        b.setTypeface(CustomFont2);
        c.setTypeface(CustomFont2);
        d.setTypeface(CustomFont2);

    }
}
