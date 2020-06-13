package sokoloma777.myfirstapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    private DrawerLayout drawer;
    private NavigationView nav_View;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        drawer = findViewById(R.id.drawer_Layout);
        nav_View = findViewById(R.id.nav_View);
    }
}
