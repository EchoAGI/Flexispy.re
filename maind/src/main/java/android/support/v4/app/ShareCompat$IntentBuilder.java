package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import java.util.ArrayList;

public class ShareCompat$IntentBuilder
{
  private Activity mActivity;
  private ArrayList mBccAddresses;
  private ArrayList mCcAddresses;
  private CharSequence mChooserTitle;
  private Intent mIntent;
  private ArrayList mStreams;
  private ArrayList mToAddresses;
  
  private ShareCompat$IntentBuilder(Activity paramActivity)
  {
    this.mActivity = paramActivity;
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    localIntent = localIntent.setAction("android.intent.action.SEND");
    this.mIntent = localIntent;
    localIntent = this.mIntent;
    Object localObject = paramActivity.getPackageName();
    localIntent.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", (String)localObject);
    localIntent = this.mIntent;
    localObject = paramActivity.getComponentName();
    localIntent.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", (Parcelable)localObject);
    this.mIntent.addFlags(524288);
  }
  
  private void combineArrayExtra(String paramString, ArrayList paramArrayList)
  {
    Intent localIntent = this.mIntent;
    String[] arrayOfString1 = localIntent.getStringArrayExtra(paramString);
    if (arrayOfString1 != null) {}
    for (int i = arrayOfString1.length;; i = 0)
    {
      int j = paramArrayList.size() + i;
      String[] arrayOfString2 = new String[j];
      paramArrayList.toArray(arrayOfString2);
      if (arrayOfString1 != null)
      {
        j = paramArrayList.size();
        System.arraycopy(arrayOfString1, 0, arrayOfString2, j, i);
      }
      this.mIntent.putExtra(paramString, arrayOfString2);
      return;
    }
  }
  
  private void combineArrayExtra(String paramString, String[] paramArrayOfString)
  {
    Intent localIntent = getIntent();
    String[] arrayOfString1 = localIntent.getStringArrayExtra(paramString);
    if (arrayOfString1 != null) {}
    for (int i = arrayOfString1.length;; i = 0)
    {
      int j = paramArrayOfString.length + i;
      String[] arrayOfString2 = new String[j];
      if (arrayOfString1 != null) {
        System.arraycopy(arrayOfString1, 0, arrayOfString2, 0, i);
      }
      j = paramArrayOfString.length;
      System.arraycopy(paramArrayOfString, 0, arrayOfString2, i, j);
      localIntent.putExtra(paramString, arrayOfString2);
      return;
    }
  }
  
  public static IntentBuilder from(Activity paramActivity)
  {
    IntentBuilder localIntentBuilder = new android/support/v4/app/ShareCompat$IntentBuilder;
    localIntentBuilder.<init>(paramActivity);
    return localIntentBuilder;
  }
  
  public IntentBuilder addEmailBcc(String paramString)
  {
    ArrayList localArrayList = this.mBccAddresses;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.mBccAddresses = localArrayList;
    }
    this.mBccAddresses.add(paramString);
    return this;
  }
  
  public IntentBuilder addEmailBcc(String[] paramArrayOfString)
  {
    combineArrayExtra("android.intent.extra.BCC", paramArrayOfString);
    return this;
  }
  
  public IntentBuilder addEmailCc(String paramString)
  {
    ArrayList localArrayList = this.mCcAddresses;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.mCcAddresses = localArrayList;
    }
    this.mCcAddresses.add(paramString);
    return this;
  }
  
  public IntentBuilder addEmailCc(String[] paramArrayOfString)
  {
    combineArrayExtra("android.intent.extra.CC", paramArrayOfString);
    return this;
  }
  
  public IntentBuilder addEmailTo(String paramString)
  {
    ArrayList localArrayList = this.mToAddresses;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.mToAddresses = localArrayList;
    }
    this.mToAddresses.add(paramString);
    return this;
  }
  
  public IntentBuilder addEmailTo(String[] paramArrayOfString)
  {
    combineArrayExtra("android.intent.extra.EMAIL", paramArrayOfString);
    return this;
  }
  
  public IntentBuilder addStream(Uri paramUri)
  {
    Object localObject = this.mIntent;
    String str = "android.intent.extra.STREAM";
    Uri localUri = (Uri)((Intent)localObject).getParcelableExtra(str);
    if (localUri == null) {
      this = setStream(paramUri);
    }
    for (;;)
    {
      return this;
      localObject = this.mStreams;
      if (localObject == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        this.mStreams = ((ArrayList)localObject);
      }
      if (localUri != null)
      {
        localObject = this.mIntent;
        str = "android.intent.extra.STREAM";
        ((Intent)localObject).removeExtra(str);
        localObject = this.mStreams;
        ((ArrayList)localObject).add(localUri);
      }
      localObject = this.mStreams;
      ((ArrayList)localObject).add(paramUri);
    }
  }
  
  public Intent createChooserIntent()
  {
    Intent localIntent = getIntent();
    CharSequence localCharSequence = this.mChooserTitle;
    return Intent.createChooser(localIntent, localCharSequence);
  }
  
  Activity getActivity()
  {
    return this.mActivity;
  }
  
  public Intent getIntent()
  {
    int i = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = this.mToAddresses;
    Object localObject3;
    if (localObject2 != null)
    {
      localObject2 = "android.intent.extra.EMAIL";
      localObject3 = this.mToAddresses;
      combineArrayExtra((String)localObject2, (ArrayList)localObject3);
      this.mToAddresses = null;
    }
    localObject2 = this.mCcAddresses;
    if (localObject2 != null)
    {
      localObject2 = "android.intent.extra.CC";
      localObject3 = this.mCcAddresses;
      combineArrayExtra((String)localObject2, (ArrayList)localObject3);
      this.mCcAddresses = null;
    }
    localObject2 = this.mBccAddresses;
    if (localObject2 != null)
    {
      localObject2 = "android.intent.extra.BCC";
      localObject3 = this.mBccAddresses;
      combineArrayExtra((String)localObject2, (ArrayList)localObject3);
      this.mBccAddresses = null;
    }
    localObject2 = this.mStreams;
    if (localObject2 != null)
    {
      localObject2 = this.mStreams;
      int j = ((ArrayList)localObject2).size();
      if (j > i)
      {
        localObject2 = this.mIntent.getAction();
        localObject3 = "android.intent.action.SEND_MULTIPLE";
        boolean bool3 = ((String)localObject2).equals(localObject3);
        if ((i == 0) && (bool3))
        {
          localObject2 = this.mIntent;
          localObject3 = "android.intent.action.SEND";
          ((Intent)localObject2).setAction((String)localObject3);
          localObject2 = this.mStreams;
          if (localObject2 == null) {
            break label338;
          }
          localObject2 = this.mStreams;
          boolean bool2 = ((ArrayList)localObject2).isEmpty();
          if (bool2) {
            break label338;
          }
          localObject2 = this.mIntent;
          localObject3 = "android.intent.extra.STREAM";
          ArrayList localArrayList = this.mStreams;
          localObject1 = (Parcelable)localArrayList.get(0);
          ((Intent)localObject2).putExtra((String)localObject3, (Parcelable)localObject1);
          label251:
          this.mStreams = null;
        }
        if ((i != 0) && (!bool3))
        {
          localObject1 = this.mIntent;
          localObject2 = "android.intent.action.SEND_MULTIPLE";
          ((Intent)localObject1).setAction((String)localObject2);
          localObject1 = this.mStreams;
          if (localObject1 == null) {
            break label356;
          }
          localObject1 = this.mStreams;
          bool1 = ((ArrayList)localObject1).isEmpty();
          if (bool1) {
            break label356;
          }
          localObject1 = this.mIntent;
          localObject2 = "android.intent.extra.STREAM";
          localObject3 = this.mStreams;
          ((Intent)localObject1).putParcelableArrayListExtra((String)localObject2, (ArrayList)localObject3);
        }
      }
    }
    for (;;)
    {
      return this.mIntent;
      i = 0;
      break;
      label338:
      localObject1 = this.mIntent;
      localObject2 = "android.intent.extra.STREAM";
      ((Intent)localObject1).removeExtra((String)localObject2);
      break label251;
      label356:
      localObject1 = this.mIntent;
      localObject2 = "android.intent.extra.STREAM";
      ((Intent)localObject1).removeExtra((String)localObject2);
    }
  }
  
  public IntentBuilder setChooserTitle(int paramInt)
  {
    CharSequence localCharSequence = this.mActivity.getText(paramInt);
    return setChooserTitle(localCharSequence);
  }
  
  public IntentBuilder setChooserTitle(CharSequence paramCharSequence)
  {
    this.mChooserTitle = paramCharSequence;
    return this;
  }
  
  public IntentBuilder setEmailBcc(String[] paramArrayOfString)
  {
    this.mIntent.putExtra("android.intent.extra.BCC", paramArrayOfString);
    return this;
  }
  
  public IntentBuilder setEmailCc(String[] paramArrayOfString)
  {
    this.mIntent.putExtra("android.intent.extra.CC", paramArrayOfString);
    return this;
  }
  
  public IntentBuilder setEmailTo(String[] paramArrayOfString)
  {
    ArrayList localArrayList = this.mToAddresses;
    if (localArrayList != null)
    {
      localArrayList = null;
      this.mToAddresses = null;
    }
    this.mIntent.putExtra("android.intent.extra.EMAIL", paramArrayOfString);
    return this;
  }
  
  public IntentBuilder setHtmlText(String paramString)
  {
    this.mIntent.putExtra("android.intent.extra.HTML_TEXT", paramString);
    Object localObject = this.mIntent;
    String str = "android.intent.extra.TEXT";
    boolean bool = ((Intent)localObject).hasExtra(str);
    if (!bool)
    {
      localObject = Html.fromHtml(paramString);
      setText((CharSequence)localObject);
    }
    return this;
  }
  
  public IntentBuilder setStream(Uri paramUri)
  {
    Object localObject = this.mIntent.getAction();
    String str = "android.intent.action.SEND";
    boolean bool = ((String)localObject).equals(str);
    if (!bool)
    {
      localObject = this.mIntent;
      str = "android.intent.action.SEND";
      ((Intent)localObject).setAction(str);
    }
    this.mStreams = null;
    this.mIntent.putExtra("android.intent.extra.STREAM", paramUri);
    return this;
  }
  
  public IntentBuilder setSubject(String paramString)
  {
    this.mIntent.putExtra("android.intent.extra.SUBJECT", paramString);
    return this;
  }
  
  public IntentBuilder setText(CharSequence paramCharSequence)
  {
    this.mIntent.putExtra("android.intent.extra.TEXT", paramCharSequence);
    return this;
  }
  
  public IntentBuilder setType(String paramString)
  {
    this.mIntent.setType(paramString);
    return this;
  }
  
  public void startChooser()
  {
    Activity localActivity = this.mActivity;
    Intent localIntent = createChooserIntent();
    localActivity.startActivity(localIntent);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/ShareCompat$IntentBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */