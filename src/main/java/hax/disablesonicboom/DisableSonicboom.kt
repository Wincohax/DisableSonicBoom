package hax.disablesonicboom

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent


class DisableSonicboom : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Made with <3 by Wincohax in Kotlin.")
        server.pluginManager.registerEvents(DamageSBListener(), this)

    }
        // Actual Sonic Boom Nerf
        class DamageSBListener : Listener {

            @EventHandler
            fun onEntityDamage(event: EntityDamageEvent) {

                var switch = true

                val damageCause = event.cause

                if (damageCause == EntityDamageEvent.DamageCause.SONIC_BOOM && switch == true) {
                    event.isCancelled = true
                }
                else {
                    event.isCancelled = false
                }
            }
        }

    class DisableSBCommand


        override fun onDisable() {
            // Plugin shutdown logic
            logger.info("cya from kotlin.")
        }
}
