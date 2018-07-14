package org.apache.commons.lang.exception;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.NullArgumentException;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;

public class ExceptionUtils
{
  private static String[] CAUSE_METHOD_NAMES;
  private static final Object CAUSE_METHOD_NAMES_LOCK;
  private static final Method THROWABLE_CAUSE_METHOD;
  private static final Method THROWABLE_INITCAUSE_METHOD;
  static final String WRAPPED_MARKER = " [wrapped] ";
  static Class class$java$lang$Throwable;
  
  static
  {
    int i = 1;
    localObject1 = new java/lang/Object;
    localObject1.<init>();
    CAUSE_METHOD_NAMES_LOCK = localObject1;
    int j = 12;
    localObject1 = new String[j];
    localObject1[0] = "getCause";
    localObject2 = "getNextException";
    localObject1[i] = localObject2;
    localObject1[2] = "getTargetException";
    localObject1[3] = "getException";
    localObject1[4] = "getSourceException";
    localObject1[5] = "getRootCause";
    localObject1[6] = "getCausedByException";
    localObject1[7] = "getNested";
    localObject1[8] = "getLinkedException";
    localObject1[9] = "getNestedException";
    localObject1[10] = "getLinkedCause";
    int k = 11;
    String str = "getThrowable";
    localObject1[k] = str;
    CAUSE_METHOD_NAMES = (String[])localObject1;
    for (;;)
    {
      try
      {
        localObject1 = class$java$lang$Throwable;
        if (localObject1 != null) {
          continue;
        }
        localObject1 = "java.lang.Throwable";
        localObject1 = class$((String)localObject1);
        class$java$lang$Throwable = (Class)localObject1;
        localObject2 = "getCause";
        str = null;
        localMethod = ((Class)localObject1).getMethod((String)localObject2, null);
      }
      catch (Exception localException1)
      {
        localMethod = null;
        continue;
        localObject1 = class$java$lang$Throwable;
        localObject2 = localObject1;
        continue;
        localObject1 = class$java$lang$Throwable;
        continue;
      }
      THROWABLE_CAUSE_METHOD = localMethod;
      try
      {
        localObject1 = class$java$lang$Throwable;
        if (localObject1 != null) {
          continue;
        }
        localObject1 = "java.lang.Throwable";
        localObject1 = class$((String)localObject1);
        class$java$lang$Throwable = (Class)localObject1;
        localObject2 = localObject1;
        str = "initCause";
        j = 1;
        Class[] arrayOfClass = new Class[j];
        localObject1 = class$java$lang$Throwable;
        if (localObject1 != null) {
          continue;
        }
        localObject1 = "java.lang.Throwable";
        localObject1 = class$((String)localObject1);
        class$java$lang$Throwable = (Class)localObject1;
        arrayOfClass[0] = localObject1;
        localMethod = ((Class)localObject2).getMethod(str, arrayOfClass);
      }
      catch (Exception localException2)
      {
        localMethod = null;
        continue;
      }
      THROWABLE_INITCAUSE_METHOD = localMethod;
      return;
      localObject1 = class$java$lang$Throwable;
    }
  }
  
  public static void addCauseMethodName(String paramString)
  {
    boolean bool = StringUtils.isNotEmpty(paramString);
    ArrayList localArrayList;
    if (bool)
    {
      bool = isCauseMethodName(paramString);
      if (!bool)
      {
        localArrayList = getCauseMethodNameList();
        bool = localArrayList.add(paramString);
        if (!bool) {}
      }
    }
    synchronized (CAUSE_METHOD_NAMES_LOCK)
    {
      String[] arrayOfString = toArray(localArrayList);
      CAUSE_METHOD_NAMES = arrayOfString;
      return;
    }
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
  
  public static Throwable getCause(Throwable paramThrowable)
  {
    synchronized (CAUSE_METHOD_NAMES_LOCK)
    {
      Object localObject2 = CAUSE_METHOD_NAMES;
      localObject2 = getCause(paramThrowable, (String[])localObject2);
      return (Throwable)localObject2;
    }
  }
  
  public static Throwable getCause(Throwable paramThrowable, String[] paramArrayOfString)
  {
    Throwable localThrowable;
    if (paramThrowable == null) {
      localThrowable = null;
    }
    do
    {
      return localThrowable;
      localThrowable = getCauseUsingWellKnownTypes(paramThrowable);
    } while (localThrowable != null);
    if (paramArrayOfString == null) {}
    for (;;)
    {
      int i;
      synchronized (CAUSE_METHOD_NAMES_LOCK)
      {
        paramArrayOfString = CAUSE_METHOD_NAMES;
        i = 0;
        int j = paramArrayOfString.length;
        if (i < j)
        {
          String str1 = paramArrayOfString[i];
          if (str1 != null)
          {
            localThrowable = getCauseUsingMethodName(paramThrowable, str1);
            if (localThrowable == null) {}
          }
        }
        else
        {
          if (localThrowable != null) {
            break;
          }
          String str2 = "detail";
          localThrowable = getCauseUsingFieldName(paramThrowable, str2);
        }
      }
      i += 1;
    }
  }
  
  private static ArrayList getCauseMethodNameList()
  {
    synchronized (CAUSE_METHOD_NAMES_LOCK)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      Object localObject3 = CAUSE_METHOD_NAMES;
      localObject3 = Arrays.asList((Object[])localObject3);
      localArrayList.<init>((Collection)localObject3);
      return localArrayList;
    }
  }
  
  private static Throwable getCauseUsingFieldName(Throwable paramThrowable, String paramString)
  {
    Field localField = null;
    try
    {
      localObject1 = paramThrowable.getClass();
      localField = ((Class)localObject1).getField(paramString);
    }
    catch (SecurityException localSecurityException)
    {
      Object localObject1;
      boolean bool;
      for (;;) {}
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
    if (localField != null)
    {
      localObject1 = class$java$lang$Throwable;
      if (localObject1 == null)
      {
        localObject1 = class$("java.lang.Throwable");
        class$java$lang$Throwable = (Class)localObject1;
      }
      for (;;)
      {
        Class localClass = localField.getType();
        bool = ((Class)localObject1).isAssignableFrom(localClass);
        if (!bool) {
          break;
        }
        try
        {
          localObject1 = localField.get(paramThrowable);
          localObject1 = (Throwable)localObject1;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          for (;;)
          {
            bool = false;
            Object localObject2 = null;
          }
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          for (;;) {}
        }
        return (Throwable)localObject1;
        localObject1 = class$java$lang$Throwable;
      }
    }
  }
  
  private static Throwable getCauseUsingMethodName(Throwable paramThrowable, String paramString)
  {
    Method localMethod = null;
    try
    {
      localObject1 = paramThrowable.getClass();
      localClass = null;
      localMethod = ((Class)localObject1).getMethod(paramString, null);
    }
    catch (SecurityException localSecurityException)
    {
      Object localObject1;
      Class localClass;
      boolean bool;
      for (;;) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    if (localMethod != null)
    {
      localObject1 = class$java$lang$Throwable;
      if (localObject1 == null)
      {
        localObject1 = class$("java.lang.Throwable");
        class$java$lang$Throwable = (Class)localObject1;
      }
      for (;;)
      {
        localClass = localMethod.getReturnType();
        bool = ((Class)localObject1).isAssignableFrom(localClass);
        if (!bool) {
          break;
        }
        try
        {
          localObject1 = ArrayUtils.EMPTY_OBJECT_ARRAY;
          localObject1 = localMethod.invoke(paramThrowable, (Object[])localObject1);
          localObject1 = (Throwable)localObject1;
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          for (;;)
          {
            bool = false;
            Object localObject2 = null;
          }
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          for (;;) {}
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          for (;;) {}
        }
        return (Throwable)localObject1;
        localObject1 = class$java$lang$Throwable;
      }
    }
  }
  
  private static Throwable getCauseUsingWellKnownTypes(Throwable paramThrowable)
  {
    boolean bool = paramThrowable instanceof Nestable;
    Object localObject;
    if (bool)
    {
      paramThrowable = (Nestable)paramThrowable;
      localObject = paramThrowable.getCause();
    }
    for (;;)
    {
      return (Throwable)localObject;
      bool = paramThrowable instanceof SQLException;
      if (bool)
      {
        paramThrowable = (SQLException)paramThrowable;
        localObject = paramThrowable.getNextException();
      }
      else
      {
        bool = paramThrowable instanceof InvocationTargetException;
        if (bool)
        {
          paramThrowable = (InvocationTargetException)paramThrowable;
          localObject = paramThrowable.getTargetException();
        }
        else
        {
          bool = false;
          localObject = null;
        }
      }
    }
  }
  
  public static String getFullStackTrace(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    PrintWriter localPrintWriter = new java/io/PrintWriter;
    boolean bool1 = true;
    localPrintWriter.<init>(localStringWriter, bool1);
    Throwable[] arrayOfThrowable = getThrowables(paramThrowable);
    int j = 0;
    for (;;)
    {
      int i = arrayOfThrowable.length;
      if (j < i)
      {
        arrayOfThrowable[j].printStackTrace(localPrintWriter);
        Throwable localThrowable = arrayOfThrowable[j];
        boolean bool2 = isNestedThrowable(localThrowable);
        if (!bool2) {}
      }
      else
      {
        return localStringWriter.getBuffer().toString();
      }
      j += 1;
    }
  }
  
  public static String getMessage(Throwable paramThrowable)
  {
    if (paramThrowable == null) {}
    String str3;
    for (Object localObject = "";; localObject = str3)
    {
      return (String)localObject;
      String str1 = ClassUtils.getShortClassName(paramThrowable, null);
      String str2 = paramThrowable.getMessage();
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append(str1).append(": ");
      str3 = StringUtils.defaultString(str2);
    }
  }
  
  public static Throwable getRootCause(Throwable paramThrowable)
  {
    List localList = getThrowableList(paramThrowable);
    int i = localList.size();
    int j = 2;
    if (i < j) {
      i = 0;
    }
    for (Throwable localThrowable = null;; localThrowable = (Throwable)localList.get(i))
    {
      return localThrowable;
      i = localList.size() + -1;
    }
  }
  
  public static String getRootCauseMessage(Throwable paramThrowable)
  {
    Throwable localThrowable = getRootCause(paramThrowable);
    if (localThrowable == null) {
      localThrowable = paramThrowable;
    }
    return getMessage(localThrowable);
  }
  
  public static String[] getRootCauseStackTrace(Throwable paramThrowable)
  {
    if (paramThrowable == null) {}
    ArrayList localArrayList;
    for (Object localObject = ArrayUtils.EMPTY_STRING_ARRAY;; localObject = (String[])localArrayList.toArray((Object[])localObject))
    {
      return (String[])localObject;
      Throwable[] arrayOfThrowable = getThrowables(paramThrowable);
      int i = arrayOfThrowable.length;
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int j = i + -1;
      localObject = arrayOfThrowable[j];
      List localList1 = getStackFrameList((Throwable)localObject);
      int k = i;
      k += -1;
      if (k >= 0)
      {
        List localList2 = localList1;
        if (k != 0)
        {
          j = k + -1;
          localObject = arrayOfThrowable[j];
          localList1 = getStackFrameList((Throwable)localObject);
          removeCommonFrames(localList2, localList1);
        }
        j = i + -1;
        if (k == j)
        {
          localObject = arrayOfThrowable[k].toString();
          localArrayList.add(localObject);
        }
        for (;;)
        {
          int m = 0;
          for (;;)
          {
            j = localList2.size();
            if (m >= j) {
              break;
            }
            localObject = localList2.get(m);
            localArrayList.add(localObject);
            m += 1;
          }
          localObject = new java/lang/StringBuffer;
          ((StringBuffer)localObject).<init>();
          localObject = ((StringBuffer)localObject).append(" [wrapped] ");
          String str = arrayOfThrowable[k].toString();
          localObject = str;
          localArrayList.add(localObject);
        }
      }
      j = 0;
      localObject = new String[0];
    }
  }
  
  static List getStackFrameList(Throwable paramThrowable)
  {
    String str1 = getStackTrace(paramThrowable);
    String str2 = SystemUtils.LINE_SEPARATOR;
    StringTokenizer localStringTokenizer = new java/util/StringTokenizer;
    localStringTokenizer.<init>(str1, str2);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    do
    {
      for (;;)
      {
        boolean bool = localStringTokenizer.hasMoreTokens();
        if (!bool) {
          break label119;
        }
        String str3 = localStringTokenizer.nextToken();
        String str4 = "at";
        int k = str3.indexOf(str4);
        int j = -1;
        if (k == j) {
          break;
        }
        str4 = str3.substring(0, k).trim();
        j = str4.length();
        if (j != 0) {
          break;
        }
        i = 1;
        localArrayList.add(str3);
      }
    } while (i == 0);
    label119:
    return localArrayList;
  }
  
  static String[] getStackFrames(String paramString)
  {
    String str1 = SystemUtils.LINE_SEPARATOR;
    StringTokenizer localStringTokenizer = new java/util/StringTokenizer;
    localStringTokenizer.<init>(paramString, str1);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      boolean bool = localStringTokenizer.hasMoreTokens();
      if (!bool) {
        break;
      }
      String str2 = localStringTokenizer.nextToken();
      localArrayList.add(str2);
    }
    return toArray(localArrayList);
  }
  
  public static String[] getStackFrames(Throwable paramThrowable)
  {
    if (paramThrowable == null) {}
    for (String[] arrayOfString = ArrayUtils.EMPTY_STRING_ARRAY;; arrayOfString = getStackFrames(getStackTrace(paramThrowable))) {
      return arrayOfString;
    }
  }
  
  public static String getStackTrace(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    PrintWriter localPrintWriter = new java/io/PrintWriter;
    localPrintWriter.<init>(localStringWriter, true);
    paramThrowable.printStackTrace(localPrintWriter);
    return localStringWriter.getBuffer().toString();
  }
  
  public static int getThrowableCount(Throwable paramThrowable)
  {
    return getThrowableList(paramThrowable).size();
  }
  
  public static List getThrowableList(Throwable paramThrowable)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    while (paramThrowable != null)
    {
      boolean bool = localArrayList.contains(paramThrowable);
      if (bool) {
        break;
      }
      localArrayList.add(paramThrowable);
      paramThrowable = getCause(paramThrowable);
    }
    return localArrayList;
  }
  
  public static Throwable[] getThrowables(Throwable paramThrowable)
  {
    List localList = getThrowableList(paramThrowable);
    Throwable[] arrayOfThrowable = new Throwable[localList.size()];
    return (Throwable[])localList.toArray(arrayOfThrowable);
  }
  
  private static int indexOf(Throwable paramThrowable, Class paramClass, int paramInt, boolean paramBoolean)
  {
    int i = -1;
    int j;
    if ((paramThrowable == null) || (paramClass == null)) {
      j = i;
    }
    for (;;)
    {
      return j;
      if (paramInt < 0) {
        paramInt = 0;
      }
      Throwable[] arrayOfThrowable = getThrowables(paramThrowable);
      int k = arrayOfThrowable.length;
      if (paramInt >= k)
      {
        j = i;
      }
      else
      {
        Class localClass;
        if (paramBoolean)
        {
          j = paramInt;
          for (;;)
          {
            k = arrayOfThrowable.length;
            if (j >= k) {
              break label146;
            }
            localClass = arrayOfThrowable[j].getClass();
            boolean bool1 = paramClass.isAssignableFrom(localClass);
            if (bool1) {
              break;
            }
            j += 1;
          }
        }
        j = paramInt;
        for (;;)
        {
          int m = arrayOfThrowable.length;
          if (j >= m) {
            break label146;
          }
          localClass = arrayOfThrowable[j].getClass();
          boolean bool2 = paramClass.equals(localClass);
          if (bool2) {
            break;
          }
          j += 1;
        }
        label146:
        j = i;
      }
    }
  }
  
  public static int indexOfThrowable(Throwable paramThrowable, Class paramClass)
  {
    return indexOf(paramThrowable, paramClass, 0, false);
  }
  
  public static int indexOfThrowable(Throwable paramThrowable, Class paramClass, int paramInt)
  {
    return indexOf(paramThrowable, paramClass, paramInt, false);
  }
  
  public static int indexOfType(Throwable paramThrowable, Class paramClass)
  {
    return indexOf(paramThrowable, paramClass, 0, true);
  }
  
  public static int indexOfType(Throwable paramThrowable, Class paramClass, int paramInt)
  {
    return indexOf(paramThrowable, paramClass, paramInt, true);
  }
  
  public static boolean isCauseMethodName(String paramString)
  {
    synchronized (CAUSE_METHOD_NAMES_LOCK)
    {
      String[] arrayOfString = CAUSE_METHOD_NAMES;
      int i = ArrayUtils.indexOf(arrayOfString, paramString);
      if (i >= 0)
      {
        i = 1;
        return i;
      }
      int j = 0;
      arrayOfString = null;
    }
  }
  
  /* Error */
  public static boolean isNestedThrowable(Throwable paramThrowable)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_1
    //   5: istore_3
    //   6: aload_0
    //   7: ifnonnull +5 -> 12
    //   10: iload_1
    //   11: ireturn
    //   12: aload_0
    //   13: instanceof 202
    //   16: istore 4
    //   18: iload 4
    //   20: ifeq +8 -> 28
    //   23: iload_3
    //   24: istore_1
    //   25: goto -15 -> 10
    //   28: aload_0
    //   29: instanceof 207
    //   32: istore 4
    //   34: iload 4
    //   36: ifeq +8 -> 44
    //   39: iload_3
    //   40: istore_1
    //   41: goto -31 -> 10
    //   44: aload_0
    //   45: instanceof 200
    //   48: istore 4
    //   50: iload 4
    //   52: ifeq +8 -> 60
    //   55: iload_3
    //   56: istore_1
    //   57: goto -47 -> 10
    //   60: invokestatic 354	org/apache/commons/lang/exception/ExceptionUtils:isThrowableNested	()Z
    //   63: istore 4
    //   65: iload 4
    //   67: ifeq +8 -> 75
    //   70: iload_3
    //   71: istore_1
    //   72: goto -62 -> 10
    //   75: aload_0
    //   76: invokevirtual 154	java/lang/Object:getClass	()Ljava/lang/Class;
    //   79: astore 5
    //   81: getstatic 25	org/apache/commons/lang/exception/ExceptionUtils:CAUSE_METHOD_NAMES_LOCK	Ljava/lang/Object;
    //   84: astore 6
    //   86: aload 6
    //   88: monitorenter
    //   89: iconst_0
    //   90: istore 7
    //   92: getstatic 64	org/apache/commons/lang/exception/ExceptionUtils:CAUSE_METHOD_NAMES	[Ljava/lang/String;
    //   95: astore 8
    //   97: aload 8
    //   99: arraylength
    //   100: istore 9
    //   102: iload 7
    //   104: iload 9
    //   106: if_icmpge +107 -> 213
    //   109: getstatic 64	org/apache/commons/lang/exception/ExceptionUtils:CAUSE_METHOD_NAMES	[Ljava/lang/String;
    //   112: astore 8
    //   114: aload 8
    //   116: iload 7
    //   118: aaload
    //   119: astore 8
    //   121: aconst_null
    //   122: astore 10
    //   124: aload 5
    //   126: aload 8
    //   128: aconst_null
    //   129: invokevirtual 78	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   132: astore 11
    //   134: aload 11
    //   136: ifnull +68 -> 204
    //   139: getstatic 66	org/apache/commons/lang/exception/ExceptionUtils:class$java$lang$Throwable	Ljava/lang/Class;
    //   142: astore 8
    //   144: aload 8
    //   146: ifnonnull +48 -> 194
    //   149: ldc 68
    //   151: astore 8
    //   153: aload 8
    //   155: invokestatic 72	org/apache/commons/lang/exception/ExceptionUtils:class$	(Ljava/lang/String;)Ljava/lang/Class;
    //   158: astore 8
    //   160: aload 8
    //   162: putstatic 66	org/apache/commons/lang/exception/ExceptionUtils:class$java$lang$Throwable	Ljava/lang/Class;
    //   165: aload 11
    //   167: invokevirtual 186	java/lang/reflect/Method:getReturnType	()Ljava/lang/Class;
    //   170: astore 10
    //   172: aload 8
    //   174: aload 10
    //   176: invokevirtual 167	java/lang/Class:isAssignableFrom	(Ljava/lang/Class;)Z
    //   179: istore 4
    //   181: iload 4
    //   183: ifeq +21 -> 204
    //   186: aload 6
    //   188: monitorexit
    //   189: iload_3
    //   190: istore_1
    //   191: goto -181 -> 10
    //   194: getstatic 66	org/apache/commons/lang/exception/ExceptionUtils:class$java$lang$Throwable	Ljava/lang/Class;
    //   197: astore 8
    //   199: goto -34 -> 165
    //   202: astore 8
    //   204: iload 7
    //   206: iconst_1
    //   207: iadd
    //   208: istore 7
    //   210: goto -108 -> 102
    //   213: aload 6
    //   215: monitorexit
    //   216: ldc -120
    //   218: astore 8
    //   220: aload 5
    //   222: aload 8
    //   224: invokevirtual 158	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   227: astore 12
    //   229: aload 12
    //   231: ifnull -221 -> 10
    //   234: iload_3
    //   235: istore_1
    //   236: goto -226 -> 10
    //   239: astore_2
    //   240: aload 6
    //   242: monitorexit
    //   243: aload_2
    //   244: athrow
    //   245: pop
    //   246: goto -236 -> 10
    //   249: pop
    //   250: goto -240 -> 10
    //   253: astore 8
    //   255: goto -51 -> 204
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	258	0	paramThrowable	Throwable
    //   1	235	1	bool1	boolean
    //   3	1	2	localObject1	Object
    //   239	5	2	localObject2	Object
    //   5	230	3	bool2	boolean
    //   16	166	4	bool3	boolean
    //   79	142	5	localClass1	Class
    //   84	157	6	localObject3	Object
    //   90	119	7	i	int
    //   95	103	8	localObject4	Object
    //   202	1	8	localSecurityException1	SecurityException
    //   218	5	8	str	String
    //   253	1	8	localNoSuchMethodException	NoSuchMethodException
    //   100	7	9	j	int
    //   122	53	10	localClass2	Class
    //   132	34	11	localMethod	Method
    //   227	3	12	localField	Field
    //   245	1	17	localSecurityException2	SecurityException
    //   249	1	18	localNoSuchFieldException	NoSuchFieldException
    // Exception table:
    //   from	to	target	type
    //   109	112	202	java/lang/SecurityException
    //   116	119	202	java/lang/SecurityException
    //   128	132	202	java/lang/SecurityException
    //   139	142	202	java/lang/SecurityException
    //   153	158	202	java/lang/SecurityException
    //   160	165	202	java/lang/SecurityException
    //   165	170	202	java/lang/SecurityException
    //   174	179	202	java/lang/SecurityException
    //   194	197	202	java/lang/SecurityException
    //   92	95	239	finally
    //   97	100	239	finally
    //   109	112	239	finally
    //   116	119	239	finally
    //   128	132	239	finally
    //   139	142	239	finally
    //   153	158	239	finally
    //   160	165	239	finally
    //   165	170	239	finally
    //   174	179	239	finally
    //   186	189	239	finally
    //   194	197	239	finally
    //   213	216	239	finally
    //   240	243	239	finally
    //   222	227	245	java/lang/SecurityException
    //   222	227	249	java/lang/NoSuchFieldException
    //   109	112	253	java/lang/NoSuchMethodException
    //   116	119	253	java/lang/NoSuchMethodException
    //   128	132	253	java/lang/NoSuchMethodException
    //   139	142	253	java/lang/NoSuchMethodException
    //   153	158	253	java/lang/NoSuchMethodException
    //   160	165	253	java/lang/NoSuchMethodException
    //   165	170	253	java/lang/NoSuchMethodException
    //   174	179	253	java/lang/NoSuchMethodException
    //   194	197	253	java/lang/NoSuchMethodException
  }
  
  public static boolean isThrowableNested()
  {
    Method localMethod = THROWABLE_CAUSE_METHOD;
    boolean bool;
    if (localMethod != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMethod = null;
    }
  }
  
  public static void printRootCauseStackTrace(Throwable paramThrowable)
  {
    PrintStream localPrintStream = System.err;
    printRootCauseStackTrace(paramThrowable, localPrintStream);
  }
  
  public static void printRootCauseStackTrace(Throwable paramThrowable, PrintStream paramPrintStream)
  {
    if (paramThrowable == null) {}
    for (;;)
    {
      return;
      IllegalArgumentException localIllegalArgumentException;
      if (paramPrintStream == null)
      {
        localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("The PrintStream must not be null");
        throw localIllegalArgumentException;
      }
      String[] arrayOfString = getRootCauseStackTrace(paramThrowable);
      int i = 0;
      for (;;)
      {
        int j = arrayOfString.length;
        if (i >= j) {
          break;
        }
        localIllegalArgumentException = arrayOfString[i];
        paramPrintStream.println(localIllegalArgumentException);
        i += 1;
      }
      paramPrintStream.flush();
    }
  }
  
  public static void printRootCauseStackTrace(Throwable paramThrowable, PrintWriter paramPrintWriter)
  {
    if (paramThrowable == null) {}
    for (;;)
    {
      return;
      IllegalArgumentException localIllegalArgumentException;
      if (paramPrintWriter == null)
      {
        localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localIllegalArgumentException.<init>("The PrintWriter must not be null");
        throw localIllegalArgumentException;
      }
      String[] arrayOfString = getRootCauseStackTrace(paramThrowable);
      int i = 0;
      for (;;)
      {
        int j = arrayOfString.length;
        if (i >= j) {
          break;
        }
        localIllegalArgumentException = arrayOfString[i];
        paramPrintWriter.println(localIllegalArgumentException);
        i += 1;
      }
      paramPrintWriter.flush();
    }
  }
  
  public static void removeCauseMethodName(String paramString)
  {
    boolean bool = StringUtils.isNotEmpty(paramString);
    ArrayList localArrayList;
    if (bool)
    {
      localArrayList = getCauseMethodNameList();
      bool = localArrayList.remove(paramString);
      if (!bool) {}
    }
    synchronized (CAUSE_METHOD_NAMES_LOCK)
    {
      String[] arrayOfString = toArray(localArrayList);
      CAUSE_METHOD_NAMES = arrayOfString;
      return;
    }
  }
  
  public static void removeCommonFrames(List paramList1, List paramList2)
  {
    if ((paramList1 == null) || (paramList2 == null))
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("The List must not be null");
      throw localIllegalArgumentException;
    }
    int i = paramList1.size() + -1;
    int j = paramList2.size();
    int k = j + -1;
    while ((i >= 0) && (k >= 0))
    {
      String str1 = (String)paramList1.get(i);
      String str2 = (String)paramList2.get(k);
      boolean bool = str1.equals(str2);
      if (bool) {
        paramList1.remove(i);
      }
      i += -1;
      k += -1;
    }
  }
  
  public static boolean setCause(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    int i = 1;
    int j = 0;
    Object localObject = null;
    if (paramThrowable1 == null)
    {
      localObject = new org/apache/commons/lang/NullArgumentException;
      ((NullArgumentException)localObject).<init>("target");
      throw ((Throwable)localObject);
    }
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = paramThrowable2;
    boolean bool = false;
    localObject = THROWABLE_INITCAUSE_METHOD;
    if (localObject != null) {}
    for (;;)
    {
      try
      {
        localObject = THROWABLE_INITCAUSE_METHOD;
        ((Method)localObject).invoke(paramThrowable1, arrayOfObject);
        bool = true;
      }
      catch (InvocationTargetException localInvocationTargetException2)
      {
        Class localClass;
        String str;
        Class[] arrayOfClass;
        Method localMethod;
        continue;
      }
      catch (IllegalAccessException localIllegalAccessException2)
      {
        continue;
      }
      try
      {
        localClass = paramThrowable1.getClass();
        str = "setCause";
        j = 1;
        arrayOfClass = new Class[j];
        localObject = class$java$lang$Throwable;
        if (localObject != null) {
          continue;
        }
        localObject = "java.lang.Throwable";
        localObject = class$((String)localObject);
        class$java$lang$Throwable = (Class)localObject;
        arrayOfClass[0] = localObject;
        localMethod = localClass.getMethod(str, arrayOfClass);
        localMethod.invoke(paramThrowable1, arrayOfObject);
        bool = true;
      }
      catch (InvocationTargetException localInvocationTargetException1)
      {
        continue;
      }
      catch (IllegalAccessException localIllegalAccessException1)
      {
        continue;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        continue;
      }
      return bool;
      localObject = class$java$lang$Throwable;
    }
  }
  
  private static String[] toArray(List paramList)
  {
    String[] arrayOfString = new String[paramList.size()];
    return (String[])paramList.toArray(arrayOfString);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/exception/ExceptionUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */