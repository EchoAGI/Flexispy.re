package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

final class TypeAdapters$14
  extends TypeAdapter
{
  public Number read(JsonReader paramJsonReader)
  {
    JsonToken localJsonToken = paramJsonReader.peek();
    Object localObject1 = TypeAdapters.36.$SwitchMap$com$google$gson$stream$JsonToken;
    int i = localJsonToken.ordinal();
    int j = localObject1[i];
    Object localObject2;
    switch (j)
    {
    default: 
      localObject1 = new com/google/gson/JsonSyntaxException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Expecting number, got: " + localJsonToken;
      ((JsonSyntaxException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 4: 
      paramJsonReader.nextNull();
      j = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (Number)localObject1;
      localObject1 = new com/google/gson/internal/LazilyParsedNumber;
      localObject2 = paramJsonReader.nextString();
      ((LazilyParsedNumber)localObject1).<init>((String)localObject2);
    }
  }
  
  public void write(JsonWriter paramJsonWriter, Number paramNumber)
  {
    paramJsonWriter.value(paramNumber);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$14.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */