package sokoloma777.myfirstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_second extends AppCompatActivity {
    private TextView textViewForHeroName;
    private TextView textViewForHeroDiscription;
    private ImageView imageViewHero;
    private int hero;
    private int [] heroArray = {R.string.narutoUdzumaki, R.string.sasukeUchiha, R.string.sakuraHaruno, R.string.kakashiHatake};
    private int [] discriptionArray = {R.string.naruto_discription, R.string.sasuke_discription, R.string.sakura_discription, R.string.kakashi_discription};
    private int [] imageArray = {R.drawable.naruto, R.drawable.sasuke, R.drawable.sakura, R.drawable.kakashi};
    //private int [] imageArray = new int[R.array.imageOfHeroes];


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ActionBar my_toolbar = getSupportActionBar();
        if (my_toolbar != null) {
            my_toolbar.setTitle(R.string.header);
        }

        textViewForHeroName = findViewById(R.id.textViewForHeroName);
        textViewForHeroDiscription = findViewById(R.id.textViewForHeroDiscription);
        imageViewHero = findViewById(R.id.imageViewHero);
        catchIntent();
    }

    private void catchIntent() {
        Intent iVar = getIntent();
        if (iVar != null) {
            hero = iVar.getIntExtra("Hero", 0);
        }
        textViewForHeroName.setText(heroArray[hero]);
        textViewForHeroDiscription.setText(discriptionArray[hero]);
        imageViewHero.setImageResource(imageArray[hero]);
    }
}
