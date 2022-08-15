package agnya.advanced_movement.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;

public class Menu implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> AutoConfig.getConfigScreen(AMConfig.class, parent).get();

    }

}