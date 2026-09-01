package app.organicmaps.editor;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import app.organicmaps.AeroGuardPolicy;
import app.organicmaps.base.BaseMwmFragmentActivity;

public class ReportActivity extends BaseMwmFragmentActivity
{
  @Override
  protected void onSafeCreate(@Nullable Bundle savedInstanceState)
  {
    if (!AeroGuardPolicy.OSM_EDITING_ENABLED)
    {
      finish();
      return;
    }
    super.onSafeCreate(savedInstanceState);
  }

  @Override
  protected Class<? extends Fragment> getFragmentClass()
  {
    return ReportFragment.class;
  }
}
