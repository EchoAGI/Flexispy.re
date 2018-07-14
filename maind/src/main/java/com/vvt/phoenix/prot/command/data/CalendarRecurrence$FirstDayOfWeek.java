package com.vvt.phoenix.prot.command.data;

public enum CalendarRecurrence$FirstDayOfWeek
{
  private int mDay;
  
  static
  {
    int i = 5;
    int j = 4;
    int k = 3;
    int m = 2;
    int n = 1;
    Object localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$FirstDayOfWeek;
    ((FirstDayOfWeek)localObject).<init>("SUNDAY", 0, n);
    SUNDAY = (FirstDayOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$FirstDayOfWeek;
    ((FirstDayOfWeek)localObject).<init>("MONDAY", n, m);
    MONDAY = (FirstDayOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$FirstDayOfWeek;
    ((FirstDayOfWeek)localObject).<init>("TUESDAY", m, k);
    TUESDAY = (FirstDayOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$FirstDayOfWeek;
    ((FirstDayOfWeek)localObject).<init>("WEDNESDAY", k, j);
    WEDNESDAY = (FirstDayOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$FirstDayOfWeek;
    ((FirstDayOfWeek)localObject).<init>("THURSDAY", j, i);
    THURSDAY = (FirstDayOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$FirstDayOfWeek;
    ((FirstDayOfWeek)localObject).<init>("FRIDAY", i, 6);
    FRIDAY = (FirstDayOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$FirstDayOfWeek;
    ((FirstDayOfWeek)localObject).<init>("SATURDAY", 6, 7);
    SATURDAY = (FirstDayOfWeek)localObject;
    localObject = new FirstDayOfWeek[7];
    FirstDayOfWeek localFirstDayOfWeek1 = SUNDAY;
    localObject[0] = localFirstDayOfWeek1;
    FirstDayOfWeek localFirstDayOfWeek2 = MONDAY;
    localObject[n] = localFirstDayOfWeek2;
    localFirstDayOfWeek2 = TUESDAY;
    localObject[m] = localFirstDayOfWeek2;
    localFirstDayOfWeek2 = WEDNESDAY;
    localObject[k] = localFirstDayOfWeek2;
    localFirstDayOfWeek2 = THURSDAY;
    localObject[j] = localFirstDayOfWeek2;
    localFirstDayOfWeek2 = FRIDAY;
    localObject[i] = localFirstDayOfWeek2;
    localFirstDayOfWeek1 = SATURDAY;
    localObject[6] = localFirstDayOfWeek1;
    a = (FirstDayOfWeek[])localObject;
  }
  
  private CalendarRecurrence$FirstDayOfWeek(int paramInt1)
  {
    this.mDay = paramInt1;
  }
  
  public int getValue()
  {
    return this.mDay;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/CalendarRecurrence$FirstDayOfWeek.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */