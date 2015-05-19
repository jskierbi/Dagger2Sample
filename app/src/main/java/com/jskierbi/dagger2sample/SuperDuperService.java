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
import hugo.weaving.DebugLog;

import javax.inject.Inject;
import java.util.UUID;

/**
 * Created by jakub on 19/05/15.
 */
public class SuperDuperService {

  private static final String TAG = SuperDuperService.class.getSimpleName();

  private UUID mInstanceUUID;

  @Inject
  CofeeMachine mCofeeMachine;

  @Inject SuperDuperService() {
    mInstanceUUID = UUID.randomUUID();
  }

  @DebugLog
  public void makeCofee() {
    Log.d(TAG, "instance: " + mInstanceUUID);
    mCofeeMachine.makeCofee();
  }
}
