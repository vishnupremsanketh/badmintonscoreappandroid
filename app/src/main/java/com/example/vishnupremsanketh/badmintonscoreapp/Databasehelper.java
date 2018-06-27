package com.example.vishnupremsanketh.badmintonscoreapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Databasehelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Badminton";
    public static final String TABLE1_Name = "singles";
    public static final String T1COL_1="ID";
    public static final String T1COL_2="singles_player1";
    public static final String T1COL_3="singles_player2";
    public static final String T1COL_4="singles_player1score";
    public static final String T1COL_5="singles_player2score";
    public static final String T1COL_6="Won";
    public static final String T1COL_7="points";


    public Databasehelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(" CREATE TABLE " + TABLE1_Name + "( ID INTEGER PRIMARY KEY AUTOINCREMENT,singles_player1 TEXT,singles_player2 TEXT,singles_player1score TEXT,singles_player2score TEXT,Won TEXT,points TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE1_Name);
        onCreate(sqLiteDatabase);
    }
}


