package a_vcard.android.text;

public class Selection
{
  public static final Object SELECTION_END;
  public static final Object SELECTION_START;
  
  static
  {
    Object localObject = new a_vcard/android/text/Selection$START;
    ((Selection.START)localObject).<init>(null);
    SELECTION_START = localObject;
    localObject = new a_vcard/android/text/Selection$END;
    ((Selection.END)localObject).<init>(null);
    SELECTION_END = localObject;
  }
  
  public static final void extendSelection(Spannable paramSpannable, int paramInt)
  {
    Object localObject = SELECTION_END;
    int i = paramSpannable.getSpanStart(localObject);
    if (i != paramInt)
    {
      localObject = SELECTION_END;
      int j = 34;
      paramSpannable.setSpan(localObject, paramInt, paramInt, j);
    }
  }
  
  public static final int getSelectionEnd(CharSequence paramCharSequence)
  {
    boolean bool = paramCharSequence instanceof Spanned;
    Object localObject;
    if (bool)
    {
      paramCharSequence = (Spanned)paramCharSequence;
      localObject = SELECTION_END;
    }
    for (int i = paramCharSequence.getSpanStart(localObject);; i = -1) {
      return i;
    }
  }
  
  public static final int getSelectionStart(CharSequence paramCharSequence)
  {
    boolean bool = paramCharSequence instanceof Spanned;
    Object localObject;
    if (bool)
    {
      paramCharSequence = (Spanned)paramCharSequence;
      localObject = SELECTION_START;
    }
    for (int i = paramCharSequence.getSpanStart(localObject);; i = -1) {
      return i;
    }
  }
  
  public static final void removeSelection(Spannable paramSpannable)
  {
    Object localObject = SELECTION_START;
    paramSpannable.removeSpan(localObject);
    localObject = SELECTION_END;
    paramSpannable.removeSpan(localObject);
  }
  
  public static final void selectAll(Spannable paramSpannable)
  {
    int i = paramSpannable.length();
    setSelection(paramSpannable, 0, i);
  }
  
  public static final void setSelection(Spannable paramSpannable, int paramInt)
  {
    setSelection(paramSpannable, paramInt, paramInt);
  }
  
  public static void setSelection(Spannable paramSpannable, int paramInt1, int paramInt2)
  {
    int i = getSelectionStart(paramSpannable);
    int j = getSelectionEnd(paramSpannable);
    if ((i != paramInt1) || (j != paramInt2))
    {
      Object localObject = SELECTION_START;
      paramSpannable.setSpan(localObject, paramInt1, paramInt1, 546);
      localObject = SELECTION_END;
      int k = 34;
      paramSpannable.setSpan(localObject, paramInt2, paramInt2, k);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/text/Selection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */