package model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class NotaDAO {
    SQLiteDatabase sqLiteDatabase;

    public NotaDAO(Context c) {
        this.sqLiteDatabase = c.openOrCreateDatabase("bd",Context.MODE_PRIVATE,null);
    }

    public boolean insert(Nota n){
        ContentValues contentValues = new ContentValues();
        contentValues.put("titulo",n.getTitulo());
        contentValues.put("txt",n.getTexto());
        sqLiteDatabase.insert("notas",null,contentValues);

        return false;
    }

    public boolean update(){
        return false;
    }

    public boolean delete(){
        return false;
    }

    public boolean search(){
        return false;
    }

    public boolean getAll(){
        return false;
    }

    public boolean getNota(){
        return false;
    }


    //update
    //delete
    //getAll
    //Search
}
