package sokoloma777.myfirstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class LogoActivity extends AppCompatActivity{
    private ImageView imageForLogo;
    private TextView textViewLogo;
    private Animation logoAnim;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        imageForLogo = findViewById(R.id.LogoImage);
        textViewLogo = findViewById(R.id.textViewLogo);

        imageForLogo.setImageResource(R.drawable.naruto_logo);
        logoAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.logo_anim);
        imageForLogo.startAnimation(logoAnim);
        textViewLogo.startAnimation(logoAnim);

        start_menu_activity();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    private void start_menu_activity() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(LogoActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        }).start();
    }
}
