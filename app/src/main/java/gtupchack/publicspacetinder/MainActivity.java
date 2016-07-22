package gtupchack.publicspacetinder;

import android.os.Bundle;
import android.util.Log;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

        //  Logic for picking a different photo every time the page loads
        int[] photos = {R.drawable.pc, R.drawable.t, R.drawable.fh, R.drawable.fs};
        ImageView imgView = (ImageView) findViewById(R.id.imageView);
        Random ran = new Random();
        int i = ran.nextInt(photos.length);
        int img = (int) photos[i];
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
