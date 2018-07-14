package com.vvt.http.request;

import java.util.ArrayList;

public class a
{
  private static final boolean a = com.vvt.ak.a.c;
  private static final boolean b = com.vvt.ak.a.d;
  private ArrayList c;
  private int d = 0;
  
  public int a(byte[] paramArrayOfByte)
  {
    int i = -1;
    int j = this.d;
    ArrayList localArrayList = this.c;
    int k = localArrayList.size();
    boolean bool2;
    if (j < k)
    {
      Object localObject = this.c;
      k = this.d;
      localObject = (d)((ArrayList)localObject).get(k);
      k = ((d)localObject).a(paramArrayOfByte);
      if (k != i) {
        break label132;
      }
      bool2 = b;
      if (bool2) {}
      ((d)localObject).b();
      j = this.d + 1;
      this.d = j;
      j = a(paramArrayOfByte);
      bool2 = b;
      if (!bool2) {}
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return j;
      boolean bool1 = b;
      if (bool1) {}
      bool1 = i;
      continue;
      label132:
      bool1 = bool2;
    }
  }
  
  public long a()
  {
    long l1 = 0L;
    int i = 0;
    Object localObject = null;
    long l2 = l1;
    for (int j = 0;; j = i)
    {
      localObject = this.c;
      i = ((ArrayList)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = (d)this.c.get(j);
      long l3 = ((d)localObject).a();
      l2 += l3;
      i = j + 1;
    }
    return l2;
  }
  
  public void a(ArrayList paramArrayList)
  {
    this.c = paramArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/http/request/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */