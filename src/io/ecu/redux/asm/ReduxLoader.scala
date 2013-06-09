package io.ecu.redux.asm

import cpw.mods.fml.relauncher.IFMLLoadingPlugin
import java.util
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion

/*
 * ReduxLoader
 * io.ecu.redux.asm
 */

/**
 * FML loading plugin for Redux.
 *
 * @author Sunstrike
 */
@MCVersion(value = "1.5.2")
class ReduxLoader extends IFMLLoadingPlugin {

    def getLibraryRequestClass: Array[String] = null

    def getASMTransformerClass: Array[String] = Array("io.ecu.redux.asm.ASMTransformer")

    def getModContainerClass: String = "io.ecu.redux.Redux"

    def getSetupClass: String = null

    def injectData(data: util.Map[String, AnyRef]) {}

}
