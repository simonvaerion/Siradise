package com.yourname.assassinsoath.network;

import com.yourname.assassinsoath.AssassinsOath;
import java.util.Optional;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public final class StealthChannel {
  private StealthChannel() {}

  private static final String PROTO = "1";

  public static final SimpleChannel CHANNEL =
      NetworkRegistry.newSimpleChannel(
          ResourceLocation.fromNamespaceAndPath(AssassinsOath.MODID, "main"),
          () -> PROTO,
          PROTO::equals,
          PROTO::equals);

  private static int id = 0;

  public static void register() {
    CHANNEL.registerMessage(
        id++,
        S2CStealthHud.class,
        S2CStealthHud::encode,
        S2CStealthHud::decode,
        S2CStealthHud::handle,
        Optional.of(NetworkDirection.PLAY_TO_CLIENT));
    CHANNEL.registerMessage(
        id++,
        S2CMobAwareness.class,
        S2CMobAwareness::encode,
        S2CMobAwareness::decode,
        S2CMobAwareness::handle,
        Optional.of(NetworkDirection.PLAY_TO_CLIENT));
    CHANNEL.registerMessage(
        id++,
        S2CSmokeBombImpact.class,
        S2CSmokeBombImpact::encode,
        S2CSmokeBombImpact::decode,
        S2CSmokeBombImpact::handle,
        Optional.of(NetworkDirection.PLAY_TO_CLIENT));
  }
}
