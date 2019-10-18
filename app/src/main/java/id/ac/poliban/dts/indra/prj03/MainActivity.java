package id.ac.poliban.dts.indra.prj03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lvNegara;
    private String[] namaNegara = new String[]{
            "indonesia","malaysia","Singapura","Thailand","Argentina",
            "indonesia","malaysia","Singapura","Thailand","Argentina"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("List View Negara");

        ListView lvNegara = findViewById(R.id.lvNegara);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,namaNegara);

        lvNegara.setAdapter(adapter);

        lvNegara.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Memilih "+ namaNegara[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
