package org.sqlite.database.sqlite;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

final class SQLiteConnection$Operation
{
  private static final SimpleDateFormat sDateFormat;
  public ArrayList mBindArgs;
  public int mCookie;
  public long mEndTime;
  public Exception mException;
  public boolean mFinished;
  public String mKind;
  public String mSql;
  public long mStartTime;
  
  static
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd HH:mm:ss.SSS");
    sDateFormat = localSimpleDateFormat;
  }
  
  private String getFormattedStartTime()
  {
    SimpleDateFormat localSimpleDateFormat = sDateFormat;
    Date localDate = new java/util/Date;
    long l = this.mStartTime;
    localDate.<init>(l);
    return localSimpleDateFormat.format(localDate);
  }
  
  private String getStatus()
  {
    boolean bool = this.mFinished;
    Object localObject;
    if (!bool) {
      localObject = "running";
    }
    for (;;)
    {
      return (String)localObject;
      localObject = this.mException;
      if (localObject != null) {
        localObject = "failed";
      } else {
        localObject = "succeeded";
      }
    }
  }
  
  public void describe(StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    Object localObject1 = this.mKind;
    paramStringBuilder.append((String)localObject1);
    boolean bool1 = this.mFinished;
    long l1;
    long l2;
    String str;
    int i;
    int k;
    label185:
    Object localObject2;
    if (bool1)
    {
      localObject1 = paramStringBuilder.append(" took ");
      l1 = this.mEndTime;
      l2 = this.mStartTime;
      l1 -= l2;
      localObject1 = ((StringBuilder)localObject1).append(l1);
      str = "ms";
      ((StringBuilder)localObject1).append(str);
      localObject1 = paramStringBuilder.append(" - ");
      str = getStatus();
      ((StringBuilder)localObject1).append(str);
      localObject1 = this.mSql;
      if (localObject1 != null)
      {
        localObject1 = paramStringBuilder.append(", sql=\"");
        str = SQLiteConnection.access$300(this.mSql);
        localObject1 = ((StringBuilder)localObject1).append(str);
        str = "\"";
        ((StringBuilder)localObject1).append(str);
      }
      if (!paramBoolean) {
        break label376;
      }
      localObject1 = this.mBindArgs;
      if (localObject1 == null) {
        break label376;
      }
      localObject1 = this.mBindArgs;
      i = ((ArrayList)localObject1).size();
      if (i == 0) {
        break label376;
      }
      paramStringBuilder.append(", bindArgs=[");
      int j = this.mBindArgs.size();
      i = 0;
      localObject1 = null;
      k = 0;
      str = null;
      if (k >= j) {
        break label367;
      }
      localObject1 = this.mBindArgs.get(k);
      if (k != 0)
      {
        localObject2 = ", ";
        paramStringBuilder.append((String)localObject2);
      }
      if (localObject1 != null) {
        break label290;
      }
      localObject1 = "null";
      paramStringBuilder.append((String)localObject1);
    }
    for (;;)
    {
      i = k + 1;
      k = i;
      break label185;
      localObject1 = paramStringBuilder.append(" started ");
      l1 = System.currentTimeMillis();
      l2 = this.mStartTime;
      l1 -= l2;
      localObject1 = ((StringBuilder)localObject1).append(l1);
      str = "ms ago";
      ((StringBuilder)localObject1).append(str);
      break;
      label290:
      boolean bool2 = localObject1 instanceof byte[];
      if (bool2)
      {
        localObject1 = "<byte[]>";
        paramStringBuilder.append((String)localObject1);
      }
      else
      {
        bool2 = localObject1 instanceof String;
        if (bool2)
        {
          localObject2 = paramStringBuilder.append("\"");
          localObject1 = (String)localObject1;
          localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          localObject2 = "\"";
          ((StringBuilder)localObject1).append((String)localObject2);
        }
        else
        {
          paramStringBuilder.append(localObject1);
        }
      }
    }
    label367:
    localObject1 = "]";
    paramStringBuilder.append((String)localObject1);
    label376:
    localObject1 = this.mException;
    if (localObject1 != null)
    {
      localObject1 = paramStringBuilder.append(", exception=\"");
      str = this.mException.getMessage();
      localObject1 = ((StringBuilder)localObject1).append(str);
      str = "\"";
      ((StringBuilder)localObject1).append(str);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteConnection$Operation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */