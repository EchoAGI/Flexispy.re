package org.sqlite.database.sqlite;

public class DatabaseObjectNotClosedException
  extends RuntimeException
{
  private static final String s = "Application did not close the cursor or database object that was opened here";
  
  public DatabaseObjectNotClosedException()
  {
    super("Application did not close the cursor or database object that was opened here");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/DatabaseObjectNotClosedException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */