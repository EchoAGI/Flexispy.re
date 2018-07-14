package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$15
  extends TypeAdapter
{
  public Character read(JsonReader paramJsonReader)
  {
    Object localObject1 = paramJsonReader.peek();
    Object localObject2 = JsonToken.NULL;
    int i;
    if (localObject1 == localObject2)
    {
      paramJsonReader.nextNull();
      i = 0;
    }
    for (localObject1 = null;; localObject1 = Character.valueOf(i))
    {
      return (Character)localObject1;
      String str = paramJsonReader.nextString();
      i = str.length();
      int j = 1;
      if (i != j)
      {
        localObject1 = new com/google/gson/JsonSyntaxException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Expecting character, got: " + str;
        ((JsonSyntaxException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      i = str.charAt(0);
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Character paramCharacter)
  {
    if (paramCharacter == null) {}
    for (String str = null;; str = String.valueOf(paramCharacter))
    {
      paramJsonWriter.value(str);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$15.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */