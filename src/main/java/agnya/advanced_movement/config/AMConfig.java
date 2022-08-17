package agnya.advanced_movement.config;

import agnya.advanced_movement.AdvMovement;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = AdvMovement.MOD_ID)
public class AMConfig implements ConfigData {    
    public boolean enableStrafing = true;
    
    public boolean togonkey = true;

    @ConfigEntry.Gui.Excluded
    public final double gravity = 0.08D;

    public float friction = 0.5F; //Ground friction.
    public float accelerate = 0.1F; //Ground acceleration.
    public float airaccelerate = 0.2F; //Air acceleration.
    public float maxairspeed = 0.08F; //Maximum speed you can move in air without influence. Also determines how fast you gain bhop speed.

    @ConfigEntry.Gui.Excluded
    public float airspeedcutoff = 0.2F; //How fast to travel before applying sv_maxairspeed. Intended to be a fix for low-speed air control.

    public float maxSpeedMul = 2.2F; //How much to multiply default game's movementSpeed by.

    public boolean compatibilityMode = true;
}