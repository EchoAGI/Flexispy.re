package android.support.v4.view;

import android.content.Context;
import android.widget.TextView;

class PagerTitleStripIcs
{
  public static void setSingleLineAllCaps(TextView paramTextView)
  {
    PagerTitleStripIcs.SingleLineAllCapsTransform localSingleLineAllCapsTransform = new android/support/v4/view/PagerTitleStripIcs$SingleLineAllCapsTransform;
    Context localContext = paramTextView.getContext();
    localSingleLineAllCapsTransform.<init>(localContext);
    paramTextView.setTransformationMethod(localSingleLineAllCapsTransform);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/view/PagerTitleStripIcs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */