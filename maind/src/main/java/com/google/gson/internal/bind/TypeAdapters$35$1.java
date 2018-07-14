package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

class TypeAdapters$35$1
  extends TypeAdapter
{
  TypeAdapters$35$1(TypeAdapters.35 param35, Class paramClass) {}
  
  public Object read(JsonReader paramJsonReader)
  {
    Object localObject1 = this.this$0.val$typeAdapter;
    Object localObject2 = ((TypeAdapter)localObject1).read(paramJsonReader);
    if (localObject2 != null)
    {
      localObject1 = this.val$requestedType;
      boolean bool = ((Class)localObject1).isInstance(localObject2);
      if (!bool)
      {
        localObject1 = new com/google/gson/JsonSyntaxException;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Expected a ");
        String str = this.val$requestedType.getName();
        localObject3 = ((StringBuilder)localObject3).append(str).append(" but was ");
        str = localObject2.getClass().getName();
        localObject3 = str;
        ((JsonSyntaxException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
    }
    return localObject2;
  }
  
  public void write(JsonWriter paramJsonWriter, Object paramObject)
  {
    this.this$0.val$typeAdapter.write(paramJsonWriter, paramObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TypeAdapters$35$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */