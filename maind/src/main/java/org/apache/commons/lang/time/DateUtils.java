package org.apache.commons.lang.time;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;
import org.apache.commons.lang.StringUtils;

public class DateUtils
{
  public static final int MILLIS_IN_DAY = 86400000;
  public static final int MILLIS_IN_HOUR = 3600000;
  public static final int MILLIS_IN_MINUTE = 60000;
  public static final int MILLIS_IN_SECOND = 1000;
  public static final long MILLIS_PER_DAY = 86400000L;
  public static final long MILLIS_PER_HOUR = 3600000L;
  public static final long MILLIS_PER_MINUTE = 60000L;
  public static final long MILLIS_PER_SECOND = 1000L;
  private static final int MODIFY_CEILING = 2;
  private static final int MODIFY_ROUND = 1;
  private static final int MODIFY_TRUNCATE = 0;
  public static final int RANGE_MONTH_MONDAY = 6;
  public static final int RANGE_MONTH_SUNDAY = 5;
  public static final int RANGE_WEEK_CENTER = 4;
  public static final int RANGE_WEEK_MONDAY = 2;
  public static final int RANGE_WEEK_RELATIVE = 3;
  public static final int RANGE_WEEK_SUNDAY = 1;
  public static final int SEMI_MONTH = 1001;
  public static final TimeZone UTC_TIME_ZONE;
  private static final int[][] fields;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    UTC_TIME_ZONE = TimeZone.getTimeZone("GMT");
    int[][] arrayOfInt = new int[8][];
    int[] arrayOfInt1 = new int[k];
    arrayOfInt1[0] = 14;
    arrayOfInt[0] = arrayOfInt1;
    arrayOfInt1 = new int[k];
    arrayOfInt1[0] = 13;
    arrayOfInt[k] = arrayOfInt1;
    arrayOfInt1 = new int[k];
    arrayOfInt1[0] = 12;
    arrayOfInt[j] = arrayOfInt1;
    arrayOfInt1 = new int[j];
    int[] tmp75_73 = arrayOfInt1;
    tmp75_73[0] = 11;
    tmp75_73[1] = 10;
    arrayOfInt[i] = arrayOfInt1;
    int[] arrayOfInt2 = new int[i];
    int[] tmp96_94 = arrayOfInt2;
    tmp96_94[0] = 5;
    int[] tmp100_96 = tmp96_94;
    tmp100_96[1] = 5;
    tmp100_96[2] = 9;
    arrayOfInt[4] = arrayOfInt2;
    arrayOfInt2 = new int[j];
    int[] tmp120_118 = arrayOfInt2;
    tmp120_118[0] = 2;
    tmp120_118[1] = 'ϩ';
    arrayOfInt[5] = arrayOfInt2;
    arrayOfInt2 = new int[k];
    arrayOfInt2[0] = k;
    arrayOfInt[6] = arrayOfInt2;
    arrayOfInt2 = new int[k];
    arrayOfInt2[0] = 0;
    arrayOfInt[7] = arrayOfInt2;
    fields = arrayOfInt;
  }
  
  public static Date add(Date paramDate, int paramInt1, int paramInt2)
  {
    if (paramDate == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTime(paramDate);
    localCalendar.add(paramInt1, paramInt2);
    return localCalendar.getTime();
  }
  
  public static Date addDays(Date paramDate, int paramInt)
  {
    return add(paramDate, 5, paramInt);
  }
  
  public static Date addHours(Date paramDate, int paramInt)
  {
    return add(paramDate, 11, paramInt);
  }
  
  public static Date addMilliseconds(Date paramDate, int paramInt)
  {
    return add(paramDate, 14, paramInt);
  }
  
  public static Date addMinutes(Date paramDate, int paramInt)
  {
    return add(paramDate, 12, paramInt);
  }
  
  public static Date addMonths(Date paramDate, int paramInt)
  {
    return add(paramDate, 2, paramInt);
  }
  
  public static Date addSeconds(Date paramDate, int paramInt)
  {
    return add(paramDate, 13, paramInt);
  }
  
  public static Date addWeeks(Date paramDate, int paramInt)
  {
    return add(paramDate, 3, paramInt);
  }
  
  public static Date addYears(Date paramDate, int paramInt)
  {
    return add(paramDate, 1, paramInt);
  }
  
  public static Calendar ceiling(Calendar paramCalendar, int paramInt)
  {
    if (paramCalendar == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    Calendar localCalendar = (Calendar)paramCalendar.clone();
    modify(localCalendar, paramInt, 2);
    return localCalendar;
  }
  
  public static Date ceiling(Object paramObject, int paramInt)
  {
    if (paramObject == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The date must not be null");
      throw ((Throwable)localObject1);
    }
    boolean bool = paramObject instanceof Date;
    if (bool) {
      paramObject = (Date)paramObject;
    }
    for (Object localObject1 = ceiling((Date)paramObject, paramInt);; localObject1 = ceiling((Calendar)paramObject, paramInt).getTime())
    {
      return (Date)localObject1;
      bool = paramObject instanceof Calendar;
      if (!bool) {
        break;
      }
      paramObject = (Calendar)paramObject;
    }
    localObject1 = new java/lang/ClassCastException;
    Object localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    localObject2 = ((StringBuffer)localObject2).append("Could not find ceiling of for type: ");
    Class localClass = paramObject.getClass();
    localObject2 = localClass;
    ((ClassCastException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public static Date ceiling(Date paramDate, int paramInt)
  {
    if (paramDate == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTime(paramDate);
    modify(localCalendar, paramInt, 2);
    return localCalendar.getTime();
  }
  
  private static long getFragment(Calendar paramCalendar, int paramInt1, int paramInt2)
  {
    long l1 = 86400000L;
    IllegalArgumentException localIllegalArgumentException;
    if (paramCalendar == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    long l2 = getMillisPerUnit(paramInt2);
    long l3 = 0L;
    switch (paramInt1)
    {
    }
    for (;;)
    {
      switch (paramInt1)
      {
      case 3: 
      case 4: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      default: 
        localIllegalArgumentException = new java/lang/IllegalArgumentException;
        Object localObject = new java/lang/StringBuffer;
        ((StringBuffer)localObject).<init>();
        localObject = "The fragment " + paramInt1 + " is not supported";
        localIllegalArgumentException.<init>((String)localObject);
        throw localIllegalArgumentException;
        i = paramCalendar.get(6);
        l4 = i * l1 / l2;
        l3 += l4;
        continue;
        i = paramCalendar.get(5);
        l4 = i * l1 / l2;
        l3 += l4;
      }
    }
    int i = paramCalendar.get(11);
    long l4 = i;
    l1 = 3600000L;
    l4 = l4 * l1 / l2;
    l3 += l4;
    i = paramCalendar.get(12);
    l4 = i;
    l1 = 60000L;
    l4 = l4 * l1 / l2;
    l3 += l4;
    i = paramCalendar.get(13);
    l4 = i;
    l1 = 1000L;
    l4 = l4 * l1 / l2;
    l3 += l4;
    i = paramCalendar.get(14) * 1;
    l4 = i / l2;
    l3 += l4;
    return l3;
  }
  
  private static long getFragment(Date paramDate, int paramInt1, int paramInt2)
  {
    if (paramDate == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTime(paramDate);
    return getFragment(localCalendar, paramInt1, paramInt2);
  }
  
  public static long getFragmentInDays(Calendar paramCalendar, int paramInt)
  {
    return getFragment(paramCalendar, paramInt, 6);
  }
  
  public static long getFragmentInDays(Date paramDate, int paramInt)
  {
    return getFragment(paramDate, paramInt, 6);
  }
  
  public static long getFragmentInHours(Calendar paramCalendar, int paramInt)
  {
    return getFragment(paramCalendar, paramInt, 11);
  }
  
  public static long getFragmentInHours(Date paramDate, int paramInt)
  {
    return getFragment(paramDate, paramInt, 11);
  }
  
  public static long getFragmentInMilliseconds(Calendar paramCalendar, int paramInt)
  {
    return getFragment(paramCalendar, paramInt, 14);
  }
  
  public static long getFragmentInMilliseconds(Date paramDate, int paramInt)
  {
    return getFragment(paramDate, paramInt, 14);
  }
  
  public static long getFragmentInMinutes(Calendar paramCalendar, int paramInt)
  {
    return getFragment(paramCalendar, paramInt, 12);
  }
  
  public static long getFragmentInMinutes(Date paramDate, int paramInt)
  {
    return getFragment(paramDate, paramInt, 12);
  }
  
  public static long getFragmentInSeconds(Calendar paramCalendar, int paramInt)
  {
    return getFragment(paramCalendar, paramInt, 13);
  }
  
  public static long getFragmentInSeconds(Date paramDate, int paramInt)
  {
    return getFragment(paramDate, paramInt, 13);
  }
  
  private static long getMillisPerUnit(int paramInt)
  {
    long l = Long.MAX_VALUE;
    switch (paramInt)
    {
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    default: 
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = "The unit " + paramInt + " cannot be represented is milleseconds";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    case 5: 
    case 6: 
      l = 86400000L;
    }
    for (;;)
    {
      return l;
      l = 3600000L;
      continue;
      l = 60000L;
      continue;
      l = 1000L;
      continue;
      l = 1L;
    }
  }
  
  private static int indexOfSignChars(String paramString, int paramInt)
  {
    char c = '+';
    int i = StringUtils.indexOf(paramString, c, paramInt);
    if (i < 0)
    {
      c = '-';
      i = StringUtils.indexOf(paramString, c, paramInt);
    }
    return i;
  }
  
  public static boolean isSameDay(Calendar paramCalendar1, Calendar paramCalendar2)
  {
    int i = 6;
    int j = 1;
    IllegalArgumentException localIllegalArgumentException;
    if ((paramCalendar1 == null) || (paramCalendar2 == null))
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    int m = paramCalendar1.get(0);
    int n = paramCalendar2.get(0);
    if (m == n)
    {
      m = paramCalendar1.get(j);
      n = paramCalendar2.get(j);
      if (m == n)
      {
        m = paramCalendar1.get(i);
        n = paramCalendar2.get(i);
        if (m != n) {}
      }
    }
    for (;;)
    {
      return j;
      int k = 0;
      localIllegalArgumentException = null;
    }
  }
  
  public static boolean isSameDay(Date paramDate1, Date paramDate2)
  {
    if ((paramDate1 == null) || (paramDate2 == null))
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    Calendar localCalendar1 = Calendar.getInstance();
    localCalendar1.setTime(paramDate1);
    Calendar localCalendar2 = Calendar.getInstance();
    localCalendar2.setTime(paramDate2);
    return isSameDay(localCalendar1, localCalendar2);
  }
  
  public static boolean isSameInstant(Calendar paramCalendar1, Calendar paramCalendar2)
  {
    if ((paramCalendar1 == null) || (paramCalendar2 == null))
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("The date must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = paramCalendar1.getTime();
    long l1 = ((Date)localObject).getTime();
    Date localDate = paramCalendar2.getTime();
    long l2 = localDate.getTime();
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public static boolean isSameInstant(Date paramDate1, Date paramDate2)
  {
    IllegalArgumentException localIllegalArgumentException;
    if ((paramDate1 == null) || (paramDate2 == null))
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    long l1 = paramDate1.getTime();
    long l2 = paramDate2.getTime();
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localIllegalArgumentException = null;
    }
  }
  
  public static boolean isSameLocalTime(Calendar paramCalendar1, Calendar paramCalendar2)
  {
    int i = 12;
    int j = 10;
    int k = 6;
    int m = 1;
    IllegalArgumentException localIllegalArgumentException;
    if ((paramCalendar1 == null) || (paramCalendar2 == null))
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    int i1 = paramCalendar1.get(14);
    int i2 = paramCalendar2.get(14);
    if (i1 == i2)
    {
      i1 = paramCalendar1.get(13);
      i2 = paramCalendar2.get(13);
      if (i1 == i2)
      {
        i1 = paramCalendar1.get(i);
        i2 = paramCalendar2.get(i);
        if (i1 == i2)
        {
          i1 = paramCalendar1.get(j);
          i2 = paramCalendar2.get(j);
          if (i1 == i2)
          {
            i1 = paramCalendar1.get(k);
            i2 = paramCalendar2.get(k);
            if (i1 == i2)
            {
              i1 = paramCalendar1.get(m);
              i2 = paramCalendar2.get(m);
              if (i1 == i2)
              {
                i1 = paramCalendar1.get(0);
                i2 = paramCalendar2.get(0);
                if (i1 == i2)
                {
                  Class localClass1 = paramCalendar1.getClass();
                  Class localClass2 = paramCalendar2.getClass();
                  if (localClass1 != localClass2) {}
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return m;
      int n = 0;
      localIllegalArgumentException = null;
    }
  }
  
  public static Iterator iterator(Object paramObject, int paramInt)
  {
    if (paramObject == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The date must not be null");
      throw ((Throwable)localObject1);
    }
    boolean bool = paramObject instanceof Date;
    if (bool) {
      paramObject = (Date)paramObject;
    }
    for (Object localObject1 = iterator((Date)paramObject, paramInt);; localObject1 = iterator((Calendar)paramObject, paramInt))
    {
      return (Iterator)localObject1;
      bool = paramObject instanceof Calendar;
      if (!bool) {
        break;
      }
      paramObject = (Calendar)paramObject;
    }
    localObject1 = new java/lang/ClassCastException;
    Object localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    localObject2 = "Could not iterate based on " + paramObject;
    ((ClassCastException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public static Iterator iterator(Calendar paramCalendar, int paramInt)
  {
    int i = 2;
    int j = -1;
    int k = 1;
    int m = 5;
    int n = 7;
    if (paramCalendar == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The date must not be null");
      throw ((Throwable)localObject1);
    }
    Calendar localCalendar1 = null;
    Calendar localCalendar2 = null;
    int i1 = 1;
    int i2 = 7;
    switch (paramInt)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      localObject2 = "The range style " + paramInt + " is not valid.";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 5: 
    case 6: 
      localCalendar1 = truncate(paramCalendar, i);
      localCalendar2 = (Calendar)localCalendar1.clone();
      localCalendar2.add(i, k);
      localCalendar2.add(m, j);
      i = 6;
      if (paramInt == i)
      {
        i1 = 2;
        i2 = 1;
      }
      break;
    }
    for (;;)
    {
      if (i1 < k) {
        i1 += 7;
      }
      if (i1 > n) {
        i1 += -7;
      }
      if (i2 < k) {
        i2 += 7;
      }
      if (i2 > n) {
        i2 += -7;
      }
      for (;;)
      {
        i = localCalendar1.get(n);
        if (i == i1) {
          break;
        }
        localCalendar1.add(m, j);
      }
      localCalendar1 = truncate(paramCalendar, m);
      localCalendar2 = truncate(paramCalendar, m);
      switch (paramInt)
      {
      case 1: 
      default: 
        break;
      case 2: 
        i1 = 2;
        i2 = 1;
        break;
      case 3: 
        i1 = paramCalendar.get(n);
        i2 = i1 + -1;
        break;
      case 4: 
        i1 = paramCalendar.get(n) + -3;
        i = paramCalendar.get(n);
        i2 = i + 3;
      }
    }
    for (;;)
    {
      i = localCalendar2.get(n);
      if (i == i2) {
        break;
      }
      localCalendar2.add(m, k);
    }
    Object localObject1 = new org/apache/commons/lang/time/DateUtils$DateIterator;
    ((DateUtils.DateIterator)localObject1).<init>(localCalendar1, localCalendar2);
    return (Iterator)localObject1;
  }
  
  public static Iterator iterator(Date paramDate, int paramInt)
  {
    if (paramDate == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTime(paramDate);
    return iterator(localCalendar, paramInt);
  }
  
  private static void modify(Calendar paramCalendar, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = paramCalendar.get(i);
    int m = 280000000;
    int n = j;
    i = m;
    if (j > m)
    {
      localObject1 = new java/lang/ArithmeticException;
      ((ArithmeticException)localObject1).<init>("Calendar value too large for accurate calculations");
      throw ((Throwable)localObject1);
    }
    j = 14;
    n = paramInt1;
    i = j;
    if (paramInt1 == j) {
      return;
    }
    Date localDate = paramCalendar.getTime();
    long l1 = localDate.getTime();
    int i1 = 0;
    j = 14;
    i = j;
    int i2 = paramCalendar.get(j);
    long l2;
    if (paramInt2 != 0)
    {
      j = 500;
      n = j;
      if (i2 >= j) {}
    }
    else
    {
      l2 = i2;
      l3 = l2;
      l1 -= l2;
    }
    j = 13;
    n = paramInt1;
    i = j;
    if (paramInt1 == j) {
      i1 = 1;
    }
    j = 13;
    i = j;
    int i3 = paramCalendar.get(j);
    long l4;
    if (i1 == 0) {
      if (paramInt2 != 0)
      {
        j = 30;
        n = j;
        if (i3 >= j) {}
      }
      else
      {
        l2 = i3;
        l3 = l2;
        l4 = 1000L;
        l3 = l2 * l4;
        l1 -= l3;
      }
    }
    j = 12;
    n = paramInt1;
    i = j;
    if (paramInt1 == j) {
      i1 = 1;
    }
    j = 12;
    i = j;
    int i4 = paramCalendar.get(j);
    if (i1 == 0) {
      if (paramInt2 != 0)
      {
        j = 30;
        n = j;
        if (i4 >= j) {}
      }
      else
      {
        l2 = i4;
        l3 = l2;
        l4 = 60000L;
        l3 = l2 * l4;
        l1 -= l3;
      }
    }
    long l3 = localDate.getTime();
    boolean bool = l3 < l1;
    if (bool)
    {
      l2 = l1;
      localDate.setTime(l1);
      paramCalendar.setTime(localDate);
    }
    int i5 = 0;
    int i6 = 0;
    Object localObject1 = fields;
    n = localObject1.length;
    bool = n;
    if (i6 < n)
    {
      int i7 = 0;
      int k;
      int i8;
      for (;;)
      {
        localObject1 = fields[i6];
        n = localObject1.length;
        bool = n;
        if (i7 >= n) {
          break label691;
        }
        localObject1 = fields[i6];
        k = localObject1[i7];
        n = k;
        i = paramInt1;
        if (k == paramInt1)
        {
          k = 2;
          n = paramInt2;
          i = k;
          if (paramInt2 != k)
          {
            k = 1;
            i = k;
            if ((paramInt2 != k) || (i5 == 0)) {
              break;
            }
          }
          k = 1001;
          n = paramInt1;
          i = k;
          if (paramInt1 == k)
          {
            i = 5;
            k = paramCalendar.get(i);
            m = 1;
            n = k;
            i = m;
            if (k == m)
            {
              k = 5;
              m = 15;
              i = k;
              i8 = m;
              paramCalendar.add(k, m);
              break;
            }
            i = 5;
            i8 = -15;
            paramCalendar.add(i, i8);
            k = 2;
            m = 1;
            i = k;
            i8 = m;
            paramCalendar.add(k, m);
            break;
          }
          k = 9;
          i = k;
          if (paramInt1 == k)
          {
            i = 11;
            k = paramCalendar.get(i);
            if (k == 0)
            {
              k = 11;
              m = 12;
              i = k;
              i8 = m;
              paramCalendar.add(k, m);
              break;
            }
            i = 11;
            i8 = -12;
            paramCalendar.add(i, i8);
            k = 5;
            m = 1;
            i = k;
            i8 = m;
            paramCalendar.add(k, m);
            break;
          }
          localObject1 = fields[i6];
          localObject2 = null;
          k = localObject1[0];
          m = 1;
          i = k;
          i8 = m;
          paramCalendar.add(k, m);
          break;
        }
        i7 += 1;
      }
      label691:
      int i9 = 0;
      int i10 = 0;
      switch (paramInt1)
      {
      default: 
        label724:
        if (i10 == 0)
        {
          k = fields[i6][0];
          i = k;
          int i11 = paramCalendar.getActualMinimum(k);
          k = fields[i6][0];
          i = k;
          int i12 = paramCalendar.getActualMaximum(k);
          localObject1 = fields[i6];
          m = 0;
          localObject2 = null;
          k = localObject1[0];
          i = k;
          i9 = paramCalendar.get(k) - i11;
          k = (i12 - i11) / 2;
          n = k;
          if (i9 <= k) {
            break label1093;
          }
        }
        break;
      }
      label1093:
      for (i5 = 1;; i5 = 0)
      {
        if (i9 != 0)
        {
          localObject1 = fields[i6];
          k = localObject1[0];
          localObject2 = fields[i6];
          m = localObject2[0];
          i = m;
          m = paramCalendar.get(m) - i9;
          i = k;
          i8 = m;
          paramCalendar.set(k, m);
        }
        i6 += 1;
        break;
        localObject1 = fields[i6];
        localObject2 = null;
        k = localObject1[0];
        m = 5;
        n = k;
        i = m;
        if (k != m) {
          break label724;
        }
        i = 5;
        i9 = paramCalendar.get(i) + -1;
        k = 15;
        n = k;
        if (i9 >= k) {
          i9 += -15;
        }
        k = 7;
        n = k;
        if (i9 > k) {}
        for (i5 = 1;; i5 = 0)
        {
          i10 = 1;
          break;
        }
        localObject1 = fields[i6];
        localObject2 = null;
        k = localObject1[0];
        m = 11;
        n = k;
        i = m;
        if (k != m) {
          break label724;
        }
        i = 11;
        i9 = paramCalendar.get(i);
        k = 12;
        n = k;
        if (i9 >= k) {
          i9 += -12;
        }
        k = 6;
        n = k;
        if (i9 >= k) {}
        for (i5 = 1;; i5 = 0)
        {
          i10 = 1;
          break;
        }
      }
    }
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    localObject2 = ((StringBuffer)localObject2).append("The field ");
    i = paramInt1;
    localObject2 = paramInt1 + " is not supported";
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public static Date parseDate(String paramString, String[] paramArrayOfString)
  {
    return parseDateWithLeniency(paramString, paramArrayOfString, true);
  }
  
  public static Date parseDateStrictly(String paramString, String[] paramArrayOfString)
  {
    return parseDateWithLeniency(paramString, paramArrayOfString, false);
  }
  
  private static Date parseDateWithLeniency(String paramString, String[] paramArrayOfString, boolean paramBoolean)
  {
    if ((paramString == null) || (paramArrayOfString == null))
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Date and Patterns must not be null");
      throw ((Throwable)localObject1);
    }
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>();
    localSimpleDateFormat.setLenient(paramBoolean);
    ParsePosition localParsePosition = new java/text/ParsePosition;
    localParsePosition.<init>(0);
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfString.length;
      if (i >= j) {
        break;
      }
      String str1 = paramArrayOfString[i];
      localObject1 = paramArrayOfString[i];
      localObject2 = "ZZ";
      boolean bool1 = ((String)localObject1).endsWith((String)localObject2);
      if (bool1)
      {
        int k = str1.length() + -1;
        str1 = str1.substring(0, k);
      }
      localSimpleDateFormat.applyPattern(str1);
      localParsePosition.setIndex(0);
      String str2 = paramString;
      localObject1 = paramArrayOfString[i];
      localObject2 = "ZZ";
      boolean bool2 = ((String)localObject1).endsWith((String)localObject2);
      if (bool2) {
        for (int n = indexOfSignChars(paramString, 0); n >= 0; n = indexOfSignChars(str2, n))
        {
          str2 = reformatTimezone(str2, n);
          n += 1;
        }
      }
      Date localDate = localSimpleDateFormat.parse(str2, localParsePosition);
      if (localDate != null)
      {
        int m = localParsePosition.getIndex();
        int i1 = str2.length();
        if (m == i1) {
          return localDate;
        }
      }
      i += 1;
    }
    Object localObject1 = new java/text/ParseException;
    Object localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    localObject2 = "Unable to parse the date: " + paramString;
    ((ParseException)localObject1).<init>((String)localObject2, -1);
    throw ((Throwable)localObject1);
  }
  
  private static String reformatTimezone(String paramString, int paramInt)
  {
    String str1 = paramString;
    if (paramInt >= 0)
    {
      int i = paramInt + 5;
      int n = paramString.length();
      if (i < n)
      {
        i = paramInt + 1;
        boolean bool1 = Character.isDigit(paramString.charAt(i));
        if (bool1)
        {
          int j = paramInt + 2;
          boolean bool2 = Character.isDigit(paramString.charAt(j));
          if (bool2)
          {
            int k = paramInt + 3;
            k = paramString.charAt(k);
            n = 58;
            if (k == n)
            {
              k = paramInt + 4;
              boolean bool3 = Character.isDigit(paramString.charAt(k));
              if (bool3)
              {
                int m = paramInt + 5;
                boolean bool4 = Character.isDigit(paramString.charAt(m));
                if (bool4)
                {
                  StringBuffer localStringBuffer = new java/lang/StringBuffer;
                  localStringBuffer.<init>();
                  int i1 = paramInt + 3;
                  String str2 = paramString.substring(0, i1);
                  localStringBuffer = localStringBuffer.append(str2);
                  n = paramInt + 4;
                  str2 = paramString.substring(n);
                  localStringBuffer = localStringBuffer.append(str2);
                  str1 = localStringBuffer.toString();
                }
              }
            }
          }
        }
      }
    }
    return str1;
  }
  
  public static Calendar round(Calendar paramCalendar, int paramInt)
  {
    if (paramCalendar == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    Calendar localCalendar = (Calendar)paramCalendar.clone();
    modify(localCalendar, paramInt, 1);
    return localCalendar;
  }
  
  public static Date round(Object paramObject, int paramInt)
  {
    if (paramObject == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The date must not be null");
      throw ((Throwable)localObject1);
    }
    boolean bool = paramObject instanceof Date;
    if (bool) {
      paramObject = (Date)paramObject;
    }
    for (Object localObject1 = round((Date)paramObject, paramInt);; localObject1 = round((Calendar)paramObject, paramInt).getTime())
    {
      return (Date)localObject1;
      bool = paramObject instanceof Calendar;
      if (!bool) {
        break;
      }
      paramObject = (Calendar)paramObject;
    }
    localObject1 = new java/lang/ClassCastException;
    Object localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    localObject2 = "Could not round " + paramObject;
    ((ClassCastException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public static Date round(Date paramDate, int paramInt)
  {
    if (paramDate == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTime(paramDate);
    modify(localCalendar, paramInt, 1);
    return localCalendar.getTime();
  }
  
  private static Date set(Date paramDate, int paramInt1, int paramInt2)
  {
    if (paramDate == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setLenient(false);
    localCalendar.setTime(paramDate);
    localCalendar.set(paramInt1, paramInt2);
    return localCalendar.getTime();
  }
  
  public static Date setDays(Date paramDate, int paramInt)
  {
    return set(paramDate, 5, paramInt);
  }
  
  public static Date setHours(Date paramDate, int paramInt)
  {
    return set(paramDate, 11, paramInt);
  }
  
  public static Date setMilliseconds(Date paramDate, int paramInt)
  {
    return set(paramDate, 14, paramInt);
  }
  
  public static Date setMinutes(Date paramDate, int paramInt)
  {
    return set(paramDate, 12, paramInt);
  }
  
  public static Date setMonths(Date paramDate, int paramInt)
  {
    return set(paramDate, 2, paramInt);
  }
  
  public static Date setSeconds(Date paramDate, int paramInt)
  {
    return set(paramDate, 13, paramInt);
  }
  
  public static Date setYears(Date paramDate, int paramInt)
  {
    return set(paramDate, 1, paramInt);
  }
  
  public static Calendar truncate(Calendar paramCalendar, int paramInt)
  {
    if (paramCalendar == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    Calendar localCalendar = (Calendar)paramCalendar.clone();
    modify(localCalendar, paramInt, 0);
    return localCalendar;
  }
  
  public static Date truncate(Object paramObject, int paramInt)
  {
    if (paramObject == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The date must not be null");
      throw ((Throwable)localObject1);
    }
    boolean bool = paramObject instanceof Date;
    if (bool) {
      paramObject = (Date)paramObject;
    }
    for (Object localObject1 = truncate((Date)paramObject, paramInt);; localObject1 = truncate((Calendar)paramObject, paramInt).getTime())
    {
      return (Date)localObject1;
      bool = paramObject instanceof Calendar;
      if (!bool) {
        break;
      }
      paramObject = (Calendar)paramObject;
    }
    localObject1 = new java/lang/ClassCastException;
    Object localObject2 = new java/lang/StringBuffer;
    ((StringBuffer)localObject2).<init>();
    localObject2 = "Could not truncate " + paramObject;
    ((ClassCastException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public static Date truncate(Date paramDate, int paramInt)
  {
    if (paramDate == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The date must not be null");
      throw localIllegalArgumentException;
    }
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.setTime(paramDate);
    modify(localCalendar, paramInt, 0);
    return localCalendar.getTime();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/time/DateUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */