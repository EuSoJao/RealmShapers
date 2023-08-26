/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmshapers.init;

import net.mcreator.realmshapers.client.gui.Mana0Overlay;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class RealmshapersModOverlays {
	public static void load() {
		HudRenderCallback.EVENT.register((matrices, tickDelta) -> {
			Mana0Overlay.render(matrices, tickDelta);
		});
	}
}
