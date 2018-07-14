package com.vvt.capture.email.gmail;

import com.vvt.base.capture.g;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GmailEventReference
  implements g, Serializable
{
  private static final long serialVersionUID = 7258104532816267048L;
  private String databasePath;
  private HashMap ref;
  
  public GmailEventReference()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.ref = localHashMap;
    this.databasePath = "";
  }
  
  public String getDatabasePath()
  {
    return this.databasePath;
  }
  
  public HashMap getReference()
  {
    return this.ref;
  }
  
  public boolean isChangeFound(g paramg)
  {
    int i = 1;
    boolean bool1 = paramg instanceof GmailEventReference;
    Object localObject1;
    Object localObject2;
    if (bool1)
    {
      paramg = (GmailEventReference)paramg;
      localObject1 = this.databasePath;
      localObject2 = paramg.databasePath;
      bool1 = ((String)localObject1).equals(localObject2);
      if (!bool1) {
        bool1 = i;
      }
    }
    for (;;)
    {
      return bool1;
      localObject1 = this.ref.keySet();
      int j = ((Set)localObject1).size();
      localObject2 = paramg.ref.keySet();
      int k = ((Set)localObject2).size();
      if (j != k)
      {
        j = i;
      }
      else
      {
        localObject1 = this.ref.keySet();
        Iterator localIterator = ((Set)localObject1).iterator();
        do
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break label219;
          }
          localObject1 = (String)localIterator.next();
          localObject2 = paramg.ref.keySet();
          boolean bool3 = ((Set)localObject2).contains(localObject1);
          if (!bool3) {
            break;
          }
          long l1 = ((Long)this.ref.get(localObject1)).longValue();
          localObject2 = paramg.ref;
          localObject1 = (Long)((HashMap)localObject2).get(localObject1);
          long l2 = ((Long)localObject1).longValue();
          bool2 = l1 < l2;
        } while (!bool2);
        boolean bool2 = i;
        continue;
        bool2 = i;
        continue;
        label219:
        bool2 = false;
        localObject1 = null;
      }
    }
  }
  
  public boolean isNewEventFound(g paramg)
  {
    int i = 1;
    boolean bool1 = paramg instanceof GmailEventReference;
    Object localObject1;
    int j;
    Object localObject2;
    if (bool1)
    {
      paramg = (GmailEventReference)paramg;
      localObject1 = paramg.ref.keySet();
      j = ((Set)localObject1).size();
      localObject2 = this.ref.keySet();
      int k = ((Set)localObject2).size();
      if (j > k) {
        j = i;
      }
    }
    for (;;)
    {
      return j;
      localObject1 = paramg.ref.keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      do
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break label190;
        }
        localObject1 = (String)localIterator.next();
        localObject2 = this.ref.keySet();
        boolean bool3 = ((Set)localObject2).contains(localObject1);
        if (!bool3) {
          break;
        }
        long l1 = ((Long)this.ref.get(localObject1)).longValue();
        localObject2 = paramg.ref;
        localObject1 = (Long)((HashMap)localObject2).get(localObject1);
        long l2 = ((Long)localObject1).longValue();
        bool2 = l2 < l1;
      } while (!bool2);
      boolean bool2 = i;
      continue;
      bool2 = i;
      continue;
      label190:
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public void setDatabasePath(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    this.databasePath = paramString;
  }
  
  public void setReference(HashMap paramHashMap)
  {
    this.ref = paramHashMap;
  }
  
  public String toString()
  {
    String str1 = "db: %s, map: %s";
    int i = 2;
    Object[] arrayOfObject = new Object[i];
    HashMap localHashMap = null;
    String str2 = this.databasePath;
    if (str2 != null)
    {
      str2 = this.databasePath.trim();
      i = str2.length();
      if (i != 0) {
        break label69;
      }
    }
    label69:
    for (str2 = "n/a";; str2 = this.databasePath)
    {
      arrayOfObject[0] = str2;
      localHashMap = this.ref;
      arrayOfObject[1] = localHashMap;
      return String.format(str1, arrayOfObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/gmail/GmailEventReference.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */