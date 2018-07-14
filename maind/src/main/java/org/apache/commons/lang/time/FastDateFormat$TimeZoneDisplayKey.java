package org.apache.commons.lang.time;

import java.util.Locale;
import java.util.TimeZone;

class FastDateFormat$TimeZoneDisplayKey
{
  private final Locale mLocale;
  private final int mStyle;
  private final TimeZone mTimeZone;
  
  FastDateFormat$TimeZoneDisplayKey(TimeZone paramTimeZone, boolean paramBoolean, int paramInt, Locale paramLocale)
  {
    this.mTimeZone = paramTimeZone;
    if (paramBoolean)
    {
      int i = -1 << -1;
      paramInt |= i;
    }
    this.mStyle = paramInt;
    this.mLocale = paramLocale;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof TimeZoneDisplayKey;
      if (bool2)
      {
        Object localObject1 = paramObject;
        localObject1 = (TimeZoneDisplayKey)paramObject;
        Object localObject2 = this.mTimeZone;
        Object localObject3 = ((TimeZoneDisplayKey)localObject1).mTimeZone;
        bool2 = localObject2.equals(localObject3);
        if (bool2)
        {
          int i = this.mStyle;
          int j = ((TimeZoneDisplayKey)localObject1).mStyle;
          if (i == j)
          {
            localObject2 = this.mLocale;
            localObject3 = ((TimeZoneDisplayKey)localObject1).mLocale;
            boolean bool3 = ((Locale)localObject2).equals(localObject3);
            if (bool3) {
              continue;
            }
          }
        }
        bool1 = false;
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.mStyle * 31;
    int j = this.mLocale.hashCode();
    return i + j;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/FastDateFormat$TimeZoneDisplayKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */