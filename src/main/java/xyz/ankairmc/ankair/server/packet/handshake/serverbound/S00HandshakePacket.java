package xyz.ankairmc.ankair.server.packet.handshake.serverbound;

import xyz.ankairmc.ankair.network.packet.Packet;
import xyz.ankairmc.ankair.network.ConnectionStatus;
import xyz.ankairmc.ankair.network.listener.IHandshakeListener;
import xyz.ankairmc.ankair.network.PacketBuffer;

public class S00HandshakePacket implements Packet<IHandshakeListener> {
    public int protocol;
    public String host;
    public int port;
    public ConnectionStatus status;

    @Override
    public void read(PacketBuffer data) {
        this.protocol = data.readVarInt();
        this.host = data.readUtfString();
        this.port = data.readUnsignedShort();
        this.status = data.readVarInt() == 2 ? ConnectionStatus.LOGIN : ConnectionStatus.STATUS;
    }

    @Override
    public void listener(IHandshakeListener listener) {
        listener.handleHandshake(this);
    }
}
