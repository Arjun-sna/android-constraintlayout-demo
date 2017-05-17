package in.arjunsn.constraintlayoutdemo;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileViewActivity extends AppCompatActivity {

  @BindView(R.id.bg_image) ImageView profileImage;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_profile_view);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.view_profile_btn)
  public void showFullDetail() {
    Intent detailsIntent = new Intent(ProfileViewActivity.this, ProfileViewActivity2.class);
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
      ActivityOptionsCompat optionsCompat =
          ActivityOptionsCompat.makeSceneTransitionAnimation(ProfileViewActivity.this, profileImage,
              "profile_image");
      startActivity(detailsIntent, optionsCompat.toBundle());
    } else {
      startActivity(detailsIntent);
    }
  }
}
