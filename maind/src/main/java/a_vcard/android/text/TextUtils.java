package a_vcard.android.text;

public class TextUtils
{
  public static void getChars(CharSequence paramCharSequence, int paramInt1, int paramInt2, char[] paramArrayOfChar, int paramInt3)
  {
    Class localClass1 = paramCharSequence.getClass();
    Class localClass2 = String.class;
    if (localClass1 == localClass2)
    {
      paramCharSequence = (String)paramCharSequence;
      paramCharSequence.getChars(paramInt1, paramInt2, paramArrayOfChar, paramInt3);
    }
    for (;;)
    {
      return;
      localClass2 = StringBuffer.class;
      if (localClass1 == localClass2)
      {
        paramCharSequence = (StringBuffer)paramCharSequence;
        paramCharSequence.getChars(paramInt1, paramInt2, paramArrayOfChar, paramInt3);
      }
      else
      {
        localClass2 = StringBuilder.class;
        if (localClass1 == localClass2)
        {
          paramCharSequence = (StringBuilder)paramCharSequence;
          paramCharSequence.getChars(paramInt1, paramInt2, paramArrayOfChar, paramInt3);
        }
        else
        {
          boolean bool = paramCharSequence instanceof GetChars;
          if (bool)
          {
            paramCharSequence = (GetChars)paramCharSequence;
            paramCharSequence.getChars(paramInt1, paramInt2, paramArrayOfChar, paramInt3);
          }
          else
          {
            int j = paramInt1;
            for (int k = paramInt3; j < paramInt2; k = paramInt3)
            {
              paramInt3 = k + 1;
              int i = paramCharSequence.charAt(j);
              paramArrayOfChar[k] = i;
              j += 1;
            }
            paramInt3 = k;
          }
        }
      }
    }
  }
  
  public static boolean isEmpty(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      i = paramCharSequence.length();
      if (i != 0) {
        break label19;
      }
    }
    label19:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/text/TextUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */