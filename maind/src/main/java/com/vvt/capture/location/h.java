package com.vvt.capture.location;

import android.location.Location;
import com.vvt.base.FxEvent;
import com.vvt.location.LocationSource;
import com.vvt.location.j;
import com.vvt.location.n;
import com.vvt.location.o;

class h implements o {
  private CallingModule b;
  
  private h(f paramf) {}
  
  public void a() {
    boolean bool = f.c();
    if (bool) {}
    Object localObject = f.a(this.a).a();
    f localf = this.a;
    CallingModule localCallingModule = this.b;
    Location localLocation = ((n)localObject).a();
    localObject = ((n)localObject).b();
    localObject = f.a(localf, localCallingModule, localLocation, (LocationSource)localObject);
    localf = this.a;
    localCallingModule = this.b;
    f.a(localf, localCallingModule, (FxEvent)localObject);
    bool = f.c();
    if (bool) {}
  }
  
  public void a(CallingModule paramCallingModule)
  {
    this.b = paramCallingModule;
  }
  
  public void b() {
    CallingModule localCallingModule = null;
    boolean bool = f.c();
    if (bool) {}
    Object localObject1 = this.a;
    Object localObject2 = this.b;
    localObject1 = f.a((f)localObject1, (CallingModule)localObject2, null, null);
    localObject2 = this.a;
    localCallingModule = this.b;
    f.a((f)localObject2, localCallingModule, (FxEvent)localObject1);
    bool = f.c();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/location/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */