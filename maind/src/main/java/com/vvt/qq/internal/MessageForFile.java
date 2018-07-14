package com.vvt.qq.internal;

import java.io.File;

public class MessageForFile
  extends ChatMessage
{
  public String fileType;
  public String msg;
  public byte[] msgData;
  public String[] tempMsg;
  public String url;
  
  private String a(String paramString)
  {
    String str = File.separator;
    int i = paramString.lastIndexOf(str);
    int j = paramString.lastIndexOf(".");
    str = "";
    if ((i > 0) && (j > 0) && (j > i))
    {
      i = j + 1;
      int k = paramString.length();
      if (i < k) {
        break label55;
      }
    }
    for (;;)
    {
      return str;
      label55:
      int m = j + 1;
      str = paramString.substring(m);
    }
  }
  
  public boolean doParse()
  {
    int i = 1;
    boolean bool = false;
    String str1 = null;
    Object localObject = this.msg;
    int j;
    if (localObject != null)
    {
      localObject = this.msg;
      j = ((String)localObject).length();
      if (j > 0)
      {
        localObject = this.msg;
        j = ((String)localObject).charAt(0);
        int k = 22;
        if (j == k) {
          break label69;
        }
      }
    }
    i = 0;
    this.tempMsg = null;
    return bool;
    label69:
    localObject = this.msg;
    String str2 = "\\|";
    localObject = ((String)localObject).split(str2);
    this.tempMsg = ((String[])localObject);
    localObject = this.tempMsg;
    if (localObject != null)
    {
      localObject = this.tempMsg;
      j = localObject.length;
      if (j > 0) {
        break label150;
      }
    }
    for (str1 = "";; str1 = localObject[0].substring(i))
    {
      this.url = str1;
      str1 = this.url;
      str1 = a(str1);
      this.fileType = str1;
      bool = i;
      break;
      label150:
      localObject = this.tempMsg;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/MessageForFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */