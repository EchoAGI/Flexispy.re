package com.vvt.phoenix.prot.command.data;

public enum CalendarRecurrence$DaysOfWeek
{
  private int mDay;
  
  static
  {
    int i = 3;
    int j = 4;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$DaysOfWeek;
    ((DaysOfWeek)localObject).<init>("NONE", 0, 0);
    NONE = (DaysOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$DaysOfWeek;
    ((DaysOfWeek)localObject).<init>("SUNDAY", m, m);
    SUNDAY = (DaysOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$DaysOfWeek;
    ((DaysOfWeek)localObject).<init>("MONDAY", k, k);
    MONDAY = (DaysOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$DaysOfWeek;
    ((DaysOfWeek)localObject).<init>("TUESDAY", i, j);
    TUESDAY = (DaysOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$DaysOfWeek;
    ((DaysOfWeek)localObject).<init>("WEDNESDAY", j, 8);
    WEDNESDAY = (DaysOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$DaysOfWeek;
    ((DaysOfWeek)localObject).<init>("THURSDAY", 5, 16);
    THURSDAY = (DaysOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$DaysOfWeek;
    ((DaysOfWeek)localObject).<init>("FRIDAY", 6, 32);
    FRIDAY = (DaysOfWeek)localObject;
    localObject = new com/vvt/phoenix/prot/command/data/CalendarRecurrence$DaysOfWeek;
    ((DaysOfWeek)localObject).<init>("SATURDAY", 7, 64);
    SATURDAY = (DaysOfWeek)localObject;
    localObject = new DaysOfWeek[8];
    DaysOfWeek localDaysOfWeek1 = NONE;
    localObject[0] = localDaysOfWeek1;
    localDaysOfWeek1 = SUNDAY;
    localObject[m] = localDaysOfWeek1;
    localDaysOfWeek1 = MONDAY;
    localObject[k] = localDaysOfWeek1;
    localDaysOfWeek1 = TUESDAY;
    localObject[i] = localDaysOfWeek1;
    localDaysOfWeek1 = WEDNESDAY;
    localObject[j] = localDaysOfWeek1;
    DaysOfWeek localDaysOfWeek2 = THURSDAY;
    localObject[5] = localDaysOfWeek2;
    localDaysOfWeek2 = FRIDAY;
    localObject[6] = localDaysOfWeek2;
    localDaysOfWeek2 = SATURDAY;
    localObject[7] = localDaysOfWeek2;
    a = (DaysOfWeek[])localObject;
  }
  
  private CalendarRecurrence$DaysOfWeek(int paramInt1)
  {
    this.mDay = paramInt1;
  }
  
  public int getValue()
  {
    return this.mDay;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/data/CalendarRecurrence$DaysOfWeek.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */