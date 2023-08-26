package net.mcreator.realmshapers.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class Mana0Overlay {
	public static void render(GuiGraphics guiGraphics, float tickDelta) {
		int posX = Minecraft.getInstance().getWindow().getGuiScaledWidth() / 2;
		int posY = Minecraft.getInstance().getWindow().getGuiScaledHeight() / 2;
		Level _world = null;
		double _x = 0;
		double _y = 0;
		double _z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			_world = entity.level();
			_x = entity.getX();
			_y = entity.getY();
			_z = entity.getZ();
		}
		Level world = _world;
		double x = _x;
		double y = _y;
		double z = _z;
		if (true) {
		}
	}
}
