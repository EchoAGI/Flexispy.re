package com.vvt.phoenix.prot.command.data;

public enum CalendarEntry$EntryType
{
  private int mType;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$EntryType;
    ((EntryType)localObject).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (EntryType)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$EntryType;
    ((EntryType)localObject).<init>("MEETING", m, m);
    MEETING = (EntryType)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$EntryType;
    ((EntryType)localObject).<init>("ANNIVERSARY", k, k);
    ANNIVERSARY = (EntryType)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$EntryType;
    ((EntryType)localObject).<init>("TASK", j, j);
    TASK = (EntryType)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$EntryType;
    ((EntryType)localObject).<init>("APPOINTMENT", i, i);
    APPOINTMENT = (EntryType)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$EntryType;
    ((EntryType)localObject).<init>("REMINDER", 5, 5);
    REMINDER = (EntryType)localObject;
    localObject = new EntryType[6];
    EntryType localEntryType1 = UNKNOWN;
    localObject[0] = localEntryType1;
    localEntryType1 = MEETING;
    localObject[m] = localEntryType1;
    localEntryType1 = ANNIVERSARY;
    localObject[k] = localEntryType1;
    localEntryType1 = TASK;
    localObject[j] = localEntryType1;
    localEntryType1 = APPOINTMENT;
    localObject[i] = localEntryType1;
    EntryType localEntryType2 = REMINDER;
    localObject[5] = localEntryType2;
    a = (EntryType[])localObject;
  }
  
  private CalendarEntry$EntryType(int paramInt1)
  {
    this.mType = paramInt1;
  }
  
  public int getValue()
  {
    return this.mType;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/CalendarEntry$EntryType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */