package a_vcard.android.telephony;

import a_vcard.android.text.Editable;
import a_vcard.android.text.SpannableStringBuilder;
import java.util.Locale;

public class PhoneNumberUtils
{
  public static final int FORMAT_JAPAN = 2;
  public static final int FORMAT_NANP = 1;
  public static final int FORMAT_UNKNOWN = 0;
  private static final String[] NANP_COUNTRIES;
  private static final int NANP_STATE_DASH = 4;
  private static final int NANP_STATE_DIGIT = 1;
  private static final int NANP_STATE_ONE = 3;
  private static final int NANP_STATE_PLUS = 2;
  
  static
  {
    String[] arrayOfString = new String[24];
    arrayOfString[0] = "US";
    arrayOfString[1] = "CA";
    arrayOfString[2] = "AS";
    arrayOfString[3] = "AI";
    arrayOfString[4] = "AG";
    arrayOfString[5] = "BS";
    arrayOfString[6] = "BB";
    arrayOfString[7] = "BM";
    arrayOfString[8] = "VG";
    arrayOfString[9] = "KY";
    arrayOfString[10] = "DM";
    arrayOfString[11] = "DO";
    arrayOfString[12] = "GD";
    arrayOfString[13] = "GU";
    arrayOfString[14] = "JM";
    arrayOfString[15] = "PR";
    arrayOfString[16] = "MS";
    arrayOfString[17] = "NP";
    arrayOfString[18] = "KN";
    arrayOfString[19] = "LC";
    arrayOfString[20] = "VC";
    arrayOfString[21] = "TT";
    arrayOfString[22] = "TC";
    arrayOfString[23] = "VI";
    NANP_COUNTRIES = arrayOfString;
  }
  
  public static void formatJapaneseNumber(Editable paramEditable)
  {
    JapanesePhoneNumberFormatter.format(paramEditable);
  }
  
  public static void formatNanpNumber(Editable paramEditable)
  {
    int i = paramEditable.length();
    String str1 = "+1-nnn-nnn-nnnn";
    int j = str1.length();
    if (i > j) {}
    int m;
    int[] arrayOfInt;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    for (;;)
    {
      return;
      j = 0;
      str1 = null;
      CharSequence localCharSequence = paramEditable.subSequence(0, i);
      int k = 0;
      for (;;)
      {
        j = paramEditable.length();
        if (k >= j) {
          break;
        }
        j = paramEditable.charAt(k);
        m = 45;
        if (j == m)
        {
          j = k + 1;
          paramEditable.delete(k, j);
        }
        else
        {
          k += 1;
        }
      }
      i = paramEditable.length();
      j = 3;
      arrayOfInt = new int[j];
      n = 0;
      i1 = 1;
      i2 = 0;
      i3 = 0;
      for (i4 = 0;; i4 = n)
      {
        if (i3 >= i) {
          break label396;
        }
        int i5 = paramEditable.charAt(i3);
        switch (i5)
        {
        case 44: 
        case 46: 
        case 47: 
        default: 
          j = 0;
          str1 = null;
          paramEditable.replace(0, i, localCharSequence);
          break;
        case 49: 
          label220:
          if (i2 != 0)
          {
            j = 2;
            if (i1 != j) {
              break label271;
            }
          }
          i1 = 3;
          n = i4;
          label258:
          i3 += 1;
        }
      }
      label271:
      j = 2;
      if (i1 != j) {
        break;
      }
      j = 0;
      str1 = null;
      paramEditable.replace(0, i, localCharSequence);
    }
    j = 3;
    if (i1 == j)
    {
      n = i4 + 1;
      arrayOfInt[i4] = i3;
    }
    for (;;)
    {
      i1 = 1;
      i2 += 1;
      break label258;
      j = 4;
      if (i1 != j)
      {
        j = 3;
        if (i2 != j)
        {
          j = 6;
          if (i2 != j) {}
        }
        else
        {
          n = i4 + 1;
          arrayOfInt[i4] = i3;
          continue;
          i1 = 4;
          n = i4;
          break label258;
          if (i3 != 0) {
            break label220;
          }
          i1 = 2;
          n = i4;
          break label258;
          label396:
          j = 7;
          if (i2 == j) {}
          for (n = i4 + -1;; n = i4)
          {
            i3 = 0;
            while (i3 < n)
            {
              int i6 = arrayOfInt[i3];
              j = i6 + i3;
              m = i6 + i3;
              String str2 = "-";
              paramEditable.replace(j, m, str2);
              i3 += 1;
            }
            int i7 = paramEditable.length();
            for (;;)
            {
              if (i7 <= 0) {
                break label524;
              }
              j = i7 + -1;
              j = paramEditable.charAt(j);
              m = 45;
              if (j != m) {
                break;
              }
              j = i7 + -1;
              paramEditable.delete(j, i7);
              i7 += -1;
            }
            label524:
            break;
          }
        }
      }
      n = i4;
    }
  }
  
  public static String formatNumber(String paramString)
  {
    SpannableStringBuilder localSpannableStringBuilder = new a_vcard/android/text/SpannableStringBuilder;
    localSpannableStringBuilder.<init>(paramString);
    int i = getFormatTypeForLocale(Locale.getDefault());
    formatNumber(localSpannableStringBuilder, i);
    return localSpannableStringBuilder.toString();
  }
  
  public static void formatNumber(Editable paramEditable, int paramInt)
  {
    int i = 49;
    int j = 2;
    int k = 1;
    int m = paramInt;
    int n = paramEditable.length();
    int i1;
    if (n > j)
    {
      n = paramEditable.charAt(0);
      i1 = 43;
      if (n == i1)
      {
        n = paramEditable.charAt(k);
        if (n != i) {
          break label89;
        }
        m = 1;
      }
    }
    switch (m)
    {
    }
    for (;;)
    {
      return;
      label89:
      n = paramEditable.length();
      i1 = 3;
      if (n >= i1)
      {
        n = paramEditable.charAt(k);
        i1 = 56;
        if (n == i1)
        {
          n = paramEditable.charAt(j);
          if (n == i)
          {
            m = 2;
            break;
            formatNanpNumber(paramEditable);
            continue;
            formatJapaneseNumber(paramEditable);
          }
        }
      }
    }
  }
  
  public static int getFormatTypeForLocale(Locale paramLocale)
  {
    String str = paramLocale.getCountry();
    Object localObject = NANP_COUNTRIES;
    int i = localObject.length;
    int j = 0;
    int k;
    if (j < i)
    {
      localObject = NANP_COUNTRIES[j];
      k = ((String)localObject).equals(str);
      if (k != 0) {
        k = 1;
      }
    }
    for (;;)
    {
      return k;
      j += 1;
      break;
      localObject = Locale.JAPAN;
      boolean bool = paramLocale.equals(localObject);
      int m;
      if (bool)
      {
        m = 2;
      }
      else
      {
        m = 0;
        localObject = null;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/a_vcard/android/telephony/PhoneNumberUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */