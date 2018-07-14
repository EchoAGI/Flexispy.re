package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;

final class TreeTypeAdapter$GsonContextImpl
  implements JsonSerializationContext, JsonDeserializationContext
{
  private TreeTypeAdapter$GsonContextImpl(TreeTypeAdapter paramTreeTypeAdapter) {}
  
  public Object deserialize(JsonElement paramJsonElement, Type paramType)
  {
    return TreeTypeAdapter.access$100(this.this$0).fromJson(paramJsonElement, paramType);
  }
  
  public JsonElement serialize(Object paramObject)
  {
    return TreeTypeAdapter.access$100(this.this$0).toJsonTree(paramObject);
  }
  
  public JsonElement serialize(Object paramObject, Type paramType)
  {
    return TreeTypeAdapter.access$100(this.this$0).toJsonTree(paramObject, paramType);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/google/gson/internal/bind/TreeTypeAdapter$GsonContextImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */