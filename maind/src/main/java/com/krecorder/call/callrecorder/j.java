package com.krecorder.call.callrecorder;

import com.krecorder.call.recording.MediaFormat;
import com.vvt.ak.a;
import java.io.File;

public class j
{
  private static final boolean a = a.e;
  private static final boolean b = a.a;
  private String c = "";
  private String d = "";
  private MediaFormat e;
  private int f;
  private l g;
  private int h;
  
  public j()
  {
    MediaFormat localMediaFormat = MediaFormat.AMR;
    this.e = localMediaFormat;
    this.f = -1;
    this.g = null;
    this.h = 0;
  }
  
  public static String a(MediaFormat paramMediaFormat)
  {
    Object localObject = k.a;
    int i = paramMediaFormat.ordinal();
    int j = localObject[i];
    switch (j)
    {
    default: 
      localObject = ".unk";
    }
    for (;;)
    {
      return (String)localObject;
      localObject = ".amr";
      continue;
      localObject = ".wav";
      continue;
      localObject = ".aac";
      continue;
      localObject = ".mp3";
    }
  }
  
  public static String c(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "UNKNOWN";
    }
    for (;;)
    {
      return str;
      str = "Mic";
      continue;
      str = "Voice Call";
      continue;
      str = "Voice DownLink";
      continue;
      str = "Voice UpLink";
      continue;
      str = "Alsa";
      continue;
      str = "Aosp";
      continue;
      str = "Legacy";
    }
  }
  
  public int a()
  {
    return this.f;
  }
  
  public void a(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void a(MediaFormat paramMediaFormat, int paramInt1, int paramInt2, int paramInt3)
  {
    l locall = new com/krecorder/call/callrecorder/l;
    locall.<init>(this, paramMediaFormat, paramInt1, paramInt2, paramInt3);
    this.g = locall;
  }
  
  public void a(String paramString)
  {
    boolean bool = b;
    if (bool) {}
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    localFile.mkdirs();
    this.c = paramString;
  }
  
  public MediaFormat b()
  {
    return this.e;
  }
  
  public void b(int paramInt)
  {
    boolean bool = b;
    if (bool) {}
    this.f = paramInt;
  }
  
  public void b(MediaFormat paramMediaFormat)
  {
    boolean bool = b;
    if (bool) {}
    this.e = paramMediaFormat;
  }
  
  public void b(String paramString)
  {
    String str = ".";
    boolean bool = paramString.contains(str);
    if (bool)
    {
      bool = false;
      int i = paramString.lastIndexOf('.');
      str = paramString.substring(0, i);
    }
    for (this.d = str;; this.d = paramString)
    {
      bool = b;
      if (bool) {}
      return;
    }
  }
  
  public File c()
  {
    File localFile = new java/io/File;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = this.c;
    localObject = ((StringBuilder)localObject).append(str).append("/");
    str = this.d;
    localObject = ((StringBuilder)localObject).append(str);
    str = a(this.e);
    localObject = str;
    localFile.<init>((String)localObject);
    return localFile;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/krecorder/call/callrecorder/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */