package model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class NotaDAO {
    SQLiteDatabase sqLiteDatabase;

    public NotaDAO(Context c) {
        this.sqLiteDatabase = c.openOrCreateDatabase("b",Context.MODE_PRIVATE,null);
    }

    public boolean insert(Nota n){
        ContentValues contentValues = new ContentValues();
        contentValues.put("titulo",n.titulo);
        contentValues.put("txt",n.titulo);
        sqLiteDatabase.insert("notas",null,contentValues);

        return false;
    }

    //update
    //delete
    //getAll

}
