package id.ac.polinema.utssharedpreferenceandroompresistence;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class ListDataActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        final KotaDatabase kotaDatabase = Room.databaseBuilder(getApplicationContext(), KotaDatabase.class, "kota_db")
                .allowMainThreadQueries()
                .build();

        recyclerView=findViewById(R.id.rv);

        //dbcenter = new DataHelper(this);
        //dataset = dbcenter.getAllRecord();
//
        List<KotaModel> kotas = kotaDatabase.kotaDao().getAllCity();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DataAdapter(kotas);
        recyclerView.setAdapter(adapter);

        btnBack = (Button)findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), InsertDataActivity.class);
                startActivity(mIntent);
            }
        });
    }
}
