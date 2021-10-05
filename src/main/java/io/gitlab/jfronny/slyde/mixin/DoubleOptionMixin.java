package io.gitlab.jfronny.slyde.mixin;

import net.minecraft.client.option.DoubleOption;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(DoubleOption.class)
public class DoubleOptionMixin {
    @Redirect(method = "getRatio(D)D", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;clamp(DDD)D"))
    private double getRatioClamp(double value, double min, double max) {
        return value;
    }

    @Redirect(method = "getValue(D)D", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;clamp(DDD)D"))
    private double getValueClamp(double value, double min, double max) {
        return value;
    }

    @Redirect(method = "adjust(D)D", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;clamp(DDD)D"))
    private double adjustClamp(double value, double min, double max) {
        return value;
    }
}
