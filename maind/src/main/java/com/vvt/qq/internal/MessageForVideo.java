package com.vvt.qq.internal;

public class MessageForVideo
  extends ChatMessage
{
  private static final String TAG = "MessageForVideo";
  public boolean isVideo;
  public String msg;
  public String text;
  public int type;
  
  protected boolean doParse()
  {
    int i = 5;
    int j = 3;
    int k = 1;
    Object localObject1 = this.msg;
    String str;
    label61:
    label82:
    int n;
    if (localObject1 != null)
    {
      localObject1 = this.msg;
      str = "\\|";
      localObject1 = ((String)localObject1).split(str);
      int m;
      if (localObject1 != null)
      {
        m = localObject1.length;
        if (m > 0) {
          break label114;
        }
      }
      str = "";
      this.text = str;
      if (localObject1 != null)
      {
        m = localObject1.length;
        if (m > k) {
          break label132;
        }
      }
      this.type = i;
      if (localObject1 != null)
      {
        n = localObject1.length;
        if (n > j) {
          break label294;
        }
      }
      this.isVideo = k;
    }
    for (;;)
    {
      return k;
      boolean bool = false;
      localObject1 = null;
      break;
      label114:
      str = localObject1[0].trim();
      this.text = str;
      break label61;
      label132:
      n = 1;
      try
      {
        str = localObject1[n];
        n = Integer.parseInt(str);
        this.type = n;
      }
      catch (Exception localException)
      {
        localObject2 = this.msg;
        if (localObject2 != null)
        {
          localObject2 = this.msg;
          n = ((String)localObject2).length();
          if (n > 0)
          {
            localObject2 = this.msg;
            n = ((String)localObject2).charAt(0);
            i1 = 22;
            if (n == i1) {
              break label222;
            }
          }
        }
        this.type = i;
      }
      break label82;
      label222:
      Object localObject2 = new java/lang/RuntimeException;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("java.lang.NumberFormatException: Invalid int: ");
      localObject1 = localObject1[k];
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1).append(" msg is ");
      localObject3 = this.msg;
      localObject1 = (String)localObject3;
      ((RuntimeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      label294:
      n = localObject1.length;
      int i1 = 4;
      if (n == i1)
      {
        localObject2 = "1";
        localObject1 = localObject1[j];
        bool = ((String)localObject2).equals(localObject1);
        this.isVideo = bool;
      }
      else
      {
        localObject1 = localObject1[0];
        localObject2 = "视频";
        bool = ((String)localObject1).contains((CharSequence)localObject2);
        this.isVideo = bool;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/qq/internal/MessageForVideo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */