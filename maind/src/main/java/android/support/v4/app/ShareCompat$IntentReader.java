package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import java.util.ArrayList;

public class ShareCompat$IntentReader
{
  private static final String TAG = "IntentReader";
  private Activity mActivity;
  private ComponentName mCallingActivity;
  private String mCallingPackage;
  private Intent mIntent;
  private ArrayList mStreams;
  
  private ShareCompat$IntentReader(Activity paramActivity)
  {
    this.mActivity = paramActivity;
    Object localObject = paramActivity.getIntent();
    this.mIntent = ((Intent)localObject);
    localObject = ShareCompat.getCallingPackage(paramActivity);
    this.mCallingPackage = ((String)localObject);
    localObject = ShareCompat.getCallingActivity(paramActivity);
    this.mCallingActivity = ((ComponentName)localObject);
  }
  
  public static IntentReader from(Activity paramActivity)
  {
    IntentReader localIntentReader = new android/support/v4/app/ShareCompat$IntentReader;
    localIntentReader.<init>(paramActivity);
    return localIntentReader;
  }
  
  public ComponentName getCallingActivity()
  {
    return this.mCallingActivity;
  }
  
  public Drawable getCallingActivityIcon()
  {
    Drawable localDrawable = null;
    Object localObject = this.mCallingActivity;
    if (localObject == null) {}
    for (;;)
    {
      return localDrawable;
      localObject = this.mActivity;
      PackageManager localPackageManager = ((Activity)localObject).getPackageManager();
      try
      {
        localObject = this.mCallingActivity;
        localDrawable = localPackageManager.getActivityIcon((ComponentName)localObject);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localObject = "IntentReader";
        String str = "Could not retrieve icon for calling activity";
        Log.e((String)localObject, str, localNameNotFoundException);
      }
    }
  }
  
  public Drawable getCallingApplicationIcon()
  {
    Drawable localDrawable = null;
    Object localObject = this.mCallingPackage;
    if (localObject == null) {}
    for (;;)
    {
      return localDrawable;
      localObject = this.mActivity;
      PackageManager localPackageManager = ((Activity)localObject).getPackageManager();
      try
      {
        localObject = this.mCallingPackage;
        localDrawable = localPackageManager.getApplicationIcon((String)localObject);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localObject = "IntentReader";
        String str = "Could not retrieve icon for calling application";
        Log.e((String)localObject, str, localNameNotFoundException);
      }
    }
  }
  
  public CharSequence getCallingApplicationLabel()
  {
    CharSequence localCharSequence = null;
    Object localObject = this.mCallingPackage;
    if (localObject == null) {}
    for (;;)
    {
      return localCharSequence;
      localObject = this.mActivity;
      PackageManager localPackageManager = ((Activity)localObject).getPackageManager();
      try
      {
        localObject = this.mCallingPackage;
        str = null;
        localObject = localPackageManager.getApplicationInfo((String)localObject, 0);
        localCharSequence = localPackageManager.getApplicationLabel((ApplicationInfo)localObject);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localObject = "IntentReader";
        String str = "Could not retrieve label for calling application";
        Log.e((String)localObject, str, localNameNotFoundException);
      }
    }
  }
  
  public String getCallingPackage()
  {
    return this.mCallingPackage;
  }
  
  public String[] getEmailBcc()
  {
    return this.mIntent.getStringArrayExtra("android.intent.extra.BCC");
  }
  
  public String[] getEmailCc()
  {
    return this.mIntent.getStringArrayExtra("android.intent.extra.CC");
  }
  
  public String[] getEmailTo()
  {
    return this.mIntent.getStringArrayExtra("android.intent.extra.EMAIL");
  }
  
  public String getHtmlText()
  {
    Object localObject1 = this.mIntent;
    String str1 = "android.intent.extra.HTML_TEXT";
    String str2 = ((Intent)localObject1).getStringExtra(str1);
    localObject1 = this.mIntent;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = getText();
      boolean bool = localObject2 instanceof Spanned;
      if (!bool) {
        break label56;
      }
      localObject2 = (Spanned)localObject2;
      str2 = Html.toHtml((Spanned)localObject2);
    }
    for (;;)
    {
      return str2;
      label56:
      if (localObject2 != null)
      {
        localObject1 = ShareCompat.access$000();
        str2 = ((ShareCompat.ShareCompatImpl)localObject1).escapeHtml((CharSequence)localObject2);
      }
    }
  }
  
  public Uri getStream()
  {
    return (Uri)this.mIntent.getParcelableExtra("android.intent.extra.STREAM");
  }
  
  public Uri getStream(int paramInt)
  {
    Object localObject1 = this.mStreams;
    if (localObject1 == null)
    {
      boolean bool = isMultipleShare();
      if (bool)
      {
        localObject1 = this.mIntent;
        localObject2 = "android.intent.extra.STREAM";
        localObject1 = ((Intent)localObject1).getParcelableArrayListExtra((String)localObject2);
        this.mStreams = ((ArrayList)localObject1);
      }
    }
    localObject1 = this.mStreams;
    if (localObject1 != null) {}
    for (localObject1 = (Uri)this.mStreams.get(paramInt);; localObject1 = (Uri)((Intent)localObject1).getParcelableExtra((String)localObject2))
    {
      return (Uri)localObject1;
      if (paramInt != 0) {
        break;
      }
      localObject1 = this.mIntent;
      localObject2 = "android.intent.extra.STREAM";
    }
    localObject1 = new java/lang/IndexOutOfBoundsException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Stream items available: ");
    int i = getStreamCount();
    localObject2 = i + " index requested: " + paramInt;
    ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public int getStreamCount()
  {
    Object localObject = this.mStreams;
    String str;
    if (localObject == null)
    {
      boolean bool1 = isMultipleShare();
      if (bool1)
      {
        localObject = this.mIntent;
        str = "android.intent.extra.STREAM";
        localObject = ((Intent)localObject).getParcelableArrayListExtra(str);
        this.mStreams = ((ArrayList)localObject);
      }
    }
    localObject = this.mStreams;
    int i;
    if (localObject != null)
    {
      localObject = this.mStreams;
      i = ((ArrayList)localObject).size();
    }
    for (;;)
    {
      return i;
      localObject = this.mIntent;
      str = "android.intent.extra.STREAM";
      boolean bool2 = ((Intent)localObject).hasExtra(str);
      if (bool2)
      {
        bool2 = true;
      }
      else
      {
        bool2 = false;
        localObject = null;
      }
    }
  }
  
  public String getSubject()
  {
    return this.mIntent.getStringExtra("android.intent.extra.SUBJECT");
  }
  
  public CharSequence getText()
  {
    return this.mIntent.getCharSequenceExtra("android.intent.extra.TEXT");
  }
  
  public String getType()
  {
    return this.mIntent.getType();
  }
  
  public boolean isMultipleShare()
  {
    return this.mIntent.getAction().equals("android.intent.action.SEND_MULTIPLE");
  }
  
  public boolean isShareIntent()
  {
    String str1 = this.mIntent.getAction();
    String str2 = "android.intent.action.SEND";
    boolean bool = str1.equals(str2);
    if (!bool)
    {
      str2 = "android.intent.action.SEND_MULTIPLE";
      bool = str1.equals(str2);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str2 = null;
    }
  }
  
  public boolean isSingleShare()
  {
    return this.mIntent.getAction().equals("android.intent.action.SEND");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/ShareCompat$IntentReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */