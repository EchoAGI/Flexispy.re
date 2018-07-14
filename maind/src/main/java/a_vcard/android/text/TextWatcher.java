package a_vcard.android.text;

public abstract interface TextWatcher
  extends NoCopySpan
{
  public abstract void afterTextChanged(Editable paramEditable);
  
  public abstract void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/text/TextWatcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */