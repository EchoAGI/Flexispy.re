package com.vvt.c;

import android.os.Build;
import java.io.File;

public class b
{
  private static final boolean a;
  
  static
  {
    boolean bool = a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public static Integer a()
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = new java/io/File;
    String str = "/sys/class/power_supply/battery/capacity";
    ((File)localObject).<init>(str);
    boolean bool2 = ((File)localObject).exists();
    if (bool2)
    {
      bool2 = a;
      if (bool2) {}
      localObject = a((File)localObject);
      if (localObject == null) {
        break label660;
      }
    }
    for (;;)
    {
      return (Integer)localObject;
      bool1 = a;
      if (bool1) {}
      bool1 = a;
      if (bool1) {}
      localObject = Build.MODEL.toLowerCase();
      str = "wildfire s";
      bool1 = ((String)localObject).contains(str);
      if (bool1)
      {
        localObject = new java/io/File;
        str = "/sys/class/power_supply/battery/capacity";
        ((File)localObject).<init>(str);
        bool2 = ((File)localObject).exists();
        if (bool2)
        {
          localObject = a((File)localObject);
          if (localObject != null) {
            continue;
          }
        }
      }
      localObject = Build.MODEL.toLowerCase();
      str = "triumph";
      bool1 = ((String)localObject).contains(str);
      if (bool1)
      {
        localObject = new java/io/File;
        str = "/sys/class/power_supply/battery/capacity";
        ((File)localObject).<init>(str);
        bool2 = ((File)localObject).exists();
        if (bool2)
        {
          localObject = a((File)localObject);
          continue;
        }
      }
      localObject = Build.MODEL.toLowerCase();
      str = "desire hd";
      bool1 = ((String)localObject).contains(str);
      if (!bool1)
      {
        localObject = Build.MODEL.toLowerCase();
        str = "desire z";
        bool1 = ((String)localObject).contains(str);
        if (!bool1)
        {
          localObject = Build.MODEL.toLowerCase();
          str = "inspire";
          bool1 = ((String)localObject).contains(str);
          if (!bool1) {
            break label252;
          }
        }
      }
      localObject = new java/io/File;
      str = "/sys/class/power_supply/battery/capacity";
      ((File)localObject).<init>(str);
      bool2 = ((File)localObject).exists();
      if (bool2)
      {
        localObject = a((File)localObject);
      }
      else
      {
        label252:
        localObject = new java/io/File;
        str = "/sys/devices/platform/ds2784-battery/capacity";
        ((File)localObject).<init>(str);
        bool2 = ((File)localObject).exists();
        if (bool2)
        {
          localObject = a((File)localObject);
        }
        else
        {
          localObject = new java/io/File;
          str = "/sys/devices/platform/i2c-adapter/i2c-0/0-0036/power_supply/ds2746-battery/capacity";
          ((File)localObject).<init>(str);
          bool2 = ((File)localObject).exists();
          if (bool2)
          {
            localObject = a((File)localObject);
          }
          else
          {
            localObject = new java/io/File;
            str = "/sys/devices/platform/i2c-adapter/i2c-0/0-0036/power_supply/battery/capacity";
            ((File)localObject).<init>(str);
            bool2 = ((File)localObject).exists();
            if (bool2)
            {
              localObject = a((File)localObject);
            }
            else
            {
              localObject = new java/io/File;
              str = "/sys/class/power_supply/battery/capacity";
              ((File)localObject).<init>(str);
              bool2 = ((File)localObject).exists();
              if (bool2)
              {
                localObject = a((File)localObject);
                if (localObject != null) {}
              }
              else
              {
                localObject = new java/io/File;
                str = "/sys/class/power_supply/battery/capacity";
                ((File)localObject).<init>(str);
                bool2 = ((File)localObject).exists();
                if (bool2)
                {
                  localObject = a((File)localObject);
                  if (localObject != null) {}
                }
                else
                {
                  localObject = new java/io/File;
                  str = "/sys/class/power_supply/battery/capacity";
                  ((File)localObject).<init>(str);
                  bool2 = ((File)localObject).exists();
                  if (bool2)
                  {
                    localObject = a((File)localObject);
                  }
                  else
                  {
                    localObject = new java/io/File;
                    str = "/sys/class/power_supply/battery/capacity";
                    ((File)localObject).<init>(str);
                    bool2 = ((File)localObject).exists();
                    if (bool2)
                    {
                      localObject = a((File)localObject);
                    }
                    else
                    {
                      localObject = new java/io/File;
                      str = "/sys/class/power_supply/battery/capacity";
                      ((File)localObject).<init>(str);
                      bool2 = ((File)localObject).exists();
                      if (bool2)
                      {
                        localObject = a((File)localObject);
                      }
                      else
                      {
                        localObject = new java/io/File;
                        str = "/sys/class/power_supply/battery/capacity";
                        ((File)localObject).<init>(str);
                        bool2 = ((File)localObject).exists();
                        if (bool2)
                        {
                          localObject = a((File)localObject);
                        }
                        else
                        {
                          localObject = new java/io/File;
                          str = "/sys/class/power_supply/max17042-0/capacity";
                          ((File)localObject).<init>(str);
                          bool2 = ((File)localObject).exists();
                          if (bool2)
                          {
                            localObject = a((File)localObject);
                          }
                          else
                          {
                            localObject = new java/io/File;
                            str = "/sys/class/power_supply/bq27520/capacity";
                            ((File)localObject).<init>(str);
                            bool2 = ((File)localObject).exists();
                            if (bool2)
                            {
                              localObject = a((File)localObject);
                            }
                            else
                            {
                              localObject = new java/io/File;
                              str = "/sys/devices/platform/cpcap_battery/power_supply/usb/capacity";
                              ((File)localObject).<init>(str);
                              bool2 = ((File)localObject).exists();
                              if (bool2)
                              {
                                localObject = a((File)localObject);
                              }
                              else
                              {
                                localObject = new java/io/File;
                                str = "/sys/EcControl/capacity";
                                ((File)localObject).<init>(str);
                                bool2 = ((File)localObject).exists();
                                if (bool2)
                                {
                                  localObject = a((File)localObject);
                                }
                                else
                                {
                                  localObject = new java/io/File;
                                  str = "/sys/class/power_supply/battery/capacity";
                                  ((File)localObject).<init>(str);
                                  bool2 = ((File)localObject).exists();
                                  if (bool2)
                                  {
                                    localObject = a((File)localObject);
                                  }
                                  else
                                  {
                                    label660:
                                    bool1 = false;
                                    localObject = null;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  /* Error */
  public static Integer a(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 69	java/io/FileInputStream
    //   5: astore_2
    //   6: aload_2
    //   7: aload_0
    //   8: invokespecial 72	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   11: new 74	java/io/DataInputStream
    //   14: astore_3
    //   15: aload_3
    //   16: aload_2
    //   17: invokespecial 77	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   20: aload_3
    //   21: invokevirtual 80	java/io/DataInputStream:readLine	()Ljava/lang/String;
    //   24: astore 4
    //   26: aload_3
    //   27: invokevirtual 84	java/io/DataInputStream:close	()V
    //   30: aload_2
    //   31: invokestatic 88	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   34: aload_3
    //   35: invokestatic 88	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   38: aload 4
    //   40: ifnull +16 -> 56
    //   43: aload 4
    //   45: invokestatic 94	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   48: istore 5
    //   50: iload 5
    //   52: invokestatic 98	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   55: astore_1
    //   56: aload_1
    //   57: areturn
    //   58: astore_3
    //   59: aconst_null
    //   60: astore_2
    //   61: aconst_null
    //   62: astore 6
    //   64: aload_3
    //   65: astore_1
    //   66: iconst_0
    //   67: istore 5
    //   69: aconst_null
    //   70: astore_3
    //   71: aload_2
    //   72: invokestatic 88	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   75: aload_3
    //   76: invokestatic 88	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   79: aload_1
    //   80: athrow
    //   81: astore_3
    //   82: iconst_0
    //   83: istore 5
    //   85: aconst_null
    //   86: astore_3
    //   87: aconst_null
    //   88: astore_2
    //   89: aconst_null
    //   90: astore 4
    //   92: aload_2
    //   93: invokestatic 88	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   96: goto -62 -> 34
    //   99: astore_3
    //   100: goto -44 -> 56
    //   103: astore 6
    //   105: iconst_0
    //   106: istore 5
    //   108: aconst_null
    //   109: astore_3
    //   110: aload 6
    //   112: astore_1
    //   113: goto -42 -> 71
    //   116: astore_1
    //   117: goto -46 -> 71
    //   120: astore_3
    //   121: iconst_0
    //   122: istore 5
    //   124: aconst_null
    //   125: astore_3
    //   126: aconst_null
    //   127: astore 4
    //   129: goto -37 -> 92
    //   132: astore 4
    //   134: aconst_null
    //   135: astore 4
    //   137: goto -45 -> 92
    //   140: pop
    //   141: goto -49 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	144	0	paramFile	File
    //   1	112	1	localObject1	Object
    //   116	1	1	localObject2	Object
    //   5	88	2	localFileInputStream	java.io.FileInputStream
    //   14	21	3	localDataInputStream	java.io.DataInputStream
    //   58	7	3	localObject3	Object
    //   70	6	3	localInputStream	java.io.InputStream
    //   81	1	3	localException1	Exception
    //   86	1	3	localObject4	Object
    //   99	1	3	localNumberFormatException	NumberFormatException
    //   109	1	3	localObject5	Object
    //   120	1	3	localException2	Exception
    //   125	1	3	localObject6	Object
    //   24	104	4	str	String
    //   132	1	4	localException3	Exception
    //   135	1	4	localObject7	Object
    //   48	75	5	i	int
    //   62	1	6	localObject8	Object
    //   103	8	6	localObject9	Object
    //   140	1	19	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   2	5	58	finally
    //   7	11	58	finally
    //   2	5	81	java/lang/Exception
    //   7	11	81	java/lang/Exception
    //   43	48	99	java/lang/NumberFormatException
    //   50	55	99	java/lang/NumberFormatException
    //   11	14	103	finally
    //   16	20	103	finally
    //   20	24	116	finally
    //   26	30	116	finally
    //   11	14	120	java/lang/Exception
    //   16	20	120	java/lang/Exception
    //   20	24	132	java/lang/Exception
    //   26	30	140	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/MyUncaughtExceptionHandler/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */