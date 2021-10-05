package io.gitlab.jfronny.slyde.mixin;

import io.gitlab.jfronny.slyde.Slyde;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets = "me.jellysquid.mods.sodium.client.gui.options.control.SliderControl$Button")
public abstract class SodiumSliderControlMixin {
    @Redirect(method = "setValue(D)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;clamp(DDD)D"))
    private double adjustClamp(double value, double min, double max) {
        return Slyde.isActive() ? value : MathHelper.clamp(value, min, max);
    }
}
