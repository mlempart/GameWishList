package pl.pwr.s241936.gamewishlist;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameListActivity extends AppCompatActivity {

    private Button addGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list);
        setupUIViews();

        addGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddGameActivity();
            }
        });
    }

    private void setupUIViews(){
        addGame = (Button)findViewById(R.id.addGame);
    }

    private void openAddGameActivity(){
        Intent intent = new Intent(this, AddGameActivity.class);
        startActivity(intent);
    }
}


