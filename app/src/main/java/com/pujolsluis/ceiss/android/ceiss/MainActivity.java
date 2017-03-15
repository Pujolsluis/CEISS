package com.pujolsluis.ceiss.android.ceiss;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button subscribeBtn = (Button) findViewById(R.id.subscribe_buttonView);

        subscribeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://eepurl.com/csDFZr";
                Intent intent = new Intent();
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
