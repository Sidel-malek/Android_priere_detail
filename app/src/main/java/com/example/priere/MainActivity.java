package com.example.priere;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.priere.R;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemLongClickListener {

    private MediaPlayer mediaPlayer;
    private boolean isPlaying;
    private int currentPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        List<DetailPriere> detailPrieres = new ArrayList<DetailPriere>();
        detailPrieres.add(new DetailPriere("Soubh", "Ci-dessous nous allons voir les 10 étapes à respecter pour accomplir correctement la prière de l'aube, qui comporte 2 rakats: 1 - Le Takbir: C'est le fait de lever les mains à hauteur des épaules ou des oreilles, puis de dire : « Allahou Akbar » 2 - La Fatiha : C'est le fait de réciter à voix haute la première sourate du Coran Al-Fatiha, suivie d'une autre petite sourate. 3- L'inclinaison: Ensuite on prononce le Takbir, puis on s'incline en posant les mains sur les genoux, puis on dit 3 fois : Gloire et pureté à mon Seigneur l'Immense. On appelle cette position le Ruku'. 4 - On se relève ensuite de l'inclinaison en disant : Allah entend celui qui Le loue. Une fois complètement relevé on dit: Seigneur, à Toi la louange. 5- La prosternation: Ensuite on dit le Takbir, puis on se prosterne au sol, et on dit 3 fois : Gloire et pureté à mon Seigneur le Très Haut. On appelle cette position le soujoud.",R.drawable.prayer_0));
        detailPrieres.add(new DetailPriere("Dohr", "Ci-dessous nous allons voir les 10 étapes à respecter pour accomplir correctement la prière de l'aube, qui comporte 2 rakats: 1 - Le Takbir: C'est le fait de lever les mains à hauteur des épaules ou des oreilles, puis de dire : « Allahou Akbar » 2 - La Fatiha : C'est le fait de réciter à voix haute la première sourate du Coran Al-Fatiha, suivie d'une autre petite sourate. 3- L'inclinaison: Ensuite on prononce le Takbir, puis on s'incline en posant les mains sur les genoux, puis on dit 3 fois : Gloire et pureté à mon Seigneur l'Immense. On appelle cette position le Ruku'. 4 - On se relève ensuite de l'inclinaison en disant : Allah entend celui qui Le loue. Une fois complètement relevé on dit: Seigneur, à Toi la louange. 5- La prosternation: Ensuite on dit le Takbir, puis on se prosterne au sol, et on dit 3 fois : Gloire et pureté à mon Seigneur le Très Haut. On appelle cette position le soujoud.",R.drawable.prayer_1));
        detailPrieres.add(new DetailPriere("Asr", "Ci-dessous nous allons voir les 10 étapes à respecter pour accomplir correctement la prière de l'aube, qui comporte 2 rakats: 1 - Le Takbir: C'est le fait de lever les mains à hauteur des épaules ou des oreilles, puis de dire : « Allahou Akbar » 2 - La Fatiha : C'est le fait de réciter à voix haute la première sourate du Coran Al-Fatiha, suivie d'une autre petite sourate. 3- L'inclinaison: Ensuite on prononce le Takbir, puis on s'incline en posant les mains sur les genoux, puis on dit 3 fois : Gloire et pureté à mon Seigneur l'Immense. On appelle cette position le Ruku'. 4 - On se relève ensuite de l'inclinaison en disant : Allah entend celui qui Le loue. Une fois complètement relevé on dit: Seigneur, à Toi la louange. 5- La prosternation: Ensuite on dit le Takbir, puis on se prosterne au sol, et on dit 3 fois : Gloire et pureté à mon Seigneur le Très Haut. On appelle cette position le soujoud.",R.drawable.prayer_2));
        detailPrieres.add(new DetailPriere("Maghreb", "Ci-dessous nous allons voir les 10 étapes à respecter pour accomplir correctement la prière de l'aube, qui comporte 2 rakats: 1 - Le Takbir: C'est le fait de lever les mains à hauteur des épaules ou des oreilles, puis de dire : « Allahou Akbar » 2 - La Fatiha : C'est le fait de réciter à voix haute la première sourate du Coran Al-Fatiha, suivie d'une autre petite sourate. 3- L'inclinaison: Ensuite on prononce le Takbir, puis on s'incline en posant les mains sur les genoux, puis on dit 3 fois : Gloire et pureté à mon Seigneur l'Immense. On appelle cette position le Ruku'. 4 - On se relève ensuite de l'inclinaison en disant : Allah entend celui qui Le loue. Une fois complètement relevé on dit: Seigneur, à Toi la louange. 5- La prosternation: Ensuite on dit le Takbir, puis on se prosterne au sol, et on dit 3 fois : Gloire et pureté à mon Seigneur le Très Haut. On appelle cette position le soujoud.",R.drawable.prayer_3));
        detailPrieres.add(new DetailPriere("Aichaa", "Ci-dessous nous allons voir les 10 étapes à respecter pour accomplir correctement la prière de l'aube, qui comporte 2 rakats: 1 - Le Takbir: C'est le fait de lever les mains à hauteur des épaules ou des oreilles, puis de dire : « Allahou Akbar » 2 - La Fatiha : C'est le fait de réciter à voix haute la première sourate du Coran Al-Fatiha, suivie d'une autre petite sourate. 3- L'inclinaison: Ensuite on prononce le Takbir, puis on s'incline en posant les mains sur les genoux, puis on dit 3 fois : Gloire et pureté à mon Seigneur l'Immense. On appelle cette position le Ruku'. 4 - On se relève ensuite de l'inclinaison en disant : Allah entend celui qui Le loue. Une fois complètement relevé on dit: Seigneur, à Toi la louange. 5- La prosternation: Ensuite on dit le Takbir, puis on se prosterne au sol, et on dit 3 fois : Gloire et pureté à mon Seigneur le Très Haut. On appelle cette position le soujoud.",R.drawable.prayer));


        ListView mListView = findViewById(R.id.list);

        DetailPriereAdapter adapter = new DetailPriereAdapter(MainActivity.this, detailPrieres );
        mListView.setAdapter(adapter);
        mListView.setOnItemLongClickListener(this);

        mediaPlayer = MediaPlayer.create(this, R.raw.bgmusic);
        mediaPlayer.setLooping(true); // Pour que la musique se répète en boucle
        mediaPlayer.start();




    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            isPlaying = true;
            currentPosition = mediaPlayer.getCurrentPosition();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        if (mediaPlayer != null) {
            savedInstanceState.putBoolean("isPlaying", isPlaying);
            savedInstanceState.putInt("currentPosition", currentPosition);
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            isPlaying = savedInstanceState.getBoolean("isPlaying");
            currentPosition = savedInstanceState.getInt("currentPosition", 0);

        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (isPlaying && mediaPlayer != null) {
            mediaPlayer.seekTo(currentPosition);
            mediaPlayer.start();
        }
    }




    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        Intent intent = new Intent(this, DetailActivity.class);

        DetailPriere selectedDetailPriere = (DetailPriere) adapterView.getItemAtPosition(i);
        intent.putExtra("image", selectedDetailPriere.idImage);
        intent.putExtra("title", selectedDetailPriere.title);
        intent.putExtra("desc", selectedDetailPriere.description);

        startActivity(intent);
        return true;
    }
}