package in.arjunsn.constraintlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.profile_page)
  public void goToProfileView() {
    Intent profileViewIntent = new Intent(MainActivity.this, ProfileViewActivity.class);
    startActivity(profileViewIntent);
  }
}
