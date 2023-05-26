package model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class NotaDAO {
    SQLiteDatabase sqLiteDatabase;

    public NotaDAO(Context c) {
        this.sqLiteDatabase = c.openOrCreateDatabase("bancoNotas",Context.MODE_PRIVATE,null);
        sqLiteDatabase.execSQL("CREATE TABLE notas (id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "titulo varchar," +
                "texto varchar)");
    }

    public boolean insert(Nota n){
        ContentValues contentValues = new ContentValues();
        contentValues.put("titulo",n.getTitulo());
        contentValues.put("texto",n.getTexto());
        sqLiteDatabase.insert("notas",null,contentValues);

        return false;
    }

    //update
    //delete
    //getAll

}
