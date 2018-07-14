package com.vvt.b;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class a
{
  private static final boolean a;
  private static final boolean b;
  private static List c;
  
  static
  {
    boolean bool = com.vvt.h.a.a;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      a = bool;
      b = com.vvt.h.a.e;
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      c = (List)localObject;
      localObject = c;
      Pattern localPattern = Pattern.compile("^/storage/emulated/\\d{1,2}");
      ((List)localObject).add(localPattern);
      localObject = c;
      localPattern = Pattern.compile("^/data/media/\\d{1,2}");
      ((List)localObject).add(localPattern);
      localObject = c;
      localPattern = Pattern.compile("^/mnt/shell/emulated/\\d{1,2}");
      ((List)localObject).add(localPattern);
      localObject = c;
      localPattern = Pattern.compile("^/sdcard/sdcard0");
      ((List)localObject).add(localPattern);
      localObject = c;
      localPattern = Pattern.compile("^/sdcard");
      ((List)localObject).add(localPattern);
      localObject = c;
      localPattern = Pattern.compile("^/storage");
      ((List)localObject).add(localPattern);
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public static int a(FileDescriptor paramFileDescriptor)
  {
    i = -1;
    Object localObject = FileDescriptor.class;
    String str = "descriptor";
    try
    {
      localObject = ((Class)localObject).getDeclaredField(str);
      boolean bool1 = true;
      ((Field)localObject).setAccessible(bool1);
      localObject = ((Field)localObject).get(paramFileDescriptor);
      localObject = (Integer)localObject;
      j = ((Integer)localObject).intValue();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int j;
        boolean bool2 = b;
        if (bool2) {}
        bool2 = i;
      }
    }
    return j;
  }
  
  public static FileDescriptor a(int paramInt)
  {
    FileDescriptor localFileDescriptor = new java/io/FileDescriptor;
    localFileDescriptor.<init>();
    Object localObject2 = FileDescriptor.class;
    Object localObject3 = "descriptor";
    try
    {
      localObject2 = ((Class)localObject2).getDeclaredField((String)localObject3);
      boolean bool1 = true;
      ((Field)localObject2).setAccessible(bool1);
      localObject3 = Integer.valueOf(paramInt);
      ((Field)localObject2).set(localFileDescriptor, localObject3);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (bool2) {}
        bool2 = false;
        Object localObject1 = null;
      }
    }
    return localFileDescriptor;
  }
  
  public static void a(InputStream paramInputStream)
  {
    if (paramInputStream != null) {}
    try
    {
      paramInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static void a(ObjectInputStream paramObjectInputStream)
  {
    if (paramObjectInputStream != null) {}
    try
    {
      paramObjectInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static void a(ObjectOutputStream paramObjectOutputStream)
  {
    if (paramObjectOutputStream != null) {}
    try
    {
      paramObjectOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static void a(OutputStream paramOutputStream)
  {
    if (paramOutputStream != null) {}
    try
    {
      paramOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/b/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */