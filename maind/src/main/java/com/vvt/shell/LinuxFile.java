package com.vvt.shell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;

public class LinuxFile
{
  private LinuxFile.Type a;
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private String k;
  private String l;
  private String m;
  
  private static LinuxFile.Type a(char paramChar)
  {
    LinuxFile.Type localType = LinuxFile.Type.UNKNOWN;
    switch (paramChar)
    {
    }
    for (;;)
    {
      return localType;
      localType = LinuxFile.Type.FILE;
      continue;
      localType = LinuxFile.Type.DIR;
      continue;
      localType = LinuxFile.Type.DEV;
      continue;
      localType = LinuxFile.Type.BLOCK;
      continue;
      localType = LinuxFile.Type.SOCKET;
    }
  }
  
  public static ArrayList a(String paramString)
  {
    return a(paramString, false);
  }
  
  public static ArrayList a(String paramString, boolean paramBoolean)
  {
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (paramBoolean) {}
    try
    {
      localObject1 = f.b();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2;
        int n;
        Object localObject3;
        int i1;
        String str;
        return localArrayList;
        f localf = f.a();
        continue;
        localf.close();
      }
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      for (;;) {}
    }
    localObject2 = "%s -l %s";
    n = 2;
    localObject3 = new Object[n];
    i1 = 0;
    str = "/system/bin/ls";
    localObject3[0] = str;
    i1 = 1;
    localObject3[i1] = paramString;
    localObject2 = String.format((String)localObject2, (Object[])localObject3);
    localObject2 = ((f)localObject1).a((String)localObject2);
    ((f)localObject1).d();
    localObject1 = new java/io/BufferedReader;
    localObject3 = new java/io/StringReader;
    ((StringReader)localObject3).<init>((String)localObject2);
    ((BufferedReader)localObject1).<init>((Reader)localObject3);
    for (;;)
    {
      localObject2 = ((BufferedReader)localObject1).readLine();
      if (localObject2 == null) {
        break;
      }
      localObject2 = b((String)localObject2);
      if (localObject2 != null) {
        localArrayList.add(localObject2);
      }
    }
  }
  
  private static LinuxFile b(String paramString)
  {
    int n = 114;
    int i1 = 7;
    int i2 = 6;
    int i3 = 1;
    boolean bool = false;
    int i4 = 0;
    Object localObject1 = null;
    Object localObject2 = "\\s+";
    String[] arrayOfString = paramString.split((String)localObject2);
    int i5 = arrayOfString.length;
    label124:
    label152:
    label175:
    label203:
    label231:
    label254:
    label283:
    LinuxFile.Type localType;
    if (i5 >= i2)
    {
      localObject2 = new com/vvt/shell/LinuxFile;
      ((LinuxFile)localObject2).<init>();
      char[] arrayOfChar = arrayOfString[0].toCharArray();
      localObject1 = a(arrayOfChar[0]);
      ((LinuxFile)localObject2).a = ((LinuxFile.Type)localObject1);
      i4 = arrayOfChar[i3];
      if (i4 != n) {
        break label400;
      }
      i4 = i3;
      ((LinuxFile)localObject2).b = i4;
      i4 = arrayOfChar[2];
      int i6 = 119;
      if (i4 != i6) {
        break label409;
      }
      i4 = i3;
      ((LinuxFile)localObject2).c = i4;
      i4 = arrayOfChar[3];
      i6 = 120;
      if (i4 != i6) {
        break label418;
      }
      i4 = i3;
      ((LinuxFile)localObject2).d = i4;
      i4 = arrayOfChar[4];
      if (i4 != n) {
        break label427;
      }
      i4 = i3;
      ((LinuxFile)localObject2).e = i4;
      i4 = arrayOfChar[5];
      i6 = 119;
      if (i4 != i6) {
        break label436;
      }
      i4 = i3;
      ((LinuxFile)localObject2).f = i4;
      i4 = arrayOfChar[i2];
      i6 = 120;
      if (i4 != i6) {
        break label445;
      }
      i4 = i3;
      ((LinuxFile)localObject2).g = i4;
      i4 = arrayOfChar[i1];
      if (i4 != n) {
        break label454;
      }
      i4 = i3;
      ((LinuxFile)localObject2).h = i4;
      i4 = arrayOfChar[8];
      i6 = 119;
      if (i4 != i6) {
        break label463;
      }
      i4 = i3;
      ((LinuxFile)localObject2).i = i4;
      i4 = arrayOfChar[9];
      int i7 = 120;
      if (i4 == i7) {
        bool = i3;
      }
      ((LinuxFile)localObject2).j = bool;
      localObject1 = arrayOfString[i3];
      ((LinuxFile)localObject2).k = ((String)localObject1);
      i4 = 2;
      localObject1 = arrayOfString[i4];
      ((LinuxFile)localObject2).l = ((String)localObject1);
      localObject1 = ((LinuxFile)localObject2).a;
      localType = LinuxFile.Type.FILE;
      if (localObject1 != localType) {
        break label472;
      }
      i4 = arrayOfString.length;
      if (i4 <= i2) {
        break label472;
      }
      localObject1 = arrayOfString[i2];
    }
    for (;;)
    {
      ((LinuxFile)localObject2).m = ((String)localObject1);
      localObject1 = localObject2;
      return (LinuxFile)localObject1;
      label400:
      i4 = 0;
      localObject1 = null;
      break;
      label409:
      i4 = 0;
      localObject1 = null;
      break label124;
      label418:
      i4 = 0;
      localObject1 = null;
      break label152;
      label427:
      i4 = 0;
      localObject1 = null;
      break label175;
      label436:
      i4 = 0;
      localObject1 = null;
      break label203;
      label445:
      i4 = 0;
      localObject1 = null;
      break label231;
      label454:
      i4 = 0;
      localObject1 = null;
      break label254;
      label463:
      i4 = 0;
      localObject1 = null;
      break label283;
      label472:
      localObject1 = ((LinuxFile)localObject2).a;
      localType = LinuxFile.Type.DEV;
      if (localObject1 != localType)
      {
        localObject1 = ((LinuxFile)localObject2).a;
        localType = LinuxFile.Type.BLOCK;
        if (localObject1 != localType) {}
      }
      else
      {
        i4 = arrayOfString.length;
        if (i4 > i1)
        {
          localObject1 = arrayOfString[i1];
          continue;
        }
      }
      i4 = arrayOfString.length;
      if (i4 <= i2)
      {
        i4 = 5;
        localObject1 = arrayOfString[i4];
      }
      else
      {
        localObject1 = "unknown";
      }
    }
  }
  
  public boolean a()
  {
    return this.h;
  }
  
  public boolean b()
  {
    return this.i;
  }
  
  public String c()
  {
    return this.k;
  }
  
  public String d()
  {
    return this.m;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    String str = this.a.toString();
    arrayOfObject[0] = str;
    str = this.m;
    arrayOfObject[1] = str;
    str = this.k;
    arrayOfObject[2] = str;
    return String.format("type: %s, name: %s, owner: %s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/shell/LinuxFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */