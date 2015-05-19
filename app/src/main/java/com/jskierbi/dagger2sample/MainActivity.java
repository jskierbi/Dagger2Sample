package com.jskierbi.dagger2sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jskierbi.dagger2sample.dagger.ActivityComponent;
import com.jskierbi.dagger2sample.dagger.ActivityModule;

import javax.inject.Inject;


public class MainActivity extends ActionBarActivity {

  @Inject
  CofeeMachine mCofeeMachine;

  @Inject SuperDuperService mService1;
  @Inject SuperDuperService mService2;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.inject(this);

    ActivityComponent component = ((MyApplication) getApplication()).getAppComponent()
        .newActivityComponent(new ActivityModule(this));
    component.inject(this);

    mCofeeMachine.init();
  }

  @OnClick(R.id.btn_make_cofee)
  void makeCofeeClick() {
    mCofeeMachine.makeCofee();
  }

  @OnClick(R.id.btn_make_cofee_s1)
  void makeCofee1Click() {
    mService1.makeCofee();
  }

  @OnClick(R.id.btn_make_cofee_s2)
  void makeCofee2Click() {
    mService2.makeCofee();
  }
}
