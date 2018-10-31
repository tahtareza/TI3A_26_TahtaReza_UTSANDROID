package id.ac.polinema.utssharedpreferenceandroompresistence;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface KotaDao {

    @Query("SELECT * FROM kotamodel")
    List<KotaModel> getAllCity();

    @Insert
    void insertAll(KotaModel... kotas);


}
