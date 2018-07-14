package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Locale;
import java.util.StringTokenizer;

final class TypeAdapters$28
  extends TypeAdapter
{
  public Locale read(JsonReader paramJsonReader)
  {
    Object localObject = paramJsonReader.peek();
    JsonToken localJsonToken = JsonToken.NULL;
    boolean bool;
    if (localObject == localJsonToken)
    {
      paramJsonReader.nextNull();
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (Locale)localObject;
      String str1 = paramJsonReader.nextString();
      StringTokenizer localStringTokenizer = new java/util/StringTokenizer;
      localObject = "_";
      localStringTokenizer.<init>(str1, (String)localObject);
      String str2 = null;
      String str3 = null;
      String str4 = null;
      bool = localStringTokenizer.hasMoreElements();
      if (bool) {
        str2 = localStringTokenizer.nextToken();
      }
      bool = localStringTokenizer.hasMoreElements();
      if (bool) {
        str3 = localStringTokenizer.nextToken();
      }
      bool = localStringTokenizer.hasMoreElements();
      if (bool) {
        str4 = localStringTokenizer.nextToken();
      }
      if ((str3 == null) && (str4 == null))
      {
        localObject = new java/util/Locale;
        ((Locale)localObject).<init>(str2);
      }
      else if (str4 == null)
      {
        localObject = new java/util/Locale;
        ((Locale)localObject).<init>(str2, str3);
      }
      else
      {
        localObject = new java/util/Locale;
        ((Locale)localObject).<init>(str2, str3, str4);
      }
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Locale paramLocale)
  {
    if (paramLocale == null) {}
    for (String str = null;; str = paramLocale.toString())
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$28.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */