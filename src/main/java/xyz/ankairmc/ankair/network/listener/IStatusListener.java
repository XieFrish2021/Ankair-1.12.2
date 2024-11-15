package xyz.ankairmc.ankair.network.listener;

import xyz.ankairmc.ankair.network.packet.PacketListener;
import xyz.ankairmc.ankair.server.packet.status.serverbound.S00StatusRequestPacket;
import xyz.ankairmc.ankair.server.packet.status.serverbound.S01StatusPingPacket;

public interface IStatusListener extends PacketListener {
    void handleStatusPing(S01StatusPingPacket packet);

    void handleStatusRequest(S00StatusRequestPacket packet);
}
