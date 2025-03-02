package github.pitbox46.defaultskin.mixin;

import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.client.resources.PlayerSkin;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerInfo.class)
public class  PlayerInfoMixin {
    @Inject(method = "getSkin", at = @At("HEAD"), cancellable = true)
    private void setSkinDefault(CallbackInfoReturnable<PlayerSkin> cir) {
        var steveSkin = new PlayerSkin(
                DefaultPlayerSkin.getDefaultTexture(),
                null,
                null,
                null,
                PlayerSkin.Model.SLIM,
                true
        );
        cir.setReturnValue(steveSkin);
    }
}
