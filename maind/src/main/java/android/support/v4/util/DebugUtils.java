package android.support.v4.util;

public class DebugUtils
{
  public static void buildShortClassTag(Object paramObject, StringBuilder paramStringBuilder)
  {
    Object localObject;
    if (paramObject == null)
    {
      localObject = "null";
      paramStringBuilder.append((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = paramObject.getClass();
      String str = ((Class)localObject).getSimpleName();
      if (str != null)
      {
        i = str.length();
        if (i > 0) {}
      }
      else
      {
        localObject = paramObject.getClass();
        str = ((Class)localObject).getName();
        i = 46;
        int j = str.lastIndexOf(i);
        if (j > 0)
        {
          i = j + 1;
          str = str.substring(i);
        }
      }
      paramStringBuilder.append(str);
      paramStringBuilder.append('{');
      int i = System.identityHashCode(paramObject);
      localObject = Integer.toHexString(i);
      paramStringBuilder.append((String)localObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/util/DebugUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */