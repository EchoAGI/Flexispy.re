package org.apache.commons.lang.text;

import java.util.Map;

public abstract class StrLookup
{
  private static final StrLookup NONE_LOOKUP;
  private static final StrLookup SYSTEM_PROPERTIES_LOOKUP;
  
  static
  {
    Object localObject1 = new org/apache/commons/lang/text/StrLookup$MapStrLookup;
    ((StrLookup.MapStrLookup)localObject1).<init>(null);
    NONE_LOOKUP = (StrLookup)localObject1;
    localObject2 = null;
    try
    {
      localObject2 = new org/apache/commons/lang/text/StrLookup$MapStrLookup;
      localObject1 = System.getProperties();
      ((StrLookup.MapStrLookup)localObject2).<init>((Map)localObject1);
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        localObject2 = NONE_LOOKUP;
      }
    }
    SYSTEM_PROPERTIES_LOOKUP = (StrLookup)localObject2;
  }
  
  public static StrLookup mapLookup(Map paramMap)
  {
    StrLookup.MapStrLookup localMapStrLookup = new org/apache/commons/lang/text/StrLookup$MapStrLookup;
    localMapStrLookup.<init>(paramMap);
    return localMapStrLookup;
  }
  
  public static StrLookup noneLookup()
  {
    return NONE_LOOKUP;
  }
  
  public static StrLookup systemPropertiesLookup()
  {
    return SYSTEM_PROPERTIES_LOOKUP;
  }
  
  public abstract String lookup(String paramString);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/text/StrLookup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */