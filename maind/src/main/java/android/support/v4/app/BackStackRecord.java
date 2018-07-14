package android.support.v4.app;

import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

final class BackStackRecord
  extends FragmentTransaction
  implements FragmentManager.BackStackEntry, Runnable
{
  static final int OP_ADD = 1;
  static final int OP_ATTACH = 7;
  static final int OP_DETACH = 6;
  static final int OP_HIDE = 4;
  static final int OP_NULL = 0;
  static final int OP_REMOVE = 3;
  static final int OP_REPLACE = 2;
  static final int OP_SHOW = 5;
  static final String TAG = "BackStackEntry";
  boolean mAddToBackStack;
  boolean mAllowAddToBackStack = true;
  int mBreadCrumbShortTitleRes;
  CharSequence mBreadCrumbShortTitleText;
  int mBreadCrumbTitleRes;
  CharSequence mBreadCrumbTitleText;
  boolean mCommitted;
  int mEnterAnim;
  int mExitAnim;
  BackStackRecord.Op mHead;
  int mIndex;
  final FragmentManagerImpl mManager;
  String mName;
  int mNumOp;
  int mPopEnterAnim;
  int mPopExitAnim;
  BackStackRecord.Op mTail;
  int mTransition;
  int mTransitionStyle;
  
  public BackStackRecord(FragmentManagerImpl paramFragmentManagerImpl)
  {
    this.mManager = paramFragmentManagerImpl;
  }
  
  private void doAddOp(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    Object localObject1 = this.mManager;
    paramFragment.mFragmentManager = ((FragmentManagerImpl)localObject1);
    Object localObject2;
    if (paramString != null)
    {
      localObject1 = paramFragment.mTag;
      if (localObject1 != null)
      {
        localObject1 = paramFragment.mTag;
        boolean bool = paramString.equals(localObject1);
        if (!bool)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Can't change tag of fragment ").append(paramFragment).append(": was ");
          String str = paramFragment.mTag;
          localObject2 = str + " now " + paramString;
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      paramFragment.mTag = paramString;
    }
    if (paramInt1 != 0)
    {
      int i = paramFragment.mFragmentId;
      if (i != 0)
      {
        i = paramFragment.mFragmentId;
        if (i != paramInt1)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Can't change container ID of fragment ").append(paramFragment).append(": was ");
          int j = paramFragment.mFragmentId;
          localObject2 = j + " now " + paramInt1;
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      paramFragment.mFragmentId = paramInt1;
      paramFragment.mContainerId = paramInt1;
    }
    BackStackRecord.Op localOp = new android/support/v4/app/BackStackRecord$Op;
    localOp.<init>();
    localOp.cmd = paramInt2;
    localOp.fragment = paramFragment;
    addOp(localOp);
  }
  
  public FragmentTransaction add(int paramInt, Fragment paramFragment)
  {
    doAddOp(paramInt, paramFragment, null, 1);
    return this;
  }
  
  public FragmentTransaction add(int paramInt, Fragment paramFragment, String paramString)
  {
    doAddOp(paramInt, paramFragment, paramString, 1);
    return this;
  }
  
  public FragmentTransaction add(Fragment paramFragment, String paramString)
  {
    doAddOp(0, paramFragment, paramString, 1);
    return this;
  }
  
  void addOp(BackStackRecord.Op paramOp)
  {
    BackStackRecord.Op localOp = this.mHead;
    if (localOp == null)
    {
      this.mTail = paramOp;
      this.mHead = paramOp;
    }
    for (;;)
    {
      int i = this.mEnterAnim;
      paramOp.enterAnim = i;
      i = this.mExitAnim;
      paramOp.exitAnim = i;
      i = this.mPopEnterAnim;
      paramOp.popEnterAnim = i;
      i = this.mPopExitAnim;
      paramOp.popExitAnim = i;
      i = this.mNumOp + 1;
      this.mNumOp = i;
      return;
      localOp = this.mTail;
      paramOp.prev = localOp;
      localOp = this.mTail;
      localOp.next = paramOp;
      this.mTail = paramOp;
    }
  }
  
  public FragmentTransaction addToBackStack(String paramString)
  {
    boolean bool = this.mAllowAddToBackStack;
    if (!bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("This FragmentTransaction is not allowed to be added to the back stack.");
      throw localIllegalStateException;
    }
    this.mAddToBackStack = true;
    this.mName = paramString;
    return this;
  }
  
  public FragmentTransaction attach(Fragment paramFragment)
  {
    BackStackRecord.Op localOp = new android/support/v4/app/BackStackRecord$Op;
    localOp.<init>();
    localOp.cmd = 7;
    localOp.fragment = paramFragment;
    addOp(localOp);
    return this;
  }
  
  void bumpBackStackNesting(int paramInt)
  {
    boolean bool1 = this.mAddToBackStack;
    if (!bool1) {}
    for (;;)
    {
      return;
      bool1 = FragmentManagerImpl.DEBUG;
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if (bool1)
      {
        localObject1 = "BackStackEntry";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Bump nesting in ").append(this);
        localObject3 = " by ";
        localObject2 = (String)localObject3 + paramInt;
        Log.v((String)localObject1, (String)localObject2);
      }
      for (BackStackRecord.Op localOp = this.mHead; localOp != null; localOp = localOp.next)
      {
        localObject1 = localOp.fragment;
        int k;
        if (localObject1 != null)
        {
          localObject1 = localOp.fragment;
          int j = ((Fragment)localObject1).mBackStackNesting + paramInt;
          ((Fragment)localObject1).mBackStackNesting = j;
          bool1 = FragmentManagerImpl.DEBUG;
          if (bool1)
          {
            localObject1 = "BackStackEntry";
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("Bump nesting of ");
            localObject3 = localOp.fragment;
            localObject2 = ((StringBuilder)localObject2).append(localObject3).append(" to ");
            localObject3 = localOp.fragment;
            k = ((Fragment)localObject3).mBackStackNesting;
            localObject2 = k;
            Log.v((String)localObject1, (String)localObject2);
          }
        }
        localObject1 = localOp.removed;
        if (localObject1 != null)
        {
          localObject1 = localOp.removed;
          int i = ((ArrayList)localObject1).size();
          int m = i + -1;
          while (m >= 0)
          {
            localObject1 = localOp.removed;
            Fragment localFragment = (Fragment)((ArrayList)localObject1).get(m);
            i = localFragment.mBackStackNesting + paramInt;
            localFragment.mBackStackNesting = i;
            boolean bool2 = FragmentManagerImpl.DEBUG;
            if (bool2)
            {
              localObject1 = "BackStackEntry";
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ((StringBuilder)localObject2).append("Bump nesting of ").append(localFragment);
              localObject3 = " to ";
              localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
              k = localFragment.mBackStackNesting;
              localObject2 = k;
              Log.v((String)localObject1, (String)localObject2);
            }
            m += -1;
          }
        }
      }
    }
  }
  
  public int commit()
  {
    return commitInternal(false);
  }
  
  public int commitAllowingStateLoss()
  {
    return commitInternal(true);
  }
  
  int commitInternal(boolean paramBoolean)
  {
    boolean bool = this.mCommitted;
    Object localObject1;
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("commit already called");
      throw ((Throwable)localObject1);
    }
    bool = FragmentManagerImpl.DEBUG;
    if (bool)
    {
      localObject1 = "BackStackEntry";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "Commit: ";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    this.mCommitted = true;
    bool = this.mAddToBackStack;
    int i;
    if (bool)
    {
      localObject1 = this.mManager;
      i = ((FragmentManagerImpl)localObject1).allocBackStackIndex(this);
    }
    for (this.mIndex = i;; this.mIndex = i)
    {
      this.mManager.enqueueAction(this, paramBoolean);
      return this.mIndex;
      i = -1;
    }
  }
  
  public FragmentTransaction detach(Fragment paramFragment)
  {
    BackStackRecord.Op localOp = new android/support/v4/app/BackStackRecord$Op;
    localOp.<init>();
    localOp.cmd = 6;
    localOp.fragment = paramFragment;
    addOp(localOp);
    return this;
  }
  
  public FragmentTransaction disallowAddToBackStack()
  {
    boolean bool = this.mAddToBackStack;
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("This transaction is already being added to the back stack");
      throw localIllegalStateException;
    }
    this.mAllowAddToBackStack = false;
    return this;
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mName=");
    Object localObject = this.mName;
    paramPrintWriter.print((String)localObject);
    paramPrintWriter.print(" mIndex=");
    int i = this.mIndex;
    paramPrintWriter.print(i);
    localObject = " mCommitted=";
    paramPrintWriter.print((String)localObject);
    boolean bool = this.mCommitted;
    paramPrintWriter.println(bool);
    int j = this.mTransition;
    if (j != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTransition=#");
      localObject = Integer.toHexString(this.mTransition);
      paramPrintWriter.print((String)localObject);
      paramPrintWriter.print(" mTransitionStyle=#");
      j = this.mTransitionStyle;
      localObject = Integer.toHexString(j);
      paramPrintWriter.println((String)localObject);
    }
    j = this.mEnterAnim;
    if (j == 0)
    {
      j = this.mExitAnim;
      if (j == 0) {}
    }
    else
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mEnterAnim=#");
      localObject = Integer.toHexString(this.mEnterAnim);
      paramPrintWriter.print((String)localObject);
      paramPrintWriter.print(" mExitAnim=#");
      j = this.mExitAnim;
      localObject = Integer.toHexString(j);
      paramPrintWriter.println((String)localObject);
    }
    j = this.mPopEnterAnim;
    if (j == 0)
    {
      j = this.mPopExitAnim;
      if (j == 0) {}
    }
    else
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mPopEnterAnim=#");
      localObject = Integer.toHexString(this.mPopEnterAnim);
      paramPrintWriter.print((String)localObject);
      paramPrintWriter.print(" mPopExitAnim=#");
      j = this.mPopExitAnim;
      localObject = Integer.toHexString(j);
      paramPrintWriter.println((String)localObject);
    }
    j = this.mBreadCrumbTitleRes;
    if (j == 0)
    {
      localObject = this.mBreadCrumbTitleText;
      if (localObject == null) {}
    }
    else
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mBreadCrumbTitleRes=#");
      j = this.mBreadCrumbTitleRes;
      localObject = Integer.toHexString(j);
      paramPrintWriter.print((String)localObject);
      paramPrintWriter.print(" mBreadCrumbTitleText=");
      localObject = this.mBreadCrumbTitleText;
      paramPrintWriter.println(localObject);
    }
    j = this.mBreadCrumbShortTitleRes;
    if (j == 0)
    {
      localObject = this.mBreadCrumbShortTitleText;
      if (localObject == null) {}
    }
    else
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
      j = this.mBreadCrumbShortTitleRes;
      localObject = Integer.toHexString(j);
      paramPrintWriter.print((String)localObject);
      paramPrintWriter.print(" mBreadCrumbShortTitleText=");
      localObject = this.mBreadCrumbShortTitleText;
      paramPrintWriter.println(localObject);
    }
    localObject = this.mHead;
    if (localObject != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString);
      String str1 = "    ";
      localObject = ((StringBuilder)localObject).append(str1);
      String str2 = ((StringBuilder)localObject).toString();
      for (BackStackRecord.Op localOp = this.mHead; localOp != null; localOp = localOp.next)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(0);
        paramPrintWriter.println(":");
        paramPrintWriter.print(str2);
        paramPrintWriter.print("cmd=");
        j = localOp.cmd;
        paramPrintWriter.print(j);
        paramPrintWriter.print(" fragment=");
        localObject = localOp.fragment;
        paramPrintWriter.println(localObject);
        j = localOp.enterAnim;
        if (j == 0)
        {
          j = localOp.exitAnim;
          if (j == 0) {}
        }
        else
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("enterAnim=#");
          localObject = Integer.toHexString(localOp.enterAnim);
          paramPrintWriter.print((String)localObject);
          paramPrintWriter.print(" exitAnim=#");
          j = localOp.exitAnim;
          localObject = Integer.toHexString(j);
          paramPrintWriter.println((String)localObject);
        }
        j = localOp.popEnterAnim;
        if (j == 0)
        {
          j = localOp.popExitAnim;
          if (j == 0) {}
        }
        else
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("popEnterAnim=#");
          localObject = Integer.toHexString(localOp.popEnterAnim);
          paramPrintWriter.print((String)localObject);
          paramPrintWriter.print(" popExitAnim=#");
          j = localOp.popExitAnim;
          localObject = Integer.toHexString(j);
          paramPrintWriter.println((String)localObject);
        }
        localObject = localOp.removed;
        if (localObject != null)
        {
          localObject = localOp.removed;
          j = ((ArrayList)localObject).size();
          if (j > 0)
          {
            int k = 0;
            localObject = localOp.removed;
            j = ((ArrayList)localObject).size();
            if (k < j)
            {
              paramPrintWriter.print(str2);
              localObject = localOp.removed;
              j = ((ArrayList)localObject).size();
              int m = 1;
              if (j == m)
              {
                localObject = "Removed: ";
                paramPrintWriter.print((String)localObject);
              }
              for (;;)
              {
                localObject = localOp.removed.get(k);
                paramPrintWriter.println(localObject);
                k += 1;
                break;
                paramPrintWriter.println("Removed:");
                paramPrintWriter.print(str2);
                paramPrintWriter.print("  #");
                paramPrintWriter.print(0);
                localObject = ": ";
                paramPrintWriter.print((String)localObject);
              }
            }
          }
        }
      }
    }
  }
  
  public CharSequence getBreadCrumbShortTitle()
  {
    int i = this.mBreadCrumbShortTitleRes;
    int j;
    if (i != 0)
    {
      localObject = this.mManager.mActivity;
      j = this.mBreadCrumbShortTitleRes;
    }
    for (Object localObject = ((FragmentActivity)localObject).getText(j);; localObject = this.mBreadCrumbShortTitleText) {
      return (CharSequence)localObject;
    }
  }
  
  public int getBreadCrumbShortTitleRes()
  {
    return this.mBreadCrumbShortTitleRes;
  }
  
  public CharSequence getBreadCrumbTitle()
  {
    int i = this.mBreadCrumbTitleRes;
    int j;
    if (i != 0)
    {
      localObject = this.mManager.mActivity;
      j = this.mBreadCrumbTitleRes;
    }
    for (Object localObject = ((FragmentActivity)localObject).getText(j);; localObject = this.mBreadCrumbTitleText) {
      return (CharSequence)localObject;
    }
  }
  
  public int getBreadCrumbTitleRes()
  {
    return this.mBreadCrumbTitleRes;
  }
  
  public int getId()
  {
    return this.mIndex;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public int getTransition()
  {
    return this.mTransition;
  }
  
  public int getTransitionStyle()
  {
    return this.mTransitionStyle;
  }
  
  public FragmentTransaction hide(Fragment paramFragment)
  {
    BackStackRecord.Op localOp = new android/support/v4/app/BackStackRecord$Op;
    localOp.<init>();
    localOp.cmd = 4;
    localOp.fragment = paramFragment;
    addOp(localOp);
    return this;
  }
  
  public boolean isAddToBackStackAllowed()
  {
    return this.mAllowAddToBackStack;
  }
  
  public boolean isEmpty()
  {
    int i = this.mNumOp;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public void popFromBackStack(boolean paramBoolean)
  {
    int i = 0;
    int j = -1;
    boolean bool1 = FragmentManagerImpl.DEBUG;
    Object localObject1;
    Object localObject2;
    if (bool1)
    {
      localObject1 = "BackStackEntry";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "popFromBackStack: ";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    bumpBackStackNesting(j);
    BackStackRecord.Op localOp = this.mTail;
    int m;
    int n;
    if (localOp != null)
    {
      k = localOp.cmd;
      Fragment localFragment1;
      switch (k)
      {
      default: 
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Unknown cmd: ");
        m = localOp.cmd;
        localObject2 = m;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      case 1: 
        localFragment1 = localOp.fragment;
        k = localOp.popExitAnim;
        localFragment1.mNextAnim = k;
        localObject1 = this.mManager;
        n = FragmentManagerImpl.reverseTransit(this.mTransition);
        m = this.mTransitionStyle;
        ((FragmentManagerImpl)localObject1).removeFragment(localFragment1, n, m);
      }
      for (;;)
      {
        localOp = localOp.prev;
        break;
        localFragment1 = localOp.fragment;
        if (localFragment1 != null)
        {
          k = localOp.popExitAnim;
          localFragment1.mNextAnim = k;
          localObject1 = this.mManager;
          n = FragmentManagerImpl.reverseTransit(this.mTransition);
          m = this.mTransitionStyle;
          ((FragmentManagerImpl)localObject1).removeFragment(localFragment1, n, m);
        }
        localObject1 = localOp.removed;
        if (localObject1 != null)
        {
          int i1 = 0;
          for (;;)
          {
            localObject1 = localOp.removed;
            k = ((ArrayList)localObject1).size();
            if (i1 >= k) {
              break;
            }
            Fragment localFragment2 = (Fragment)localOp.removed.get(i1);
            k = localOp.popEnterAnim;
            localFragment2.mNextAnim = k;
            localObject1 = this.mManager;
            ((FragmentManagerImpl)localObject1).addFragment(localFragment2, false);
            i1 += 1;
          }
          localFragment1 = localOp.fragment;
          k = localOp.popEnterAnim;
          localFragment1.mNextAnim = k;
          localObject1 = this.mManager;
          ((FragmentManagerImpl)localObject1).addFragment(localFragment1, false);
          continue;
          localFragment1 = localOp.fragment;
          k = localOp.popEnterAnim;
          localFragment1.mNextAnim = k;
          localObject1 = this.mManager;
          n = FragmentManagerImpl.reverseTransit(this.mTransition);
          m = this.mTransitionStyle;
          ((FragmentManagerImpl)localObject1).showFragment(localFragment1, n, m);
          continue;
          localFragment1 = localOp.fragment;
          k = localOp.popExitAnim;
          localFragment1.mNextAnim = k;
          localObject1 = this.mManager;
          n = FragmentManagerImpl.reverseTransit(this.mTransition);
          m = this.mTransitionStyle;
          ((FragmentManagerImpl)localObject1).hideFragment(localFragment1, n, m);
          continue;
          localFragment1 = localOp.fragment;
          k = localOp.popEnterAnim;
          localFragment1.mNextAnim = k;
          localObject1 = this.mManager;
          n = FragmentManagerImpl.reverseTransit(this.mTransition);
          m = this.mTransitionStyle;
          ((FragmentManagerImpl)localObject1).attachFragment(localFragment1, n, m);
          continue;
          localFragment1 = localOp.fragment;
          k = localOp.popEnterAnim;
          localFragment1.mNextAnim = k;
          localObject1 = this.mManager;
          n = FragmentManagerImpl.reverseTransit(this.mTransition);
          m = this.mTransitionStyle;
          ((FragmentManagerImpl)localObject1).detachFragment(localFragment1, n, m);
        }
      }
    }
    if (paramBoolean)
    {
      localObject1 = this.mManager;
      localObject2 = this.mManager;
      n = ((FragmentManagerImpl)localObject2).mCurState;
      m = FragmentManagerImpl.reverseTransit(this.mTransition);
      i = this.mTransitionStyle;
      boolean bool2 = true;
      ((FragmentManagerImpl)localObject1).moveToState(n, m, i, bool2);
    }
    int k = this.mIndex;
    if (k >= 0)
    {
      localObject1 = this.mManager;
      n = this.mIndex;
      ((FragmentManagerImpl)localObject1).freeBackStackIndex(n);
      this.mIndex = j;
    }
  }
  
  public FragmentTransaction remove(Fragment paramFragment)
  {
    BackStackRecord.Op localOp = new android/support/v4/app/BackStackRecord$Op;
    localOp.<init>();
    localOp.cmd = 3;
    localOp.fragment = paramFragment;
    addOp(localOp);
    return this;
  }
  
  public FragmentTransaction replace(int paramInt, Fragment paramFragment)
  {
    return replace(paramInt, paramFragment, null);
  }
  
  public FragmentTransaction replace(int paramInt, Fragment paramFragment, String paramString)
  {
    if (paramInt == 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Must use non-zero containerViewId");
      throw localIllegalArgumentException;
    }
    doAddOp(paramInt, paramFragment, paramString, 2);
    return this;
  }
  
  public void run()
  {
    int i = 1;
    int j = 0;
    boolean bool1 = FragmentManagerImpl.DEBUG;
    String str;
    if (bool1)
    {
      localObject1 = "BackStackEntry";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str = "Run: ";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool1 = this.mAddToBackStack;
    int k;
    if (bool1)
    {
      k = this.mIndex;
      if (k < 0)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("addToBackStack() called after commit()");
        throw ((Throwable)localObject1);
      }
    }
    bumpBackStackNesting(i);
    BackStackRecord.Op localOp = this.mHead;
    if (localOp != null)
    {
      k = localOp.cmd;
      Fragment localFragment1;
      switch (k)
      {
      default: 
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Unknown cmd: ");
        i2 = localOp.cmd;
        localObject2 = i2;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      case 1: 
        localFragment1 = localOp.fragment;
        k = localOp.enterAnim;
        localFragment1.mNextAnim = k;
        localObject1 = this.mManager;
        ((FragmentManagerImpl)localObject1).addFragment(localFragment1, false);
      }
      for (;;)
      {
        localOp = localOp.next;
        break;
        localFragment1 = localOp.fragment;
        localObject1 = this.mManager.mAdded;
        if (localObject1 != null)
        {
          int i3 = 0;
          localObject1 = this.mManager.mAdded;
          k = ((ArrayList)localObject1).size();
          if (i3 < k)
          {
            localObject1 = this.mManager.mAdded;
            Fragment localFragment2 = (Fragment)((ArrayList)localObject1).get(i3);
            boolean bool2 = FragmentManagerImpl.DEBUG;
            if (bool2)
            {
              localObject1 = "BackStackEntry";
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ((StringBuilder)localObject2).append("OP_REPLACE: adding=").append(localFragment1);
              str = " old=";
              localObject2 = str + localFragment2;
              Log.v((String)localObject1, (String)localObject2);
            }
            int m;
            if (localFragment1 != null)
            {
              m = localFragment2.mContainerId;
              i4 = localFragment1.mContainerId;
              if (m != i4) {}
            }
            else
            {
              if (localFragment2 != localFragment1) {
                break label435;
              }
              localFragment1 = null;
              localOp.fragment = null;
            }
            for (;;)
            {
              i3 += 1;
              break;
              label435:
              localObject1 = localOp.removed;
              if (localObject1 == null)
              {
                localObject1 = new java/util/ArrayList;
                ((ArrayList)localObject1).<init>();
                localOp.removed = ((ArrayList)localObject1);
              }
              localObject1 = localOp.removed;
              ((ArrayList)localObject1).add(localFragment2);
              m = localOp.exitAnim;
              localFragment2.mNextAnim = m;
              boolean bool3 = this.mAddToBackStack;
              if (bool3)
              {
                int n = localFragment2.mBackStackNesting + 1;
                localFragment2.mBackStackNesting = n;
                boolean bool4 = FragmentManagerImpl.DEBUG;
                if (bool4)
                {
                  localObject1 = "BackStackEntry";
                  localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>();
                  localObject2 = ((StringBuilder)localObject2).append("Bump nesting of ").append(localFragment2);
                  str = " to ";
                  localObject2 = ((StringBuilder)localObject2).append(str);
                  i2 = localFragment2.mBackStackNesting;
                  localObject2 = i2;
                  Log.v((String)localObject1, (String)localObject2);
                }
              }
              localObject1 = this.mManager;
              i4 = this.mTransition;
              i2 = this.mTransitionStyle;
              ((FragmentManagerImpl)localObject1).removeFragment(localFragment2, i4, i2);
            }
          }
        }
        if (localFragment1 != null)
        {
          int i1 = localOp.enterAnim;
          localFragment1.mNextAnim = i1;
          localObject1 = this.mManager;
          ((FragmentManagerImpl)localObject1).addFragment(localFragment1, false);
          continue;
          localFragment1 = localOp.fragment;
          i1 = localOp.exitAnim;
          localFragment1.mNextAnim = i1;
          localObject1 = this.mManager;
          i4 = this.mTransition;
          i2 = this.mTransitionStyle;
          ((FragmentManagerImpl)localObject1).removeFragment(localFragment1, i4, i2);
          continue;
          localFragment1 = localOp.fragment;
          i1 = localOp.exitAnim;
          localFragment1.mNextAnim = i1;
          localObject1 = this.mManager;
          i4 = this.mTransition;
          i2 = this.mTransitionStyle;
          ((FragmentManagerImpl)localObject1).hideFragment(localFragment1, i4, i2);
          continue;
          localFragment1 = localOp.fragment;
          i1 = localOp.enterAnim;
          localFragment1.mNextAnim = i1;
          localObject1 = this.mManager;
          i4 = this.mTransition;
          i2 = this.mTransitionStyle;
          ((FragmentManagerImpl)localObject1).showFragment(localFragment1, i4, i2);
          continue;
          localFragment1 = localOp.fragment;
          i1 = localOp.exitAnim;
          localFragment1.mNextAnim = i1;
          localObject1 = this.mManager;
          i4 = this.mTransition;
          i2 = this.mTransitionStyle;
          ((FragmentManagerImpl)localObject1).detachFragment(localFragment1, i4, i2);
          continue;
          localFragment1 = localOp.fragment;
          i1 = localOp.enterAnim;
          localFragment1.mNextAnim = i1;
          localObject1 = this.mManager;
          i4 = this.mTransition;
          i2 = this.mTransitionStyle;
          ((FragmentManagerImpl)localObject1).attachFragment(localFragment1, i4, i2);
        }
      }
    }
    Object localObject1 = this.mManager;
    Object localObject2 = this.mManager;
    int i4 = ((FragmentManagerImpl)localObject2).mCurState;
    int i2 = this.mTransition;
    j = this.mTransitionStyle;
    ((FragmentManagerImpl)localObject1).moveToState(i4, i2, j, i);
    boolean bool5 = this.mAddToBackStack;
    if (bool5)
    {
      localObject1 = this.mManager;
      ((FragmentManagerImpl)localObject1).addBackStackState(this);
    }
  }
  
  public FragmentTransaction setBreadCrumbShortTitle(int paramInt)
  {
    this.mBreadCrumbShortTitleRes = paramInt;
    this.mBreadCrumbShortTitleText = null;
    return this;
  }
  
  public FragmentTransaction setBreadCrumbShortTitle(CharSequence paramCharSequence)
  {
    this.mBreadCrumbShortTitleRes = 0;
    this.mBreadCrumbShortTitleText = paramCharSequence;
    return this;
  }
  
  public FragmentTransaction setBreadCrumbTitle(int paramInt)
  {
    this.mBreadCrumbTitleRes = paramInt;
    this.mBreadCrumbTitleText = null;
    return this;
  }
  
  public FragmentTransaction setBreadCrumbTitle(CharSequence paramCharSequence)
  {
    this.mBreadCrumbTitleRes = 0;
    this.mBreadCrumbTitleText = paramCharSequence;
    return this;
  }
  
  public FragmentTransaction setCustomAnimations(int paramInt1, int paramInt2)
  {
    return setCustomAnimations(paramInt1, paramInt2, 0, 0);
  }
  
  public FragmentTransaction setCustomAnimations(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mEnterAnim = paramInt1;
    this.mExitAnim = paramInt2;
    this.mPopEnterAnim = paramInt3;
    this.mPopExitAnim = paramInt4;
    return this;
  }
  
  public FragmentTransaction setTransition(int paramInt)
  {
    this.mTransition = paramInt;
    return this;
  }
  
  public FragmentTransaction setTransitionStyle(int paramInt)
  {
    this.mTransitionStyle = paramInt;
    return this;
  }
  
  public FragmentTransaction show(Fragment paramFragment)
  {
    BackStackRecord.Op localOp = new android/support/v4/app/BackStackRecord$Op;
    localOp.<init>();
    localOp.cmd = 5;
    localOp.fragment = paramFragment;
    addOp(localOp);
    return this;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/BackStackRecord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */