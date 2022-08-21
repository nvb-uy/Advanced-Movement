package agnya.advanced_movement.config;

import agnya.advanced_movement.AdvMovement;
import agnya.advanced_movement.config.categories.GeneralConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = AdvMovement.MOD_ID)
public class AMConfig implements ConfigData {   
    @ConfigEntry.Category("general")
    @ConfigEntry.Gui.TransitiveObject
    public GeneralConfig general = new GeneralConfig();

    public float friction = 0.5F; //Ground friction.
    public float accelerate = 0.1F; //Ground acceleration.
    public float airaccelerate = 0.2F; //Air acceleration.
    public float maxairspeed = 0.08F; //Maximum speed you can move in air without influence. Also determines how fast you gain bhop speed.
    
    public float maxSpeedMul = 2.2F; //How much to multiply default game's movementSpeed by.

    @ConfigEntry.Gui.Excluded
    public final double gravity = 0.08D;
    @ConfigEntry.Gui.Excluded
    public float airspeedcutoff = 0.2F; //How fast to travel before applying sv_maxairspeed. Intended to be a fix for low-speed air control.
}