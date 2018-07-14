package android.support.v4.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

class PagerTitleStripIcs$SingleLineAllCapsTransform
  extends SingleLineTransformationMethod
{
  private static final String TAG = "SingleLineAllCapsTransform";
  private Locale mLocale;
  
  public PagerTitleStripIcs$SingleLineAllCapsTransform(Context paramContext)
  {
    Locale localLocale = paramContext.getResources().getConfiguration().locale;
    this.mLocale = localLocale;
  }
  
  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    paramCharSequence = super.getTransformation(paramCharSequence, paramView);
    Locale localLocale;
    if (paramCharSequence != null)
    {
      str = paramCharSequence.toString();
      localLocale = this.mLocale;
    }
    for (String str = str.toUpperCase(localLocale);; str = null) {
      return str;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/PagerTitleStripIcs$SingleLineAllCapsTransform.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */