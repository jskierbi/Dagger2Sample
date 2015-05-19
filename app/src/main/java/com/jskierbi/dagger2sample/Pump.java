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

import hugo.weaving.DebugLog;

import javax.inject.Inject;

/**
 * Created by jakub on 19/05/15.
 */
public class Pump {

  @Inject
  Connector pumpConnector;

  // Have to be implemented explicitly to be visible to Component
  @Inject
  public Pump() {
  }

  @DebugLog
  public void pump() {
  }

  @DebugLog
  public void init() {
    pumpConnector.connect();
  }
}
