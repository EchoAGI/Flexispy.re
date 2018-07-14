package com.vvt.callmanager.a;

import android.os.Parcel;
import android.telephony.PhoneNumberUtils;
import com.vvt.e.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class d
{
  private static final boolean a;
  private int b;
  private int c;
  private int d;
  private String e;
  
  static
  {
    boolean bool = com.vvt.h.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  private d(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramString;
  }
  
  private static d a(Parcel paramParcel, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    paramParcel.setDataPosition(paramInt);
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    Object localObject;
    if (paramBoolean3)
    {
      i = paramParcel.readInt();
      j = paramParcel.readInt() & 0xFF;
      k = paramParcel.readInt();
      m = paramParcel.readInt();
      if (m != 0) {}
      n = paramParcel.readInt();
      paramParcel.readInt();
      paramParcel.readInt();
      m = paramParcel.readInt();
      if (m != 0) {}
      m = paramParcel.readInt();
      i1 = 2;
      if (m == i1)
      {
        paramParcel.readString();
        paramParcel.readInt();
        localObject = paramParcel.readString();
        String str1 = PhoneNumberUtils.stringFromStringAndTOA((String)localObject, k);
        localObject = new com/vvt/callmanager/a/d;
        ((d)localObject).<init>(j, n, i, str1);
      }
    }
    for (;;)
    {
      return (d)localObject;
      i1 = paramParcel.dataPosition();
      paramParcel.readInt();
      paramParcel.readString();
      localObject = paramParcel.readString();
      boolean bool = a((String)localObject);
      if (!bool) {
        break;
      }
      paramParcel.setDataPosition(i1);
      paramParcel.readString();
      paramParcel.readInt();
      localObject = paramParcel.readString();
      break;
      String str2;
      if (paramBoolean2)
      {
        i = paramParcel.readInt();
        j = paramParcel.readInt() & 0xFF;
        m = paramParcel.readInt();
        k = paramParcel.readInt();
        if (k != 0) {}
        k = paramParcel.readInt();
        paramParcel.readInt();
        n = paramParcel.readInt();
        if (n != 0) {}
        n = paramParcel.readInt();
        if (n != 0) {}
        paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readString();
        str2 = PhoneNumberUtils.stringFromStringAndTOA(paramParcel.readString(), m);
        localObject = new com/vvt/callmanager/a/d;
        ((d)localObject).<init>(j, k, i, str2);
      }
      else if (paramBoolean1)
      {
        i = paramParcel.readInt();
        j = paramParcel.readInt() & 0xFF;
        m = paramParcel.readInt();
        paramParcel.readInt();
        k = paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readInt();
        str2 = PhoneNumberUtils.stringFromStringAndTOA(paramParcel.readString(), m);
        localObject = new com/vvt/callmanager/a/d;
        ((d)localObject).<init>(j, k, i, str2);
      }
      else
      {
        i = paramParcel.readInt();
        j = paramParcel.readInt();
        m = paramParcel.readInt();
        paramParcel.readInt();
        k = paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readInt();
        n = paramParcel.readInt();
        if (n > 0)
        {
          n = paramParcel.dataPosition() + -4;
          paramParcel.setDataPosition(n);
        }
        str2 = PhoneNumberUtils.stringFromStringAndTOA(paramParcel.readString(), m);
        localObject = new com/vvt/callmanager/a/d;
        ((d)localObject).<init>(j, k, i, str2);
      }
    }
  }
  
  private static f a(Parcel paramParcel, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    f localf = new com/vvt/callmanager/a/f;
    String str = null;
    localf.<init>(null);
    int i = paramParcel.dataPosition();
    localf.a = i;
    i = paramParcel.readInt();
    localf.c = i;
    i = paramParcel.readInt();
    localf.d = i;
    if ((paramBoolean1) || (paramBoolean2) || (paramBoolean3))
    {
      i = localf.d & 0xFF;
      localf.d = i;
    }
    i = paramParcel.readInt();
    localf.e = i;
    i = paramParcel.readInt();
    localf.f = i;
    i = paramParcel.readInt();
    localf.g = i;
    i = paramParcel.readInt();
    localf.h = i;
    i = paramParcel.readInt();
    localf.i = i;
    i = paramParcel.readInt();
    localf.j = i;
    boolean bool1 = a(localf);
    int j;
    if (bool1)
    {
      str = "";
      if (!paramBoolean3) {
        break label329;
      }
      j = paramParcel.readInt();
      int k = 2;
      if (j != k) {
        break label270;
      }
      paramParcel.readString();
      paramParcel.readInt();
      str = paramParcel.readString();
      m = a(str);
      if (m == 0) {
        break label430;
      }
    }
    int n;
    label270:
    label329:
    label430:
    for (int m = 0;; n = b(str))
    {
      localf.k = m;
      n = localf.k;
      if (n >= 0) {
        localf.l = str;
      }
      j = paramParcel.dataPosition();
      localf.b = j;
      return localf;
      n = paramParcel.dataPosition();
      paramParcel.readInt();
      paramParcel.readString();
      str = paramParcel.readString();
      boolean bool2 = a(str);
      if (!bool2) {
        break;
      }
      paramParcel.setDataPosition(n);
      paramParcel.readString();
      paramParcel.readInt();
      str = paramParcel.readString();
      break;
      if (paramBoolean2)
      {
        paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readString();
        str = paramParcel.readString();
        break;
      }
      if (paramBoolean1)
      {
        paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readInt();
        paramParcel.readInt();
        str = paramParcel.readString();
        break;
      }
      j = paramParcel.readInt();
      if (j != 0)
      {
        j = paramParcel.dataPosition() + -4;
        paramParcel.setDataPosition(j);
      }
      str = paramParcel.readString();
      break;
    }
  }
  
  private static f a(List paramList)
  {
    Object localObject1 = null;
    Iterator localIterator = paramList.iterator();
    boolean bool = localIterator.hasNext();
    if (bool)
    {
      Object localObject2 = (f)localIterator.next();
      if (localObject1 == null) {}
      label79:
      for (;;)
      {
        localObject1 = localObject2;
        break;
        int i = ((f)localObject1).k;
        int j = ((f)localObject2).k;
        if (i >= j) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label79;
          }
          localObject2 = localObject1;
          break;
        }
      }
    }
    return (f)localObject1;
  }
  
  public static String a(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = String.valueOf(paramInt);
    }
    for (;;)
    {
      return str;
      str = "ACTIVE";
      continue;
      str = "HOLDING";
      continue;
      str = "DIALING";
      continue;
      str = "ALERTING";
      continue;
      str = "INCOMING";
      continue;
      str = "WAITING";
    }
  }
  
  public static ArrayList a(Parcel paramParcel)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int j = 16;
    paramParcel.setDataPosition(j);
    int k = paramParcel.readInt();
    boolean bool4 = b.a();
    boolean bool5;
    if (bool4)
    {
      bool3 = com.vvt.e.a.c();
      if (bool3)
      {
        bool5 = bool1;
        if (!bool4) {
          break label155;
        }
        bool3 = com.vvt.e.a.b();
        if (!bool3) {
          break label155;
        }
      }
    }
    ArrayList localArrayList;
    label155:
    for (boolean bool3 = bool1;; bool3 = false)
    {
      if (bool4)
      {
        bool4 = com.vvt.e.a.a();
        if (bool4) {
          bool2 = bool1;
        }
      }
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject = a(b(paramParcel), k);
      Iterator localIterator = ((List)localObject).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        int i = ((f)localIterator.next()).a;
        localObject = a(paramParcel, i, bool5, bool3, bool2);
        localArrayList.add(localObject);
      }
      bool5 = false;
      break;
    }
    return localArrayList;
  }
  
  private static HashMap a(List paramList, int paramInt1, int paramInt2)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Iterator localIterator = paramList.iterator();
    Object localObject1;
    int j;
    int k;
    do
    {
      do
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (f)localIterator.next();
        j = ((f)localObject1).d;
      } while (j == paramInt1);
      k = ((f)localObject1).a;
    } while (k < paramInt2);
    Object localObject2 = Integer.valueOf(j);
    boolean bool3 = localHashMap.containsKey(localObject2);
    if (bool3)
    {
      localObject2 = Integer.valueOf(j);
      localObject2 = (List)localHashMap.get(localObject2);
    }
    for (;;)
    {
      ((List)localObject2).add(localObject1);
      break;
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      Integer localInteger = Integer.valueOf(j);
      localHashMap.put(localInteger, localObject2);
    }
    boolean bool1 = a;
    if (bool1)
    {
      localObject1 = localHashMap.keySet();
      localObject2 = ((Set)localObject1).iterator();
      bool1 = ((Iterator)localObject2).hasNext();
      if (bool1)
      {
        int i = ((Integer)((Iterator)localObject2).next()).intValue();
        localObject1 = Integer.valueOf(i);
        localObject1 = (List)localHashMap.get(localObject1);
        localIterator = ((List)localObject1).iterator();
        for (;;)
        {
          boolean bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (f)localIterator.next();
        }
      }
    }
    return localHashMap;
  }
  
  private static List a(List paramList, int paramInt)
  {
    int i = -1;
    boolean bool3 = a;
    if (bool3) {}
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    int i1 = paramList.size();
    Object localObject;
    int i3;
    int j;
    if (i1 > 0)
    {
      localObject = (f)paramList.get(0);
      paramList.remove(0);
      i3 = ((f)localObject).d;
      i1 = ((f)localObject).b;
      localHashSet.add(localObject);
      j = a;
      if (j != 0) {}
      j = i1;
    }
    boolean bool4;
    int n;
    for (i1 = i3;; bool4 = n)
    {
      int i4 = a;
      if (i4 != 0) {}
      i4 = 1;
      ArrayList localArrayList;
      int m;
      int i2;
      if (paramInt > i4)
      {
        HashMap localHashMap = a(paramList, i1, j);
        int k = localHashMap.size();
        if (k > 0)
        {
          localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          boolean bool1 = a;
          if (bool1) {}
          localObject = localHashMap.keySet();
          Iterator localIterator = ((Set)localObject).iterator();
          for (;;)
          {
            bool1 = localIterator.hasNext();
            if (!bool1) {
              break;
            }
            m = ((Integer)localIterator.next()).intValue();
            localObject = Integer.valueOf(m);
            localObject = a((List)localHashMap.get(localObject));
            boolean bool5 = a;
            if (bool5) {}
            localArrayList.add(localObject);
          }
          m = paramInt + -1;
          i1 = localArrayList.size();
          m -= i1;
          if (m > 0)
          {
            i2 = a;
            if (i2 != 0) {}
            i2 = 0;
            localHashMap = null;
            i4 = m;
          }
        }
      }
      for (;;)
      {
        m = localArrayList.size();
        if (i2 < m)
        {
          localObject = (f)localArrayList.get(i2);
          m = ((f)localObject).k;
          if (m == 0)
          {
            localArrayList.remove(i2);
            i4 += -1;
            boolean bool2 = a;
            if (!bool2) {}
          }
          if (i4 != 0) {}
        }
        else
        {
          localHashSet.addAll(localArrayList);
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          ((List)localObject).addAll(localHashSet);
          bool4 = a;
          if (bool4) {}
          return (List)localObject;
        }
        n = bool4 + true;
        bool4 = n;
      }
    }
  }
  
  private static boolean a(f paramf)
  {
    int i = 1;
    int j = paramf.c;
    if (j >= 0)
    {
      j = paramf.c;
      int i1 = 5;
      if (j <= i1)
      {
        j = paramf.d;
        if (j > 0)
        {
          j = paramf.d;
          int i2 = 20;
          if (j < i2)
          {
            j = paramf.e;
            if (j != 0)
            {
              j = paramf.e;
              int i3 = 100;
              if (j <= i3) {}
            }
            else
            {
              j = paramf.f;
              if (j != 0)
              {
                j = paramf.f;
                if (j != i) {}
              }
              else
              {
                int k = paramf.g;
                if (k != 0)
                {
                  k = paramf.g;
                  if (k != i) {}
                }
                else
                {
                  int m = paramf.h;
                  if (m >= 0)
                  {
                    m = paramf.i;
                    if (m != 0)
                    {
                      m = paramf.i;
                      if (m != i) {}
                    }
                    else
                    {
                      int n = paramf.j;
                      if (n < 0) {}
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  private static boolean a(String paramString)
  {
    String str1;
    if (paramString != null)
    {
      str1 = paramString.trim();
      int i = str1.length();
      if (i != 0)
      {
        str1 = paramString.trim();
        String str2 = "null";
        bool = str1.equalsIgnoreCase(str2);
        if (!bool) {
          break label40;
        }
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label40:
      bool = false;
      str1 = null;
    }
  }
  
  private static int b(String paramString)
  {
    String str = "([+][0-9]{1}+)?[ ]*[-]*[(]*[0-9]{1}+([0-9]?[(]?[ ]*[-]?[0-9]?[)]?)*";
    int i = Pattern.matches(str, paramString);
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      str = "^\\p{ASCII}*$";
      boolean bool = Pattern.matches(str, paramString);
      if (bool)
      {
        bool = false;
        str = null;
      }
      else
      {
        int j = -1;
      }
    }
  }
  
  private static List b(Parcel paramParcel)
  {
    boolean bool1 = true;
    int i = 0;
    int j = paramParcel.dataPosition();
    int k = 16;
    paramParcel.setDataPosition(k);
    paramParcel.readInt();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool3 = b.a();
    boolean bool2;
    boolean bool4;
    if (bool3)
    {
      bool2 = com.vvt.e.a.c();
      if (bool2)
      {
        bool4 = bool1;
        if (!bool3) {
          break label170;
        }
        bool2 = com.vvt.e.a.b();
        if (!bool2) {
          break label170;
        }
        bool2 = bool1;
        label75:
        if (!bool3) {
          break label176;
        }
        bool3 = com.vvt.e.a.a();
        if (!bool3) {
          break label176;
        }
      }
    }
    for (;;)
    {
      try
      {
        i = paramParcel.dataPosition();
        int m = paramParcel.dataAvail();
        int n = 4;
        if (m > n)
        {
          f localf = a(paramParcel, bool4, bool2, bool1);
          n = localf.k;
          if (n < 0) {
            break label181;
          }
          localArrayList.add(localf);
          continue;
        }
        bool4 = false;
      }
      catch (Exception localException)
      {
        bool1 = a;
        if (bool1) {}
        paramParcel.setDataPosition(j);
        return localArrayList;
      }
      break;
      label170:
      bool2 = false;
      break label75;
      label176:
      bool1 = false;
      continue;
      label181:
      i += 4;
      paramParcel.setDataPosition(i);
    }
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public String d()
  {
    return this.e;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = Integer.valueOf(this.b);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.c);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.d);
    arrayOfObject[2] = localObject;
    localObject = this.e;
    arrayOfObject[3] = localObject;
    localObject = a(this.d);
    arrayOfObject[4] = localObject;
    return String.format("idx: %d, direction: %d, state: %d, num: %s, stateFromCLCC: %s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/getInstance/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */