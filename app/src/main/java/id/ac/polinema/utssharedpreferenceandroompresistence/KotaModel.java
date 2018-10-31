package id.ac.polinema.utssharedpreferenceandroompresistence;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class KotaModel {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "nama")
    private String nama;

    public KotaModel(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
