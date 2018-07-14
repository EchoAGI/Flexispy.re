package org.apache.commons.lang;

import java.io.File;
import java.io.PrintStream;

public class SystemUtils
{
  public static final String AWT_TOOLKIT;
  public static final String FILE_ENCODING;
  public static final String FILE_SEPARATOR;
  public static final boolean IS_JAVA_1_1 = false;
  public static final boolean IS_JAVA_1_2 = false;
  public static final boolean IS_JAVA_1_3 = false;
  public static final boolean IS_JAVA_1_4 = false;
  public static final boolean IS_JAVA_1_5 = false;
  public static final boolean IS_JAVA_1_6 = false;
  public static final boolean IS_JAVA_1_7 = false;
  public static final boolean IS_OS_AIX = false;
  public static final boolean IS_OS_HP_UX = false;
  public static final boolean IS_OS_IRIX = false;
  public static final boolean IS_OS_LINUX = false;
  public static final boolean IS_OS_MAC = false;
  public static final boolean IS_OS_MAC_OSX = false;
  public static final boolean IS_OS_OS2 = false;
  public static final boolean IS_OS_SOLARIS = false;
  public static final boolean IS_OS_SUN_OS = false;
  public static final boolean IS_OS_UNIX = false;
  public static final boolean IS_OS_WINDOWS = false;
  public static final boolean IS_OS_WINDOWS_2000 = false;
  public static final boolean IS_OS_WINDOWS_7 = false;
  public static final boolean IS_OS_WINDOWS_95 = false;
  public static final boolean IS_OS_WINDOWS_98 = false;
  public static final boolean IS_OS_WINDOWS_ME = false;
  public static final boolean IS_OS_WINDOWS_NT = false;
  public static final boolean IS_OS_WINDOWS_VISTA = false;
  public static final boolean IS_OS_WINDOWS_XP = false;
  public static final String JAVA_AWT_FONTS;
  public static final String JAVA_AWT_GRAPHICSENV;
  public static final String JAVA_AWT_HEADLESS;
  public static final String JAVA_AWT_PRINTERJOB;
  public static final String JAVA_CLASS_PATH;
  public static final String JAVA_CLASS_VERSION;
  public static final String JAVA_COMPILER;
  public static final String JAVA_ENDORSED_DIRS;
  public static final String JAVA_EXT_DIRS;
  public static final String JAVA_HOME;
  private static final String JAVA_HOME_KEY = "java.home";
  public static final String JAVA_IO_TMPDIR;
  private static final String JAVA_IO_TMPDIR_KEY = "java.io.tmpdir";
  public static final String JAVA_LIBRARY_PATH;
  public static final String JAVA_RUNTIME_NAME;
  public static final String JAVA_RUNTIME_VERSION;
  public static final String JAVA_SPECIFICATION_NAME;
  public static final String JAVA_SPECIFICATION_VENDOR;
  public static final String JAVA_SPECIFICATION_VERSION;
  public static final String JAVA_UTIL_PREFS_PREFERENCES_FACTORY;
  public static final String JAVA_VENDOR;
  public static final String JAVA_VENDOR_URL;
  public static final String JAVA_VERSION;
  public static final float JAVA_VERSION_FLOAT = 0.0F;
  public static final int JAVA_VERSION_INT = 0;
  public static final String JAVA_VERSION_TRIMMED;
  public static final String JAVA_VM_INFO;
  public static final String JAVA_VM_NAME;
  public static final String JAVA_VM_SPECIFICATION_NAME;
  public static final String JAVA_VM_SPECIFICATION_VENDOR;
  public static final String JAVA_VM_SPECIFICATION_VERSION;
  public static final String JAVA_VM_VENDOR;
  public static final String JAVA_VM_VERSION;
  public static final String LINE_SEPARATOR;
  public static final String OS_ARCH;
  public static final String OS_NAME;
  private static final String OS_NAME_WINDOWS_PREFIX = "Windows";
  public static final String OS_VERSION;
  public static final String PATH_SEPARATOR;
  public static final String USER_COUNTRY;
  public static final String USER_DIR;
  private static final String USER_DIR_KEY = "user.dir";
  public static final String USER_HOME;
  private static final String USER_HOME_KEY = "user.home";
  public static final String USER_LANGUAGE;
  public static final String USER_NAME;
  public static final String USER_TIMEZONE;
  
  static
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    AWT_TOOLKIT = getSystemProperty("awt.toolkit");
    FILE_ENCODING = getSystemProperty("file.encoding");
    FILE_SEPARATOR = getSystemProperty("file.separator");
    JAVA_AWT_FONTS = getSystemProperty("java.awt.fonts");
    JAVA_AWT_GRAPHICSENV = getSystemProperty("java.awt.graphicsenv");
    JAVA_AWT_HEADLESS = getSystemProperty("java.awt.headless");
    JAVA_AWT_PRINTERJOB = getSystemProperty("java.awt.printerjob");
    JAVA_CLASS_PATH = getSystemProperty("java.class.path");
    JAVA_CLASS_VERSION = getSystemProperty("java.class.version");
    JAVA_COMPILER = getSystemProperty("java.compiler");
    JAVA_ENDORSED_DIRS = getSystemProperty("java.endorsed.dirs");
    JAVA_EXT_DIRS = getSystemProperty("java.ext.dirs");
    JAVA_HOME = getSystemProperty("java.home");
    JAVA_IO_TMPDIR = getSystemProperty("java.io.tmpdir");
    JAVA_LIBRARY_PATH = getSystemProperty("java.library.path");
    JAVA_RUNTIME_NAME = getSystemProperty("java.runtime.name");
    JAVA_RUNTIME_VERSION = getSystemProperty("java.runtime.version");
    JAVA_SPECIFICATION_NAME = getSystemProperty("java.specification.name");
    JAVA_SPECIFICATION_VENDOR = getSystemProperty("java.specification.vendor");
    JAVA_SPECIFICATION_VERSION = getSystemProperty("java.specification.version");
    JAVA_UTIL_PREFS_PREFERENCES_FACTORY = getSystemProperty("java.util.prefs.PreferencesFactory");
    JAVA_VENDOR = getSystemProperty("java.vendor");
    JAVA_VENDOR_URL = getSystemProperty("java.vendor.url");
    JAVA_VERSION = getSystemProperty("java.version");
    JAVA_VM_INFO = getSystemProperty("java.vm.info");
    JAVA_VM_NAME = getSystemProperty("java.vm.name");
    JAVA_VM_SPECIFICATION_NAME = getSystemProperty("java.vm.specification.name");
    JAVA_VM_SPECIFICATION_VENDOR = getSystemProperty("java.vm.specification.vendor");
    JAVA_VM_SPECIFICATION_VERSION = getSystemProperty("java.vm.specification.version");
    JAVA_VM_VENDOR = getSystemProperty("java.vm.vendor");
    JAVA_VM_VERSION = getSystemProperty("java.vm.version");
    LINE_SEPARATOR = getSystemProperty("line.separator");
    OS_ARCH = getSystemProperty("os.arch");
    OS_NAME = getSystemProperty("os.name");
    OS_VERSION = getSystemProperty("os.version");
    PATH_SEPARATOR = getSystemProperty("path.separator");
    String str = getSystemProperty("user.country");
    boolean bool3;
    if (str == null)
    {
      str = getSystemProperty("user.region");
      USER_COUNTRY = str;
      USER_DIR = getSystemProperty("user.dir");
      USER_HOME = getSystemProperty("user.home");
      USER_LANGUAGE = getSystemProperty("user.language");
      USER_NAME = getSystemProperty("user.name");
      USER_TIMEZONE = getSystemProperty("user.timezone");
      JAVA_VERSION_TRIMMED = getJavaVersionTrimmed();
      f2 = getJavaVersionAsFloat();
      JAVA_VERSION_FLOAT = f2;
      JAVA_VERSION_INT = getJavaVersionAsInt();
      IS_JAVA_1_1 = getJavaVersionMatches("1.1");
      IS_JAVA_1_2 = getJavaVersionMatches("1.2");
      IS_JAVA_1_3 = getJavaVersionMatches("1.3");
      IS_JAVA_1_4 = getJavaVersionMatches("1.4");
      IS_JAVA_1_5 = getJavaVersionMatches("1.5");
      IS_JAVA_1_6 = getJavaVersionMatches("1.6");
      IS_JAVA_1_7 = getJavaVersionMatches("1.7");
      IS_OS_AIX = getOSMatches("AIX");
      IS_OS_HP_UX = getOSMatches("HP-UX");
      IS_OS_IRIX = getOSMatches("Irix");
      str = "Linux";
      bool3 = getOSMatches(str);
      if (!bool3)
      {
        str = "LINUX";
        bool3 = getOSMatches(str);
        if (!bool3) {
          break label739;
        }
      }
      bool3 = bool1;
    }
    for (float f2 = f1;; f2 = 0.0F)
    {
      IS_OS_LINUX = bool3;
      IS_OS_MAC = getOSMatches("Mac");
      IS_OS_MAC_OSX = getOSMatches("Mac OS X");
      IS_OS_OS2 = getOSMatches("OS/2");
      IS_OS_SOLARIS = getOSMatches("Solaris");
      str = "SunOS";
      IS_OS_SUN_OS = getOSMatches(str);
      bool3 = IS_OS_AIX;
      if (!bool3)
      {
        bool3 = IS_OS_HP_UX;
        if (!bool3)
        {
          bool3 = IS_OS_IRIX;
          if (!bool3)
          {
            bool3 = IS_OS_LINUX;
            if (!bool3)
            {
              bool3 = IS_OS_MAC_OSX;
              if (!bool3)
              {
                bool3 = IS_OS_SOLARIS;
                if (!bool3)
                {
                  bool3 = IS_OS_SUN_OS;
                  if (!bool3) {
                    break label629;
                  }
                }
              }
            }
          }
        }
      }
      bool2 = bool1;
      label629:
      IS_OS_UNIX = bool2;
      IS_OS_WINDOWS = getOSMatches("Windows");
      IS_OS_WINDOWS_2000 = getOSMatches("Windows", "5.0");
      IS_OS_WINDOWS_95 = getOSMatches("Windows 9", "4.0");
      IS_OS_WINDOWS_98 = getOSMatches("Windows 9", "4.1");
      IS_OS_WINDOWS_ME = getOSMatches("Windows", "4.9");
      IS_OS_WINDOWS_NT = getOSMatches("Windows NT");
      IS_OS_WINDOWS_XP = getOSMatches("Windows", "5.1");
      IS_OS_WINDOWS_VISTA = getOSMatches("Windows", "6.0");
      IS_OS_WINDOWS_7 = getOSMatches("Windows", "6.1");
      return;
      str = getSystemProperty("user.country");
      break;
      label739:
      bool3 = false;
      str = null;
    }
  }
  
  public static File getJavaHome()
  {
    File localFile = new java/io/File;
    String str = System.getProperty("java.home");
    localFile.<init>(str);
    return localFile;
  }
  
  public static File getJavaIoTmpDir()
  {
    File localFile = new java/io/File;
    String str = System.getProperty("java.io.tmpdir");
    localFile.<init>(str);
    return localFile;
  }
  
  public static float getJavaVersion()
  {
    return JAVA_VERSION_FLOAT;
  }
  
  private static float getJavaVersionAsFloat()
  {
    int i = 5;
    float f = 0.0F;
    Object localObject = JAVA_VERSION_TRIMMED;
    if (localObject == null) {}
    for (;;)
    {
      return f;
      localObject = JAVA_VERSION_TRIMMED;
      String str1 = null;
      int j = 3;
      String str2 = ((String)localObject).substring(0, j);
      localObject = JAVA_VERSION_TRIMMED;
      int k = ((String)localObject).length();
      if (k >= i)
      {
        localObject = new java/lang/StringBuffer;
        ((StringBuffer)localObject).<init>();
        localObject = ((StringBuffer)localObject).append(str2);
        str1 = JAVA_VERSION_TRIMMED;
        j = 4;
        str1 = str1.substring(j, i);
        localObject = ((StringBuffer)localObject).append(str1);
        str2 = ((StringBuffer)localObject).toString();
      }
      try
      {
        f = Float.parseFloat(str2);
      }
      catch (Exception localException) {}
    }
  }
  
  private static int getJavaVersionAsInt()
  {
    int i = 5;
    int j = 0;
    Object localObject = JAVA_VERSION_TRIMMED;
    if (localObject == null) {}
    for (;;)
    {
      return j;
      localObject = JAVA_VERSION_TRIMMED;
      int k = 1;
      String str1 = ((String)localObject).substring(0, k);
      localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      localObject = ((StringBuffer)localObject).append(str1);
      String str2 = JAVA_VERSION_TRIMMED;
      int m = 2;
      int n = 3;
      str2 = str2.substring(m, n);
      str1 = str2;
      localObject = JAVA_VERSION_TRIMMED;
      int i1 = ((String)localObject).length();
      if (i1 >= i)
      {
        localObject = new java/lang/StringBuffer;
        ((StringBuffer)localObject).<init>();
        localObject = ((StringBuffer)localObject).append(str1);
        str2 = JAVA_VERSION_TRIMMED;
        m = 4;
        str2 = str2.substring(m, i);
        localObject = ((StringBuffer)localObject).append(str2);
      }
      for (str1 = ((StringBuffer)localObject).toString();; str1 = ((StringBuffer)localObject).toString())
      {
        try
        {
          j = Integer.parseInt(str1);
        }
        catch (Exception localException) {}
        localObject = new java/lang/StringBuffer;
        ((StringBuffer)localObject).<init>();
        localObject = ((StringBuffer)localObject).append(str1);
        str2 = "0";
        localObject = ((StringBuffer)localObject).append(str2);
      }
    }
  }
  
  private static boolean getJavaVersionMatches(String paramString)
  {
    String str = JAVA_VERSION_TRIMMED;
    boolean bool;
    if (str == null)
    {
      bool = false;
      str = null;
    }
    for (;;)
    {
      return bool;
      str = JAVA_VERSION_TRIMMED;
      bool = str.startsWith(paramString);
    }
  }
  
  private static String getJavaVersionTrimmed()
  {
    String str = JAVA_VERSION;
    int i;
    int j;
    if (str != null)
    {
      i = 0;
      str = JAVA_VERSION;
      j = str.length();
      if (i < j)
      {
        str = JAVA_VERSION;
        int k = str.charAt(i);
        j = 48;
        if (k >= j)
        {
          j = 57;
          if (k > j) {}
        }
      }
    }
    for (str = JAVA_VERSION.substring(i);; str = null)
    {
      return str;
      i += 1;
      break;
      j = 0;
    }
  }
  
  private static boolean getOSMatches(String paramString)
  {
    String str = OS_NAME;
    boolean bool;
    if (str == null)
    {
      bool = false;
      str = null;
    }
    for (;;)
    {
      return bool;
      str = OS_NAME;
      bool = str.startsWith(paramString);
    }
  }
  
  private static boolean getOSMatches(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    String str = OS_NAME;
    if (str != null)
    {
      str = OS_VERSION;
      if (str != null) {
        break label20;
      }
    }
    for (;;)
    {
      return bool1;
      label20:
      str = OS_NAME;
      boolean bool2 = str.startsWith(paramString1);
      if (bool2)
      {
        str = OS_VERSION;
        bool2 = str.startsWith(paramString2);
        if (bool2) {
          bool1 = true;
        }
      }
    }
  }
  
  private static String getSystemProperty(String paramString)
  {
    try
    {
      localObject1 = System.getProperty(paramString);
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        Object localObject1 = System.err;
        Object localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject2 = ((StringBuffer)localObject2).append("Caught a SecurityException reading the system property '").append(paramString);
        String str = "'; the SystemUtils property value will default to null.";
        localObject2 = str;
        ((PrintStream)localObject1).println((String)localObject2);
        localObject1 = null;
      }
    }
    return (String)localObject1;
  }
  
  public static File getUserDir()
  {
    File localFile = new java/io/File;
    String str = System.getProperty("user.dir");
    localFile.<init>(str);
    return localFile;
  }
  
  public static File getUserHome()
  {
    File localFile = new java/io/File;
    String str = System.getProperty("user.home");
    localFile.<init>(str);
    return localFile;
  }
  
  public static boolean isJavaAwtHeadless()
  {
    String str1 = JAVA_AWT_HEADLESS;
    boolean bool;
    if (str1 != null)
    {
      str1 = JAVA_AWT_HEADLESS;
      String str2 = Boolean.TRUE.toString();
      bool = str1.equals(str2);
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public static boolean isJavaVersionAtLeast(float paramFloat)
  {
    float f = JAVA_VERSION_FLOAT;
    boolean bool = f < paramFloat;
    if (!bool) {
      bool = true;
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      return bool;
      bool = false;
    }
  }
  
  public static boolean isJavaVersionAtLeast(int paramInt)
  {
    int i = JAVA_VERSION_INT;
    if (i >= paramInt) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/apache/commons/lang/SystemUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */