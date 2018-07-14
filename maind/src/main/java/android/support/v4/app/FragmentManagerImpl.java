package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.LogWriter;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

final class FragmentManagerImpl
  extends FragmentManager
{
  static final Interpolator ACCELERATE_CUBIC;
  static final Interpolator ACCELERATE_QUINT;
  static final int ANIM_DUR = 220;
  public static final int ANIM_STYLE_CLOSE_ENTER = 3;
  public static final int ANIM_STYLE_CLOSE_EXIT = 4;
  public static final int ANIM_STYLE_FADE_ENTER = 5;
  public static final int ANIM_STYLE_FADE_EXIT = 6;
  public static final int ANIM_STYLE_OPEN_ENTER = 1;
  public static final int ANIM_STYLE_OPEN_EXIT = 2;
  static boolean DEBUG = false;
  static final Interpolator DECELERATE_CUBIC;
  static final Interpolator DECELERATE_QUINT;
  static final boolean HONEYCOMB = false;
  static final String TAG = "FragmentManager";
  static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
  static final String TARGET_STATE_TAG = "android:target_state";
  static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
  static final String VIEW_STATE_TAG = "android:view_state";
  ArrayList mActive;
  FragmentActivity mActivity;
  ArrayList mAdded;
  ArrayList mAvailBackStackIndices;
  ArrayList mAvailIndices;
  ArrayList mBackStack;
  ArrayList mBackStackChangeListeners;
  ArrayList mBackStackIndices;
  ArrayList mCreatedMenus;
  int mCurState = 0;
  boolean mDestroyed;
  Runnable mExecCommit;
  boolean mExecutingActions;
  boolean mHavePendingDeferredStart;
  boolean mNeedMenuInvalidate;
  String mNoTransactionsBecause;
  ArrayList mPendingActions;
  SparseArray mStateArray = null;
  Bundle mStateBundle = null;
  boolean mStateSaved;
  Runnable[] mTmpActions;
  
  static
  {
    boolean bool = false;
    Object localObject = null;
    float f1 = 2.5F;
    float f2 = 1.5F;
    DEBUG = false;
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    if (i >= j) {
      bool = true;
    }
    HONEYCOMB = bool;
    localObject = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject).<init>(f1);
    DECELERATE_QUINT = (Interpolator)localObject;
    localObject = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject).<init>(f2);
    DECELERATE_CUBIC = (Interpolator)localObject;
    localObject = new android/view/animation/AccelerateInterpolator;
    ((AccelerateInterpolator)localObject).<init>(f1);
    ACCELERATE_QUINT = (Interpolator)localObject;
    localObject = new android/view/animation/AccelerateInterpolator;
    ((AccelerateInterpolator)localObject).<init>(f2);
    ACCELERATE_CUBIC = (Interpolator)localObject;
  }
  
  FragmentManagerImpl()
  {
    FragmentManagerImpl.1 local1 = new android/support/v4/app/FragmentManagerImpl$1;
    local1.<init>(this);
    this.mExecCommit = local1;
  }
  
  private void checkStateLoss()
  {
    boolean bool = this.mStateSaved;
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Can not perform this action after onSaveInstanceState");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.mNoTransactionsBecause;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Can not perform this action inside of ");
      String str = this.mNoTransactionsBecause;
      localObject2 = str;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  static Animation makeFadeAnimation(Context paramContext, float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new android/view/animation/AlphaAnimation;
    localAlphaAnimation.<init>(paramFloat1, paramFloat2);
    Interpolator localInterpolator = DECELERATE_CUBIC;
    localAlphaAnimation.setInterpolator(localInterpolator);
    localAlphaAnimation.setDuration(220L);
    return localAlphaAnimation;
  }
  
  static Animation makeOpenCloseAnimation(Context paramContext, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new android/view/animation/AnimationSet;
    localAnimationSet.<init>(false);
    ScaleAnimation localScaleAnimation = new android/view/animation/ScaleAnimation;
    localScaleAnimation.<init>(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    Interpolator localInterpolator = DECELERATE_QUINT;
    localScaleAnimation.setInterpolator(localInterpolator);
    localScaleAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localScaleAnimation);
    AlphaAnimation localAlphaAnimation = new android/view/animation/AlphaAnimation;
    localAlphaAnimation.<init>(paramFloat3, paramFloat4);
    localInterpolator = DECELERATE_CUBIC;
    localAlphaAnimation.setInterpolator(localInterpolator);
    localAlphaAnimation.setDuration(220L);
    localAnimationSet.addAnimation(localAlphaAnimation);
    return localAnimationSet;
  }
  
  public static int reverseTransit(int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return i;
      i = 8194;
      continue;
      i = 4097;
      continue;
      i = 4099;
    }
  }
  
  public static int transitToStyleIndex(int paramInt, boolean paramBoolean)
  {
    int i = -1;
    switch (paramInt)
    {
    default: 
      return i;
    case 4097: 
      if (paramBoolean) {}
      for (i = 1;; i = 2) {
        break;
      }
    case 8194: 
      if (paramBoolean) {}
      for (i = 3;; i = 4) {
        break;
      }
    }
    if (paramBoolean) {}
    for (i = 5;; i = 6) {
      break;
    }
  }
  
  void addBackStackState(BackStackRecord paramBackStackRecord)
  {
    ArrayList localArrayList = this.mBackStack;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.mBackStack = localArrayList;
    }
    this.mBackStack.add(paramBackStackRecord);
    reportBackStackChanged();
  }
  
  public void addFragment(Fragment paramFragment, boolean paramBoolean)
  {
    boolean bool1 = true;
    Object localObject1 = this.mAdded;
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.mAdded = ((ArrayList)localObject1);
    }
    boolean bool2 = DEBUG;
    if (bool2)
    {
      localObject1 = "FragmentManager";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "add: ";
      localObject2 = str + paramFragment;
      Log.v((String)localObject1, (String)localObject2);
    }
    makeActive(paramFragment);
    bool2 = paramFragment.mDetached;
    if (!bool2)
    {
      this.mAdded.add(paramFragment);
      paramFragment.mAdded = bool1;
      localObject1 = null;
      paramFragment.mRemoving = false;
      bool2 = paramFragment.mHasMenu;
      if (bool2)
      {
        bool2 = paramFragment.mMenuVisible;
        if (bool2) {
          this.mNeedMenuInvalidate = bool1;
        }
      }
      if (paramBoolean) {
        moveToState(paramFragment);
      }
    }
  }
  
  public void addOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener paramOnBackStackChangedListener)
  {
    ArrayList localArrayList = this.mBackStackChangeListeners;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.mBackStackChangeListeners = localArrayList;
    }
    this.mBackStackChangeListeners.add(paramOnBackStackChangedListener);
  }
  
  /* Error */
  public int allocBackStackIndex(BackStackRecord paramBackStackRecord)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 241	android/support/v4/app/FragmentManagerImpl:mAvailBackStackIndices	Ljava/util/ArrayList;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +17 -> 25
    //   11: aload_0
    //   12: getfield 241	android/support/v4/app/FragmentManagerImpl:mAvailBackStackIndices	Ljava/util/ArrayList;
    //   15: astore_2
    //   16: aload_2
    //   17: invokevirtual 245	java/util/ArrayList:size	()I
    //   20: istore_3
    //   21: iload_3
    //   22: ifgt +134 -> 156
    //   25: aload_0
    //   26: getfield 247	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   29: astore_2
    //   30: aload_2
    //   31: ifnonnull +16 -> 47
    //   34: new 191	java/util/ArrayList
    //   37: astore_2
    //   38: aload_2
    //   39: invokespecial 192	java/util/ArrayList:<init>	()V
    //   42: aload_0
    //   43: aload_2
    //   44: putfield 247	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   47: aload_0
    //   48: getfield 247	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   51: astore_2
    //   52: aload_2
    //   53: invokevirtual 245	java/util/ArrayList:size	()I
    //   56: istore 4
    //   58: getstatic 78	android/support/v4/app/FragmentManagerImpl:DEBUG	Z
    //   61: istore_3
    //   62: iload_3
    //   63: ifeq +73 -> 136
    //   66: ldc 33
    //   68: astore_2
    //   69: new 133	java/lang/StringBuilder
    //   72: astore 5
    //   74: aload 5
    //   76: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   79: ldc -7
    //   81: astore 6
    //   83: aload 5
    //   85: aload 6
    //   87: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: astore 5
    //   92: aload 5
    //   94: iload 4
    //   96: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   99: astore 5
    //   101: ldc -2
    //   103: astore 6
    //   105: aload 5
    //   107: aload 6
    //   109: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: astore 5
    //   114: aload 5
    //   116: aload_1
    //   117: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   120: astore 5
    //   122: aload 5
    //   124: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: astore 5
    //   129: aload_2
    //   130: aload 5
    //   132: invokestatic 212	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   135: pop
    //   136: aload_0
    //   137: getfield 247	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   140: astore_2
    //   141: aload_2
    //   142: aload_1
    //   143: invokevirtual 196	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   146: pop
    //   147: aload_0
    //   148: monitorexit
    //   149: iload 4
    //   151: istore 7
    //   153: iload 7
    //   155: ireturn
    //   156: aload_0
    //   157: getfield 241	android/support/v4/app/FragmentManagerImpl:mAvailBackStackIndices	Ljava/util/ArrayList;
    //   160: astore_2
    //   161: aload_0
    //   162: getfield 241	android/support/v4/app/FragmentManagerImpl:mAvailBackStackIndices	Ljava/util/ArrayList;
    //   165: astore 5
    //   167: aload 5
    //   169: invokevirtual 245	java/util/ArrayList:size	()I
    //   172: iconst_m1
    //   173: iadd
    //   174: istore 8
    //   176: aload_2
    //   177: iload 8
    //   179: invokevirtual 258	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   182: astore_2
    //   183: aload_2
    //   184: checkcast 260	java/lang/Integer
    //   187: astore_2
    //   188: aload_2
    //   189: invokevirtual 263	java/lang/Integer:intValue	()I
    //   192: istore 4
    //   194: getstatic 78	android/support/v4/app/FragmentManagerImpl:DEBUG	Z
    //   197: istore_3
    //   198: iload_3
    //   199: ifeq +75 -> 274
    //   202: ldc 33
    //   204: astore_2
    //   205: new 133	java/lang/StringBuilder
    //   208: astore 5
    //   210: aload 5
    //   212: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   215: ldc_w 265
    //   218: astore 6
    //   220: aload 5
    //   222: aload 6
    //   224: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: astore 5
    //   229: aload 5
    //   231: iload 4
    //   233: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   236: astore 5
    //   238: ldc_w 267
    //   241: astore 6
    //   243: aload 5
    //   245: aload 6
    //   247: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: astore 5
    //   252: aload 5
    //   254: aload_1
    //   255: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   258: astore 5
    //   260: aload 5
    //   262: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   265: astore 5
    //   267: aload_2
    //   268: aload 5
    //   270: invokestatic 212	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   273: pop
    //   274: aload_0
    //   275: getfield 247	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   278: astore_2
    //   279: aload_2
    //   280: iload 4
    //   282: aload_1
    //   283: invokevirtual 271	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   286: pop
    //   287: aload_0
    //   288: monitorexit
    //   289: iload 4
    //   291: istore 7
    //   293: goto -140 -> 153
    //   296: astore_2
    //   297: aload_0
    //   298: monitorexit
    //   299: aload_2
    //   300: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	301	0	this	FragmentManagerImpl
    //   0	301	1	paramBackStackRecord	BackStackRecord
    //   6	274	2	localObject1	Object
    //   296	4	2	localObject2	Object
    //   20	2	3	i	int
    //   61	138	3	bool	boolean
    //   56	234	4	j	int
    //   72	197	5	localObject3	Object
    //   81	165	6	str	String
    //   151	141	7	k	int
    //   174	4	8	m	int
    // Exception table:
    //   from	to	target	type
    //   2	6	296	finally
    //   11	15	296	finally
    //   16	20	296	finally
    //   25	29	296	finally
    //   34	37	296	finally
    //   38	42	296	finally
    //   43	47	296	finally
    //   47	51	296	finally
    //   52	56	296	finally
    //   58	61	296	finally
    //   69	72	296	finally
    //   74	79	296	finally
    //   85	90	296	finally
    //   94	99	296	finally
    //   107	112	296	finally
    //   116	120	296	finally
    //   122	127	296	finally
    //   130	136	296	finally
    //   136	140	296	finally
    //   142	147	296	finally
    //   147	149	296	finally
    //   156	160	296	finally
    //   161	165	296	finally
    //   167	172	296	finally
    //   177	182	296	finally
    //   183	187	296	finally
    //   188	192	296	finally
    //   194	197	296	finally
    //   205	208	296	finally
    //   210	215	296	finally
    //   222	227	296	finally
    //   231	236	296	finally
    //   245	250	296	finally
    //   254	258	296	finally
    //   260	265	296	finally
    //   268	274	296	finally
    //   274	278	296	finally
    //   282	287	296	finally
    //   287	289	296	finally
    //   297	299	296	finally
  }
  
  public void attachActivity(FragmentActivity paramFragmentActivity)
  {
    Object localObject = this.mActivity;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    this.mActivity = paramFragmentActivity;
  }
  
  public void attachFragment(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    int i = 1;
    boolean bool = DEBUG;
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      localObject1 = "FragmentManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "attach: ";
      localObject2 = str + paramFragment;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool = paramFragment.mDetached;
    if (bool)
    {
      paramFragment.mDetached = false;
      bool = paramFragment.mAdded;
      if (!bool)
      {
        localObject1 = this.mAdded;
        if (localObject1 == null)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          this.mAdded = ((ArrayList)localObject1);
        }
        localObject1 = this.mAdded;
        ((ArrayList)localObject1).add(paramFragment);
        paramFragment.mAdded = i;
        bool = paramFragment.mHasMenu;
        if (bool)
        {
          bool = paramFragment.mMenuVisible;
          if (bool) {
            this.mNeedMenuInvalidate = i;
          }
        }
        int j = this.mCurState;
        localObject1 = this;
        localObject2 = paramFragment;
        i = paramInt1;
        moveToState(paramFragment, j, paramInt1, paramInt2, false);
      }
    }
  }
  
  public FragmentTransaction beginTransaction()
  {
    BackStackRecord localBackStackRecord = new android/support/v4/app/BackStackRecord;
    localBackStackRecord.<init>(this);
    return localBackStackRecord;
  }
  
  public void detachFragment(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    int i = 1;
    boolean bool = DEBUG;
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      localObject1 = "FragmentManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "detach: ";
      localObject2 = str + paramFragment;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool = paramFragment.mDetached;
    if (!bool)
    {
      paramFragment.mDetached = i;
      bool = paramFragment.mAdded;
      if (bool)
      {
        localObject1 = this.mAdded;
        if (localObject1 != null)
        {
          localObject1 = this.mAdded;
          ((ArrayList)localObject1).remove(paramFragment);
        }
        bool = paramFragment.mHasMenu;
        if (bool)
        {
          bool = paramFragment.mMenuVisible;
          if (bool) {
            this.mNeedMenuInvalidate = i;
          }
        }
        paramFragment.mAdded = false;
        localObject1 = this;
        localObject2 = paramFragment;
        moveToState(paramFragment, i, paramInt1, paramInt2, false);
      }
    }
  }
  
  public void dispatchActivityCreated()
  {
    this.mStateSaved = false;
    moveToState(2, false);
  }
  
  public void dispatchConfigurationChanged(Configuration paramConfiguration)
  {
    ArrayList localArrayList = this.mAdded;
    if (localArrayList != null)
    {
      int i = 0;
      for (;;)
      {
        localArrayList = this.mAdded;
        int j = localArrayList.size();
        if (i >= j) {
          break;
        }
        localArrayList = this.mAdded;
        Fragment localFragment = (Fragment)localArrayList.get(i);
        if (localFragment != null) {
          localFragment.onConfigurationChanged(paramConfiguration);
        }
        i += 1;
      }
    }
  }
  
  public boolean dispatchContextItemSelected(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.mAdded;
    int i;
    boolean bool;
    if (localArrayList != null)
    {
      i = 0;
      localArrayList = this.mAdded;
      int j = localArrayList.size();
      if (i < j)
      {
        localArrayList = this.mAdded;
        Fragment localFragment = (Fragment)localArrayList.get(i);
        if (localFragment != null)
        {
          bool = localFragment.mHidden;
          if (!bool)
          {
            bool = localFragment.mUserVisibleHint;
            if (bool)
            {
              bool = localFragment.onContextItemSelected(paramMenuItem);
              if (bool) {
                bool = true;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      i += 1;
      break;
      bool = false;
      localArrayList = null;
    }
  }
  
  public void dispatchCreate()
  {
    this.mStateSaved = false;
    moveToState(1, false);
  }
  
  public boolean dispatchCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    boolean bool1 = false;
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = this.mAdded;
    int i;
    Fragment localFragment;
    if (localArrayList2 != null)
    {
      i = 0;
      for (;;)
      {
        localArrayList2 = this.mAdded;
        int j = localArrayList2.size();
        if (i >= j) {
          break;
        }
        localArrayList2 = this.mAdded;
        localFragment = (Fragment)localArrayList2.get(i);
        if (localFragment != null)
        {
          boolean bool2 = localFragment.mHidden;
          if (!bool2)
          {
            bool2 = localFragment.mHasMenu;
            if (bool2)
            {
              bool2 = localFragment.mMenuVisible;
              if (bool2)
              {
                bool1 = true;
                localFragment.onCreateOptionsMenu(paramMenu, paramMenuInflater);
                if (localArrayList1 == null)
                {
                  localArrayList1 = new java/util/ArrayList;
                  localArrayList1.<init>();
                }
                localArrayList1.add(localFragment);
              }
            }
          }
        }
        i += 1;
      }
    }
    localArrayList2 = this.mCreatedMenus;
    if (localArrayList2 != null)
    {
      i = 0;
      for (;;)
      {
        localArrayList2 = this.mCreatedMenus;
        int k = localArrayList2.size();
        if (i >= k) {
          break;
        }
        localArrayList2 = this.mCreatedMenus;
        localFragment = (Fragment)localArrayList2.get(i);
        if (localArrayList1 != null)
        {
          boolean bool3 = localArrayList1.contains(localFragment);
          if (bool3) {}
        }
        else
        {
          localFragment.onDestroyOptionsMenu();
        }
        i += 1;
      }
    }
    this.mCreatedMenus = localArrayList1;
    return bool1;
  }
  
  public void dispatchDestroy()
  {
    this.mDestroyed = true;
    execPendingActions();
    moveToState(0, false);
    this.mActivity = null;
  }
  
  public void dispatchLowMemory()
  {
    ArrayList localArrayList = this.mAdded;
    if (localArrayList != null)
    {
      int i = 0;
      for (;;)
      {
        localArrayList = this.mAdded;
        int j = localArrayList.size();
        if (i >= j) {
          break;
        }
        localArrayList = this.mAdded;
        Fragment localFragment = (Fragment)localArrayList.get(i);
        if (localFragment != null) {
          localFragment.onLowMemory();
        }
        i += 1;
      }
    }
  }
  
  public boolean dispatchOptionsItemSelected(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = this.mAdded;
    int i;
    boolean bool;
    if (localArrayList != null)
    {
      i = 0;
      localArrayList = this.mAdded;
      int j = localArrayList.size();
      if (i < j)
      {
        localArrayList = this.mAdded;
        Fragment localFragment = (Fragment)localArrayList.get(i);
        if (localFragment != null)
        {
          bool = localFragment.mHidden;
          if (!bool)
          {
            bool = localFragment.mHasMenu;
            if (bool)
            {
              bool = localFragment.mMenuVisible;
              if (bool)
              {
                bool = localFragment.onOptionsItemSelected(paramMenuItem);
                if (bool) {
                  bool = true;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      i += 1;
      break;
      bool = false;
      localArrayList = null;
    }
  }
  
  public void dispatchOptionsMenuClosed(Menu paramMenu)
  {
    ArrayList localArrayList = this.mAdded;
    if (localArrayList != null)
    {
      int i = 0;
      for (;;)
      {
        localArrayList = this.mAdded;
        int j = localArrayList.size();
        if (i >= j) {
          break;
        }
        localArrayList = this.mAdded;
        Fragment localFragment = (Fragment)localArrayList.get(i);
        if (localFragment != null)
        {
          boolean bool = localFragment.mHidden;
          if (!bool)
          {
            bool = localFragment.mHasMenu;
            if (bool)
            {
              bool = localFragment.mMenuVisible;
              if (bool) {
                localFragment.onOptionsMenuClosed(paramMenu);
              }
            }
          }
        }
        i += 1;
      }
    }
  }
  
  public void dispatchPause()
  {
    moveToState(4, false);
  }
  
  public boolean dispatchPrepareOptionsMenu(Menu paramMenu)
  {
    boolean bool1 = false;
    ArrayList localArrayList = this.mAdded;
    if (localArrayList != null)
    {
      int i = 0;
      for (;;)
      {
        localArrayList = this.mAdded;
        int j = localArrayList.size();
        if (i >= j) {
          break;
        }
        localArrayList = this.mAdded;
        Fragment localFragment = (Fragment)localArrayList.get(i);
        if (localFragment != null)
        {
          boolean bool2 = localFragment.mHidden;
          if (!bool2)
          {
            bool2 = localFragment.mHasMenu;
            if (bool2)
            {
              bool2 = localFragment.mMenuVisible;
              if (bool2)
              {
                bool1 = true;
                localFragment.onPrepareOptionsMenu(paramMenu);
              }
            }
          }
        }
        i += 1;
      }
    }
    return bool1;
  }
  
  public void dispatchReallyStop()
  {
    moveToState(2, false);
  }
  
  public void dispatchResume()
  {
    this.mStateSaved = false;
    moveToState(5, false);
  }
  
  public void dispatchStart()
  {
    this.mStateSaved = false;
    moveToState(4, false);
  }
  
  public void dispatchStop()
  {
    this.mStateSaved = true;
    moveToState(3, false);
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(paramString);
    String str1 = "    ";
    String str2 = str1;
    localObject1 = this.mActive;
    int i;
    int m;
    Fragment localFragment;
    if (localObject1 != null)
    {
      localObject1 = this.mActive;
      i = ((ArrayList)localObject1).size();
      if (i > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        j = System.identityHashCode(this);
        localObject1 = Integer.toHexString(j);
        paramPrintWriter.print((String)localObject1);
        localObject1 = ":";
        paramPrintWriter.println((String)localObject1);
        m = 0;
        while (m < i)
        {
          localFragment = (Fragment)this.mActive.get(m);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(m);
          localObject1 = ": ";
          paramPrintWriter.print((String)localObject1);
          paramPrintWriter.println(localFragment);
          if (localFragment != null) {
            localFragment.dump(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
          m += 1;
        }
      }
    }
    localObject1 = this.mAdded;
    if (localObject1 != null)
    {
      localObject1 = this.mAdded;
      i = ((ArrayList)localObject1).size();
      if (i > 0)
      {
        paramPrintWriter.print(paramString);
        localObject1 = "Added Fragments:";
        paramPrintWriter.println((String)localObject1);
        m = 0;
        while (m < i)
        {
          localFragment = (Fragment)this.mAdded.get(m);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(m);
          paramPrintWriter.print(": ");
          localObject1 = localFragment.toString();
          paramPrintWriter.println((String)localObject1);
          m += 1;
        }
      }
    }
    localObject1 = this.mCreatedMenus;
    if (localObject1 != null)
    {
      localObject1 = this.mCreatedMenus;
      i = ((ArrayList)localObject1).size();
      if (i > 0)
      {
        paramPrintWriter.print(paramString);
        localObject1 = "Fragments Created Menus:";
        paramPrintWriter.println((String)localObject1);
        m = 0;
        while (m < i)
        {
          localFragment = (Fragment)this.mCreatedMenus.get(m);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(m);
          paramPrintWriter.print(": ");
          localObject1 = localFragment.toString();
          paramPrintWriter.println((String)localObject1);
          m += 1;
        }
      }
    }
    localObject1 = this.mBackStack;
    Object localObject4;
    if (localObject1 != null)
    {
      localObject1 = this.mBackStack;
      i = ((ArrayList)localObject1).size();
      if (i > 0)
      {
        paramPrintWriter.print(paramString);
        localObject1 = "Back Stack:";
        paramPrintWriter.println((String)localObject1);
        m = 0;
        while (m < i)
        {
          localObject4 = (BackStackRecord)this.mBackStack.get(m);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(m);
          paramPrintWriter.print(": ");
          localObject1 = localObject4.toString();
          paramPrintWriter.println((String)localObject1);
          ((BackStackRecord)localObject4).dump(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          m += 1;
        }
      }
    }
    try
    {
      localObject1 = this.mBackStackIndices;
      if (localObject1 != null)
      {
        localObject1 = this.mBackStackIndices;
        i = ((ArrayList)localObject1).size();
        if (i > 0)
        {
          paramPrintWriter.print(paramString);
          localObject1 = "Back Stack Indices:";
          paramPrintWriter.println((String)localObject1);
          m = 0;
          while (m < i)
          {
            localObject1 = this.mBackStackIndices;
            localObject4 = ((ArrayList)localObject1).get(m);
            localObject4 = (BackStackRecord)localObject4;
            paramPrintWriter.print(paramString);
            localObject1 = "  #";
            paramPrintWriter.print((String)localObject1);
            paramPrintWriter.print(m);
            localObject1 = ": ";
            paramPrintWriter.print((String)localObject1);
            paramPrintWriter.println(localObject4);
            m += 1;
          }
        }
      }
      localObject1 = this.mAvailBackStackIndices;
      if (localObject1 != null)
      {
        localObject1 = this.mAvailBackStackIndices;
        j = ((ArrayList)localObject1).size();
        if (j > 0)
        {
          paramPrintWriter.print(paramString);
          localObject1 = "mAvailBackStackIndices: ";
          paramPrintWriter.print((String)localObject1);
          localObject1 = this.mAvailBackStackIndices;
          localObject1 = ((ArrayList)localObject1).toArray();
          localObject1 = Arrays.toString((Object[])localObject1);
          paramPrintWriter.println((String)localObject1);
        }
      }
      localObject1 = this.mPendingActions;
      if (localObject1 != null)
      {
        localObject1 = this.mPendingActions;
        i = ((ArrayList)localObject1).size();
        if (i > 0)
        {
          paramPrintWriter.print(paramString);
          localObject1 = "Pending Actions:";
          paramPrintWriter.println((String)localObject1);
          m = 0;
          while (m < i)
          {
            Runnable localRunnable = (Runnable)this.mPendingActions.get(m);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(m);
            localObject1 = ": ";
            paramPrintWriter.print((String)localObject1);
            paramPrintWriter.println(localRunnable);
            m += 1;
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    int j = this.mCurState;
    paramPrintWriter.print(j);
    paramPrintWriter.print(" mStateSaved=");
    boolean bool = this.mStateSaved;
    paramPrintWriter.print(bool);
    Object localObject3 = " mDestroyed=";
    paramPrintWriter.print((String)localObject3);
    bool = this.mDestroyed;
    paramPrintWriter.println(bool);
    bool = this.mNeedMenuInvalidate;
    if (bool)
    {
      paramPrintWriter.print(paramString);
      localObject3 = "  mNeedMenuInvalidate=";
      paramPrintWriter.print((String)localObject3);
      bool = this.mNeedMenuInvalidate;
      paramPrintWriter.println(bool);
    }
    localObject3 = this.mNoTransactionsBecause;
    if (localObject3 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      localObject3 = this.mNoTransactionsBecause;
      paramPrintWriter.println((String)localObject3);
    }
    localObject3 = this.mAvailIndices;
    if (localObject3 != null)
    {
      localObject3 = this.mAvailIndices;
      int k = ((ArrayList)localObject3).size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mAvailIndices: ");
        localObject3 = Arrays.toString(this.mAvailIndices.toArray());
        paramPrintWriter.println((String)localObject3);
      }
    }
  }
  
  public void enqueueAction(Runnable paramRunnable, boolean paramBoolean)
  {
    if (!paramBoolean) {
      checkStateLoss();
    }
    Object localObject4;
    try
    {
      Object localObject1 = this.mActivity;
      if (localObject1 == null)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject4 = "Activity has been destroyed";
        ((IllegalStateException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
    }
    finally {}
    Object localObject3 = this.mPendingActions;
    if (localObject3 == null)
    {
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      this.mPendingActions = ((ArrayList)localObject3);
    }
    localObject3 = this.mPendingActions;
    ((ArrayList)localObject3).add(paramRunnable);
    localObject3 = this.mPendingActions;
    int i = ((ArrayList)localObject3).size();
    int j = 1;
    if (i == j)
    {
      localObject3 = this.mActivity;
      localObject3 = ((FragmentActivity)localObject3).mHandler;
      localObject4 = this.mExecCommit;
      ((Handler)localObject3).removeCallbacks((Runnable)localObject4);
      localObject3 = this.mActivity;
      localObject3 = ((FragmentActivity)localObject3).mHandler;
      localObject4 = this.mExecCommit;
      ((Handler)localObject3).post((Runnable)localObject4);
    }
  }
  
  public boolean execPendingActions()
  {
    boolean bool1 = this.mExecutingActions;
    if (bool1)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Recursive entry to executePendingTransactions");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = Looper.myLooper();
    Object localObject3 = this.mActivity.mHandler.getLooper();
    if (localObject1 != localObject3)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Must be called from main thread of process");
      throw ((Throwable)localObject1);
    }
    boolean bool5;
    for (boolean bool4 = false;; bool4 = true) {
      try
      {
        localObject1 = this.mPendingActions;
        if (localObject1 != null)
        {
          localObject1 = this.mPendingActions;
          int i = ((ArrayList)localObject1).size();
          if (i != 0) {}
        }
        else
        {
          boolean bool2 = this.mHavePendingDeferredStart;
          if (!bool2) {
            break label345;
          }
          bool5 = false;
          m = 0;
          for (;;)
          {
            localObject1 = this.mActive;
            int j = ((ArrayList)localObject1).size();
            if (m >= j) {
              break;
            }
            localObject1 = this.mActive;
            Fragment localFragment = (Fragment)((ArrayList)localObject1).get(m);
            if (localFragment != null)
            {
              localObject1 = localFragment.mLoaderManager;
              if (localObject1 != null)
              {
                localObject1 = localFragment.mLoaderManager;
                boolean bool3 = ((LoaderManagerImpl)localObject1).hasRunningLoaders();
                bool5 |= bool3;
              }
            }
            m += 1;
          }
        }
        localObject1 = this.mPendingActions;
        int n = ((ArrayList)localObject1).size();
        localObject1 = this.mTmpActions;
        if (localObject1 != null)
        {
          localObject1 = this.mTmpActions;
          k = localObject1.length;
          if (k >= n) {}
        }
        else
        {
          localObject1 = new Runnable[n];
          this.mTmpActions = ((Runnable[])localObject1);
        }
        localObject1 = this.mPendingActions;
        localObject3 = this.mTmpActions;
        ((ArrayList)localObject1).toArray((Object[])localObject3);
        localObject1 = this.mPendingActions;
        ((ArrayList)localObject1).clear();
        localObject1 = this.mActivity;
        localObject1 = ((FragmentActivity)localObject1).mHandler;
        localObject3 = this.mExecCommit;
        ((Handler)localObject1).removeCallbacks((Runnable)localObject3);
        int k = 1;
        this.mExecutingActions = k;
        int m = 0;
        while (m < n)
        {
          this.mTmpActions[m].run();
          localObject1 = this.mTmpActions;
          localObject3 = null;
          localObject1[m] = null;
          m += 1;
        }
        this.mExecutingActions = false;
      }
      finally {}
    }
    if (!bool5)
    {
      this.mHavePendingDeferredStart = false;
      startPendingDeferredFragments();
    }
    label345:
    return bool4;
  }
  
  public boolean executePendingTransactions()
  {
    return execPendingActions();
  }
  
  public Fragment findFragmentById(int paramInt)
  {
    ArrayList localArrayList = this.mAdded;
    int i;
    int j;
    Fragment localFragment;
    if (localArrayList != null)
    {
      localArrayList = this.mAdded;
      i = localArrayList.size();
      j = i + -1;
      if (j >= 0)
      {
        localArrayList = this.mAdded;
        localFragment = (Fragment)localArrayList.get(j);
        if (localFragment != null)
        {
          i = localFragment.mFragmentId;
          if (i != paramInt) {}
        }
      }
    }
    for (;;)
    {
      return localFragment;
      j += -1;
      break;
      localArrayList = this.mActive;
      if (localArrayList != null)
      {
        localArrayList = this.mActive;
        i = localArrayList.size();
        j = i + -1;
        for (;;)
        {
          if (j < 0) {
            break label143;
          }
          localArrayList = this.mActive;
          localFragment = (Fragment)localArrayList.get(j);
          if (localFragment != null)
          {
            i = localFragment.mFragmentId;
            if (i == paramInt) {
              break;
            }
          }
          j += -1;
        }
      }
      label143:
      localFragment = null;
    }
  }
  
  public Fragment findFragmentByTag(String paramString)
  {
    Object localObject = this.mAdded;
    int k;
    Fragment localFragment;
    if ((localObject != null) && (paramString != null))
    {
      localObject = this.mAdded;
      int i = ((ArrayList)localObject).size();
      k = i + -1;
      if (k >= 0)
      {
        localObject = this.mAdded;
        localFragment = (Fragment)((ArrayList)localObject).get(k);
        if (localFragment != null)
        {
          localObject = localFragment.mTag;
          boolean bool1 = paramString.equals(localObject);
          if (!bool1) {}
        }
      }
    }
    for (;;)
    {
      return localFragment;
      k += -1;
      break;
      localObject = this.mActive;
      if ((localObject != null) && (paramString != null))
      {
        localObject = this.mActive;
        int j = ((ArrayList)localObject).size();
        k = j + -1;
        for (;;)
        {
          if (k < 0) {
            break label161;
          }
          localObject = this.mActive;
          localFragment = (Fragment)((ArrayList)localObject).get(k);
          if (localFragment != null)
          {
            localObject = localFragment.mTag;
            boolean bool2 = paramString.equals(localObject);
            if (bool2) {
              break;
            }
          }
          k += -1;
        }
      }
      label161:
      localFragment = null;
    }
  }
  
  public Fragment findFragmentByWho(String paramString)
  {
    Object localObject = this.mActive;
    int j;
    Fragment localFragment;
    if ((localObject != null) && (paramString != null))
    {
      localObject = this.mActive;
      int i = ((ArrayList)localObject).size();
      j = i + -1;
      if (j >= 0)
      {
        localObject = this.mActive;
        localFragment = (Fragment)((ArrayList)localObject).get(j);
        if (localFragment != null)
        {
          localObject = localFragment.mWho;
          boolean bool = paramString.equals(localObject);
          if (!bool) {}
        }
      }
    }
    for (;;)
    {
      return localFragment;
      j += -1;
      break;
      localFragment = null;
    }
  }
  
  public void freeBackStackIndex(int paramInt)
  {
    try
    {
      Object localObject1 = this.mBackStackIndices;
      Object localObject3 = null;
      ((ArrayList)localObject1).set(paramInt, null);
      localObject1 = this.mAvailBackStackIndices;
      if (localObject1 == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        this.mAvailBackStackIndices = ((ArrayList)localObject1);
      }
      boolean bool = DEBUG;
      if (bool)
      {
        localObject1 = "FragmentManager";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "Freeing back stack index ";
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject3 = ((StringBuilder)localObject3).append(paramInt);
        localObject3 = ((StringBuilder)localObject3).toString();
        Log.v((String)localObject1, (String)localObject3);
      }
      localObject1 = this.mAvailBackStackIndices;
      localObject3 = Integer.valueOf(paramInt);
      ((ArrayList)localObject1).add(localObject3);
      return;
    }
    finally {}
  }
  
  public FragmentManager.BackStackEntry getBackStackEntryAt(int paramInt)
  {
    return (FragmentManager.BackStackEntry)this.mBackStack.get(paramInt);
  }
  
  public int getBackStackEntryCount()
  {
    ArrayList localArrayList = this.mBackStack;
    int i;
    if (localArrayList != null)
    {
      localArrayList = this.mBackStack;
      i = localArrayList.size();
    }
    for (;;)
    {
      return i;
      i = 0;
      localArrayList = null;
    }
  }
  
  public Fragment getFragment(Bundle paramBundle, String paramString)
  {
    int i = -1;
    int j = paramBundle.getInt(paramString, i);
    Fragment localFragment;
    if (j == i) {
      localFragment = null;
    }
    do
    {
      return localFragment;
      localObject1 = this.mActive;
      i = ((ArrayList)localObject1).size();
      if (j >= i)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Fragement no longer exists for key " + paramString + ": index " + j;
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localObject1 = this.mActive;
      localFragment = (Fragment)((ArrayList)localObject1).get(j);
    } while (localFragment != null);
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Fragement no longer exists for key " + paramString + ": index " + j;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public void hideFragment(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2 = DEBUG;
    Object localObject1;
    if (bool2)
    {
      localObject1 = "FragmentManager";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "hide: ";
      localObject2 = str + paramFragment;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool2 = paramFragment.mHidden;
    if (!bool2)
    {
      paramFragment.mHidden = bool1;
      localObject1 = paramFragment.mView;
      if (localObject1 != null)
      {
        Animation localAnimation = loadAnimation(paramFragment, paramInt1, bool1, paramInt2);
        if (localAnimation != null)
        {
          localObject1 = paramFragment.mView;
          ((View)localObject1).startAnimation(localAnimation);
        }
        localObject1 = paramFragment.mView;
        int i = 8;
        ((View)localObject1).setVisibility(i);
      }
      bool2 = paramFragment.mAdded;
      if (bool2)
      {
        bool2 = paramFragment.mHasMenu;
        if (bool2)
        {
          bool2 = paramFragment.mMenuVisible;
          if (bool2) {
            this.mNeedMenuInvalidate = bool1;
          }
        }
      }
      paramFragment.onHiddenChanged(bool1);
    }
  }
  
  Animation loadAnimation(Fragment paramFragment, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    float f1 = 0.975F;
    FragmentActivity localFragmentActivity = null;
    float f2 = 1.0F;
    int i = paramFragment.mNextAnim;
    Object localObject1 = paramFragment.onCreateAnimation(paramInt1, paramBoolean, i);
    if (localObject1 != null) {}
    for (;;)
    {
      return (Animation)localObject1;
      i = paramFragment.mNextAnim;
      Object localObject2;
      if (i != 0)
      {
        localObject2 = this.mActivity;
        int j = paramFragment.mNextAnim;
        Animation localAnimation = AnimationUtils.loadAnimation((Context)localObject2, j);
        if (localAnimation != null)
        {
          localObject1 = localAnimation;
          continue;
        }
      }
      if (paramInt1 == 0)
      {
        localObject1 = null;
      }
      else
      {
        int k = transitToStyleIndex(paramInt1, paramBoolean);
        if (k < 0)
        {
          localObject1 = null;
        }
        else
        {
          float f3;
          switch (k)
          {
          default: 
            if (paramInt2 == 0)
            {
              localObject2 = this.mActivity.getWindow();
              if (localObject2 != null)
              {
                localObject2 = this.mActivity.getWindow().getAttributes();
                paramInt2 = ((WindowManager.LayoutParams)localObject2).windowAnimations;
              }
            }
            if (paramInt2 == 0) {
              localObject1 = null;
            }
            break;
          case 1: 
            localFragmentActivity = this.mActivity;
            i = 1066401792;
            f3 = 1.125F;
            localObject1 = makeOpenCloseAnimation(localFragmentActivity, f3, f2, 0.0F, f2);
            break;
          case 2: 
            localFragmentActivity = this.mActivity;
            localObject1 = makeOpenCloseAnimation(localFragmentActivity, f2, f1, f2, 0.0F);
            break;
          case 3: 
            localFragmentActivity = this.mActivity;
            localObject1 = makeOpenCloseAnimation(localFragmentActivity, f1, f2, 0.0F, f2);
            break;
          case 4: 
            localFragmentActivity = this.mActivity;
            i = 1065982362;
            f3 = 1.075F;
            localObject1 = makeOpenCloseAnimation(localFragmentActivity, f2, f3, f2, 0.0F);
            break;
          case 5: 
            localFragmentActivity = this.mActivity;
            localObject1 = makeFadeAnimation(localFragmentActivity, 0.0F, f2);
            break;
          case 6: 
            localFragmentActivity = this.mActivity;
            localObject1 = makeFadeAnimation(localFragmentActivity, f2, 0.0F);
            continue;
            localObject1 = null;
          }
        }
      }
    }
  }
  
  void makeActive(Fragment paramFragment)
  {
    int i = paramFragment.mIndex;
    if (i >= 0) {
      return;
    }
    Object localObject1 = this.mAvailIndices;
    if (localObject1 != null)
    {
      localObject1 = this.mAvailIndices;
      i = ((ArrayList)localObject1).size();
      if (i > 0) {}
    }
    else
    {
      localObject1 = this.mActive;
      if (localObject1 == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        this.mActive = ((ArrayList)localObject1);
      }
      i = this.mActive.size();
      paramFragment.setIndex(i);
      localObject1 = this.mActive;
      ((ArrayList)localObject1).add(paramFragment);
    }
    for (;;)
    {
      boolean bool = DEBUG;
      if (!bool) {
        break;
      }
      localObject1 = "FragmentManager";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "Allocated fragment index ";
      localObject2 = str + paramFragment;
      Log.v((String)localObject1, (String)localObject2);
      break;
      localObject1 = this.mAvailIndices;
      localObject2 = this.mAvailIndices;
      int k = ((ArrayList)localObject2).size() + -1;
      int j = ((Integer)((ArrayList)localObject1).remove(k)).intValue();
      paramFragment.setIndex(j);
      localObject1 = this.mActive;
      k = paramFragment.mIndex;
      ((ArrayList)localObject1).set(k, paramFragment);
    }
  }
  
  void makeInactive(Fragment paramFragment)
  {
    int i = paramFragment.mIndex;
    if (i < 0) {}
    for (;;)
    {
      return;
      boolean bool = DEBUG;
      if (bool)
      {
        localObject1 = "FragmentManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "Freeing fragment index ";
        localObject2 = str + paramFragment;
        Log.v((String)localObject1, (String)localObject2);
      }
      Object localObject1 = this.mActive;
      int j = paramFragment.mIndex;
      String str = null;
      ((ArrayList)localObject1).set(j, null);
      localObject1 = this.mAvailIndices;
      if (localObject1 == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        this.mAvailIndices = ((ArrayList)localObject1);
      }
      localObject1 = this.mAvailIndices;
      Object localObject2 = Integer.valueOf(paramFragment.mIndex);
      ((ArrayList)localObject1).add(localObject2);
      localObject1 = this.mActivity;
      j = paramFragment.mIndex;
      ((FragmentActivity)localObject1).invalidateSupportFragmentIndex(j);
      paramFragment.initState();
    }
  }
  
  void moveToState(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    Object localObject = this.mActivity;
    if ((localObject == null) && (paramInt1 != 0))
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("No activity");
      throw ((Throwable)localObject);
    }
    int i;
    if (!paramBoolean)
    {
      i = this.mCurState;
      if (i != paramInt1) {}
    }
    for (;;)
    {
      return;
      this.mCurState = paramInt1;
      localObject = this.mActive;
      if (localObject != null)
      {
        boolean bool2 = false;
        int k = 0;
        int m;
        for (;;)
        {
          localObject = this.mActive;
          i = ((ArrayList)localObject).size();
          if (k >= i) {
            break;
          }
          localObject = this.mActive;
          Fragment localFragment = (Fragment)((ArrayList)localObject).get(k);
          if (localFragment != null)
          {
            localObject = this;
            m = paramInt1;
            moveToState(localFragment, paramInt1, paramInt2, paramInt3, false);
            localObject = localFragment.mLoaderManager;
            if (localObject != null)
            {
              localObject = localFragment.mLoaderManager;
              bool1 = ((LoaderManagerImpl)localObject).hasRunningLoaders();
              bool2 |= bool1;
            }
          }
          k += 1;
        }
        if (!bool2) {
          startPendingDeferredFragments();
        }
        boolean bool1 = this.mNeedMenuInvalidate;
        if (bool1)
        {
          localObject = this.mActivity;
          if (localObject != null)
          {
            int j = this.mCurState;
            m = 5;
            if (j == m)
            {
              localObject = this.mActivity;
              ((FragmentActivity)localObject).supportInvalidateOptionsMenu();
              this.mNeedMenuInvalidate = false;
            }
          }
        }
      }
    }
  }
  
  void moveToState(int paramInt, boolean paramBoolean)
  {
    moveToState(paramInt, 0, 0, paramBoolean);
  }
  
  void moveToState(Fragment paramFragment)
  {
    int i = this.mCurState;
    moveToState(paramFragment, i, 0, 0, false);
  }
  
  void moveToState(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramFragment.mAdded;
    if (i == 0)
    {
      i = 1;
      if (paramInt1 > i) {
        paramInt1 = 1;
      }
    }
    boolean bool1 = paramFragment.mRemoving;
    if (bool1)
    {
      int j = paramFragment.mState;
      if (paramInt1 > j) {
        paramInt1 = paramFragment.mState;
      }
    }
    boolean bool2 = paramFragment.mDeferStart;
    int i12;
    if (bool2)
    {
      k = paramFragment.mState;
      i12 = 4;
      if (k < i12)
      {
        k = 3;
        if (paramInt1 > k) {
          paramInt1 = 3;
        }
      }
    }
    int k = paramFragment.mState;
    Object localObject1;
    int i13;
    Object localObject2;
    if (k < paramInt1)
    {
      boolean bool3 = paramFragment.mFromLayout;
      if (bool3)
      {
        bool3 = paramFragment.mInLayout;
        if (!bool3) {
          return;
        }
      }
      localObject1 = paramFragment.mAnimatingAway;
      if (localObject1 != null)
      {
        bool3 = false;
        paramFragment.mAnimatingAway = null;
        i13 = paramFragment.mStateAfterAnimating;
        boolean bool16 = true;
        localObject1 = this;
        localObject2 = paramFragment;
        moveToState(paramFragment, i13, 0, 0, bool16);
      }
      int m = paramFragment.mState;
      switch (m)
      {
      }
    }
    for (;;)
    {
      paramFragment.mState = paramInt1;
      break;
      boolean bool4 = DEBUG;
      Object localObject3;
      if (bool4)
      {
        localObject1 = "FragmentManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = "moveto CREATED: ";
        localObject2 = (String)localObject3 + paramFragment;
        Log.v((String)localObject1, (String)localObject2);
      }
      localObject1 = paramFragment.mSavedFragmentState;
      if (localObject1 != null)
      {
        localObject1 = paramFragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        paramFragment.mSavedViewState = ((SparseArray)localObject1);
        localObject1 = paramFragment.mSavedFragmentState;
        localObject2 = "android:target_state";
        localObject1 = getFragment((Bundle)localObject1, (String)localObject2);
        paramFragment.mTarget = ((Fragment)localObject1);
        localObject1 = paramFragment.mTarget;
        if (localObject1 != null)
        {
          localObject1 = paramFragment.mSavedFragmentState;
          localObject2 = "android:target_req_state";
          i13 = 0;
          localObject3 = null;
          int n = ((Bundle)localObject1).getInt((String)localObject2, 0);
          paramFragment.mTargetRequestCode = n;
        }
        localObject1 = paramFragment.mSavedFragmentState;
        localObject2 = "android:user_visible_hint";
        i13 = 1;
        boolean bool5 = ((Bundle)localObject1).getBoolean((String)localObject2, i13);
        paramFragment.mUserVisibleHint = bool5;
        bool5 = paramFragment.mUserVisibleHint;
        if (!bool5)
        {
          paramFragment.mDeferStart = true;
          int i1 = 3;
          if (paramInt1 > i1) {
            paramInt1 = 3;
          }
        }
      }
      localObject1 = this.mActivity;
      paramFragment.mActivity = ((FragmentActivity)localObject1);
      localObject1 = this.mActivity.mFragments;
      paramFragment.mFragmentManager = ((FragmentManagerImpl)localObject1);
      paramFragment.mCalled = false;
      localObject1 = this.mActivity;
      paramFragment.onAttach((Activity)localObject1);
      int i2 = paramFragment.mCalled;
      if (i2 == 0)
      {
        localObject1 = new android/support/v4/app/SuperNotCalledException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Fragment " + paramFragment + " did not call through to super.onAttach()";
        ((SuperNotCalledException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localObject1 = this.mActivity;
      ((FragmentActivity)localObject1).onAttachFragment(paramFragment);
      i2 = paramFragment.mRetaining;
      if (i2 == 0)
      {
        paramFragment.mCalled = false;
        localObject1 = paramFragment.mSavedFragmentState;
        paramFragment.onCreate((Bundle)localObject1);
        i2 = paramFragment.mCalled;
        if (i2 == 0)
        {
          localObject1 = new android/support/v4/app/SuperNotCalledException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = "Fragment " + paramFragment + " did not call through to super.onCreate()";
          ((SuperNotCalledException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      localObject1 = null;
      paramFragment.mRetaining = false;
      i2 = paramFragment.mFromLayout;
      if (i2 != 0)
      {
        localObject1 = paramFragment.mSavedFragmentState;
        localObject1 = paramFragment.getLayoutInflater((Bundle)localObject1);
        i12 = 0;
        localObject2 = null;
        localObject3 = paramFragment.mSavedFragmentState;
        localObject1 = paramFragment.onCreateView((LayoutInflater)localObject1, null, (Bundle)localObject3);
        paramFragment.mView = ((View)localObject1);
        localObject1 = paramFragment.mView;
        if (localObject1 == null) {
          break label970;
        }
        localObject1 = paramFragment.mView;
        paramFragment.mInnerView = ((View)localObject1);
        localObject1 = NoSaveStateFrameLayout.wrap(paramFragment.mView);
        paramFragment.mView = ((View)localObject1);
        i2 = paramFragment.mHidden;
        if (i2 != 0)
        {
          localObject1 = paramFragment.mView;
          i12 = 8;
          ((View)localObject1).setVisibility(i12);
        }
        localObject1 = paramFragment.mView;
        localObject2 = paramFragment.mSavedFragmentState;
        paramFragment.onViewCreated((View)localObject1, (Bundle)localObject2);
      }
      ViewGroup localViewGroup;
      for (;;)
      {
        i2 = 1;
        if (paramInt1 <= i2) {
          break label1281;
        }
        boolean bool6 = DEBUG;
        if (bool6)
        {
          localObject1 = "FragmentManager";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = "moveto ACTIVITY_CREATED: ";
          localObject2 = (String)localObject3 + paramFragment;
          Log.v((String)localObject1, (String)localObject2);
        }
        bool6 = paramFragment.mFromLayout;
        if (bool6) {
          break label1165;
        }
        localViewGroup = null;
        int i3 = paramFragment.mContainerId;
        if (i3 == 0) {
          break;
        }
        localObject1 = this.mActivity;
        i12 = paramFragment.mContainerId;
        localViewGroup = (ViewGroup)((FragmentActivity)localObject1).findViewById(i12);
        if (localViewGroup != null) {
          break;
        }
        bool7 = paramFragment.mRestored;
        if (bool7) {
          break;
        }
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("No view found for id 0x");
        localObject3 = Integer.toHexString(paramFragment.mContainerId);
        localObject2 = (String)localObject3 + " for fragment " + paramFragment;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        label970:
        bool7 = false;
        localObject1 = null;
        paramFragment.mInnerView = null;
      }
      paramFragment.mContainer = localViewGroup;
      localObject1 = paramFragment.mSavedFragmentState;
      localObject1 = paramFragment.getLayoutInflater((Bundle)localObject1);
      localObject2 = paramFragment.mSavedFragmentState;
      localObject1 = paramFragment.onCreateView((LayoutInflater)localObject1, localViewGroup, (Bundle)localObject2);
      paramFragment.mView = ((View)localObject1);
      localObject1 = paramFragment.mView;
      Animation localAnimation;
      if (localObject1 != null)
      {
        localObject1 = paramFragment.mView;
        paramFragment.mInnerView = ((View)localObject1);
        localObject1 = NoSaveStateFrameLayout.wrap(paramFragment.mView);
        paramFragment.mView = ((View)localObject1);
        if (localViewGroup != null)
        {
          bool7 = true;
          localAnimation = loadAnimation(paramFragment, paramInt2, bool7, paramInt3);
          if (localAnimation != null)
          {
            localObject1 = paramFragment.mView;
            ((View)localObject1).startAnimation(localAnimation);
          }
          localObject1 = paramFragment.mView;
          localViewGroup.addView((View)localObject1);
        }
        bool7 = paramFragment.mHidden;
        if (bool7)
        {
          localObject1 = paramFragment.mView;
          i12 = 8;
          ((View)localObject1).setVisibility(i12);
        }
        localObject1 = paramFragment.mView;
        localObject2 = paramFragment.mSavedFragmentState;
        paramFragment.onViewCreated((View)localObject1, (Bundle)localObject2);
      }
      for (;;)
      {
        label1165:
        paramFragment.mCalled = false;
        localObject1 = paramFragment.mSavedFragmentState;
        paramFragment.onActivityCreated((Bundle)localObject1);
        bool7 = paramFragment.mCalled;
        if (bool7) {
          break;
        }
        localObject1 = new android/support/v4/app/SuperNotCalledException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Fragment " + paramFragment + " did not call through to super.onActivityCreated()";
        ((SuperNotCalledException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        bool7 = false;
        localObject1 = null;
        paramFragment.mInnerView = null;
      }
      localObject1 = paramFragment.mView;
      if (localObject1 != null) {
        paramFragment.restoreViewState();
      }
      boolean bool7 = false;
      localObject1 = null;
      paramFragment.mSavedFragmentState = null;
      label1281:
      int i4 = 3;
      if (paramInt1 > i4)
      {
        boolean bool8 = DEBUG;
        if (bool8)
        {
          localObject1 = "FragmentManager";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = "moveto STARTED: ";
          localObject2 = (String)localObject3 + paramFragment;
          Log.v((String)localObject1, (String)localObject2);
        }
        localObject1 = null;
        paramFragment.mCalled = false;
        paramFragment.performStart();
        bool8 = paramFragment.mCalled;
        if (!bool8)
        {
          localObject1 = new android/support/v4/app/SuperNotCalledException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = "Fragment " + paramFragment + " did not call through to super.onStart()";
          ((SuperNotCalledException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      int i5 = 4;
      if (paramInt1 > i5)
      {
        boolean bool9 = DEBUG;
        if (bool9)
        {
          localObject1 = "FragmentManager";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = "moveto RESUMED: ";
          localObject2 = (String)localObject3 + paramFragment;
          Log.v((String)localObject1, (String)localObject2);
        }
        localObject1 = null;
        paramFragment.mCalled = false;
        paramFragment.mResumed = true;
        paramFragment.onResume();
        bool9 = paramFragment.mCalled;
        if (!bool9)
        {
          localObject1 = new android/support/v4/app/SuperNotCalledException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = "Fragment " + paramFragment + " did not call through to super.onResume()";
          ((SuperNotCalledException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        paramFragment.mSavedFragmentState = null;
        bool9 = false;
        localObject1 = null;
        paramFragment.mSavedViewState = null;
        continue;
        int i6 = paramFragment.mState;
        if (i6 > paramInt1)
        {
          i6 = paramFragment.mState;
          switch (i6)
          {
          default: 
            break;
          case 1: 
          case 5: 
          case 4: 
          case 3: 
          case 2: 
            for (;;)
            {
              i6 = 1;
              if (paramInt1 >= i6) {
                break;
              }
              boolean bool10 = this.mDestroyed;
              if (bool10)
              {
                localObject1 = paramFragment.mAnimatingAway;
                if (localObject1 != null)
                {
                  View localView = paramFragment.mAnimatingAway;
                  bool10 = false;
                  localObject1 = null;
                  paramFragment.mAnimatingAway = null;
                  localView.clearAnimation();
                }
              }
              localObject1 = paramFragment.mAnimatingAway;
              if (localObject1 == null) {
                break label2383;
              }
              paramFragment.mStateAfterAnimating = paramInt1;
              paramInt1 = 1;
              break;
              int i7 = 5;
              if (paramInt1 < i7)
              {
                boolean bool11 = DEBUG;
                if (bool11)
                {
                  localObject1 = "FragmentManager";
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>();
                  localObject3 = "movefrom RESUMED: ";
                  localObject2 = (String)localObject3 + paramFragment;
                  Log.v((String)localObject1, (String)localObject2);
                }
                localObject1 = null;
                paramFragment.mCalled = false;
                paramFragment.onPause();
                bool11 = paramFragment.mCalled;
                if (!bool11)
                {
                  localObject1 = new android/support/v4/app/SuperNotCalledException;
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>();
                  localObject2 = "Fragment " + paramFragment + " did not call through to super.onPause()";
                  ((SuperNotCalledException)localObject1).<init>((String)localObject2);
                  throw ((Throwable)localObject1);
                }
                bool11 = false;
                localObject1 = null;
                paramFragment.mResumed = false;
              }
              int i8 = 4;
              if (paramInt1 < i8)
              {
                boolean bool12 = DEBUG;
                if (bool12)
                {
                  localObject1 = "FragmentManager";
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>();
                  localObject3 = "movefrom STARTED: ";
                  localObject2 = (String)localObject3 + paramFragment;
                  Log.v((String)localObject1, (String)localObject2);
                }
                localObject1 = null;
                paramFragment.mCalled = false;
                paramFragment.performStop();
                bool12 = paramFragment.mCalled;
                if (!bool12)
                {
                  localObject1 = new android/support/v4/app/SuperNotCalledException;
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>();
                  localObject2 = "Fragment " + paramFragment + " did not call through to super.onStop()";
                  ((SuperNotCalledException)localObject1).<init>((String)localObject2);
                  throw ((Throwable)localObject1);
                }
              }
              int i9 = 3;
              if (paramInt1 < i9)
              {
                boolean bool13 = DEBUG;
                if (bool13)
                {
                  localObject1 = "FragmentManager";
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>();
                  localObject3 = "movefrom STOPPED: ";
                  localObject2 = (String)localObject3 + paramFragment;
                  Log.v((String)localObject1, (String)localObject2);
                }
                paramFragment.performReallyStop();
              }
              int i10 = 2;
              if (paramInt1 < i10)
              {
                boolean bool14 = DEBUG;
                if (bool14)
                {
                  localObject1 = "FragmentManager";
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>();
                  localObject3 = "movefrom ACTIVITY_CREATED: ";
                  localObject2 = (String)localObject3 + paramFragment;
                  Log.v((String)localObject1, (String)localObject2);
                }
                localObject1 = paramFragment.mView;
                if (localObject1 != null)
                {
                  localObject1 = this.mActivity;
                  bool14 = ((FragmentActivity)localObject1).isFinishing();
                  if (!bool14)
                  {
                    localObject1 = paramFragment.mSavedViewState;
                    if (localObject1 == null) {
                      saveFragmentViewState(paramFragment);
                    }
                  }
                }
                localObject1 = null;
                paramFragment.mCalled = false;
                paramFragment.performDestroyView();
                bool14 = paramFragment.mCalled;
                if (!bool14)
                {
                  localObject1 = new android/support/v4/app/SuperNotCalledException;
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>();
                  localObject2 = "Fragment " + paramFragment + " did not call through to super.onDestroyView()";
                  ((SuperNotCalledException)localObject1).<init>((String)localObject2);
                  throw ((Throwable)localObject1);
                }
                localObject1 = paramFragment.mView;
                if (localObject1 != null)
                {
                  localObject1 = paramFragment.mContainer;
                  if (localObject1 != null)
                  {
                    localAnimation = null;
                    int i11 = this.mCurState;
                    if (i11 > 0)
                    {
                      bool15 = this.mDestroyed;
                      if (!bool15)
                      {
                        bool15 = false;
                        localObject1 = null;
                        localAnimation = loadAnimation(paramFragment, paramInt2, false, paramInt3);
                      }
                    }
                    if (localAnimation != null)
                    {
                      localObject1 = paramFragment.mView;
                      paramFragment.mAnimatingAway = ((View)localObject1);
                      paramFragment.mStateAfterAnimating = paramInt1;
                      localObject1 = new android/support/v4/app/FragmentManagerImpl$5;
                      ((FragmentManagerImpl.5)localObject1).<init>(this, paramFragment);
                      localAnimation.setAnimationListener((Animation.AnimationListener)localObject1);
                      localObject1 = paramFragment.mView;
                      ((View)localObject1).startAnimation(localAnimation);
                    }
                    localObject1 = paramFragment.mContainer;
                    localObject2 = paramFragment.mView;
                    ((ViewGroup)localObject1).removeView((View)localObject2);
                  }
                }
                paramFragment.mContainer = null;
                paramFragment.mView = null;
                bool15 = false;
                localObject1 = null;
                paramFragment.mInnerView = null;
              }
            }
            label2383:
            boolean bool15 = DEBUG;
            if (bool15)
            {
              localObject1 = "FragmentManager";
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject3 = "movefrom CREATED: ";
              localObject2 = (String)localObject3 + paramFragment;
              Log.v((String)localObject1, (String)localObject2);
            }
            bool15 = paramFragment.mRetaining;
            if (!bool15)
            {
              localObject1 = null;
              paramFragment.mCalled = false;
              paramFragment.onDestroy();
              bool15 = paramFragment.mCalled;
              if (!bool15)
              {
                localObject1 = new android/support/v4/app/SuperNotCalledException;
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                localObject2 = "Fragment " + paramFragment + " did not call through to super.onDestroy()";
                ((SuperNotCalledException)localObject1).<init>((String)localObject2);
                throw ((Throwable)localObject1);
              }
            }
            localObject1 = null;
            paramFragment.mCalled = false;
            paramFragment.onDetach();
            bool15 = paramFragment.mCalled;
            if (!bool15)
            {
              localObject1 = new android/support/v4/app/SuperNotCalledException;
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = "Fragment " + paramFragment + " did not call through to super.onDetach()";
              ((SuperNotCalledException)localObject1).<init>((String)localObject2);
              throw ((Throwable)localObject1);
            }
            if (!paramBoolean)
            {
              bool15 = paramFragment.mRetaining;
              if (!bool15)
              {
                makeInactive(paramFragment);
              }
              else
              {
                paramFragment.mActivity = null;
                bool15 = false;
                localObject1 = null;
                paramFragment.mFragmentManager = null;
              }
            }
            break;
          }
        }
      }
    }
  }
  
  public void noteStateNotSaved()
  {
    this.mStateSaved = false;
  }
  
  public void performPendingDeferredStart(Fragment paramFragment)
  {
    boolean bool = paramFragment.mDeferStart;
    if (bool)
    {
      bool = this.mExecutingActions;
      if (!bool) {
        break label26;
      }
      bool = true;
      this.mHavePendingDeferredStart = bool;
    }
    for (;;)
    {
      return;
      label26:
      paramFragment.mDeferStart = false;
      int i = this.mCurState;
      moveToState(paramFragment, i, 0, 0, false);
    }
  }
  
  public void popBackStack()
  {
    FragmentManagerImpl.2 local2 = new android/support/v4/app/FragmentManagerImpl$2;
    local2.<init>(this);
    enqueueAction(local2, false);
  }
  
  public void popBackStack(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Bad id: " + paramInt1;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = new android/support/v4/app/FragmentManagerImpl$4;
    ((FragmentManagerImpl.4)localObject1).<init>(this, paramInt1, paramInt2);
    enqueueAction((Runnable)localObject1, false);
  }
  
  public void popBackStack(String paramString, int paramInt)
  {
    FragmentManagerImpl.3 local3 = new android/support/v4/app/FragmentManagerImpl$3;
    local3.<init>(this, paramString, paramInt);
    enqueueAction(local3, false);
  }
  
  public boolean popBackStackImmediate()
  {
    checkStateLoss();
    executePendingTransactions();
    Handler localHandler = this.mActivity.mHandler;
    return popBackStackState(localHandler, null, -1, 0);
  }
  
  public boolean popBackStackImmediate(int paramInt1, int paramInt2)
  {
    checkStateLoss();
    executePendingTransactions();
    if (paramInt1 < 0)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Bad id: " + paramInt1;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.mActivity.mHandler;
    return popBackStackState((Handler)localObject1, null, paramInt1, paramInt2);
  }
  
  public boolean popBackStackImmediate(String paramString, int paramInt)
  {
    checkStateLoss();
    executePendingTransactions();
    Handler localHandler = this.mActivity.mHandler;
    return popBackStackState(localHandler, paramString, -1, paramInt);
  }
  
  boolean popBackStackState(Handler paramHandler, String paramString, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = this.mBackStack;
    if (localObject1 == null) {
      break label176;
    }
    label17:
    int i;
    int m;
    do
    {
      return bool2;
      if ((paramString != null) || (paramInt1 >= 0)) {
        break;
      }
      i = paramInt2 & 0x1;
      if (i != 0) {
        break;
      }
      localObject1 = this.mBackStack;
      i = ((ArrayList)localObject1).size();
      m = i + -1;
    } while (m < 0);
    localObject1 = this.mBackStack;
    BackStackRecord localBackStackRecord = (BackStackRecord)((ArrayList)localObject1).remove(m);
    localBackStackRecord.popFromBackStack(bool1);
    reportBackStackChanged();
    for (;;)
    {
      bool2 = bool1;
      break label17;
      int n = -1;
      if ((paramString != null) || (paramInt1 >= 0))
      {
        localObject1 = this.mBackStack;
        i = ((ArrayList)localObject1).size();
        n = i + -1;
        for (;;)
        {
          if (n >= 0)
          {
            localObject1 = this.mBackStack;
            localBackStackRecord = (BackStackRecord)((ArrayList)localObject1).get(n);
            if (paramString != null)
            {
              localObject1 = localBackStackRecord.getName();
              boolean bool3 = paramString.equals(localObject1);
              if (!bool3) {}
            }
          }
          else
          {
            label176:
            if (n < 0) {
              break label17;
            }
            int j = paramInt2 & 0x1;
            if (j == 0) {
              break label297;
            }
            n += -1;
            while (n >= 0)
            {
              localObject1 = this.mBackStack;
              localBackStackRecord = (BackStackRecord)((ArrayList)localObject1).get(n);
              if (paramString != null)
              {
                localObject1 = localBackStackRecord.getName();
                boolean bool4 = paramString.equals(localObject1);
                if (bool4) {}
              }
              else
              {
                if (paramInt1 < 0) {
                  break;
                }
                k = localBackStackRecord.mIndex;
                if (paramInt1 != k) {
                  break;
                }
              }
              n += -1;
            }
          }
          if (paramInt1 >= 0)
          {
            k = localBackStackRecord.mIndex;
            if (paramInt1 == k) {
              break;
            }
          }
          n += -1;
        }
      }
      label297:
      localObject1 = this.mBackStack;
      int k = ((ArrayList)localObject1).size() + -1;
      if (n == k) {
        break label17;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localObject1 = this.mBackStack;
      k = ((ArrayList)localObject1).size();
      int i1 = k + -1;
      while (i1 > n)
      {
        localObject1 = this.mBackStack.remove(i1);
        localArrayList.add(localObject1);
        i1 += -1;
      }
      k = localArrayList.size();
      int i2 = k + -1;
      i1 = 0;
      if (i1 <= i2)
      {
        boolean bool5 = DEBUG;
        Object localObject2;
        if (bool5)
        {
          localObject1 = "FragmentManager";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Popping back stack state: ");
          Object localObject3 = localArrayList.get(i1);
          localObject2 = localObject3;
          Log.v((String)localObject1, (String)localObject2);
        }
        localObject1 = (BackStackRecord)localArrayList.get(i1);
        boolean bool6;
        if (i1 == i2) {
          bool6 = bool1;
        }
        for (;;)
        {
          ((BackStackRecord)localObject1).popFromBackStack(bool6);
          i1 += 1;
          break;
          bool6 = false;
          localObject2 = null;
        }
      }
      reportBackStackChanged();
    }
  }
  
  public void putFragment(Bundle paramBundle, String paramString, Fragment paramFragment)
  {
    int i = paramFragment.mIndex;
    if (i < 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Fragment " + paramFragment + " is not currently in the FragmentManager";
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
    i = paramFragment.mIndex;
    paramBundle.putInt(paramString, i);
  }
  
  public void removeFragment(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    int i = 1;
    boolean bool = DEBUG;
    Object localObject1;
    Object localObject2;
    int j;
    if (bool)
    {
      localObject1 = "FragmentManager";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("remove: ").append(paramFragment);
      String str = " nesting=";
      localObject2 = ((StringBuilder)localObject2).append(str);
      j = paramFragment.mBackStackNesting;
      localObject2 = j;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool = paramFragment.isInBackStack();
    int k;
    int m;
    if (!bool)
    {
      k = i;
      bool = paramFragment.mDetached;
      if ((!bool) || (k != 0))
      {
        localObject1 = this.mAdded;
        if (localObject1 != null)
        {
          localObject1 = this.mAdded;
          ((ArrayList)localObject1).remove(paramFragment);
        }
        bool = paramFragment.mHasMenu;
        if (bool)
        {
          bool = paramFragment.mMenuVisible;
          if (bool) {
            this.mNeedMenuInvalidate = i;
          }
        }
        paramFragment.mAdded = false;
        paramFragment.mRemoving = i;
        if (k == 0) {
          break label209;
        }
        m = 0;
        localObject2 = null;
      }
    }
    for (;;)
    {
      localObject1 = paramFragment;
      j = paramInt1;
      moveToState(paramFragment, m, paramInt1, paramInt2, false);
      return;
      k = 0;
      break;
      label209:
      m = i;
    }
  }
  
  public void removeOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener paramOnBackStackChangedListener)
  {
    ArrayList localArrayList = this.mBackStackChangeListeners;
    if (localArrayList != null)
    {
      localArrayList = this.mBackStackChangeListeners;
      localArrayList.remove(paramOnBackStackChangedListener);
    }
  }
  
  void reportBackStackChanged()
  {
    Object localObject = this.mBackStackChangeListeners;
    if (localObject != null)
    {
      int i = 0;
      for (;;)
      {
        localObject = this.mBackStackChangeListeners;
        int j = ((ArrayList)localObject).size();
        if (i >= j) {
          break;
        }
        localObject = (FragmentManager.OnBackStackChangedListener)this.mBackStackChangeListeners.get(i);
        ((FragmentManager.OnBackStackChangedListener)localObject).onBackStackChanged();
        i += 1;
      }
    }
  }
  
  void restoreAllState(Parcelable paramParcelable, ArrayList paramArrayList)
  {
    if (paramParcelable == null) {}
    for (;;)
    {
      return;
      Object localObject1 = paramParcelable;
      localObject1 = (FragmentManagerState)paramParcelable;
      Object localObject2 = ((FragmentManagerState)localObject1).mActive;
      if (localObject2 != null)
      {
        Fragment localFragment;
        String str;
        Object localObject4;
        if (paramArrayList != null)
        {
          i = 0;
          for (;;)
          {
            int j = paramArrayList.size();
            if (i >= j) {
              break;
            }
            localFragment = (Fragment)paramArrayList.get(i);
            boolean bool1 = DEBUG;
            if (bool1)
            {
              localObject2 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              str = "restoreAllState: re-attaching retained ";
              localObject3 = str + localFragment;
              Log.v((String)localObject2, (String)localObject3);
            }
            localObject2 = ((FragmentManagerState)localObject1).mActive;
            i2 = localFragment.mIndex;
            localObject4 = localObject2[i2];
            ((FragmentState)localObject4).mInstance = localFragment;
            localFragment.mSavedViewState = null;
            localFragment.mBackStackNesting = 0;
            localFragment.mInLayout = false;
            localFragment.mAdded = false;
            localFragment.mTarget = null;
            localObject2 = ((FragmentState)localObject4).mSavedFragmentState;
            if (localObject2 != null)
            {
              localObject2 = ((FragmentState)localObject4).mSavedFragmentState;
              localObject3 = this.mActivity.getClassLoader();
              ((Bundle)localObject2).setClassLoader((ClassLoader)localObject3);
              localObject2 = ((FragmentState)localObject4).mSavedFragmentState;
              localObject3 = "android:view_state";
              localObject2 = ((Bundle)localObject2).getSparseParcelableArray((String)localObject3);
              localFragment.mSavedViewState = ((SparseArray)localObject2);
            }
            i += 1;
          }
        }
        localObject2 = new java/util/ArrayList;
        Object localObject3 = ((FragmentManagerState)localObject1).mActive;
        int i2 = localObject3.length;
        ((ArrayList)localObject2).<init>(i2);
        this.mActive = ((ArrayList)localObject2);
        localObject2 = this.mAvailIndices;
        if (localObject2 != null)
        {
          localObject2 = this.mAvailIndices;
          ((ArrayList)localObject2).clear();
        }
        int i = 0;
        localObject2 = ((FragmentManagerState)localObject1).mActive;
        int k = localObject2.length;
        if (i < k)
        {
          localObject2 = ((FragmentManagerState)localObject1).mActive;
          localObject4 = localObject2[i];
          boolean bool2;
          if (localObject4 != null)
          {
            localObject2 = this.mActivity;
            localFragment = ((FragmentState)localObject4).instantiate((FragmentActivity)localObject2);
            bool2 = DEBUG;
            if (bool2)
            {
              localObject2 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((StringBuilder)localObject3).append("restoreAllState: adding #").append(i);
              str = ": ";
              localObject3 = str + localFragment;
              Log.v((String)localObject2, (String)localObject3);
            }
            localObject2 = this.mActive;
            ((ArrayList)localObject2).add(localFragment);
            ((FragmentState)localObject4).mInstance = null;
          }
          for (;;)
          {
            i += 1;
            break;
            bool2 = DEBUG;
            if (bool2)
            {
              localObject2 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((StringBuilder)localObject3).append("restoreAllState: adding #").append(i);
              str = ": (null)";
              localObject3 = str;
              Log.v((String)localObject2, (String)localObject3);
            }
            this.mActive.add(null);
            localObject2 = this.mAvailIndices;
            if (localObject2 == null)
            {
              localObject2 = new java/util/ArrayList;
              ((ArrayList)localObject2).<init>();
              this.mAvailIndices = ((ArrayList)localObject2);
            }
            bool2 = DEBUG;
            if (bool2)
            {
              localObject2 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              str = "restoreAllState: adding avail #";
              localObject3 = str + i;
              Log.v((String)localObject2, (String)localObject3);
            }
            localObject2 = this.mAvailIndices;
            localObject3 = Integer.valueOf(i);
            ((ArrayList)localObject2).add(localObject3);
          }
        }
        int m;
        label728:
        int i3;
        if (paramArrayList != null)
        {
          i = 0;
          m = paramArrayList.size();
          if (i < m)
          {
            localFragment = (Fragment)paramArrayList.get(i);
            m = localFragment.mTargetIndex;
            if (m >= 0)
            {
              m = localFragment.mTargetIndex;
              localObject3 = this.mActive;
              i2 = ((ArrayList)localObject3).size();
              if (m >= i2) {
                break label728;
              }
              localObject2 = this.mActive;
              i2 = localFragment.mTargetIndex;
              localObject2 = (Fragment)((ArrayList)localObject2).get(i2);
            }
            for (localFragment.mTarget = ((Fragment)localObject2);; localFragment.mTarget = null)
            {
              i += 1;
              break;
              localObject2 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((StringBuilder)localObject3).append("Re-attaching retained fragment ").append(localFragment);
              str = " target no longer exists: ";
              localObject3 = ((StringBuilder)localObject3).append(str);
              i3 = localFragment.mTargetIndex;
              localObject3 = i3;
              Log.w((String)localObject2, (String)localObject3);
            }
          }
        }
        localObject2 = ((FragmentManagerState)localObject1).mAdded;
        if (localObject2 != null)
        {
          localObject2 = new java/util/ArrayList;
          localObject3 = ((FragmentManagerState)localObject1).mAdded;
          i2 = localObject3.length;
          ((ArrayList)localObject2).<init>(i2);
          this.mAdded = ((ArrayList)localObject2);
          i = 0;
          for (;;)
          {
            localObject2 = ((FragmentManagerState)localObject1).mAdded;
            m = localObject2.length;
            if (i >= m) {
              break;
            }
            localObject2 = this.mActive;
            localObject3 = ((FragmentManagerState)localObject1).mAdded;
            i2 = localObject3[i];
            localFragment = (Fragment)((ArrayList)localObject2).get(i2);
            if (localFragment == null)
            {
              localObject2 = new java/lang/IllegalStateException;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((StringBuilder)localObject3).append("No instantiated fragment for index #");
              i3 = localObject1.mAdded[i];
              localObject3 = i3;
              ((IllegalStateException)localObject2).<init>((String)localObject3);
              throw ((Throwable)localObject2);
            }
            localFragment.mAdded = true;
            boolean bool3 = DEBUG;
            if (bool3)
            {
              localObject2 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((StringBuilder)localObject3).append("restoreAllState: making added #").append(i);
              str = ": ";
              localObject3 = str + localFragment;
              Log.v((String)localObject2, (String)localObject3);
            }
            localObject2 = this.mAdded;
            ((ArrayList)localObject2).add(localFragment);
            i += 1;
          }
        }
        this.mAdded = null;
        localObject2 = ((FragmentManagerState)localObject1).mBackStack;
        if (localObject2 != null)
        {
          localObject2 = new java/util/ArrayList;
          localObject3 = ((FragmentManagerState)localObject1).mBackStack;
          i2 = localObject3.length;
          ((ArrayList)localObject2).<init>(i2);
          this.mBackStack = ((ArrayList)localObject2);
          i = 0;
          for (;;)
          {
            localObject2 = ((FragmentManagerState)localObject1).mBackStack;
            int n = localObject2.length;
            if (i >= n) {
              break;
            }
            localObject2 = localObject1.mBackStack[i];
            BackStackRecord localBackStackRecord = ((BackStackState)localObject2).instantiate(this);
            boolean bool4 = DEBUG;
            if (bool4)
            {
              localObject2 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((StringBuilder)localObject3).append("restoreAllState: adding bse #").append(i).append(" (index ");
              i3 = localBackStackRecord.mIndex;
              localObject3 = ((StringBuilder)localObject3).append(i3);
              str = "): ";
              localObject3 = str + localBackStackRecord;
              Log.v((String)localObject2, (String)localObject3);
            }
            localObject2 = this.mBackStack;
            ((ArrayList)localObject2).add(localBackStackRecord);
            int i1 = localBackStackRecord.mIndex;
            if (i1 >= 0)
            {
              i1 = localBackStackRecord.mIndex;
              setBackStackIndex(i1, localBackStackRecord);
            }
            i += 1;
          }
        }
        this.mBackStack = null;
      }
    }
  }
  
  ArrayList retainNonConfig()
  {
    ArrayList localArrayList = null;
    Object localObject1 = this.mActive;
    if (localObject1 != null)
    {
      int i = 0;
      localObject1 = this.mActive;
      int j = ((ArrayList)localObject1).size();
      if (i < j)
      {
        localObject1 = this.mActive;
        Fragment localFragment = (Fragment)((ArrayList)localObject1).get(i);
        if (localFragment != null)
        {
          boolean bool1 = localFragment.mRetainInstance;
          if (bool1)
          {
            if (localArrayList == null)
            {
              localArrayList = new java/util/ArrayList;
              localArrayList.<init>();
            }
            localArrayList.add(localFragment);
            bool1 = true;
            localFragment.mRetaining = bool1;
            localObject1 = localFragment.mTarget;
            if (localObject1 == null) {
              break label179;
            }
            localObject1 = localFragment.mTarget;
          }
        }
        label179:
        int m;
        for (int k = ((Fragment)localObject1).mIndex;; m = -1)
        {
          localFragment.mTargetIndex = k;
          boolean bool2 = DEBUG;
          if (bool2)
          {
            localObject1 = "FragmentManager";
            Object localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            String str = "retainNonConfig: keeping retained ";
            localObject2 = str + localFragment;
            Log.v((String)localObject1, (String)localObject2);
          }
          i += 1;
          break;
        }
      }
    }
    return localArrayList;
  }
  
  Parcelable saveAllState()
  {
    Object localObject1 = null;
    execPendingActions();
    boolean bool1 = HONEYCOMB;
    if (bool1)
    {
      bool1 = true;
      this.mStateSaved = bool1;
    }
    Object localObject2 = this.mActive;
    int i;
    if (localObject2 != null)
    {
      localObject2 = this.mActive;
      i = ((ArrayList)localObject2).size();
      if (i > 0) {
        break label47;
      }
    }
    for (;;)
    {
      return (Parcelable)localObject1;
      label47:
      localObject2 = this.mActive;
      int k = ((ArrayList)localObject2).size();
      FragmentState[] arrayOfFragmentState = new FragmentState[k];
      int m = 0;
      int n = 0;
      int i1;
      String str;
      Object localObject3;
      Object localObject4;
      boolean bool2;
      if (n < k)
      {
        localObject2 = this.mActive;
        Fragment localFragment = (Fragment)((ArrayList)localObject2).get(n);
        FragmentState localFragmentState;
        if (localFragment != null)
        {
          i = localFragment.mIndex;
          if (i < 0)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("Failure saving state: active ").append(localFragment).append(" has cleared index: ");
            i1 = localFragment.mIndex;
            str = i1;
            Log.e("FragmentManager", str);
            localObject3 = new java/io/PrintWriter;
            localObject4 = new android/support/v4/util/LogWriter;
            ((LogWriter)localObject4).<init>("FragmentManager");
            ((PrintWriter)localObject3).<init>((Writer)localObject4);
            localObject4 = new String[0];
            dump("  ", null, (PrintWriter)localObject3, (String[])localObject4);
            localObject2 = new java/lang/IllegalStateException;
            ((IllegalStateException)localObject2).<init>(str);
            throw ((Throwable)localObject2);
          }
          m = 1;
          localFragmentState = new android/support/v4/app/FragmentState;
          localFragmentState.<init>(localFragment);
          arrayOfFragmentState[n] = localFragmentState;
          i = localFragment.mState;
          if (i <= 0) {
            break label565;
          }
          localObject2 = localFragmentState.mSavedFragmentState;
          if (localObject2 != null) {
            break label565;
          }
          localObject2 = saveFragmentBasicState(localFragment);
          localFragmentState.mSavedFragmentState = ((Bundle)localObject2);
          localObject2 = localFragment.mTarget;
          if (localObject2 != null)
          {
            localObject2 = localFragment.mTarget;
            i = ((Fragment)localObject2).mIndex;
            if (i < 0)
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ((StringBuilder)localObject2).append("Failure saving state: ").append(localFragment).append(" has target not in fragment manager: ");
              localObject3 = localFragment.mTarget;
              str = localObject3;
              Log.e("FragmentManager", str);
              localObject3 = new java/io/PrintWriter;
              localObject4 = new android/support/v4/util/LogWriter;
              ((LogWriter)localObject4).<init>("FragmentManager");
              ((PrintWriter)localObject3).<init>((Writer)localObject4);
              localObject4 = new String[0];
              dump("  ", null, (PrintWriter)localObject3, (String[])localObject4);
              localObject2 = new java/lang/IllegalStateException;
              ((IllegalStateException)localObject2).<init>(str);
              throw ((Throwable)localObject2);
            }
            localObject2 = localFragmentState.mSavedFragmentState;
            if (localObject2 == null)
            {
              localObject2 = new android/os/Bundle;
              ((Bundle)localObject2).<init>();
              localFragmentState.mSavedFragmentState = ((Bundle)localObject2);
            }
            localObject2 = localFragmentState.mSavedFragmentState;
            localObject3 = "android:target_state";
            localObject4 = localFragment.mTarget;
            putFragment((Bundle)localObject2, (String)localObject3, (Fragment)localObject4);
            i = localFragment.mTargetRequestCode;
            if (i != 0)
            {
              localObject2 = localFragmentState.mSavedFragmentState;
              localObject3 = "android:target_req_state";
              int i2 = localFragment.mTargetRequestCode;
              ((Bundle)localObject2).putInt((String)localObject3, i2);
            }
          }
        }
        for (;;)
        {
          bool2 = DEBUG;
          if (bool2)
          {
            localObject2 = "FragmentManager";
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject3 = ((StringBuilder)localObject3).append("Saved state of ").append(localFragment).append(": ");
            localObject4 = localFragmentState.mSavedFragmentState;
            localObject3 = localObject4;
            Log.v((String)localObject2, (String)localObject3);
          }
          n += 1;
          break;
          label565:
          localObject2 = localFragment.mSavedFragmentState;
          localFragmentState.mSavedFragmentState = ((Bundle)localObject2);
        }
      }
      if (m == 0)
      {
        bool2 = DEBUG;
        if (bool2)
        {
          localObject2 = "FragmentManager";
          localObject3 = "saveAllState: no fragments!";
          Log.v((String)localObject2, (String)localObject3);
        }
      }
      else
      {
        int[] arrayOfInt = null;
        BackStackState[] arrayOfBackStackState = null;
        localObject2 = this.mAdded;
        boolean bool3;
        if (localObject2 != null)
        {
          localObject2 = this.mAdded;
          k = ((ArrayList)localObject2).size();
          if (k > 0)
          {
            arrayOfInt = new int[k];
            n = 0;
            while (n < k)
            {
              localObject2 = (Fragment)this.mAdded.get(n);
              int j = ((Fragment)localObject2).mIndex;
              arrayOfInt[n] = j;
              j = arrayOfInt[n];
              if (j < 0)
              {
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                localObject2 = ((StringBuilder)localObject2).append("Failure saving state: active ");
                localObject3 = this.mAdded.get(n);
                localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" has cleared index: ");
                i1 = arrayOfInt[n];
                str = i1;
                Log.e("FragmentManager", str);
                localObject3 = new java/io/PrintWriter;
                localObject4 = new android/support/v4/util/LogWriter;
                ((LogWriter)localObject4).<init>("FragmentManager");
                ((PrintWriter)localObject3).<init>((Writer)localObject4);
                localObject4 = new String[0];
                dump("  ", null, (PrintWriter)localObject3, (String[])localObject4);
                localObject2 = new java/lang/IllegalStateException;
                ((IllegalStateException)localObject2).<init>(str);
                throw ((Throwable)localObject2);
              }
              bool3 = DEBUG;
              if (bool3)
              {
                localObject2 = "FragmentManager";
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                localObject3 = ((StringBuilder)localObject3).append("saveAllState: adding fragment #").append(n).append(": ");
                localObject4 = this.mAdded.get(n);
                localObject3 = localObject4;
                Log.v((String)localObject2, (String)localObject3);
              }
              n += 1;
            }
          }
        }
        localObject2 = this.mBackStack;
        if (localObject2 != null)
        {
          localObject2 = this.mBackStack;
          k = ((ArrayList)localObject2).size();
          if (k > 0)
          {
            arrayOfBackStackState = new BackStackState[k];
            n = 0;
            while (n < k)
            {
              localObject3 = new android/support/v4/app/BackStackState;
              localObject2 = (BackStackRecord)this.mBackStack.get(n);
              ((BackStackState)localObject3).<init>(this, (BackStackRecord)localObject2);
              arrayOfBackStackState[n] = localObject3;
              bool3 = DEBUG;
              if (bool3)
              {
                localObject2 = "FragmentManager";
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                localObject3 = ((StringBuilder)localObject3).append("saveAllState: adding back stack #").append(n).append(": ");
                localObject4 = this.mBackStack.get(n);
                localObject3 = localObject4;
                Log.v((String)localObject2, (String)localObject3);
              }
              n += 1;
            }
          }
        }
        localObject1 = new android/support/v4/app/FragmentManagerState;
        ((FragmentManagerState)localObject1).<init>();
        ((FragmentManagerState)localObject1).mActive = arrayOfFragmentState;
        ((FragmentManagerState)localObject1).mAdded = arrayOfInt;
        ((FragmentManagerState)localObject1).mBackStack = arrayOfBackStackState;
      }
    }
  }
  
  Bundle saveFragmentBasicState(Fragment paramFragment)
  {
    Bundle localBundle = null;
    Object localObject = this.mStateBundle;
    if (localObject == null)
    {
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      this.mStateBundle = ((Bundle)localObject);
    }
    localObject = this.mStateBundle;
    paramFragment.onSaveInstanceState((Bundle)localObject);
    localObject = this.mStateBundle;
    boolean bool1 = ((Bundle)localObject).isEmpty();
    if (!bool1)
    {
      localBundle = this.mStateBundle;
      bool1 = false;
      localObject = null;
      this.mStateBundle = null;
    }
    localObject = paramFragment.mView;
    if (localObject != null) {
      saveFragmentViewState(paramFragment);
    }
    localObject = paramFragment.mSavedViewState;
    if (localObject != null)
    {
      if (localBundle == null)
      {
        localBundle = new android/os/Bundle;
        localBundle.<init>();
      }
      localObject = "android:view_state";
      SparseArray localSparseArray = paramFragment.mSavedViewState;
      localBundle.putSparseParcelableArray((String)localObject, localSparseArray);
    }
    bool1 = paramFragment.mUserVisibleHint;
    if (!bool1)
    {
      if (localBundle == null)
      {
        localBundle = new android/os/Bundle;
        localBundle.<init>();
      }
      localObject = "android:user_visible_hint";
      boolean bool2 = paramFragment.mUserVisibleHint;
      localBundle.putBoolean((String)localObject, bool2);
    }
    return localBundle;
  }
  
  public Fragment.SavedState saveFragmentInstanceState(Fragment paramFragment)
  {
    Object localObject1 = null;
    int i = paramFragment.mIndex;
    if (i < 0)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Fragment " + paramFragment + " is not currently in the FragmentManager";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    i = paramFragment.mState;
    if (i > 0)
    {
      Bundle localBundle = saveFragmentBasicState(paramFragment);
      if (localBundle != null)
      {
        localObject1 = new android/support/v4/app/Fragment$SavedState;
        ((Fragment.SavedState)localObject1).<init>(localBundle);
      }
    }
    return (Fragment.SavedState)localObject1;
  }
  
  void saveFragmentViewState(Fragment paramFragment)
  {
    Object localObject = paramFragment.mInnerView;
    if (localObject == null) {
      return;
    }
    localObject = this.mStateArray;
    if (localObject == null)
    {
      localObject = new android/util/SparseArray;
      ((SparseArray)localObject).<init>();
      this.mStateArray = ((SparseArray)localObject);
    }
    for (;;)
    {
      localObject = paramFragment.mInnerView;
      SparseArray localSparseArray = this.mStateArray;
      ((View)localObject).saveHierarchyState(localSparseArray);
      localObject = this.mStateArray;
      int i = ((SparseArray)localObject).size();
      if (i <= 0) {
        break;
      }
      localObject = this.mStateArray;
      paramFragment.mSavedViewState = ((SparseArray)localObject);
      i = 0;
      localObject = null;
      this.mStateArray = null;
      break;
      localObject = this.mStateArray;
      ((SparseArray)localObject).clear();
    }
  }
  
  /* Error */
  public void setBackStackIndex(int paramInt, BackStackRecord paramBackStackRecord)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 247	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnonnull +16 -> 24
    //   11: new 191	java/util/ArrayList
    //   14: astore_3
    //   15: aload_3
    //   16: invokespecial 192	java/util/ArrayList:<init>	()V
    //   19: aload_0
    //   20: aload_3
    //   21: putfield 247	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   24: aload_0
    //   25: getfield 247	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   28: astore_3
    //   29: aload_3
    //   30: invokevirtual 245	java/util/ArrayList:size	()I
    //   33: istore 4
    //   35: iload_1
    //   36: iload 4
    //   38: if_icmpge +97 -> 135
    //   41: getstatic 78	android/support/v4/app/FragmentManagerImpl:DEBUG	Z
    //   44: istore 5
    //   46: iload 5
    //   48: ifeq +72 -> 120
    //   51: ldc 33
    //   53: astore_3
    //   54: new 133	java/lang/StringBuilder
    //   57: astore 6
    //   59: aload 6
    //   61: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   64: ldc -7
    //   66: astore 7
    //   68: aload 6
    //   70: aload 7
    //   72: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: astore 6
    //   77: aload 6
    //   79: iload_1
    //   80: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   83: astore 6
    //   85: ldc -2
    //   87: astore 7
    //   89: aload 6
    //   91: aload 7
    //   93: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: astore 6
    //   98: aload 6
    //   100: aload_2
    //   101: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   104: astore 6
    //   106: aload 6
    //   108: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: astore 6
    //   113: aload_3
    //   114: aload 6
    //   116: invokestatic 212	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   119: pop
    //   120: aload_0
    //   121: getfield 247	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   124: astore_3
    //   125: aload_3
    //   126: iload_1
    //   127: aload_2
    //   128: invokevirtual 271	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: aload_0
    //   133: monitorexit
    //   134: return
    //   135: iload 4
    //   137: iload_1
    //   138: if_icmpge +127 -> 265
    //   141: aload_0
    //   142: getfield 247	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   145: astore_3
    //   146: aconst_null
    //   147: astore 6
    //   149: aload_3
    //   150: aconst_null
    //   151: invokevirtual 196	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   154: pop
    //   155: aload_0
    //   156: getfield 241	android/support/v4/app/FragmentManagerImpl:mAvailBackStackIndices	Ljava/util/ArrayList;
    //   159: astore_3
    //   160: aload_3
    //   161: ifnonnull +16 -> 177
    //   164: new 191	java/util/ArrayList
    //   167: astore_3
    //   168: aload_3
    //   169: invokespecial 192	java/util/ArrayList:<init>	()V
    //   172: aload_0
    //   173: aload_3
    //   174: putfield 241	android/support/v4/app/FragmentManagerImpl:mAvailBackStackIndices	Ljava/util/ArrayList;
    //   177: getstatic 78	android/support/v4/app/FragmentManagerImpl:DEBUG	Z
    //   180: istore 5
    //   182: iload 5
    //   184: ifeq +53 -> 237
    //   187: ldc 33
    //   189: astore_3
    //   190: new 133	java/lang/StringBuilder
    //   193: astore 6
    //   195: aload 6
    //   197: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   200: ldc_w 1032
    //   203: astore 7
    //   205: aload 6
    //   207: aload 7
    //   209: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: astore 6
    //   214: aload 6
    //   216: iload 4
    //   218: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   221: astore 6
    //   223: aload 6
    //   225: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   228: astore 6
    //   230: aload_3
    //   231: aload 6
    //   233: invokestatic 212	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   236: pop
    //   237: aload_0
    //   238: getfield 241	android/support/v4/app/FragmentManagerImpl:mAvailBackStackIndices	Ljava/util/ArrayList;
    //   241: astore_3
    //   242: iload 4
    //   244: invokestatic 508	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   247: astore 6
    //   249: aload_3
    //   250: aload 6
    //   252: invokevirtual 196	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   255: pop
    //   256: iload 4
    //   258: iconst_1
    //   259: iadd
    //   260: istore 4
    //   262: goto -127 -> 135
    //   265: getstatic 78	android/support/v4/app/FragmentManagerImpl:DEBUG	Z
    //   268: istore 5
    //   270: iload 5
    //   272: ifeq +74 -> 346
    //   275: ldc 33
    //   277: astore_3
    //   278: new 133	java/lang/StringBuilder
    //   281: astore 6
    //   283: aload 6
    //   285: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   288: ldc_w 265
    //   291: astore 7
    //   293: aload 6
    //   295: aload 7
    //   297: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: astore 6
    //   302: aload 6
    //   304: iload_1
    //   305: invokevirtual 252	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   308: astore 6
    //   310: ldc_w 267
    //   313: astore 7
    //   315: aload 6
    //   317: aload 7
    //   319: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: astore 6
    //   324: aload 6
    //   326: aload_2
    //   327: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   330: astore 6
    //   332: aload 6
    //   334: invokevirtual 144	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   337: astore 6
    //   339: aload_3
    //   340: aload 6
    //   342: invokestatic 212	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   345: pop
    //   346: aload_0
    //   347: getfield 247	android/support/v4/app/FragmentManagerImpl:mBackStackIndices	Ljava/util/ArrayList;
    //   350: astore_3
    //   351: aload_3
    //   352: aload_2
    //   353: invokevirtual 196	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   356: pop
    //   357: goto -225 -> 132
    //   360: astore_3
    //   361: aload_0
    //   362: monitorexit
    //   363: aload_3
    //   364: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	365	0	this	FragmentManagerImpl
    //   0	365	1	paramInt	int
    //   0	365	2	paramBackStackRecord	BackStackRecord
    //   6	346	3	localObject1	Object
    //   360	4	3	localObject2	Object
    //   33	228	4	i	int
    //   44	227	5	bool	boolean
    //   57	284	6	localObject3	Object
    //   66	252	7	str	String
    // Exception table:
    //   from	to	target	type
    //   2	6	360	finally
    //   11	14	360	finally
    //   15	19	360	finally
    //   20	24	360	finally
    //   24	28	360	finally
    //   29	33	360	finally
    //   41	44	360	finally
    //   54	57	360	finally
    //   59	64	360	finally
    //   70	75	360	finally
    //   79	83	360	finally
    //   91	96	360	finally
    //   100	104	360	finally
    //   106	111	360	finally
    //   114	120	360	finally
    //   120	124	360	finally
    //   127	132	360	finally
    //   132	134	360	finally
    //   141	145	360	finally
    //   150	155	360	finally
    //   155	159	360	finally
    //   164	167	360	finally
    //   168	172	360	finally
    //   173	177	360	finally
    //   177	180	360	finally
    //   190	193	360	finally
    //   195	200	360	finally
    //   207	212	360	finally
    //   216	221	360	finally
    //   223	228	360	finally
    //   231	237	360	finally
    //   237	241	360	finally
    //   242	247	360	finally
    //   250	256	360	finally
    //   265	268	360	finally
    //   278	281	360	finally
    //   283	288	360	finally
    //   295	300	360	finally
    //   304	308	360	finally
    //   317	322	360	finally
    //   326	330	360	finally
    //   332	337	360	finally
    //   340	346	360	finally
    //   346	350	360	finally
    //   352	357	360	finally
    //   361	363	360	finally
  }
  
  public void showFragment(Fragment paramFragment, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2 = DEBUG;
    Object localObject1;
    if (bool2)
    {
      localObject1 = "FragmentManager";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "show: ";
      localObject2 = str + paramFragment;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool2 = paramFragment.mHidden;
    if (bool2)
    {
      paramFragment.mHidden = false;
      localObject1 = paramFragment.mView;
      if (localObject1 != null)
      {
        Animation localAnimation = loadAnimation(paramFragment, paramInt1, bool1, paramInt2);
        if (localAnimation != null)
        {
          localObject1 = paramFragment.mView;
          ((View)localObject1).startAnimation(localAnimation);
        }
        localObject1 = paramFragment.mView;
        ((View)localObject1).setVisibility(0);
      }
      bool2 = paramFragment.mAdded;
      if (bool2)
      {
        bool2 = paramFragment.mHasMenu;
        if (bool2)
        {
          bool2 = paramFragment.mMenuVisible;
          if (bool2) {
            this.mNeedMenuInvalidate = bool1;
          }
        }
      }
      paramFragment.onHiddenChanged(false);
    }
  }
  
  void startPendingDeferredFragments()
  {
    ArrayList localArrayList = this.mActive;
    if (localArrayList == null) {
      return;
    }
    int i = 0;
    for (;;)
    {
      localArrayList = this.mActive;
      int j = localArrayList.size();
      if (i >= j) {
        break;
      }
      localArrayList = this.mActive;
      Fragment localFragment = (Fragment)localArrayList.get(i);
      if (localFragment != null) {
        performPendingDeferredStart(localFragment);
      }
      i += 1;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("FragmentManager{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    localStringBuilder.append(" in ");
    DebugUtils.buildShortClassTag(this.mActivity, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/FragmentManagerImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */