package io.ecu.redux.util.ebus

import com.google.common.eventbus.{Subscribe, EventBus}
import io.ecu.redux.helpers.ProgUtil




/*
 * EBusLoader
 * io.ecu.redux.helpers.event
 */

/**
 * Redux Event Bus Handler.
 *
 * Starts the Redux Event Bus & registers redux
 *
 * @author Progwml6
 */
class EBusLoader {

  def StartEBus(){
    
   ProgUtil.passmsg("Loading Redux event loader") 
  }
  
}