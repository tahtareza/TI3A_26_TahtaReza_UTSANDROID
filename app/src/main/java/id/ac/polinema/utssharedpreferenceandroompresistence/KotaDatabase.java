package id.ac.polinema.utssharedpreferenceandroompresistence;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {KotaModel.class}, version = 1)
public abstract class KotaDatabase extends RoomDatabase {
    public abstract KotaDao kotaDao();
}
