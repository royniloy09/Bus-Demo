package hfad.com.example.busdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity_3 extends AppCompatActivity {
    private TextView textview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_3);

        textview2 = findViewById(R.id.textview2);

        Bundle bundle =getIntent().getExtras();
        if(bundle!=null)
        {
            String name =bundle.getString("name");
            showdetail(name);
        }
    }

    void showdetail(String name)
    {
        if(name.equals("13 no"))
        {
            textview2.setText(R.string.T1);
        }
        if(name.equals("06 no"))
        {
            textview2.setText(R.string.T2);
        }
        if(name.equals("07 no"))
        {
            textview2.setText(R.string.T3);
        }
        if(name.equals("08 no"))
        {
            textview2.setText(R.string.T4);
        }
        if(name.equals("Anabil Super"))
        {
            textview2.setText(R.string.T5);
        }
        if(name.equals("Agradut ltd."))
        {
            textview2.setText(R.string.T6);
        }
        if(name.equals("Alif Enterprise"))
        {
            textview2.setText(R.string.T7);
        }
        if(name.equals("Bihongo Paribahan Limited"))
        {
            textview2.setText(R.string.T8);
        }
        if(name.equals("Balaka"))
        {
            textview2.setText(R.string.T9);
        }
        if(name.equals("BRTC Service"))
        {
            textview2.setText(R.string.T10);
        }
        if(name.equals("Dewan"))
        {
            textview2.setText(R.string.T11);
        }
        if(name.equals("Himachol Paribahan"))
        {
            textview2.setText(R.string.T12);
        }
        if(name.equals("Khajababa Paribahan Ltd."))
        {
            textview2.setText(R.string.T13);
        }
        if(name.equals("Labbayek"))
        {
            textview2.setText(R.string.T14);
        }
        if(name.equals("Ramjan"))
        {
            textview2.setText(R.string.T15);
        }
        if(name.equals("Robrob Paribahan Pvt. Ltd."))
        {
            textview2.setText(R.string.T16);
        }
        if(name.equals("Suprovat Paribahan"))
        {
            textview2.setText(R.string.T17);
        }
        if(name.equals("Shadhin"))
        {
            textview2.setText(R.string.T18);
        }
        if(name.equals("Torongo Plus Transport Ltd."))
        {
            textview2.setText(R.string.T19);
        }
        if(name.equals("Turag Transport Co. Ltd."))
        {
            textview2.setText(R.string.T20);
        }
    }
}
