package github.pitbox46.defaultskin.mixin;

import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerInfo.class)
public class PlayerInfoMixin {
    @Inject(method = "getSkinLocation", at = @At("HEAD"), cancellable = true)
    private void setSkinDefault(CallbackInfoReturnable<ResourceLocation> cir) {
        cir.setReturnValue(DefaultPlayerSkin.getDefaultSkin());
    }
}
