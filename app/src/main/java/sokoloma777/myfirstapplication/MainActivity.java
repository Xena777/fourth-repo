package sokoloma777.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    private ListView listOfHeroes;
    private String [] arrayOfHeroes;
    private ArrayAdapter adapterForHeroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar my_toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);
        if (my_toolbar != null) {
            my_toolbar.setTitle(R.string.header);
        }

        listOfHeroes = findViewById(R.id.heroesListView);
        arrayOfHeroes = getResources().getStringArray(R.array.heroes);
        adapterForHeroes = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayOfHeroes);
        listOfHeroes.setAdapter(adapterForHeroes);

        listOfHeroes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Activity_second.class);
                intent.putExtra("Hero", position);
                startActivity(intent);
            }
        });
    }
}
