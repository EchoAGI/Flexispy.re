package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils
{
  private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone("UTC");
  private static final String UTC_ID = "UTC";
  
  private static boolean checkOffset(String paramString, int paramInt, char paramChar)
  {
    int i = paramString.length();
    if (paramInt < i)
    {
      i = paramString.charAt(paramInt);
      if (i != paramChar) {}
    }
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  public static String format(Date paramDate)
  {
    TimeZone localTimeZone = TIMEZONE_UTC;
    return format(paramDate, false, localTimeZone);
  }
  
  public static String format(Date paramDate, boolean paramBoolean)
  {
    TimeZone localTimeZone = TIMEZONE_UTC;
    return format(paramDate, paramBoolean, localTimeZone);
  }
  
  public static String format(Date paramDate, boolean paramBoolean, TimeZone paramTimeZone)
  {
    int i = 60000;
    char c = ':';
    int j = 45;
    GregorianCalendar localGregorianCalendar = new java/util/GregorianCalendar;
    Object localObject = Locale.US;
    localGregorianCalendar.<init>(paramTimeZone, (Locale)localObject);
    localGregorianCalendar.setTime(paramDate);
    localObject = "yyyy-MM-ddThh:mm:ss";
    int k = ((String)localObject).length();
    label90:
    StringBuilder localStringBuilder;
    label400:
    int n;
    if (paramBoolean)
    {
      localObject = ".sss";
      int m = ((String)localObject).length();
      k += m;
      m = paramTimeZone.getRawOffset();
      if (m != 0) {
        break label467;
      }
      localObject = "Z";
      m = ((String)localObject).length();
      k += m;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(k);
      m = localGregorianCalendar.get(1);
      int i1 = "yyyy".length();
      padInt(localStringBuilder, m, i1);
      localStringBuilder.append(j);
      m = localGregorianCalendar.get(2) + 1;
      i1 = "MM".length();
      padInt(localStringBuilder, m, i1);
      localStringBuilder.append(j);
      m = localGregorianCalendar.get(5);
      i1 = "dd".length();
      padInt(localStringBuilder, m, i1);
      localStringBuilder.append('T');
      m = localGregorianCalendar.get(11);
      i1 = "hh".length();
      padInt(localStringBuilder, m, i1);
      localStringBuilder.append(c);
      m = localGregorianCalendar.get(12);
      i1 = "mm".length();
      padInt(localStringBuilder, m, i1);
      localStringBuilder.append(c);
      m = localGregorianCalendar.get(13);
      String str = "ss";
      i1 = str.length();
      padInt(localStringBuilder, m, i1);
      if (paramBoolean)
      {
        localStringBuilder.append('.');
        m = localGregorianCalendar.get(14);
        str = "sss";
        i1 = str.length();
        padInt(localStringBuilder, m, i1);
      }
      long l = localGregorianCalendar.getTimeInMillis();
      int i2 = paramTimeZone.getOffset(l);
      if (i2 == 0) {
        break label488;
      }
      int i3 = Math.abs(i2 / i / 60);
      m = i2 / i % 60;
      int i4 = Math.abs(m);
      if (i2 >= 0) {
        break label481;
      }
      m = j;
      localStringBuilder.append(m);
      n = "hh".length();
      padInt(localStringBuilder, i3, n);
      localStringBuilder.append(c);
      localObject = "mm";
      n = ((String)localObject).length();
      padInt(localStringBuilder, i4, n);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      n = 0;
      localObject = null;
      break;
      label467:
      localObject = "+hh:mm";
      n = ((String)localObject).length();
      break label90;
      label481:
      n = 43;
      break label400;
      label488:
      n = 90;
      localStringBuilder.append(n);
    }
  }
  
  private static int indexOfNonDigit(String paramString, int paramInt)
  {
    int i = paramInt;
    int j = paramString.length();
    if (i < j)
    {
      int k = paramString.charAt(i);
      j = 48;
      if (k >= j)
      {
        j = 57;
        if (k <= j) {
          break label39;
        }
      }
    }
    for (;;)
    {
      return i;
      label39:
      i += 1;
      break;
      i = paramString.length();
    }
  }
  
  private static void padInt(StringBuilder paramStringBuilder, int paramInt1, int paramInt2)
  {
    String str = Integer.toString(paramInt1);
    int i = str.length();
    int j = paramInt2 - i;
    while (j > 0)
    {
      i = 48;
      paramStringBuilder.append(i);
      j += -1;
    }
    paramStringBuilder.append(str);
  }
  
  public static Date parse(String paramString, ParsePosition paramParsePosition)
  {
    localObject1 = null;
    try
    {
      i = paramParsePosition.getIndex();
      j = i + 4;
      k = parseInt(paramString, i, j);
      char c1 = '-';
      boolean bool1 = checkOffset(paramString, j, c1);
      if (bool1)
      {
        i = j + 1;
        j = i;
      }
      i = j + 2;
      i3 = parseInt(paramString, j, i);
      char c2 = '-';
      boolean bool2 = checkOffset(paramString, i, c2);
      if (!bool2) {
        break label1308;
      }
      i += 1;
      j = i;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      int k;
      int i3;
      int i4;
      int i5;
      int i6;
      int i9;
      GregorianCalendar localGregorianCalendar;
      int i8;
      for (;;)
      {
        int i7;
        char c3;
        boolean bool8;
        int m;
        boolean bool3;
        char c4;
        boolean bool4;
        int n;
        int i10;
        boolean bool5;
        int i1;
        int i11;
        int i12;
        int i13;
        localObject1 = localIndexOutOfBoundsException;
        if (paramString != null) {
          break;
        }
        str1 = null;
        String str2 = ((Exception)localObject1).getMessage();
        if (str2 != null)
        {
          boolean bool6 = str2.isEmpty();
          if (!bool6) {}
        }
        else
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("(");
          localObject3 = localObject1.getClass().getName();
          localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
          localObject3 = ")";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
          str2 = ((StringBuilder)localObject2).toString();
        }
        ParseException localParseException = new java/text/ParseException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Failed to parse date [" + str1 + "]: " + str2;
        i14 = paramParsePosition.getIndex();
        localParseException.<init>((String)localObject2, i14);
        localParseException.initCause((Throwable)localObject1);
        throw localParseException;
        i9 = i13 * 10;
        continue;
        i9 = i13 * 100;
      }
      TimeZone localTimeZone = null;
      i15 = paramString.charAt(i);
      int i2 = 90;
      if (i15 != i2) {
        break label832;
      }
      localTimeZone = TIMEZONE_UTC;
      i += 1;
      boolean bool7;
      String str4;
      do
      {
        String str5;
        do
        {
          localGregorianCalendar = new java/util/GregorianCalendar;
          localGregorianCalendar.<init>(localTimeZone);
          i2 = 0;
          localObject2 = null;
          localGregorianCalendar.setLenient(false);
          i2 = 1;
          localGregorianCalendar.set(i2, k);
          i2 = 2;
          i14 = i3 + -1;
          localGregorianCalendar.set(i2, i14);
          i2 = 5;
          localGregorianCalendar.set(i2, i4);
          i2 = 11;
          localGregorianCalendar.set(i2, i5);
          i2 = 12;
          localGregorianCalendar.set(i2, i6);
          i2 = 13;
          localGregorianCalendar.set(i2, i8);
          i2 = 14;
          localGregorianCalendar.set(i2, i9);
          paramParsePosition.setIndex(i);
          localObject2 = localGregorianCalendar.getTime();
          break;
          i2 = 43;
          if (i15 != i2)
          {
            i2 = 45;
            if (i15 != i2) {
              break label1168;
            }
          }
          String str3 = paramString.substring(i);
          i2 = str3.length();
          i14 = 5;
          if (i2 >= i14) {}
          for (;;)
          {
            i2 = str3.length();
            i += i2;
            localObject2 = "+0000";
            bool7 = ((String)localObject2).equals(str3);
            if (!bool7)
            {
              localObject2 = "+00:00";
              bool7 = ((String)localObject2).equals(str3);
              if (!bool7) {
                break label976;
              }
            }
            localTimeZone = TIMEZONE_UTC;
            break;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append(str3);
            localObject3 = "00";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
            str3 = ((StringBuilder)localObject2).toString();
          }
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = "GMT";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
          localObject2 = ((StringBuilder)localObject2).append(str3);
          str4 = ((StringBuilder)localObject2).toString();
          localTimeZone = TimeZone.getTimeZone(str4);
          str5 = localTimeZone.getID();
          bool7 = str5.equals(str4);
        } while (bool7);
        localObject2 = ":";
        localObject3 = "";
        String str6 = str5.replace((CharSequence)localObject2, (CharSequence)localObject3);
        bool7 = str6.equals(str4);
      } while (bool7);
      localObject2 = new java/lang/IndexOutOfBoundsException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      str7 = "Mismatching time zone indicator: ";
      localObject3 = ((StringBuilder)localObject3).append(str7);
      localObject3 = ((StringBuilder)localObject3).append(str4);
      str7 = " given, resolves to ";
      localObject3 = ((StringBuilder)localObject3).append(str7);
      str7 = localTimeZone.getID();
      localObject3 = ((StringBuilder)localObject3).append(str7);
      localObject3 = ((StringBuilder)localObject3).toString();
      ((IndexOutOfBoundsException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      int i15;
      for (;;)
      {
        localObject1 = localNumberFormatException;
      }
      localObject2 = new java/lang/IndexOutOfBoundsException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      String str7 = "Invalid time zone indicator '";
      localObject3 = ((StringBuilder)localObject3).append(str7);
      localObject3 = ((StringBuilder)localObject3).append(i15);
      str7 = "'";
      localObject3 = ((StringBuilder)localObject3).append(str7);
      localObject3 = ((StringBuilder)localObject3).toString();
      ((IndexOutOfBoundsException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        localObject1 = localIllegalArgumentException;
        continue;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        int i14 = 34;
        localObject2 = ((StringBuilder)localObject2).append(i14).append(paramString);
        Object localObject3 = "'";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        String str1 = ((StringBuilder)localObject2).toString();
        continue;
        int i = j;
        continue;
        int j = i;
        continue;
        j = i;
      }
    }
    i = j + 2;
    i4 = parseInt(paramString, j, i);
    i5 = 0;
    i6 = 0;
    i7 = 0;
    i9 = 0;
    c3 = 'T';
    bool8 = checkOffset(paramString, i, c3);
    if (!bool8)
    {
      m = paramString.length();
      if (m <= i)
      {
        localGregorianCalendar = new java/util/GregorianCalendar;
        m = i3 + -1;
        localGregorianCalendar.<init>(k, m, i4);
        paramParsePosition.setIndex(i);
        localObject2 = localGregorianCalendar.getTime();
        return (Date)localObject2;
      }
    }
    if (bool8)
    {
      i += 1;
      j = i + 2;
      i5 = parseInt(paramString, i, j);
      m = 58;
      bool3 = checkOffset(paramString, j, m);
      if (bool3)
      {
        i = j + 1;
        j = i;
      }
      i = j + 2;
      i6 = parseInt(paramString, j, i);
      c4 = ':';
      bool4 = checkOffset(paramString, i, c4);
      if (!bool4) {
        break label1302;
      }
      i += 1;
      j = i;
      n = paramString.length();
      if (n <= j) {
        break label1296;
      }
      i10 = paramString.charAt(j);
      n = 90;
      if (i10 == n) {
        break label1296;
      }
      n = 43;
      if (i10 == n) {
        break label1296;
      }
      n = 45;
      if (i10 == n) {
        break label1296;
      }
      i = j + 2;
      i7 = parseInt(paramString, j, i);
      n = 59;
      if (i7 > n)
      {
        n = 63;
        if (i7 < n) {
          i8 = 59;
        }
      }
      n = 46;
      bool5 = checkOffset(paramString, i, n);
      if (bool5)
      {
        i += 1;
        i1 = i + 1;
        i11 = indexOfNonDigit(paramString, i1);
        i1 = i + 3;
        i12 = Math.min(i11, i1);
        i13 = parseInt(paramString, i, i12);
        i1 = i12 - i;
      }
    }
    switch (i1)
    {
    default: 
      i9 = i13;
      i = i11;
      i1 = paramString.length();
      if (i1 <= i)
      {
        localObject2 = new java/lang/IllegalArgumentException;
        localObject3 = "No time zone indicator";
        ((IllegalArgumentException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
      }
      break;
    }
  }
  
  private static int parseInt(String paramString, int paramInt1, int paramInt2)
  {
    int i = 10;
    int j;
    NumberFormatException localNumberFormatException;
    if (paramInt1 >= 0)
    {
      j = paramString.length();
      if ((paramInt2 <= j) && (paramInt1 <= paramInt2)) {}
    }
    else
    {
      localNumberFormatException = new java/lang/NumberFormatException;
      localNumberFormatException.<init>(paramString);
      throw localNumberFormatException;
    }
    int k = paramInt1;
    int m = 0;
    int n;
    int i1;
    Object localObject;
    String str;
    if (paramInt1 < paramInt2)
    {
      n = paramInt1 + 1;
      j = paramString.charAt(paramInt1);
      i1 = Character.digit(j, i);
      if (i1 < 0)
      {
        localNumberFormatException = new java/lang/NumberFormatException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("Invalid number: ");
        str = paramString.substring(paramInt1, paramInt2);
        localObject = str;
        localNumberFormatException.<init>((String)localObject);
        throw localNumberFormatException;
      }
      m = -i1;
    }
    for (;;)
    {
      if (n < paramInt2)
      {
        k = n + 1;
        j = paramString.charAt(n);
        i1 = Character.digit(j, i);
        if (i1 < 0)
        {
          localNumberFormatException = new java/lang/NumberFormatException;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          localObject = ((StringBuilder)localObject).append("Invalid number: ");
          str = paramString.substring(paramInt1, paramInt2);
          localObject = str;
          localNumberFormatException.<init>((String)localObject);
          throw localNumberFormatException;
        }
        m = m * 10 - i1;
        n = k;
      }
      else
      {
        return -m;
        n = paramInt1;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/util/ISO8601Utils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */