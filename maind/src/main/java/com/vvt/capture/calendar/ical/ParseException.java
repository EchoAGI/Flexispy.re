package com.vvt.capture.calendar.ical;

public class ParseException
  extends Exception
{
  private static final long serialVersionUID = -471284195879231580L;
  public String error;
  public String icalText;
  
  public ParseException(String paramString1, String paramString2)
  {
    super(paramString1);
    this.error = paramString1;
    this.icalText = paramString2;
  }
  
  public String toString()
  {
    Object localObject1 = super.toString();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append("\nInput iCal data: '");
    localObject2 = this.icalText;
    return (String)localObject2 + "'\n";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/ical/ParseException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */