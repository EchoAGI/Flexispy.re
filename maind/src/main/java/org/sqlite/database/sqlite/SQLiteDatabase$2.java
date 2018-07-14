package org.sqlite.database.sqlite;

import java.io.File;
import java.io.FileFilter;

final class SQLiteDatabase$2
  implements FileFilter
{
  SQLiteDatabase$2(String paramString) {}
  
  public boolean accept(File paramFile)
  {
    String str1 = paramFile.getName();
    String str2 = this.val$prefix;
    return str1.startsWith(str2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteDatabase$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */