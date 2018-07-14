package org.sqlite.database.sqlite;

import android.util.Log;

final class CloseGuard$DefaultReporter
  implements CloseGuard.Reporter
{
  public void report(String paramString, Throwable paramThrowable)
  {
    Log.w(paramString, paramThrowable);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/CloseGuard$DefaultReporter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */