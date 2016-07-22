package gtupchack.publicspacetinder;

import android.os.Bundle;
import android.util.Log;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;

import java.util.Random;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHandler db = new DBHandler(this);

        db.addFilter(new Filter("Restaurants"));
        db.addFilter(new Filter("Parks"));
        db.addFilter(new Filter("Public Squares"));
        db.addFilter(new Filter("Landmarks"));
        db.addFilter(new Filter("Market"));

        Place b = new Place("La Boqueria", "La Rambla, 91, 08001 Barcelona", 41.3, 2.1, "Barcelona", "Market");
        Place eb = new Place("Mercat del Born", "Plaça Comercial, 12, 08003 Barcelona", 41.2, 2.1, "Barcelona", "Landmark");
        Place m = new Place("Monserrat", "08199 Montserrat, Barcelona", 41.6, 1.8, "Barcelona", "Landmark");
        Place pc = new Place("Parc de la Ciutadella", "Passeig de Picasso, 21, 08003 Barcelona", 41.4, 2.2, "Barcelona", "Park");
        Place pn = new Place("Playa de la Barceloneta", "Barceloneta Beach", 41.3, 2.2, "Barcelona", "Landmark");
        Place ps = new Place("Placa del Sol", "Plaça del Sol, 08012 Barcelona", 41.4, 2.2, "Barcelona", "Public Squares");

        db.addPlace(b);
        db.addPlace(eb);
        db.addPlace(m);
        db.addPlace(pc);
        db.addPlace(pn);
        db.addPlace(ps);

        //  Logic for picking a different photo every time the page loads
        Place[] places = {b, eb, m, pc, pn, ps};
        int[] photos = {R.drawable.b, R.drawable.eb, R.drawable.m, R.drawable.pc,R.drawable.pn, R.drawable.ps};

        ImageView imgView = (ImageView) findViewById(R.id.imageView);

        Random ran = new Random();
        int i = ran.nextInt(photos.length);
        int img = (int) photos[i];
        Place place = (Place) places[i];

        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(place.getPname());

        imgView.setImageResource(img);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public void refresh(View view) {
        finish();
        startActivity(getIntent());
    }





}
