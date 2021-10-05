package io.gitlab.jfronny.slyde;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class Slyde {
    public static boolean isActive() {
        long handle = MinecraftClient.getInstance().getWindow().getHandle();
        boolean down = InputUtil.isKeyPressed(handle, GLFW.GLFW_KEY_LEFT_SHIFT)
                || InputUtil.isKeyPressed(handle, GLFW.GLFW_KEY_RIGHT_SHIFT)
                || InputUtil.isKeyPressed(handle, GLFW.GLFW_KEY_LEFT_CONTROL)
                || InputUtil.isKeyPressed(handle, GLFW.GLFW_KEY_RIGHT_CONTROL);
        return down == Cfg.holdKeyToActivate;
    }
}
