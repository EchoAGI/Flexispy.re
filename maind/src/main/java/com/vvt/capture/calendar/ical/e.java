package com.vvt.capture.calendar.ical;

public class e
{
  public boolean a;
  public int b = -1;
  public int c;
  public boolean d = false;
  
  public e(d paramd, String paramString)
  {
    int k = paramString.charAt(0);
    int n = 43;
    String str1;
    String str2;
    if (k == n)
    {
      this.a = j;
      i = j;
      k = paramString.charAt(i);
      n = 48;
      if (k >= n)
      {
        k = paramString.charAt(i);
        n = 57;
        if (k <= n)
        {
          k = paramString.charAt(i) + '￐';
          this.c = k;
          i += 1;
        }
      }
      k = i + 2;
      str1 = paramString.substring(i, k);
      str2 = "SU";
      boolean bool2 = str1.equals(str2);
      if (!bool2) {
        break label208;
      }
      this.b = j;
    }
    for (;;)
    {
      k = this.b;
      if (k >= 0)
      {
        k = paramString.length();
        i += 2;
        if (k == i) {
          this.d = j;
        }
      }
      return;
      k = paramString.charAt(0);
      int i1 = 45;
      if (k != i1) {
        break;
      }
      this.a = false;
      i = j;
      break;
      label208:
      str2 = "MO";
      boolean bool3 = str1.equals(str2);
      if (bool3)
      {
        k = 2;
        this.b = k;
      }
      else
      {
        str2 = "TU";
        bool3 = str1.equals(str2);
        if (bool3)
        {
          k = 4;
          this.b = k;
        }
        else
        {
          str2 = "WE";
          bool3 = str1.equals(str2);
          if (bool3)
          {
            k = 8;
            this.b = k;
          }
          else
          {
            str2 = "TH";
            bool3 = str1.equals(str2);
            if (bool3)
            {
              k = 16;
              this.b = k;
            }
            else
            {
              str2 = "FR";
              bool3 = str1.equals(str2);
              if (bool3)
              {
                k = 32;
                this.b = k;
              }
              else
              {
                str2 = "SA";
                boolean bool1 = str1.equals(str2);
                if (bool1)
                {
                  int m = 6;
                  this.b = m;
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/ical/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */