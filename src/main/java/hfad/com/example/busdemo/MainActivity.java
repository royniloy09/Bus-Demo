package hfad.com.example.busdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button1;
    private Button rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        rating = findViewById(R.id.rating);
        button1.setOnClickListener(this);
        rating.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            if(v.getId()==R.id.button1)
            {
                Intent intent = new Intent(MainActivity.this,Main2Activity_2.class);
                startActivity(intent);
            }
        if(v.getId()==R.id.rating)
        {
            Intent intent = new Intent(MainActivity.this,Main4Activity_4.class);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.drawable.exitbutton);
        alertDialogBuilder.setTitle(R.string.exit_title);
        alertDialogBuilder.setMessage(R.string.exit_text);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}
