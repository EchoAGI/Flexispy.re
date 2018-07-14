package a_vcard.android.text;

public class Editable$Factory
{
  private static Factory sInstance;
  
  static
  {
    Factory localFactory = new a_vcard/android/text/Editable$Factory;
    localFactory.<init>();
    sInstance = localFactory;
  }
  
  public static Factory getInstance()
  {
    return sInstance;
  }
  
  public Editable newEditable(CharSequence paramCharSequence)
  {
    SpannableStringBuilder localSpannableStringBuilder = new a_vcard/android/text/SpannableStringBuilder;
    localSpannableStringBuilder.<init>(paramCharSequence);
    return localSpannableStringBuilder;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/text/Editable$Factory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */