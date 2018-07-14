package org.apache.commons.lang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class LocaleUtils
{
  private static List cAvailableLocaleList;
  private static Set cAvailableLocaleSet;
  private static final Map cCountriesByLanguage;
  private static final Map cLanguagesByCountry;
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    cLanguagesByCountry = Collections.synchronizedMap(localHashMap);
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    cCountriesByLanguage = Collections.synchronizedMap(localHashMap);
  }
  
  public static List availableLocaleList()
  {
    List localList = cAvailableLocaleList;
    if (localList == null) {
      initAvailableLocaleList();
    }
    return cAvailableLocaleList;
  }
  
  public static Set availableLocaleSet()
  {
    Set localSet = cAvailableLocaleSet;
    if (localSet == null) {
      initAvailableLocaleSet();
    }
    return cAvailableLocaleSet;
  }
  
  public static List countriesByLanguage(String paramString)
  {
    Object localObject1 = cCountriesByLanguage;
    Object localObject2 = (List)((Map)localObject1).get(paramString);
    if (localObject2 == null)
    {
      if (paramString == null) {
        break label156;
      }
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      List localList = availableLocaleList();
      int i = 0;
      for (;;)
      {
        int j = localList.size();
        if (i >= j) {
          break;
        }
        Locale localLocale = (Locale)localList.get(i);
        localObject1 = localLocale.getLanguage();
        boolean bool = paramString.equals(localObject1);
        if (bool)
        {
          localObject1 = localLocale.getCountry();
          int k = ((String)localObject1).length();
          if (k != 0)
          {
            localObject1 = localLocale.getVariant();
            k = ((String)localObject1).length();
            if (k == 0) {
              ((List)localObject2).add(localLocale);
            }
          }
        }
        i += 1;
      }
    }
    label156:
    for (localObject2 = Collections.unmodifiableList((List)localObject2);; localObject2 = Collections.EMPTY_LIST)
    {
      localObject1 = cCountriesByLanguage;
      ((Map)localObject1).put(paramString, localObject2);
      return (List)localObject2;
    }
  }
  
  private static void initAvailableLocaleList()
  {
    synchronized (LocaleUtils.class)
    {
      Object localObject1 = cAvailableLocaleList;
      if (localObject1 == null)
      {
        localObject1 = Locale.getAvailableLocales();
        List localList = Arrays.asList((Object[])localObject1);
        localObject1 = Collections.unmodifiableList(localList);
        cAvailableLocaleList = (List)localObject1;
      }
      return;
    }
  }
  
  private static void initAvailableLocaleSet()
  {
    synchronized (LocaleUtils.class)
    {
      Object localObject1 = cAvailableLocaleSet;
      if (localObject1 == null)
      {
        localObject1 = new java/util/HashSet;
        List localList = availableLocaleList();
        ((HashSet)localObject1).<init>(localList);
        localObject1 = Collections.unmodifiableSet((Set)localObject1);
        cAvailableLocaleSet = (Set)localObject1;
      }
      return;
    }
  }
  
  public static boolean isAvailableLocale(Locale paramLocale)
  {
    return availableLocaleList().contains(paramLocale);
  }
  
  public static List languagesByCountry(String paramString)
  {
    Object localObject1 = cLanguagesByCountry;
    Object localObject2 = (List)((Map)localObject1).get(paramString);
    if (localObject2 == null)
    {
      if (paramString == null) {
        break label139;
      }
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      List localList = availableLocaleList();
      int i = 0;
      for (;;)
      {
        int j = localList.size();
        if (i >= j) {
          break;
        }
        Locale localLocale = (Locale)localList.get(i);
        localObject1 = localLocale.getCountry();
        boolean bool = paramString.equals(localObject1);
        if (bool)
        {
          localObject1 = localLocale.getVariant();
          int k = ((String)localObject1).length();
          if (k == 0) {
            ((List)localObject2).add(localLocale);
          }
        }
        i += 1;
      }
    }
    label139:
    for (localObject2 = Collections.unmodifiableList((List)localObject2);; localObject2 = Collections.EMPTY_LIST)
    {
      localObject1 = cLanguagesByCountry;
      ((Map)localObject1).put(paramString, localObject2);
      return (List)localObject2;
    }
  }
  
  public static List localeLookupList(Locale paramLocale)
  {
    return localeLookupList(paramLocale, paramLocale);
  }
  
  public static List localeLookupList(Locale paramLocale1, Locale paramLocale2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = 4;
    localArrayList.<init>(i);
    if (paramLocale1 != null)
    {
      localArrayList.add(paramLocale1);
      Object localObject = paramLocale1.getVariant();
      i = ((String)localObject).length();
      String str1;
      String str2;
      if (i > 0)
      {
        localObject = new java/util/Locale;
        str1 = paramLocale1.getLanguage();
        str2 = paramLocale1.getCountry();
        ((Locale)localObject).<init>(str1, str2);
        localArrayList.add(localObject);
      }
      localObject = paramLocale1.getCountry();
      i = ((String)localObject).length();
      if (i > 0)
      {
        localObject = new java/util/Locale;
        str1 = paramLocale1.getLanguage();
        str2 = "";
        ((Locale)localObject).<init>(str1, str2);
        localArrayList.add(localObject);
      }
      boolean bool = localArrayList.contains(paramLocale2);
      if (!bool) {
        localArrayList.add(paramLocale2);
      }
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  public static Locale toLocale(String paramString)
  {
    int i = 95;
    int j = 3;
    int k = 0;
    String str1 = null;
    int m = 5;
    int n = 2;
    int i1;
    Object localObject1;
    if (paramString == null)
    {
      i1 = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (Locale)localObject1;
      int i2 = paramString.length();
      if ((i2 != n) && (i2 != m))
      {
        i1 = 7;
        if (i2 < i1)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          localObject2 = new java/lang/StringBuffer;
          ((StringBuffer)localObject2).<init>();
          localObject2 = "Invalid locale format: " + paramString;
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      int i3 = paramString.charAt(0);
      int i4 = paramString.charAt(1);
      i1 = 97;
      if (i3 >= i1)
      {
        i1 = 122;
        if (i3 <= i1)
        {
          i1 = 97;
          if (i4 >= i1)
          {
            i1 = 122;
            if (i4 <= i1) {
              break label200;
            }
          }
        }
      }
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      localObject2 = "Invalid locale format: " + paramString;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
      label200:
      if (i2 == n)
      {
        localObject1 = new java/util/Locale;
        localObject2 = "";
        ((Locale)localObject1).<init>(paramString, (String)localObject2);
      }
      else
      {
        i1 = paramString.charAt(n);
        if (i1 != i)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          localObject2 = new java/lang/StringBuffer;
          ((StringBuffer)localObject2).<init>();
          localObject2 = "Invalid locale format: " + paramString;
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        int i5 = paramString.charAt(j);
        String str2;
        if (i5 == i)
        {
          localObject1 = new java/util/Locale;
          localObject2 = paramString.substring(0, n);
          str2 = "";
          k = 4;
          str1 = paramString.substring(k);
          ((Locale)localObject1).<init>((String)localObject2, str2, str1);
        }
        else
        {
          int i6 = paramString.charAt(4);
          i1 = 65;
          if (i5 >= i1)
          {
            i1 = 90;
            if (i5 <= i1)
            {
              i1 = 65;
              if (i6 >= i1)
              {
                i1 = 90;
                if (i6 <= i1) {
                  break label428;
                }
              }
            }
          }
          localObject1 = new java/lang/IllegalArgumentException;
          localObject2 = new java/lang/StringBuffer;
          ((StringBuffer)localObject2).<init>();
          localObject2 = "Invalid locale format: " + paramString;
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
          label428:
          if (i2 == m)
          {
            localObject1 = new java/util/Locale;
            localObject2 = paramString.substring(0, n);
            str2 = paramString.substring(j, m);
            ((Locale)localObject1).<init>((String)localObject2, str2);
          }
          else
          {
            i1 = paramString.charAt(m);
            if (i1 != i)
            {
              localObject1 = new java/lang/IllegalArgumentException;
              localObject2 = new java/lang/StringBuffer;
              ((StringBuffer)localObject2).<init>();
              localObject2 = "Invalid locale format: " + paramString;
              ((IllegalArgumentException)localObject1).<init>((String)localObject2);
              throw ((Throwable)localObject1);
            }
            localObject1 = new java/util/Locale;
            localObject2 = paramString.substring(0, n);
            str2 = paramString.substring(j, m);
            k = 6;
            str1 = paramString.substring(k);
            ((Locale)localObject1).<init>((String)localObject2, str2, str1);
          }
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/LocaleUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */