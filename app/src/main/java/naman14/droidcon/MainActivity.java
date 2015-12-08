package naman14.droidcon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_line_animation_simple_runnable:
                startActivity(new Intent(MainActivity.this, ViewHolderActivity.class).putExtra("layout_id", R.layout.activity_line_animation_simple_runnable));
                break;
            case R.id.action_view_animation_wheel_spikes:
                startActivity(new Intent(MainActivity.this, ViewHolderActivity.class).putExtra("layout_id", R.layout.activity_view_animation_wheel_spikes));
                break;
            case R.id.action_view_wheel_spikes:
                startActivity(new Intent(MainActivity.this, ViewHolderActivity.class).putExtra("layout_id", R.layout.activity_view_sheel_spikes));
                break;
            case R.id.action_music_visualizer:
                startActivity(new Intent(MainActivity.this, ViewHolderActivity.class).putExtra("layout_id", R.layout.activity_music_visualizer));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}