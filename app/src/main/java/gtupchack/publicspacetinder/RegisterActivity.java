package gtupchack.publicspacetinder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class RegisterActivity extends AppCompatActivity {
//    Context context = null;
    DBHandler db = new DBHandler(this);

    private String name;

    public String returnName(){
        return name;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final Button login = (Button) findViewById(R.id.registerButton);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText user = (EditText)findViewById(R.id.usernameRegister);
                String username = user.getText().toString();

                EditText email = (EditText)findViewById(R.id.emailRegister);
                String emailAddress = email.getText().toString();

                EditText pass = (EditText)findViewById(R.id.passwordTextRegister);
                String password = pass.getText().toString();

                User newUser = new User(username, emailAddress, password);
                db.addUser(newUser);

                User test = db.getUser(username);
                String testU = test.getUsername();
                String testE = test.getEmail();

                Log.d("INFO", testU);
                Log.d("INFO", testE);

                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

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


}