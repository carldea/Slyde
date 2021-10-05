package io.gitlab.jfronny.slyde.mixin;

import io.gitlab.jfronny.slyde.Slyde;
import net.minecraft.client.gui.widget.SliderWidget;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SliderWidget.class)
public abstract class SliderWidgetMixin {
    @Redirect(method = "setValue(D)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;clamp(DDD)D"))
    private double adjustClamp(double value, double min, double max) {
        return Slyde.isActive() ? value : MathHelper.clamp(value, min, max);
    }
}
