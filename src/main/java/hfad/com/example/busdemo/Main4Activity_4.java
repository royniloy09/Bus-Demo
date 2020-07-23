package hfad.com.example.busdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class Main4Activity_4 extends AppCompatActivity {
    private RatingBar rating;
    private TextView textview3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_4);
        rating = findViewById(R.id.ratingbar);
        textview3 = findViewById(R.id.textview3);

        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textview3.setText("Rating : "+rating);
            }
        });

    }
}
