package a_vcard.android.text;

public abstract interface Editable
  extends CharSequence, GetChars, Appendable
{
  public abstract Editable append(char paramChar);
  
  public abstract Editable append(CharSequence paramCharSequence);
  
  public abstract Editable append(CharSequence paramCharSequence, int paramInt1, int paramInt2);
  
  public abstract void clear();
  
  public abstract void clearSpans();
  
  public abstract Editable delete(int paramInt1, int paramInt2);
  
  public abstract InputFilter[] getFilters();
  
  public abstract Editable insert(int paramInt, CharSequence paramCharSequence);
  
  public abstract Editable insert(int paramInt1, CharSequence paramCharSequence, int paramInt2, int paramInt3);
  
  public abstract Editable replace(int paramInt1, int paramInt2, CharSequence paramCharSequence);
  
  public abstract Editable replace(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4);
  
  public abstract void setFilters(InputFilter[] paramArrayOfInputFilter);
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/text/Editable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */