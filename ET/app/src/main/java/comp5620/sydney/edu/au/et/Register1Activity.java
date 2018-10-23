package comp5620.sydney.edu.au.et;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register1Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);

        Button register2 = (Button) findViewById(R.id.newR);
        register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register1Activity.this,Register2Activity.class));
            }
        });

        Button register3 = (Button) findViewById(R.id.newC);
        register3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register1Activity.this,Register3Activity.class));
            }
        });
    }
}
