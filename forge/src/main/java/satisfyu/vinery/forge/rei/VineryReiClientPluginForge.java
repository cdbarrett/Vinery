package satisfyu.vinery.forge.rei;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.forge.REIPluginClient;
import satisfyu.vinery.compat.rei.VineryReiClientPlugin;

@REIPluginClient
public class VineryReiClientPluginForge implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        VineryReiClientPlugin.registerCategories(registry);
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        VineryReiClientPlugin.registerDisplays(registry);
    }
}
