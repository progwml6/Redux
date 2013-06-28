package io.ecu.redux

import cpw.mods.fml.common.{LoadController, ModMetadata, DummyModContainer}
import collection.JavaConversions._
import com.google.common.eventbus.{Subscribe, EventBus}
import io.ecu.redux.helpers.ObjRepo._
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLInitializationEvent, FMLPreInitializationEvent}
import io.ecu.redux.util.ebus.EBusLoader

/*
 * Redux
 * io.ecu.redux
 */

/**
 * Redux core
 *
 * @author Sunstrike
 */
class Redux extends DummyModContainer(new ModMetadata()) {

    //=== Construction ==============================
    val meta = super.getMetadata
    meta.authorList = List("EcuTruin", "progwml6", "Sunstrike")
    meta.description = ""
    meta.modId = "Redux"
    meta.name = "Redux"
    meta.version = "@VERSION@"

    //=== Forge EVENT_BUS ===========================
    /**
     * Forge EVENT_BUS registration
     *
     * @param bus The EVENT_BUS
     * @return True if registering
     */
    override def registerBus(bus: EventBus, controller: LoadController): Boolean = {
        bus.register(this)
        logger.info("Attached to Forge event bus.")
        true
    }

    //=== FML events ================================
    /**
     * FML - Preinit event
     *
     * Load configuration data here
     *
     * @param event FML event
     */
    @Subscribe
    def preInit(event:FMLPreInitializationEvent) {

        logger.info("prepping Redux event bus")
        val ebusldr = EBusLoader
        ebusldr.startEBus()
    }

    /**
     * FML - Init event
     *
     * Register items/blocks/etc here
     *
     * @param event FML event
     */
    @Subscribe
    def init(event:FMLInitializationEvent) {
        logger.info("Initialised Redux (version @VERSION@).")
    }

    /**
     * FML - Postinit event
     *
     * @param event FML event
     */
    @Subscribe
    def postInit(event:FMLPostInitializationEvent) {

    }

}
