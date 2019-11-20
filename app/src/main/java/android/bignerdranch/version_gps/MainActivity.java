package android.bignerdranch.version_gps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button vrs_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vrs_button = (Button) findViewById(R.id.vrs_button);
        vrs_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Version_page();
            }
        });

    }

    public void Version_page() {
        Intent intent = new Intent(this, Version_page.class);
        startActivity(intent);
    }
}
