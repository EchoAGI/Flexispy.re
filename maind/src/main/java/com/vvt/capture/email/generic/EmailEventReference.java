package com.vvt.capture.email.generic;

import com.vvt.base.capture.g;
import java.io.Serializable;

public class EmailEventReference
  implements g, Serializable
{
  private static final long serialVersionUID = 7258104532816267048L;
  private String databasePath = "";
  private long ref = 0L;
  
  public String getDatabasePath()
  {
    return this.databasePath;
  }
  
  public Long getReference()
  {
    return Long.valueOf(this.ref);
  }
  
  public boolean isChangeFound(g paramg)
  {
    boolean bool1 = true;
    boolean bool2 = paramg instanceof EmailEventReference;
    if (bool2)
    {
      paramg = (EmailEventReference)paramg;
      String str1 = this.databasePath;
      String str2 = paramg.databasePath;
      bool2 = str1.equals(str2);
      if (bool2) {}
    }
    for (;;)
    {
      return bool1;
      long l1 = this.ref;
      long l2 = paramg.ref;
      bool2 = l1 < l2;
      if (!bool2) {
        bool1 = false;
      }
    }
  }
  
  public boolean isNewEventFound(g paramg)
  {
    boolean bool = paramg instanceof EmailEventReference;
    if (bool)
    {
      paramg = (EmailEventReference)paramg;
      long l1 = paramg.ref;
      long l2 = this.ref;
      bool = l1 < l2;
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void setDatabasePath(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.databasePath = paramString;
  }
  
  public void setReference(Long paramLong)
  {
    long l = paramLong.longValue();
    this.ref = l;
  }
  
  public String toString()
  {
    String str1 = "db: %s, ref: %s";
    int i = 2;
    Object[] arrayOfObject = new Object[i];
    Long localLong = null;
    String str2 = this.databasePath;
    if (str2 != null)
    {
      str2 = this.databasePath.trim();
      i = str2.length();
      if (i != 0) {
        break label72;
      }
    }
    label72:
    for (str2 = "n/a";; str2 = this.databasePath)
    {
      arrayOfObject[0] = str2;
      localLong = Long.valueOf(this.ref);
      arrayOfObject[1] = localLong;
      return String.format(str1, arrayOfObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/generic/EmailEventReference.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */