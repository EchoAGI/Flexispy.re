package com.android.internal.telephony;

class GsmAlphabet$LanguagePairCount
{
  final int languageCode;
  final int[] septetCounts;
  final int[] unencodableCounts;
  
  GsmAlphabet$LanguagePairCount(int paramInt)
  {
    this.languageCode = paramInt;
    int m = GsmAlphabet.access$000();
    int[] arrayOfInt1 = new int[m + 1];
    this.septetCounts = arrayOfInt1;
    arrayOfInt1 = new int[m + 1];
    this.unencodableCounts = arrayOfInt1;
    int n = 0;
    arrayOfInt1 = null;
    int i1 = k;
    if (i1 <= m)
    {
      int[] arrayOfInt2 = GsmAlphabet.access$100();
      int i2 = arrayOfInt2[n];
      if (i2 == i1) {
        n += 1;
      }
      for (;;)
      {
        i1 += 1;
        break;
        arrayOfInt2 = this.septetCounts;
        arrayOfInt2[i1] = j;
      }
    }
    if ((paramInt == k) && (m >= k))
    {
      arrayOfInt1 = this.septetCounts;
      arrayOfInt1[k] = j;
    }
    for (;;)
    {
      return;
      n = 3;
      if ((paramInt == n) && (m >= i))
      {
        arrayOfInt1 = this.septetCounts;
        arrayOfInt1[i] = j;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/android/internal/telephony/GsmAlphabet$LanguagePairCount.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */