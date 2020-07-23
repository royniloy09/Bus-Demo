package hfad.com.example.busdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity_2 extends AppCompatActivity {
    private TextView textView1;
    private ListView listView;
    private String[] bus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_2);

        listView = findViewById(R.id.listview);
        final String[] buses = getResources().getStringArray(R.array.bus);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Main2Activity_2.this,R.layout.sample_view,R.id.textview1,buses);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = buses[position];
                if(value.equals("13 no"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "13 no");
                    startActivity(intent);
                }
                if(value.equals("06 no"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "06 no");
                    startActivity(intent);
                }
                if(value.equals("07 no"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "07 no");
                    startActivity(intent);
                }
                if(value.equals("08 no"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "08 no");
                    startActivity(intent);
                }
                if(value.equals("Anabil Super"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Anabil Super");
                    startActivity(intent);
                }
                if(value.equals("Agradut ltd."))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Agradut ltd.");
                    startActivity(intent);
                }
                if(value.equals("Alif Enterprise"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Alif Enterprise");
                    startActivity(intent);
                }
                if(value.equals("Bihongo Paribahan Limited"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Bihongo Paribahan Limited");
                    startActivity(intent);
                }
                if(value.equals("Balaka"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Balaka");
                    startActivity(intent);
                }
                if(value.equals("BRTC Service"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "BRTC Service");
                    startActivity(intent);
                }
                if(value.equals("Dewan"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Dewan");
                    startActivity(intent);
                }
                if(value.equals("Himachol Paribahan"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Himachol Paribahan");
                    startActivity(intent);
                }
                if(value.equals("Khajababa Paribahan Ltd."))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Khajababa Paribahan Ltd.");
                    startActivity(intent);
                }
                if(value.equals("Labbayek"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Labbayek");
                    startActivity(intent);
                }
                if(value.equals("Ramjan"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Ramjan");
                    startActivity(intent);
                }
                if(value.equals("Robrob Paribahan Pvt. Ltd."))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Robrob Paribahan Pvt. Ltd.");
                    startActivity(intent);
                }
                if(value.equals("Suprovat Paribahan"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Suprovat Paribahan");
                    startActivity(intent);
                }
                if(value.equals("Shadhin"))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Shadhin");
                    startActivity(intent);
                }
                if(value.equals("Torongo Plus Transport Ltd."))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Torongo Plus Transport Ltd.");
                    startActivity(intent);
                }
                if(value.equals("Turag Transport Co. Ltd."))
                {
                    Intent intent = new Intent(Main2Activity_2.this, Main3Activity_3.class);
                    intent.putExtra("name", "Turag Transport Co. Ltd.");
                    startActivity(intent);
                }

            }
        });

    }
}
