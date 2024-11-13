package com.example.priere;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_priere);

        TextView title = findViewById(R.id.titre);
        TextView des = findViewById(R.id.text);
        ImageView icon = findViewById(R.id.img);

        Intent intent = getIntent();
        title.setText(intent.getStringExtra("title"));
        des.setText(intent.getStringExtra("desc"));
        icon.setImageResource(intent.getIntExtra("image",0));

    }
}
