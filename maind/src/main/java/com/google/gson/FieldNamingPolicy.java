package com.google.gson;

public enum FieldNamingPolicy
  implements FieldNamingStrategy
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/google/gson/FieldNamingPolicy$1;
    ((FieldNamingPolicy.1)localObject).<init>("IDENTITY", 0);
    IDENTITY = (FieldNamingPolicy)localObject;
    localObject = new com/google/gson/FieldNamingPolicy$2;
    ((FieldNamingPolicy.2)localObject).<init>("UPPER_CAMEL_CASE", m);
    UPPER_CAMEL_CASE = (FieldNamingPolicy)localObject;
    localObject = new com/google/gson/FieldNamingPolicy$3;
    ((FieldNamingPolicy.3)localObject).<init>("UPPER_CAMEL_CASE_WITH_SPACES", k);
    UPPER_CAMEL_CASE_WITH_SPACES = (FieldNamingPolicy)localObject;
    localObject = new com/google/gson/FieldNamingPolicy$4;
    ((FieldNamingPolicy.4)localObject).<init>("LOWER_CASE_WITH_UNDERSCORES", j);
    LOWER_CASE_WITH_UNDERSCORES = (FieldNamingPolicy)localObject;
    localObject = new com/google/gson/FieldNamingPolicy$5;
    ((FieldNamingPolicy.5)localObject).<init>("LOWER_CASE_WITH_DASHES", i);
    LOWER_CASE_WITH_DASHES = (FieldNamingPolicy)localObject;
    localObject = new FieldNamingPolicy[5];
    FieldNamingPolicy localFieldNamingPolicy = IDENTITY;
    localObject[0] = localFieldNamingPolicy;
    localFieldNamingPolicy = UPPER_CAMEL_CASE;
    localObject[m] = localFieldNamingPolicy;
    localFieldNamingPolicy = UPPER_CAMEL_CASE_WITH_SPACES;
    localObject[k] = localFieldNamingPolicy;
    localFieldNamingPolicy = LOWER_CASE_WITH_UNDERSCORES;
    localObject[j] = localFieldNamingPolicy;
    localFieldNamingPolicy = LOWER_CASE_WITH_DASHES;
    localObject[i] = localFieldNamingPolicy;
    $VALUES = (FieldNamingPolicy[])localObject;
  }
  
  private static String modifyString(char paramChar, String paramString, int paramInt)
  {
    int i = paramString.length();
    String str;
    if (paramInt < i)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramChar);
      str = paramString.substring(paramInt);
    }
    for (Object localObject = str;; localObject = String.valueOf(paramChar)) {
      return (String)localObject;
    }
  }
  
  static String separateCamelCase(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramString1.length();
      if (i >= j) {
        break;
      }
      char c = paramString1.charAt(i);
      boolean bool = Character.isUpperCase(c);
      if (bool)
      {
        int k = localStringBuilder.length();
        if (k != 0) {
          localStringBuilder.append(paramString2);
        }
      }
      localStringBuilder.append(c);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  static String upperCaseFirstLetter(String paramString)
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    int i = 0;
    char c1 = paramString.charAt(0);
    int j = paramString.length() + -1;
    if (i < j)
    {
      boolean bool1 = Character.isLetter(c1);
      if (!bool1) {}
    }
    else
    {
      int k = paramString.length();
      if (i != k) {
        break label79;
      }
      paramString = localStringBuilder1.toString();
    }
    for (;;)
    {
      return paramString;
      localStringBuilder1.append(c1);
      i += 1;
      c1 = paramString.charAt(i);
      break;
      label79:
      boolean bool2 = Character.isUpperCase(c1);
      if (!bool2)
      {
        char c2 = Character.toUpperCase(c1);
        i += 1;
        String str = modifyString(c2, paramString, i);
        StringBuilder localStringBuilder2 = localStringBuilder1.append(str);
        paramString = localStringBuilder2.toString();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/FieldNamingPolicy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */