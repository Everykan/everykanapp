package com.everykan.everykanapp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Nombre de la BASE DE DATOS
    public static final String DATABASE_NAME = "expensesdata.db";

    // Nombre de la TABLA
    public static final String AMIGOS_TABLE = "expenses";

    // Columnas de la TABLA
    public static final String COL_1 = "ID";
    public static final String COL_2 = "FECHA";
    public static final String COL_3 = "HORA";
    public static final String COL_4 = "IMPORTE";
    public static final String COL_5 = "DESCRIPCION";
    public static final String COL_6 = "LATITUD";
    public static final String COL_7 = "LONGITUD";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }






    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
