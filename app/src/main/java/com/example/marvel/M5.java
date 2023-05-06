package com.example.marvel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M5 extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m5);
        button = (Button) findViewById(R.id.buttonxx);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GotUrl("https://reworkedgames.eu/the-last-of-us-pc-game-download-repack/");
            }
        });
        button2 = (Button) findViewById(R.id.textView9);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        button3 = (Button) findViewById(R.id.buttonx);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GotUrl("https://www.youtube.com/watch?v=uLtkt8BonwM");
            }
        });
    }

    public void open_M8() {
        Intent intent = new Intent(M5.this, M8.class);
        startActivity(intent);
    }
    public void GotUrl(String s) { //function to take URl as a string  <Explicit Intent>
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
