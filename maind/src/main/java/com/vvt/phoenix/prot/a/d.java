package com.vvt.phoenix.prot.a;

import com.vvt.phoenix.a.a;
import com.vvt.phoenix.prot.command.a.q;
import com.vvt.phoenix.prot.command.a.s;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public class d
{
  public static void a(ByteArrayInputStream paramByteArrayInputStream, s params)
  {
    int i = 2;
    int j = paramByteArrayInputStream.read();
    int k = 0;
    while (k < j)
    {
      byte[] arrayOfByte1 = new byte[i];
      paramByteArrayInputStream.read(arrayOfByte1, 0, i);
      q localq = new com/vvt/phoenix/prot/command/a/q;
      int m = a.a(arrayOfByte1);
      localq.<init>(m);
      int n = paramByteArrayInputStream.read();
      m = 0;
      arrayOfByte1 = null;
      while (m < n)
      {
        Object localObject = new byte[i];
        paramByteArrayInputStream.read((byte[])localObject, 0, i);
        int i1 = a.a((byte[])localObject);
        byte[] arrayOfByte2 = new byte[i1];
        paramByteArrayInputStream.read(arrayOfByte2, 0, i1);
        localObject = a.d(arrayOfByte2);
        localq.a((String)localObject);
        m += 1;
      }
      params.a(localq);
      k += 1;
    }
  }
  
  public static void a(DataInputStream paramDataInputStream, s params)
  {
    int i = paramDataInputStream.read();
    int j = 0;
    while (j < i)
    {
      q localq = new com/vvt/phoenix/prot/command/a/q;
      int k = paramDataInputStream.readShort();
      localq.<init>(k);
      int m = paramDataInputStream.read();
      k = 0;
      while (k < m)
      {
        int n = paramDataInputStream.readShort();
        byte[] arrayOfByte = new byte[n];
        paramDataInputStream.read(arrayOfByte);
        String str = new java/lang/String;
        str.<init>(arrayOfByte);
        localq.a(str);
        k += 1;
      }
      params.a(localq);
      j += 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */