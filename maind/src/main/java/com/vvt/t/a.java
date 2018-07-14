package com.vvt.t;

public class a
{
  private static a a;
  private String b;
  private String c;
  private boolean d = false;
  private boolean e = false;
  private boolean f = false;
  
  public static a a()
  {
    synchronized (a.class)
    {
      a locala = a;
      if (locala == null)
      {
        locala = new com/vvt/t/a;
        locala.<init>();
        a = locala;
      }
      locala = a;
      return locala;
    }
  }
  
  public void a(int paramInt)
  {
    int i = 1;
    int j = paramInt & 0x1;
    if (j == i)
    {
      j = i;
      this.d = j;
      j = paramInt & 0x2;
      int k = 2;
      if (j != k) {
        break label62;
      }
      j = i;
      label33:
      this.e = j;
      j = paramInt & 0x4;
      k = 4;
      if (j != k) {
        break label67;
      }
    }
    for (;;)
    {
      this.f = i;
      return;
      j = 0;
      break;
      label62:
      j = 0;
      break label33;
      label67:
      i = 0;
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null))
    {
      Object localObject = paramString1.trim();
      this.b = ((String)localObject);
      localObject = paramString2.trim();
      this.c = ((String)localObject);
      localObject = this.b;
      String str = "/";
      boolean bool = ((String)localObject).endsWith(str);
      if (!bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = this.b;
        localObject = ((StringBuilder)localObject).append(str);
        str = "/";
        localObject = str;
        this.b = ((String)localObject);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/t/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */