package com.vvt.phoenix.prot.command.data;

public enum CalendarRecurrence$RecurrenceType
{
  private int mType;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$RecurrenceType;
    ((RecurrenceType)localObject).<init>("NONE", 0, 0);
    NONE = (RecurrenceType)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$RecurrenceType;
    ((RecurrenceType)localObject).<init>("DAILY", m, m);
    DAILY = (RecurrenceType)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$RecurrenceType;
    ((RecurrenceType)localObject).<init>("WEEKLY", k, k);
    WEEKLY = (RecurrenceType)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$RecurrenceType;
    ((RecurrenceType)localObject).<init>("MONTHLY", j, j);
    MONTHLY = (RecurrenceType)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$RecurrenceType;
    ((RecurrenceType)localObject).<init>("YEARLY", i, i);
    YEARLY = (RecurrenceType)localObject;
    localObject = new RecurrenceType[5];
    RecurrenceType localRecurrenceType = NONE;
    localObject[0] = localRecurrenceType;
    localRecurrenceType = DAILY;
    localObject[m] = localRecurrenceType;
    localRecurrenceType = WEEKLY;
    localObject[k] = localRecurrenceType;
    localRecurrenceType = MONTHLY;
    localObject[j] = localRecurrenceType;
    localRecurrenceType = YEARLY;
    localObject[i] = localRecurrenceType;
    a = (RecurrenceType[])localObject;
  }
  
  private CalendarRecurrence$RecurrenceType(int paramInt1)
  {
    this.mType = paramInt1;
  }
  
  public int getValue()
  {
    return this.mType;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/CalendarRecurrence$RecurrenceType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */