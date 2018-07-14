package android.support.v4.util;

import java.io.PrintWriter;

public class TimeUtils
{
  public static final int HUNDRED_DAY_FIELD_LEN = 19;
  private static final int SECONDS_PER_DAY = 86400;
  private static final int SECONDS_PER_HOUR = 3600;
  private static final int SECONDS_PER_MINUTE = 60;
  private static char[] sFormatStr = new char[24];
  private static final Object sFormatSync;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    sFormatSync = localObject;
  }
  
  private static int accumField(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    int i = 99;
    if (paramInt1 <= i)
    {
      if (paramBoolean)
      {
        i = 3;
        if (paramInt3 < i) {}
      }
    }
    else {
      i = paramInt2 + 3;
    }
    for (;;)
    {
      return i;
      i = 9;
      if (paramInt1 <= i)
      {
        if (paramBoolean)
        {
          i = 2;
          if (paramInt3 < i) {}
        }
      }
      else
      {
        i = paramInt2 + 2;
        continue;
      }
      if ((paramBoolean) || (paramInt1 > 0)) {
        i = paramInt2 + 1;
      } else {
        i = 0;
      }
    }
  }
  
  public static void formatDuration(long paramLong1, long paramLong2, PrintWriter paramPrintWriter)
  {
    long l = 0L;
    boolean bool = paramLong1 < l;
    if (!bool)
    {
      String str = "--";
      paramPrintWriter.print(str);
    }
    for (;;)
    {
      return;
      l = paramLong1 - paramLong2;
      formatDuration(l, paramPrintWriter, 0);
    }
  }
  
  public static void formatDuration(long paramLong, PrintWriter paramPrintWriter)
  {
    formatDuration(paramLong, paramPrintWriter, 0);
  }
  
  public static void formatDuration(long paramLong, PrintWriter paramPrintWriter, int paramInt)
  {
    synchronized (sFormatSync)
    {
      int i = formatDurationLocked(paramLong, paramInt);
      String str = new java/lang/String;
      char[] arrayOfChar = sFormatStr;
      str.<init>(arrayOfChar, 0, i);
      paramPrintWriter.print(str);
      return;
    }
  }
  
  public static void formatDuration(long paramLong, StringBuilder paramStringBuilder)
  {
    Object localObject1 = sFormatSync;
    char[] arrayOfChar = null;
    try
    {
      int i = formatDurationLocked(paramLong, 0);
      arrayOfChar = sFormatStr;
      paramStringBuilder.append(arrayOfChar, 0, i);
      return;
    }
    finally {}
  }
  
  private static int formatDurationLocked(long paramLong, int paramInt)
  {
    char[] arrayOfChar1 = sFormatStr;
    int i = arrayOfChar1.length;
    int i3 = paramInt;
    if (i < paramInt)
    {
      arrayOfChar1 = new char[paramInt];
      sFormatStr = arrayOfChar1;
    }
    char[] arrayOfChar2 = sFormatStr;
    long l1 = 0L;
    double d = 0.0D;
    boolean bool1 = paramLong < l1;
    int i5;
    if (!bool1)
    {
      i5 = 0;
      paramInt += -1;
      for (;;)
      {
        i3 = paramInt;
        if (0 >= paramInt) {
          break;
        }
        j = 32;
        arrayOfChar2[0] = j;
      }
      arrayOfChar2[0] = '0';
      int j = 1;
      return j;
    }
    l1 = 0L;
    d = 0.0D;
    boolean bool2 = paramLong < l1;
    int i6;
    int i7;
    int i12;
    int i13;
    int i14;
    int i11;
    int i15;
    int i22;
    label291:
    label325:
    label359:
    int i1;
    int i20;
    if (bool2)
    {
      i6 = 43;
      i7 = (int)(paramLong % 1000L);
      l1 = paramLong / 1000L;
      d = Math.floor(l1);
      i3 = (int)d;
      int i8 = i3;
      i12 = 0;
      i13 = 0;
      i14 = 0;
      int k = 86400;
      int i9;
      if (i3 > k)
      {
        i12 = i3 / 86400;
        k = 86400 * i12;
        i9 = i3 - k;
      }
      k = 3600;
      i3 = i9;
      int i10;
      if (i9 > k)
      {
        i13 = i9 / 3600;
        k = i13 * 3600;
        i9 -= k;
      }
      k = 60;
      i3 = i10;
      if (i10 > k)
      {
        i14 = i10 / 60;
        k = i14 * 60;
        i10 -= k;
      }
      i5 = 0;
      if (paramInt == 0) {
        break label502;
      }
      k = 1;
      i15 = 0;
      int i17 = accumField(i12, k, false, 0);
      i22 = 1;
      if (i17 <= 0) {
        break label470;
      }
      k = 1;
      i15 = 2;
      int m = accumField(i13, i22, k, i15);
      int i18;
      i17 += m;
      i22 = 1;
      if (i18 <= 0) {
        break label478;
      }
      m = 1;
      i15 = 2;
      int n = accumField(i14, i22, m, i15);
      int i19;
      i18 += n;
      i22 = 1;
      if (i19 <= 0) {
        break label486;
      }
      n = 1;
      i3 = i11;
      i1 = accumField(i11, i22, n, 2);
      i19 += i1;
      i22 = 2;
      i15 = 1;
      if (i20 <= 0) {
        break label494;
      }
      i1 = 3;
    }
    int i4;
    for (;;)
    {
      i1 = accumField(i7, i22, i15, i1) + 1;
      int i21;
      i20 += i1;
      for (;;)
      {
        i4 = paramInt;
        if (i21 >= paramInt) {
          break;
        }
        i1 = 32;
        arrayOfChar2[i5] = i1;
        i5 += 1;
        i21 += 1;
      }
      i6 = 45;
      long l2 = paramLong;
      l2 = -paramLong;
      paramLong = l2;
      break;
      label470:
      i1 = 0;
      arrayOfChar1 = null;
      break label291;
      label478:
      i1 = 0;
      arrayOfChar1 = null;
      break label325;
      label486:
      i1 = 0;
      arrayOfChar1 = null;
      break label359;
      label494:
      i1 = 0;
      arrayOfChar1 = null;
    }
    label502:
    arrayOfChar2[i5] = i6;
    i5 += 1;
    int i23 = i5;
    int i24;
    label526:
    int i16;
    char c;
    boolean bool3;
    if (paramInt != 0)
    {
      i24 = 1;
      i1 = 100;
      i22 = 0;
      i16 = 0;
      i5 = printField(arrayOfChar2, i12, i1, i5, false, 0);
      c = 'h';
      i4 = i23;
      if (i5 == i23) {
        break label761;
      }
      bool3 = true;
      label569:
      if (i24 == 0) {
        break label767;
      }
      i25 = 2;
      label577:
      i16 = i13;
      i5 = printField(arrayOfChar2, i13, c, i5, bool3, i25);
      c = 'm';
      i4 = i23;
      if (i5 == i23) {
        break label773;
      }
      bool3 = true;
      label616:
      if (i24 == 0) {
        break label779;
      }
      i25 = 2;
      label624:
      i16 = i14;
      i5 = printField(arrayOfChar2, i14, c, i5, bool3, i25);
      c = 's';
      i4 = i23;
      if (i5 == i23) {
        break label785;
      }
      bool3 = true;
      label663:
      if (i24 == 0) {
        break label791;
      }
      i25 = 2;
      label671:
      i16 = i11;
      i5 = printField(arrayOfChar2, i11, c, i5, bool3, i25);
      c = 'm';
      bool3 = true;
      if (i24 == 0) {
        break label797;
      }
      i4 = i23;
      if (i5 == i23) {
        break label797;
      }
    }
    label761:
    label767:
    label773:
    label779:
    label785:
    label791:
    label797:
    for (int i25 = 3;; i25 = 0)
    {
      i16 = i7;
      i5 = printField(arrayOfChar2, i7, c, i5, bool3, i25);
      arrayOfChar2[i5] = 's';
      int i2 = i5 + 1;
      break;
      i24 = 0;
      break label526;
      bool3 = false;
      break label569;
      i25 = 0;
      break label577;
      bool3 = false;
      break label616;
      i25 = 0;
      break label624;
      bool3 = false;
      break label663;
      i25 = 0;
      break label671;
    }
  }
  
  private static int printField(char[] paramArrayOfChar, int paramInt1, char paramChar, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    if ((paramBoolean) || (paramInt1 > 0))
    {
      int i = paramInt2;
      if (paramBoolean)
      {
        j = 3;
        if (paramInt3 >= j) {}
      }
      else
      {
        j = 99;
        if (paramInt1 <= j) {
          break label72;
        }
      }
      int k = paramInt1 / 100;
      int j = (char)(k + 48);
      paramArrayOfChar[paramInt2] = j;
      paramInt2 += 1;
      j = k * 100;
      paramInt1 -= j;
      label72:
      if (paramBoolean)
      {
        j = 2;
        if (paramInt3 >= j) {}
      }
      else
      {
        j = 9;
        if ((paramInt1 <= j) && (i == paramInt2)) {
          break label138;
        }
      }
      k = paramInt1 / 10;
      j = (char)(k + 48);
      paramArrayOfChar[paramInt2] = j;
      paramInt2 += 1;
      j = k * 10;
      paramInt1 -= j;
      label138:
      j = (char)(paramInt1 + 48);
      paramArrayOfChar[paramInt2] = j;
      paramInt2 += 1;
      paramArrayOfChar[paramInt2] = paramChar;
      paramInt2 += 1;
    }
    return paramInt2;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/util/TimeUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */