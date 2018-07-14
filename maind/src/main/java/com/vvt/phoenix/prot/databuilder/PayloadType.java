package com.vvt.phoenix.prot.databuilder;

public enum PayloadType
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/phoenix/prot/databuilder/PayloadType;
    ((PayloadType)localObject).<init>("FILE", 0);
    FILE = (PayloadType)localObject;
    localObject = new com/vvt/phoenix/prot/databuilder/PayloadType;
    ((PayloadType)localObject).<init>("BUFFER", j);
    BUFFER = (PayloadType)localObject;
    localObject = new com/vvt/phoenix/prot/databuilder/PayloadType;
    ((PayloadType)localObject).<init>("VIRTUAL", i);
    VIRTUAL = (PayloadType)localObject;
    localObject = new PayloadType[3];
    PayloadType localPayloadType = FILE;
    localObject[0] = localPayloadType;
    localPayloadType = BUFFER;
    localObject[j] = localPayloadType;
    localPayloadType = VIRTUAL;
    localObject[i] = localPayloadType;
    a = (PayloadType[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/databuilder/PayloadType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */