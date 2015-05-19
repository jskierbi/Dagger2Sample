/*
 * (c) Neofonie Mobile GmbH (2015)
 *
 * This computer program is the sole property of Neofonie Mobile GmbH (http://mobile.neofonie.de)
 * and is protected under the German Copyright Act (paragraph 69a UrhG).
 *
 * All rights are reserved. Making copies, duplicating, modifying, using or distributing
 * this computer program in any form, without prior written consent of Neofonie Mobile GmbH, is prohibited.
 * Violation of copyright is punishable under the German Copyright Act (paragraph 106 UrhG).
 *
 * Removing this copyright statement is also a violation.
 */
package com.jskierbi.dagger2sample;

import android.util.Log;
import com.jskierbi.dagger2sample.dagger.ActivityScope;
import hugo.weaving.DebugLog;

import javax.inject.Inject;

/**
 * Created by jakub on 19/05/15.
 */
@ActivityScope
public class CofeeMachine {

  private static int INSTANCE_COUNTER = 0;

  private static final String TAG = CofeeMachine.class.getSimpleName();

  @Inject
  Pump   mMyWaterPump;
  @Inject
  Heater mMyHeater;

  @Inject
  public CofeeMachine() {
    ++INSTANCE_COUNTER;
  }

  @DebugLog
  public void init() {
    mMyHeater.init();
    mMyWaterPump.init();
  }

  @DebugLog
  public void makeCofee() {
    Log.d(TAG, "instance: " + INSTANCE_COUNTER);
    mMyWaterPump.pump();
    mMyHeater.heat();
  }
}
