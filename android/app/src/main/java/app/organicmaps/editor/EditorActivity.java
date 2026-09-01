package app.organicmaps.editor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import app.organicmaps.AeroGuardPolicy;
import app.organicmaps.base.BaseMwmFragmentActivity;

public class EditorActivity extends BaseMwmFragmentActivity
{
  public static final String EXTRA_NEW_OBJECT = "ExtraNewMapObject";

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
    return EditorHostFragment.class;
  }

  public static void start(@NonNull Activity activity)
  {
    if (!AeroGuardPolicy.OSM_EDITING_ENABLED)
      return;

    final Intent intent = new Intent(activity, EditorActivity.class);
    activity.startActivity(intent);
  }
}
