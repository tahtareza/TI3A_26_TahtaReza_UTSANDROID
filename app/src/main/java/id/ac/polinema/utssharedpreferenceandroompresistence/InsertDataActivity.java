package id.ac.polinema.utssharedpreferenceandroompresistence;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertDataActivity extends AppCompatActivity {

    Button btnSave, btnCek;
    EditText edtInputKota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);

        edtInputKota = (EditText) findViewById(R.id.editTextInputNama);
        btnSave= (Button) findViewById(R.id.btnSimpanInputData);
        btnCek = (Button) findViewById(R.id.btnCekListData);

        final KotaDatabase kotaDatabase = Room.databaseBuilder(getApplicationContext(),
                KotaDatabase.class, "kota_db")
                .allowMainThreadQueries()
                .build();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KotaModel km = new KotaModel(edtInputKota.getText().toString());
                kotaDatabase.kotaDao().insertAll(km);
                edtInputKota.setText("");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
            }
        });

        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), ListDataActivity.class);
                startActivity(mIntent);
            }
        });
    }
}
