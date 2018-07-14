package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;

final class JsonReader$1
  extends JsonReaderInternalAccess
{
  public void promoteNameToValue(JsonReader paramJsonReader)
  {
    boolean bool = paramJsonReader instanceof JsonTreeReader;
    if (bool)
    {
      paramJsonReader = (JsonTreeReader)paramJsonReader;
      paramJsonReader.promoteNameToValue();
    }
    for (;;)
    {
      return;
      int j = paramJsonReader.peeked;
      if (j == 0) {
        j = paramJsonReader.doPeek();
      }
      int i = 13;
      if (j == i)
      {
        i = 9;
        paramJsonReader.peeked = i;
      }
      else
      {
        i = 12;
        if (j == i)
        {
          i = 8;
          paramJsonReader.peeked = i;
        }
        else
        {
          i = 14;
          if (j != i) {
            break;
          }
          i = 10;
          paramJsonReader.peeked = i;
        }
      }
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Expected a name but was ");
    Object localObject2 = paramJsonReader.peek();
    localObject1 = ((StringBuilder)localObject1).append(localObject2);
    localObject2 = JsonReader.access$000(paramJsonReader);
    localObject1 = (String)localObject2;
    localIllegalStateException.<init>((String)localObject1);
    throw localIllegalStateException;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/stream/JsonReader$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */