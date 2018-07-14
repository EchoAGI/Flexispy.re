package com.vvt.callmanager.filter;

import com.vvt.sms.SmsInfo;
import java.util.List;
import java.util.TimerTask;

class j
  extends TimerTask
{
  j(FilterSms paramFilterSms) {}
  
  public void run()
  {
    boolean bool = FilterSms.b();
    if (bool) {}
    FilterSms localFilterSms = this.a;
    SmsInfo localSmsInfo = FilterSms.a(this.a);
    FilterSms.a(localFilterSms, localSmsInfo);
    FilterSms.b(this.a, null);
    FilterSms.b(this.a).clear();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */