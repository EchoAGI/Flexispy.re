package com.vvt.phoenix.prot.command.data;

public enum CalendarEntry$Priority
{
  private int mPriority;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$Priority;
    ((Priority)localObject).<init>("NONE", 0, 0);
    NONE = (Priority)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$Priority;
    ((Priority)localObject).<init>("PRIVATE", m, m);
    PRIVATE = (Priority)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$Priority;
    ((Priority)localObject).<init>("PUBLIC", k, k);
    PUBLIC = (Priority)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$Priority;
    ((Priority)localObject).<init>("LOW", j, m);
    LOW = (Priority)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$Priority;
    ((Priority)localObject).<init>("NORMAL", i, k);
    NORMAL = (Priority)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarEntry$Priority;
    ((Priority)localObject).<init>("HIGH", 5, j);
    HIGH = (Priority)localObject;
    localObject = new Priority[6];
    Priority localPriority1 = NONE;
    localObject[0] = localPriority1;
    localPriority1 = PRIVATE;
    localObject[m] = localPriority1;
    localPriority1 = PUBLIC;
    localObject[k] = localPriority1;
    localPriority1 = LOW;
    localObject[j] = localPriority1;
    localPriority1 = NORMAL;
    localObject[i] = localPriority1;
    Priority localPriority2 = HIGH;
    localObject[5] = localPriority2;
    a = (Priority[])localObject;
  }
  
  private CalendarEntry$Priority(int paramInt1)
  {
    this.mPriority = paramInt1;
  }
  
  public int getValue()
  {
    return this.mPriority;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/CalendarEntry$Priority.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */