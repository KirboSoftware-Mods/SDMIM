package com.kirbosoftware.sdmim.mixin.server.players;

import net.minecraft.network.Connection;
import net.minecraft.server.players.PlayerList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerList.class)
public class PlayerListMixin {
    @Redirect(method = "placeNewPlayer", at = @At(value = "INVOKE", target = "Lnet/minecraft/network/Connection;getLoggableAddress(Z)Ljava/lang/String;"))
    private String sdmim$placeNewPlayer(Connection instance, boolean $$0) {
        return "***.***.***.***:*****";
    }
}
