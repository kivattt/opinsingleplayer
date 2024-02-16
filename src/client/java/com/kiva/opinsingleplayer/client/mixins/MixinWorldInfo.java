package com.kiva.opinsingleplayer.client.mixins;

import net.minecraft.src.game.level.WorldInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WorldInfo.class)
public class MixinWorldInfo {
    @Inject(method = "isCheatsEnabled", at = @At("HEAD"), cancellable = true)
    public void forceCheatsEnabled(CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(true);
        cir.cancel();
    }
}
