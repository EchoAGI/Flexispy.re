package org.apache.commons.lang.exception;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NestableDelegate
  implements Serializable
{
  private static final transient String MUST_BE_THROWABLE = "The Nestable implementation passed to the NestableDelegate(Nestable) constructor must extend java.lang.Throwable";
  static Class class$org$apache$commons$lang$exception$Nestable;
  public static boolean matchSubclasses = false;
  private static final long serialVersionUID = 1L;
  public static boolean topDown;
  public static boolean trimStackFrames;
  private Throwable nestable;
  
  static
  {
    boolean bool = true;
    topDown = bool;
    trimStackFrames = bool;
    matchSubclasses = bool;
  }
  
  public NestableDelegate(Nestable paramNestable)
  {
    IllegalArgumentException localIllegalArgumentException = null;
    this.nestable = null;
    boolean bool = paramNestable instanceof Throwable;
    if (bool)
    {
      paramNestable = (Throwable)paramNestable;
      this.nestable = paramNestable;
      return;
    }
    localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("The Nestable implementation passed to the NestableDelegate(Nestable) constructor must extend java.lang.Throwable");
    throw localIllegalArgumentException;
  }
  
  static Class class$(String paramString)
  {
    try
    {
      return Class.forName(paramString);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      NoClassDefFoundError localNoClassDefFoundError = new java/lang/NoClassDefFoundError;
      String str = localClassNotFoundException.getMessage();
      localNoClassDefFoundError.<init>(str);
      throw localNoClassDefFoundError;
    }
  }
  
  public String getMessage(int paramInt)
  {
    Object localObject1 = getThrowable(paramInt);
    Object localObject2 = class$org$apache$commons$lang$exception$Nestable;
    if (localObject2 == null)
    {
      localObject2 = class$("org.apache.commons.lang.exception.Nestable");
      class$org$apache$commons$lang$exception$Nestable = (Class)localObject2;
      boolean bool = ((Class)localObject2).isInstance(localObject1);
      if (!bool) {
        break label61;
      }
      localObject1 = (Nestable)localObject1;
      bool = false;
    }
    label61:
    for (localObject2 = ((Nestable)localObject1).getMessage(0);; localObject2 = ((Throwable)localObject1).getMessage())
    {
      return (String)localObject2;
      localObject2 = class$org$apache$commons$lang$exception$Nestable;
      break;
    }
  }
  
  public String getMessage(String paramString)
  {
    Object localObject = this.nestable;
    Throwable localThrowable = ExceptionUtils.getCause((Throwable)localObject);
    String str1;
    if (localThrowable == null)
    {
      str1 = null;
      if ((localThrowable != null) && (str1 != null)) {
        break label41;
      }
      str1 = paramString;
    }
    for (;;)
    {
      return str1;
      str1 = localThrowable.getMessage();
      break;
      label41:
      if (paramString != null)
      {
        localObject = new java/lang/StringBuffer;
        ((StringBuffer)localObject).<init>();
        localObject = ((StringBuffer)localObject).append(paramString);
        String str2 = ": ";
        localObject = ((StringBuffer)localObject).append(str2).append(str1);
        str1 = ((StringBuffer)localObject).toString();
      }
    }
  }
  
  public String[] getMessages()
  {
    Throwable[] arrayOfThrowable = getThrowables();
    int i = arrayOfThrowable.length;
    String[] arrayOfString = new String[i];
    int j = 0;
    i = arrayOfThrowable.length;
    if (j < i)
    {
      Object localObject = class$org$apache$commons$lang$exception$Nestable;
      if (localObject == null)
      {
        localObject = class$("org.apache.commons.lang.exception.Nestable");
        class$org$apache$commons$lang$exception$Nestable = (Class)localObject;
        label47:
        Throwable localThrowable = arrayOfThrowable[j];
        boolean bool = ((Class)localObject).isInstance(localThrowable);
        if (!bool) {
          break label110;
        }
        localObject = (Nestable)arrayOfThrowable[j];
        localThrowable = null;
      }
      label110:
      for (localObject = ((Nestable)localObject).getMessage(0);; localObject = arrayOfThrowable[j].getMessage())
      {
        arrayOfString[j] = localObject;
        j += 1;
        break;
        localObject = class$org$apache$commons$lang$exception$Nestable;
        break label47;
      }
    }
    return arrayOfString;
  }
  
  protected String[] getStackFrames(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    PrintWriter localPrintWriter = new java/io/PrintWriter;
    localPrintWriter.<init>(localStringWriter, true);
    boolean bool = paramThrowable instanceof Nestable;
    if (bool)
    {
      paramThrowable = (Nestable)paramThrowable;
      paramThrowable.printPartialStackTrace(localPrintWriter);
    }
    for (;;)
    {
      return ExceptionUtils.getStackFrames(localStringWriter.getBuffer().toString());
      paramThrowable.printStackTrace(localPrintWriter);
    }
  }
  
  public Throwable getThrowable(int paramInt)
  {
    if (paramInt == 0) {}
    Throwable[] arrayOfThrowable;
    for (Throwable localThrowable = this.nestable;; localThrowable = arrayOfThrowable[paramInt])
    {
      return localThrowable;
      arrayOfThrowable = getThrowables();
    }
  }
  
  public int getThrowableCount()
  {
    return ExceptionUtils.getThrowableCount(this.nestable);
  }
  
  public Throwable[] getThrowables()
  {
    return ExceptionUtils.getThrowables(this.nestable);
  }
  
  public int indexOfThrowable(Class paramClass, int paramInt)
  {
    int i = -1;
    int j;
    if (paramClass == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      IndexOutOfBoundsException localIndexOutOfBoundsException;
      if (paramInt < 0)
      {
        localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
        localObject = new java/lang/StringBuffer;
        ((StringBuffer)localObject).<init>();
        localObject = "The start index was out of bounds: " + paramInt;
        localIndexOutOfBoundsException.<init>((String)localObject);
        throw localIndexOutOfBoundsException;
      }
      Object localObject = this.nestable;
      Throwable[] arrayOfThrowable = ExceptionUtils.getThrowables((Throwable)localObject);
      int k = arrayOfThrowable.length;
      if (paramInt >= k)
      {
        localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
        localObject = new java/lang/StringBuffer;
        ((StringBuffer)localObject).<init>();
        localObject = ((StringBuffer)localObject).append("The start index was out of bounds: ").append(paramInt).append(" >= ");
        int i1 = arrayOfThrowable.length;
        localObject = i1;
        localIndexOutOfBoundsException.<init>((String)localObject);
        throw localIndexOutOfBoundsException;
      }
      boolean bool1 = matchSubclasses;
      if (bool1)
      {
        j = paramInt;
        for (;;)
        {
          int m = arrayOfThrowable.length;
          if (j >= m) {
            break label245;
          }
          localObject = arrayOfThrowable[j].getClass();
          boolean bool2 = paramClass.isAssignableFrom((Class)localObject);
          if (bool2) {
            break;
          }
          j += 1;
        }
      }
      j = paramInt;
      for (;;)
      {
        int n = arrayOfThrowable.length;
        if (j >= n) {
          break label245;
        }
        localObject = arrayOfThrowable[j].getClass();
        boolean bool3 = paramClass.equals(localObject);
        if (bool3) {
          break;
        }
        j += 1;
      }
      label245:
      j = i;
    }
  }
  
  public void printStackTrace()
  {
    PrintStream localPrintStream = System.err;
    printStackTrace(localPrintStream);
  }
  
  public void printStackTrace(PrintStream paramPrintStream)
  {
    try
    {
      PrintWriter localPrintWriter = new java/io/PrintWriter;
      Object localObject1 = null;
      localPrintWriter.<init>(paramPrintStream, false);
      printStackTrace(localPrintWriter);
      localPrintWriter.flush();
      return;
    }
    finally {}
  }
  
  public void printStackTrace(PrintWriter paramPrintWriter)
  {
    Throwable localThrowable = this.nestable;
    boolean bool = ExceptionUtils.isThrowableNested();
    Object localObject1;
    if (bool)
    {
      bool = localThrowable instanceof Nestable;
      if (bool)
      {
        localObject1 = localThrowable;
        localObject1 = (Nestable)localThrowable;
        ((Nestable)localObject1).printPartialStackTrace(paramPrintWriter);
      }
    }
    for (;;)
    {
      return;
      localThrowable.printStackTrace(paramPrintWriter);
      continue;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject3;
      while (localThrowable != null)
      {
        localObject3 = getStackFrames(localThrowable);
        localArrayList.add(localObject3);
        localThrowable = ExceptionUtils.getCause(localThrowable);
      }
      String str = "Caused by: ";
      bool = topDown;
      if (!bool)
      {
        str = "Rethrown as: ";
        Collections.reverse(localArrayList);
      }
      bool = trimStackFrames;
      if (bool) {
        trimStackFrames(localArrayList);
      }
      try
      {
        Iterator localIterator = localArrayList.iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject1 = localIterator.next();
          localObject1 = (String[])localObject1;
          Object localObject4 = localObject1;
          localObject4 = (String[])localObject1;
          localObject3 = localObject4;
          int i = 0;
          int j = localObject4.length;
          while (i < j)
          {
            localObject1 = localObject3[i];
            paramPrintWriter.println((String)localObject1);
            i += 1;
          }
          bool = localIterator.hasNext();
          if (bool) {
            paramPrintWriter.print(str);
          }
        }
      }
      finally {}
    }
  }
  
  protected void trimStackFrames(List paramList)
  {
    int i = paramList.size();
    int j = i + -1;
    while (j > 0)
    {
      Object localObject1 = (String[])paramList.get(j);
      Object localObject2 = localObject1;
      localObject2 = (String[])localObject1;
      int k = j + -1;
      localObject1 = (String[])paramList.get(k);
      Object localObject3 = localObject1;
      localObject3 = (String[])localObject1;
      ArrayList localArrayList1 = new java/util/ArrayList;
      localObject1 = Arrays.asList((Object[])localObject2);
      localArrayList1.<init>((Collection)localObject1);
      ArrayList localArrayList2 = new java/util/ArrayList;
      localObject1 = Arrays.asList((Object[])localObject3);
      localArrayList2.<init>((Collection)localObject1);
      ExceptionUtils.removeCommonFrames(localArrayList1, localArrayList2);
      k = localObject2.length;
      int m = localArrayList1.size();
      int n = k - m;
      if (n > 0)
      {
        localObject1 = new java/lang/StringBuffer;
        ((StringBuffer)localObject1).<init>();
        localObject1 = ((StringBuffer)localObject1).append("\t... ").append(n);
        String str = " more";
        localObject1 = str;
        localArrayList1.add(localObject1);
        k = localArrayList1.size();
        localObject1 = new String[k];
        localObject1 = localArrayList1.toArray((Object[])localObject1);
        paramList.set(j, localObject1);
      }
      j += -1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/exception/NestableDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */