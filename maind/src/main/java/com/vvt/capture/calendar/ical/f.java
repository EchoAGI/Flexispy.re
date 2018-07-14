package com.vvt.capture.calendar.ical;

public class f
{
  public static String a(String paramString, int paramInt)
  {
    int i = 2;
    int j = 1;
    int k = 10;
    int m = 92;
    ParseException localParseException = null;
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    int n = paramString.length();
    localStringBuffer.<init>(n);
    n = 0;
    Object localObject = null;
    int i1 = 0;
    StringBuilder localStringBuilder = null;
    int i2 = paramString.length();
    if (n < i2)
    {
      i2 = 75;
      if ((i1 > i2) && (paramInt == j))
      {
        localObject = new com/vvt/capture/calendar/ical/ParseException;
        ((ParseException)localObject).<init>("Found line longer than 75 limit", paramString);
        throw ((Throwable)localObject);
      }
      char c = paramString.charAt(n);
      i2 = n + 1;
      int i3 = paramString.length();
      if (i2 < i3)
      {
        i2 = n + 1;
        i2 = paramString.charAt(i2);
        label131:
        if (c == m)
        {
          int i4 = 110;
          if (i2 == i4)
          {
            i5 = 61;
            if ((c == i5) && (paramInt == i))
            {
              localStringBuffer.append("\r\n");
              n += 1;
              i1 = 0;
              localStringBuilder = null;
            }
          }
        }
        if (c != m) {
          break label238;
        }
        int i5 = 110;
        if (i2 != i5) {
          break label238;
        }
        localStringBuffer.append("\r\n");
        n += 1;
        i1 = 0;
        localStringBuilder = null;
      }
      for (;;)
      {
        n += 1;
        break;
        i2 = 0;
        break label131;
        label238:
        if (c == k)
        {
          int i6 = 32;
          if (i2 != i6)
          {
            int i7 = 9;
            if (i2 != i7) {}
          }
          else
          {
            n += 1;
            continue;
          }
        }
        if (c == m)
        {
          int i8 = 44;
          if ((i2 == i8) && (paramInt == i))
          {
            i2 = 44;
            localStringBuffer.append(i2);
            n += 1;
            continue;
          }
        }
        if ((c != k) || (i2 != 0)) {
          if (c == k)
          {
            if (paramInt == j)
            {
              localParseException = new com/vvt/capture/calendar/ical/ParseException;
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localObject = "Invalid line termination at char " + n;
              localParseException.<init>((String)localObject, paramString);
              throw localParseException;
            }
          }
          else
          {
            int i9 = 13;
            if (c != i9) {
              if (c == m)
              {
                i9 = 114;
                if (i2 == i9) {}
              }
              else
              {
                localStringBuffer.append(c);
                i1 += 1;
              }
            }
          }
        }
      }
    }
    return localStringBuffer.toString();
  }
  
  public static boolean a(String paramString)
  {
    return a(paramString, false);
  }
  
  public static boolean a(String paramString, boolean paramBoolean)
  {
    int i = 1;
    boolean bool = false;
    int j = paramString.length();
    if (j == 0) {
      return bool;
    }
    j = paramString.charAt(0);
    int k = 43;
    if (j != k)
    {
      j = paramString.charAt(0);
      k = 45;
      if (j != k) {}
    }
    else
    {
      j = i;
    }
    for (;;)
    {
      k = paramString.length();
      if (j < k)
      {
        k = paramString.charAt(0);
        int m = 48;
        if (k <= m) {
          break;
        }
        k = paramString.charAt(0);
        m = 57;
        if (k >= m) {
          break;
        }
        j += 1;
        continue;
      }
      bool = i;
      break;
      j = 0;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/ical/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */