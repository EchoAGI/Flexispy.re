package a_vcard.android.text;

public class InputFilter$LengthFilter
  implements InputFilter
{
  private int mMax;
  
  public InputFilter$LengthFilter(int paramInt)
  {
    this.mMax = paramInt;
  }
  
  public CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    int i = this.mMax;
    int j = paramSpanned.length();
    int k = paramInt4 - paramInt3;
    j -= k;
    int m = i - j;
    Object localObject;
    if (m <= 0) {
      localObject = "";
    }
    for (;;)
    {
      return (CharSequence)localObject;
      i = paramInt2 - paramInt1;
      if (m >= i)
      {
        i = 0;
        localObject = null;
      }
      else
      {
        i = paramInt1 + m;
        localObject = paramCharSequence.subSequence(paramInt1, i);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/text/InputFilter$LengthFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */