package io.ecu.redux.helpers

import java.util.logging.Logger
import cpw.mods.fml.common.FMLCommonHandler

/*
 * ObjRepo
 * io.ecu.redux.helpers
 */

/**
 * Static object repository
 *
 * @author Sunstrike
 */
object ObjRepo {

    val logger = Logger.getLogger("Redux")
    val side = FMLCommonHandler.instance().getSide

}
