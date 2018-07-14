package android.support.v4.database;

import android.text.TextUtils;

public class DatabaseUtilsCompat
{
  public static String[] appendSelectionArgs(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    int i;
    String[] arrayOfString;
    if (paramArrayOfString1 != null)
    {
      i = paramArrayOfString1.length;
      if (i != 0) {}
    }
    else
    {
      arrayOfString = paramArrayOfString2;
    }
    for (;;)
    {
      return arrayOfString;
      i = paramArrayOfString1.length;
      int j = paramArrayOfString2.length;
      arrayOfString = new String[i + j];
      i = paramArrayOfString1.length;
      System.arraycopy(paramArrayOfString1, 0, arrayOfString, 0, i);
      i = paramArrayOfString1.length;
      j = paramArrayOfString2.length;
      System.arraycopy(paramArrayOfString2, 0, arrayOfString, i, j);
    }
  }
  
  public static String concatenateWhere(String paramString1, String paramString2)
  {
    boolean bool = TextUtils.isEmpty(paramString1);
    if (bool) {}
    for (;;)
    {
      return paramString2;
      bool = TextUtils.isEmpty(paramString2);
      if (bool)
      {
        paramString2 = paramString1;
      }
      else
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("(").append(paramString1).append(") AND (").append(paramString2);
        String str = ")";
        localStringBuilder = localStringBuilder.append(str);
        paramString2 = localStringBuilder.toString();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/database/DatabaseUtilsCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */