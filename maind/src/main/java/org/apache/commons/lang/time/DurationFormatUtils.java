package org.apache.commons.lang.time;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.lang.StringUtils;

public class DurationFormatUtils
{
  static final Object H;
  public static final String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'";
  static final Object M;
  static final Object S = "S";
  static final Object d;
  static final Object m;
  static final Object s;
  static final Object y = "y";
  
  static
  {
    M = "M";
    d = "d";
    H = "H";
    m = "m";
    s = "s";
  }
  
  static String format(DurationFormatUtils.Token[] paramArrayOfToken, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    int i = 0;
    int j = paramArrayOfToken.length;
    int k = 0;
    if (k < j)
    {
      DurationFormatUtils.Token localToken = paramArrayOfToken[k];
      Object localObject1 = localToken.getValue();
      int n = localToken.getCount();
      int i1 = localObject1 instanceof StringBuffer;
      if (i1 != 0)
      {
        localObject2 = localObject1.toString();
        localStringBuffer.append((String)localObject2);
      }
      char c;
      do
      {
        k += 1;
        break;
        localObject2 = y;
        if (localObject1 == localObject2)
        {
          if (paramBoolean)
          {
            localObject2 = Integer.toString(paramInt1);
            c = '0';
          }
          for (localObject2 = StringUtils.leftPad((String)localObject2, n, c);; localObject2 = Integer.toString(paramInt1))
          {
            localStringBuffer.append((String)localObject2);
            i = 0;
            break;
          }
        }
        localObject2 = M;
        if (localObject1 == localObject2)
        {
          if (paramBoolean)
          {
            localObject2 = Integer.toString(paramInt2);
            c = '0';
          }
          for (localObject2 = StringUtils.leftPad((String)localObject2, n, c);; localObject2 = Integer.toString(paramInt2))
          {
            localStringBuffer.append((String)localObject2);
            i = 0;
            break;
          }
        }
        localObject2 = d;
        if (localObject1 == localObject2)
        {
          if (paramBoolean)
          {
            localObject2 = Integer.toString(paramInt3);
            c = '0';
          }
          for (localObject2 = StringUtils.leftPad((String)localObject2, n, c);; localObject2 = Integer.toString(paramInt3))
          {
            localStringBuffer.append((String)localObject2);
            i = 0;
            break;
          }
        }
        localObject2 = H;
        if (localObject1 == localObject2)
        {
          if (paramBoolean)
          {
            localObject2 = Integer.toString(paramInt4);
            c = '0';
          }
          for (localObject2 = StringUtils.leftPad((String)localObject2, n, c);; localObject2 = Integer.toString(paramInt4))
          {
            localStringBuffer.append((String)localObject2);
            i = 0;
            break;
          }
        }
        localObject2 = m;
        if (localObject1 == localObject2)
        {
          if (paramBoolean)
          {
            localObject2 = Integer.toString(paramInt5);
            c = '0';
          }
          for (localObject2 = StringUtils.leftPad((String)localObject2, n, c);; localObject2 = Integer.toString(paramInt5))
          {
            localStringBuffer.append((String)localObject2);
            i = 0;
            break;
          }
        }
        localObject2 = s;
        if (localObject1 == localObject2)
        {
          if (paramBoolean)
          {
            localObject2 = Integer.toString(paramInt6);
            c = '0';
          }
          for (localObject2 = StringUtils.leftPad((String)localObject2, n, c);; localObject2 = Integer.toString(paramInt6))
          {
            localStringBuffer.append((String)localObject2);
            i = 1;
            break;
          }
        }
        localObject2 = S;
      } while (localObject1 != localObject2);
      if (i != 0)
      {
        int i2 = paramInt7;
        i2 = paramInt7 + 1000;
        paramInt7 = i2;
        if (paramBoolean)
        {
          localObject2 = Integer.toString(i2);
          c = '0';
        }
        for (String str = StringUtils.leftPad((String)localObject2, n, c);; str = Integer.toString(i2))
        {
          i1 = 1;
          localObject2 = str.substring(i1);
          localStringBuffer.append((String)localObject2);
          i = 0;
          break;
        }
      }
      if (paramBoolean)
      {
        localObject2 = Integer.toString(paramInt7);
        c = '0';
      }
      for (Object localObject2 = StringUtils.leftPad((String)localObject2, n, c);; localObject2 = Integer.toString(paramInt7))
      {
        localStringBuffer.append((String)localObject2);
        break;
      }
    }
    return localStringBuffer.toString();
  }
  
  public static String formatDuration(long paramLong, String paramString)
  {
    return formatDuration(paramLong, paramString, true);
  }
  
  public static String formatDuration(long paramLong, String paramString, boolean paramBoolean)
  {
    DurationFormatUtils.Token[] arrayOfToken = lexx(paramString);
    int i = 0;
    int j = 0;
    int k = 0;
    int n = 0;
    int i1 = 0;
    Object localObject = d;
    boolean bool = DurationFormatUtils.Token.containsTokenWithValue(arrayOfToken, localObject);
    long l1;
    long l2;
    if (bool)
    {
      i = (int)(paramLong / 86400000L);
      l1 = i;
      l2 = 86400000L;
      l1 *= l2;
      paramLong -= l1;
    }
    localObject = H;
    bool = DurationFormatUtils.Token.containsTokenWithValue(arrayOfToken, localObject);
    if (bool)
    {
      j = (int)(paramLong / 3600000L);
      l1 = j;
      l2 = 3600000L;
      l1 *= l2;
      paramLong -= l1;
    }
    localObject = m;
    bool = DurationFormatUtils.Token.containsTokenWithValue(arrayOfToken, localObject);
    if (bool)
    {
      k = (int)(paramLong / 60000L);
      l1 = k;
      l2 = 60000L;
      l1 *= l2;
      paramLong -= l1;
    }
    localObject = s;
    bool = DurationFormatUtils.Token.containsTokenWithValue(arrayOfToken, localObject);
    if (bool)
    {
      n = (int)(paramLong / 1000L);
      l1 = n;
      l2 = 1000L;
      l1 *= l2;
      paramLong -= l1;
    }
    localObject = S;
    bool = DurationFormatUtils.Token.containsTokenWithValue(arrayOfToken, localObject);
    if (bool) {
      i1 = (int)paramLong;
    }
    return format(arrayOfToken, 0, 0, i, j, k, n, i1, paramBoolean);
  }
  
  public static String formatDurationHMS(long paramLong)
  {
    return formatDuration(paramLong, "H:mm:ss.SSS");
  }
  
  public static String formatDurationISO(long paramLong)
  {
    return formatDuration(paramLong, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false);
  }
  
  public static String formatDurationWords(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = "d' days 'H' hours 'm' minutes 's' seconds'";
    Object localObject2 = formatDuration(paramLong, (String)localObject1);
    String str1;
    String str2;
    int i;
    int j;
    if (paramBoolean1)
    {
      localObject1 = new java/lang/StringBuffer;
      ((StringBuffer)localObject1).<init>();
      localObject2 = " " + (String)localObject2;
      localObject1 = " 0 days";
      str1 = "";
      str2 = StringUtils.replaceOnce((String)localObject2, (String)localObject1, str1);
      i = str2.length();
      j = ((String)localObject2).length();
      if (i != j)
      {
        localObject2 = str2;
        localObject1 = " 0 hours";
        str1 = "";
        str2 = StringUtils.replaceOnce(str2, (String)localObject1, str1);
        i = str2.length();
        j = ((String)localObject2).length();
        if (i != j)
        {
          localObject2 = str2;
          localObject1 = " 0 minutes";
          str1 = "";
          str2 = StringUtils.replaceOnce(str2, (String)localObject1, str1);
          localObject2 = str2;
          i = str2.length();
          j = str2.length();
          if (i != j)
          {
            localObject1 = " 0 seconds";
            str1 = "";
            localObject2 = StringUtils.replaceOnce(str2, (String)localObject1, str1);
          }
        }
      }
      i = ((String)localObject2).length();
      if (i != 0)
      {
        i = 1;
        localObject2 = ((String)localObject2).substring(i);
      }
    }
    if (paramBoolean2)
    {
      localObject1 = " 0 seconds";
      str1 = "";
      str2 = StringUtils.replaceOnce((String)localObject2, (String)localObject1, str1);
      i = str2.length();
      j = ((String)localObject2).length();
      if (i != j)
      {
        localObject2 = str2;
        localObject1 = " 0 minutes";
        str1 = "";
        str2 = StringUtils.replaceOnce(str2, (String)localObject1, str1);
        i = str2.length();
        j = ((String)localObject2).length();
        if (i != j)
        {
          localObject2 = str2;
          localObject1 = " 0 hours";
          str1 = "";
          str2 = StringUtils.replaceOnce(str2, (String)localObject1, str1);
          i = str2.length();
          j = ((String)localObject2).length();
          if (i != j)
          {
            localObject1 = " 0 days";
            str1 = "";
            localObject2 = StringUtils.replaceOnce(str2, (String)localObject1, str1);
          }
        }
      }
    }
    localObject1 = new java/lang/StringBuffer;
    ((StringBuffer)localObject1).<init>();
    return StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.replaceOnce(" " + (String)localObject2, " 1 seconds", " 1 second"), " 1 minutes", " 1 minute"), " 1 hours", " 1 hour"), " 1 days", " 1 day").trim();
  }
  
  public static String formatPeriod(long paramLong1, long paramLong2, String paramString)
  {
    TimeZone localTimeZone = TimeZone.getDefault();
    return formatPeriod(paramLong1, paramLong2, paramString, true, localTimeZone);
  }
  
  public static String formatPeriod(long paramLong1, long paramLong2, String paramString, boolean paramBoolean, TimeZone paramTimeZone)
  {
    DurationFormatUtils.Token[] arrayOfToken = lexx(paramString);
    Calendar localCalendar1 = Calendar.getInstance(paramTimeZone);
    Object localObject = new java/util/Date;
    ((Date)localObject).<init>(paramLong1);
    localCalendar1.setTime((Date)localObject);
    Calendar localCalendar2 = Calendar.getInstance(paramTimeZone);
    localObject = new java/util/Date;
    ((Date)localObject).<init>(paramLong2);
    localCalendar2.setTime((Date)localObject);
    int i = localCalendar2.get(14);
    int i7 = localCalendar1.get(14);
    int i8 = i - i7;
    i = localCalendar2.get(13);
    i7 = localCalendar1.get(13);
    int i9 = i - i7;
    i = localCalendar2.get(12);
    i7 = localCalendar1.get(12);
    int i10 = i - i7;
    i = localCalendar2.get(11);
    i7 = localCalendar1.get(11);
    int i11 = i - i7;
    i = localCalendar2.get(5);
    i7 = localCalendar1.get(5);
    int i12 = i - i7;
    i = localCalendar2.get(2);
    i7 = localCalendar1.get(2);
    int i13 = i - i7;
    i = localCalendar2.get(1);
    i7 = localCalendar1.get(1);
    int i14 = i - i7;
    while (i8 < 0)
    {
      i8 += 1000;
      i9 += -1;
    }
    while (i9 < 0)
    {
      i9 += 60;
      i10 += -1;
    }
    while (i10 < 0)
    {
      i10 += 60;
      i11 += -1;
    }
    while (i11 < 0)
    {
      i11 += 24;
      i12 += -1;
    }
    localObject = M;
    boolean bool1 = DurationFormatUtils.Token.containsTokenWithValue(arrayOfToken, localObject);
    if (bool1)
    {
      while (i12 < 0)
      {
        int j = localCalendar1.getActualMaximum(5);
        i12 += j;
        i13 += -1;
        j = 2;
        i7 = 1;
        localCalendar1.add(j, i7);
      }
      while (i13 < 0)
      {
        i13 += 12;
        i14 += -1;
      }
      localObject = y;
      boolean bool2 = DurationFormatUtils.Token.containsTokenWithValue(arrayOfToken, localObject);
      if ((!bool2) && (i14 != 0)) {
        while (i14 != 0)
        {
          int k = i14 * 12;
          i13 += k;
          i14 = 0;
        }
      }
    }
    else
    {
      localObject = y;
      int n = DurationFormatUtils.Token.containsTokenWithValue(arrayOfToken, localObject);
      int i2;
      if (n == 0)
      {
        n = 1;
        int i15 = localCalendar2.get(n);
        if (i13 < 0) {
          i15 += -1;
        }
        for (;;)
        {
          int i1 = ((Calendar)localCalendar1).get(1);
          if (i1 == i15) {
            break;
          }
          i1 = ((Calendar)localCalendar1).getActualMaximum(6);
          i7 = ((Calendar)localCalendar1).get(6);
          i1 -= i7;
          i12 += i1;
          boolean bool3 = localCalendar1 instanceof GregorianCalendar;
          if (bool3)
          {
            i2 = ((Calendar)localCalendar1).get(2);
            i7 = 1;
            if (i2 == i7)
            {
              i2 = ((Calendar)localCalendar1).get(5);
              i7 = 29;
              if (i2 == i7) {
                i12 += 1;
              }
            }
          }
          i7 = 1;
          ((Calendar)localCalendar1).add(1, i7);
          i2 = ((Calendar)localCalendar1).get(6);
          i12 += i2;
        }
        i14 = 0;
      }
      for (;;)
      {
        i2 = ((Calendar)localCalendar1).get(2);
        i7 = localCalendar2.get(2);
        if (i2 == i7) {
          break;
        }
        i2 = ((Calendar)localCalendar1).getActualMaximum(5);
        i12 += i2;
        i2 = 2;
        i7 = 1;
        ((Calendar)localCalendar1).add(i2, i7);
      }
      i13 = 0;
      while (i12 < 0)
      {
        i2 = ((Calendar)localCalendar1).getActualMaximum(5);
        i12 += i2;
        i13 += -1;
        i2 = 2;
        i7 = 1;
        ((Calendar)localCalendar1).add(i2, i7);
      }
    }
    localObject = d;
    boolean bool4 = DurationFormatUtils.Token.containsTokenWithValue(arrayOfToken, localObject);
    if (!bool4)
    {
      int i3 = i12 * 24;
      i11 += i3;
      i12 = 0;
    }
    localObject = H;
    boolean bool5 = DurationFormatUtils.Token.containsTokenWithValue(arrayOfToken, localObject);
    if (!bool5)
    {
      int i4 = i11 * 60;
      i10 += i4;
      i11 = 0;
    }
    localObject = m;
    boolean bool6 = DurationFormatUtils.Token.containsTokenWithValue(arrayOfToken, localObject);
    if (!bool6)
    {
      int i5 = i10 * 60;
      i9 += i5;
      i10 = 0;
    }
    localObject = s;
    boolean bool7 = DurationFormatUtils.Token.containsTokenWithValue(arrayOfToken, localObject);
    if (!bool7)
    {
      int i6 = i9 * 1000;
      i8 += i6;
      i9 = 0;
    }
    boolean bool8 = paramBoolean;
    return format(arrayOfToken, i14, i13, i12, i11, i10, i9, i8, paramBoolean);
  }
  
  public static String formatPeriodISO(long paramLong1, long paramLong2)
  {
    TimeZone localTimeZone = TimeZone.getDefault();
    return formatPeriod(paramLong1, paramLong2, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false, localTimeZone);
  }
  
  static DurationFormatUtils.Token[] lexx(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    ArrayList localArrayList = new java/util/ArrayList;
    int i = arrayOfChar.length;
    localArrayList.<init>(i);
    int j = 0;
    StringBuffer localStringBuffer = null;
    Object localObject1 = null;
    int k = arrayOfChar.length;
    int n = 0;
    if (n < k)
    {
      int i1 = arrayOfChar[n];
      if (j != 0)
      {
        i = 39;
        if (i1 != i) {
          localStringBuffer.append(i1);
        }
      }
      Object localObject2;
      label198:
      do
      {
        n += 1;
        break;
        localObject2 = null;
        switch (i1)
        {
        default: 
          if (localStringBuffer == null)
          {
            localStringBuffer = new java/lang/StringBuffer;
            localStringBuffer.<init>();
            localObject3 = new org/apache/commons/lang/time/DurationFormatUtils$Token;
            ((DurationFormatUtils.Token)localObject3).<init>(localStringBuffer);
            localArrayList.add(localObject3);
          }
          localStringBuffer.append(i1);
        }
      } while (localObject2 == null);
      if (localObject1 != null)
      {
        localObject3 = ((DurationFormatUtils.Token)localObject1).getValue();
        if (localObject3 == localObject2) {
          ((DurationFormatUtils.Token)localObject1).increment();
        }
      }
      for (;;)
      {
        localStringBuffer = null;
        break;
        if (j != 0)
        {
          localStringBuffer = null;
          j = 0;
          break label198;
        }
        localStringBuffer = new java/lang/StringBuffer;
        localStringBuffer.<init>();
        localObject3 = new org/apache/commons/lang/time/DurationFormatUtils$Token;
        ((DurationFormatUtils.Token)localObject3).<init>(localStringBuffer);
        localArrayList.add(localObject3);
        j = 1;
        break label198;
        localObject2 = y;
        break label198;
        localObject2 = M;
        break label198;
        localObject2 = d;
        break label198;
        localObject2 = H;
        break label198;
        localObject2 = m;
        break label198;
        localObject2 = s;
        break label198;
        localObject2 = S;
        break label198;
        DurationFormatUtils.Token localToken = new org/apache/commons/lang/time/DurationFormatUtils$Token;
        localToken.<init>(localObject2);
        localArrayList.add(localToken);
        localObject1 = localToken;
      }
    }
    Object localObject3 = new DurationFormatUtils.Token[localArrayList.size()];
    return (DurationFormatUtils.Token[])localArrayList.toArray((Object[])localObject3);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/DurationFormatUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */