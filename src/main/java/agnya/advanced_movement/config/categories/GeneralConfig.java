package agnya.advanced_movement.config.categories;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "general")
public class GeneralConfig implements ConfigData {
    public boolean enableStrafing = true; // Enable strafing, hence also bunnyhop.
    public boolean manualJump = false; // Cancels autojumping while holding down the spacebar.
    public boolean crouchJump = false; // Gives you a little extra jump height when crouching.

    public boolean compatibilityMode = true; // Enables movement mechanics only for players.
}
