package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class DialogFragment
  extends Fragment
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
  private static final String SAVED_BACK_STACK_ID = "android:backStackId";
  private static final String SAVED_CANCELABLE = "android:cancelable";
  private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
  private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
  private static final String SAVED_STYLE = "android:style";
  private static final String SAVED_THEME = "android:theme";
  public static final int STYLE_NORMAL = 0;
  public static final int STYLE_NO_FRAME = 2;
  public static final int STYLE_NO_INPUT = 3;
  public static final int STYLE_NO_TITLE = 1;
  int mBackStackId;
  boolean mCancelable;
  Dialog mDialog;
  boolean mDismissed;
  boolean mShownByMe;
  boolean mShowsDialog;
  int mStyle = 0;
  int mTheme = 0;
  boolean mViewDestroyed;
  
  public DialogFragment()
  {
    this.mCancelable = bool;
    this.mShowsDialog = bool;
    this.mBackStackId = -1;
  }
  
  public void dismiss()
  {
    dismissInternal(false);
  }
  
  public void dismissAllowingStateLoss()
  {
    dismissInternal(true);
  }
  
  void dismissInternal(boolean paramBoolean)
  {
    int i = 1;
    boolean bool = this.mDismissed;
    if (bool) {}
    for (;;)
    {
      return;
      this.mDismissed = i;
      bool = false;
      this.mShownByMe = false;
      Object localObject = this.mDialog;
      if (localObject != null)
      {
        this.mDialog.dismiss();
        bool = false;
        localObject = null;
        this.mDialog = null;
      }
      this.mViewDestroyed = i;
      int j = this.mBackStackId;
      if (j >= 0)
      {
        localObject = getFragmentManager();
        int k = this.mBackStackId;
        ((FragmentManager)localObject).popBackStack(k, i);
        j = -1;
        this.mBackStackId = j;
      }
      else
      {
        localObject = getFragmentManager();
        FragmentTransaction localFragmentTransaction = ((FragmentManager)localObject).beginTransaction();
        localFragmentTransaction.remove(this);
        if (paramBoolean) {
          localFragmentTransaction.commitAllowingStateLoss();
        } else {
          localFragmentTransaction.commit();
        }
      }
    }
  }
  
  public Dialog getDialog()
  {
    return this.mDialog;
  }
  
  public LayoutInflater getLayoutInflater(Bundle paramBundle)
  {
    boolean bool = this.mShowsDialog;
    Object localObject;
    if (!bool) {
      localObject = super.getLayoutInflater(paramBundle);
    }
    for (;;)
    {
      return (LayoutInflater)localObject;
      localObject = onCreateDialog(paramBundle);
      this.mDialog = ((Dialog)localObject);
      int i = this.mStyle;
      switch (i)
      {
      }
      for (;;)
      {
        localObject = this.mDialog;
        if (localObject == null) {
          break label130;
        }
        localObject = this.mDialog.getContext();
        str = "layout_inflater";
        localObject = (LayoutInflater)((Context)localObject).getSystemService(str);
        break;
        localObject = this.mDialog.getWindow();
        int j = 24;
        ((Window)localObject).addFlags(j);
        localObject = this.mDialog;
        j = 1;
        ((Dialog)localObject).requestWindowFeature(j);
      }
      label130:
      localObject = this.mActivity;
      String str = "layout_inflater";
      localObject = (LayoutInflater)((FragmentActivity)localObject).getSystemService(str);
    }
  }
  
  public boolean getShowsDialog()
  {
    return this.mShowsDialog;
  }
  
  public int getTheme()
  {
    return this.mTheme;
  }
  
  public boolean isCancelable()
  {
    return this.mCancelable;
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    boolean bool1 = this.mShowsDialog;
    if (!bool1) {}
    for (;;)
    {
      return;
      View localView = getView();
      if (localView != null)
      {
        localObject = localView.getParent();
        if (localObject != null)
        {
          localObject = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject).<init>("DialogFragment can not be attached to a container view");
          throw ((Throwable)localObject);
        }
        localObject = this.mDialog;
        ((Dialog)localObject).setContentView(localView);
      }
      Object localObject = this.mDialog;
      FragmentActivity localFragmentActivity = getActivity();
      ((Dialog)localObject).setOwnerActivity(localFragmentActivity);
      localObject = this.mDialog;
      boolean bool2 = this.mCancelable;
      ((Dialog)localObject).setCancelable(bool2);
      this.mDialog.setOnCancelListener(this);
      localObject = this.mDialog;
      ((Dialog)localObject).setOnDismissListener(this);
      if (paramBundle != null)
      {
        localObject = "android:savedDialogState";
        Bundle localBundle = paramBundle.getBundle((String)localObject);
        if (localBundle != null)
        {
          localObject = this.mDialog;
          ((Dialog)localObject).onRestoreInstanceState(localBundle);
        }
      }
    }
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    boolean bool = this.mShownByMe;
    if (!bool)
    {
      bool = false;
      this.mDismissed = false;
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 1;
    super.onCreate(paramBundle);
    int k = this.mContainerId;
    if (k == 0) {
      k = i;
    }
    for (;;)
    {
      this.mShowsDialog = k;
      if (paramBundle != null)
      {
        k = paramBundle.getInt("android:style", 0);
        this.mStyle = k;
        k = paramBundle.getInt("android:theme", 0);
        this.mTheme = k;
        boolean bool = paramBundle.getBoolean("android:cancelable", i);
        this.mCancelable = bool;
        i = this.mShowsDialog;
        bool = paramBundle.getBoolean("android:showsDialog", i);
        this.mShowsDialog = bool;
        str = "android:backStackId";
        int j = -1;
        m = paramBundle.getInt(str, j);
        this.mBackStackId = m;
      }
      return;
      int m = 0;
      String str = null;
    }
  }
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    Dialog localDialog = new android/app/Dialog;
    FragmentActivity localFragmentActivity = getActivity();
    int i = getTheme();
    localDialog.<init>(localFragmentActivity, i);
    return localDialog;
  }
  
  public void onDestroyView()
  {
    super.onDestroyView();
    Dialog localDialog = this.mDialog;
    if (localDialog != null)
    {
      this.mViewDestroyed = true;
      this.mDialog.dismiss();
      localDialog = null;
      this.mDialog = null;
    }
  }
  
  public void onDetach()
  {
    super.onDetach();
    boolean bool = this.mShownByMe;
    if (!bool)
    {
      bool = this.mDismissed;
      if (!bool)
      {
        bool = true;
        this.mDismissed = bool;
      }
    }
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    boolean bool = this.mViewDestroyed;
    if (!bool)
    {
      bool = true;
      dismissInternal(bool);
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject = this.mDialog;
    if (localObject != null)
    {
      localObject = this.mDialog;
      Bundle localBundle = ((Dialog)localObject).onSaveInstanceState();
      if (localBundle != null)
      {
        localObject = "android:savedDialogState";
        paramBundle.putBundle((String)localObject, localBundle);
      }
    }
    int i = this.mStyle;
    int k;
    if (i != 0)
    {
      localObject = "android:style";
      k = this.mStyle;
      paramBundle.putInt((String)localObject, k);
    }
    i = this.mTheme;
    if (i != 0)
    {
      localObject = "android:theme";
      k = this.mTheme;
      paramBundle.putInt((String)localObject, k);
    }
    boolean bool1 = this.mCancelable;
    boolean bool2;
    if (!bool1)
    {
      localObject = "android:cancelable";
      bool2 = this.mCancelable;
      paramBundle.putBoolean((String)localObject, bool2);
    }
    bool1 = this.mShowsDialog;
    if (!bool1)
    {
      localObject = "android:showsDialog";
      bool2 = this.mShowsDialog;
      paramBundle.putBoolean((String)localObject, bool2);
    }
    int j = this.mBackStackId;
    int m = -1;
    if (j != m)
    {
      localObject = "android:backStackId";
      m = this.mBackStackId;
      paramBundle.putInt((String)localObject, m);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    Dialog localDialog = this.mDialog;
    if (localDialog != null)
    {
      this.mViewDestroyed = false;
      localDialog = this.mDialog;
      localDialog.show();
    }
  }
  
  public void onStop()
  {
    super.onStop();
    Dialog localDialog = this.mDialog;
    if (localDialog != null)
    {
      localDialog = this.mDialog;
      localDialog.hide();
    }
  }
  
  public void setCancelable(boolean paramBoolean)
  {
    this.mCancelable = paramBoolean;
    Dialog localDialog = this.mDialog;
    if (localDialog != null)
    {
      localDialog = this.mDialog;
      localDialog.setCancelable(paramBoolean);
    }
  }
  
  public void setShowsDialog(boolean paramBoolean)
  {
    this.mShowsDialog = paramBoolean;
  }
  
  public void setStyle(int paramInt1, int paramInt2)
  {
    this.mStyle = paramInt1;
    int i = this.mStyle;
    int j = 2;
    if (i != j)
    {
      i = this.mStyle;
      j = 3;
      if (i != j) {}
    }
    else
    {
      i = 16973913;
      this.mTheme = i;
    }
    if (paramInt2 != 0) {
      this.mTheme = paramInt2;
    }
  }
  
  public int show(FragmentTransaction paramFragmentTransaction, String paramString)
  {
    this.mDismissed = false;
    this.mShownByMe = true;
    paramFragmentTransaction.add(this, paramString);
    this.mViewDestroyed = false;
    int i = paramFragmentTransaction.commit();
    this.mBackStackId = i;
    return this.mBackStackId;
  }
  
  public void show(FragmentManager paramFragmentManager, String paramString)
  {
    this.mDismissed = false;
    this.mShownByMe = true;
    FragmentTransaction localFragmentTransaction = paramFragmentManager.beginTransaction();
    localFragmentTransaction.add(this, paramString);
    localFragmentTransaction.commit();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/android/support/v4/app/DialogFragment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */