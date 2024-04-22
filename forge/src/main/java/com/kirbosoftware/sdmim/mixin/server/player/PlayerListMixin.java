package com.kirbosoftware.sdmim.mixin.server.player;

import net.minecraft.server.players.PlayerList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.net.SocketAddress;

@Mixin(PlayerList.class)
public class PlayerListMixin {
    @Redirect(method = "placeNewPlayer", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/network/DualStackUtils;getAddressString(Ljava/net/SocketAddress;)Ljava/lang/String;"))
    private String sdmim$placeNewPlayer(SocketAddress formatted) {
        return "***.***.***.***:*****";
    }
}
