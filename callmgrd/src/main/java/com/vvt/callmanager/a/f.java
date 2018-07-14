package com.vvt.callmanager.a;

class f
{
  int a;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h;
  int i;
  int j;
  int k = -1;
  String l;
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof f;
    if (bool)
    {
      paramObject = (f)paramObject;
      m = ((f)paramObject).d;
      int i1 = this.d;
      if (m != i1) {}
    }
    int n;
    for (int m = 1;; n = 0) {
      return m;
    }
  }
  
  public int hashCode()
  {
    return this.d;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[11];
    Object localObject = Integer.valueOf(this.a);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.b);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.c);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.d);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(this.e);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(this.g);
    arrayOfObject[5] = localObject;
    localObject = Integer.valueOf(this.h);
    arrayOfObject[6] = localObject;
    localObject = Integer.valueOf(this.i);
    arrayOfObject[7] = localObject;
    localObject = Integer.valueOf(this.j);
    arrayOfObject[8] = localObject;
    localObject = this.l;
    arrayOfObject[9] = localObject;
    localObject = Integer.valueOf(this.k);
    arrayOfObject[10] = localObject;
    return String.format("pos: [%d-%d], state: %d, index: %d, toa: %d, isMt: %d, als: %d, voice: %d, privacy: %d, number: %s, correctness: %d", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/getInstance/Mitm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */