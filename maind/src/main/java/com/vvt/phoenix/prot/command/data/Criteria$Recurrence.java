package com.vvt.phoenix.prot.command.data;

public enum Criteria$Recurrence
{
  private int mValue;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/phoenix/prot/command/data/Criteria$Recurrence;
    ((Recurrence)localObject).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (Recurrence)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/Criteria$Recurrence;
    ((Recurrence)localObject).<init>("DAILY", m, m);
    DAILY = (Recurrence)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/Criteria$Recurrence;
    ((Recurrence)localObject).<init>("WEEKLY", k, k);
    WEEKLY = (Recurrence)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/Criteria$Recurrence;
    ((Recurrence)localObject).<init>("MONTHLY", j, j);
    MONTHLY = (Recurrence)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/Criteria$Recurrence;
    ((Recurrence)localObject).<init>("YEARLY", i, i);
    YEARLY = (Recurrence)localObject;
    localObject = new Recurrence[5];
    Recurrence localRecurrence = UNKNOWN;
    localObject[0] = localRecurrence;
    localRecurrence = DAILY;
    localObject[m] = localRecurrence;
    localRecurrence = WEEKLY;
    localObject[k] = localRecurrence;
    localRecurrence = MONTHLY;
    localObject[j] = localRecurrence;
    localRecurrence = YEARLY;
    localObject[i] = localRecurrence;
    a = (Recurrence[])localObject;
  }
  
  private Criteria$Recurrence(int paramInt1)
  {
    this.mValue = paramInt1;
  }
  
  public static Recurrence forValue(int paramInt)
  {
    return values()[paramInt];
  }
  
  public int getValue()
  {
    return this.mValue;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/Criteria$Recurrence.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */