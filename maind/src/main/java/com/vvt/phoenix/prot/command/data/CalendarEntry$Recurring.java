package com.vvt.phoenix.prot.command.data;

public enum CalendarEntry$Recurring
{
  private int mRecurring;
  
  static
  {
    int i = 1;
    Object localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$Recurring;
    ((Recurring)localObject).<init>("NO", 0, 0);
    NO = (Recurring)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$Recurring;
    ((Recurring)localObject).<init>("YES", i, i);
    YES = (Recurring)localObject;
    localObject = new Recurring[2];
    Recurring localRecurring = NO;
    localObject[0] = localRecurring;
    localRecurring = YES;
    localObject[i] = localRecurring;
    a = (Recurring[])localObject;
  }
  
  private CalendarEntry$Recurring(int paramInt1)
  {
    this.mRecurring = paramInt1;
  }
  
  public int getValue()
  {
    return this.mRecurring;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/CalendarEntry$Recurring.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */