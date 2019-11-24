package net.mamoe.mirai.network.protocol.tim.packet.event

import net.mamoe.mirai.event.Subscribable
import net.mamoe.mirai.network.protocol.tim.packet.Packet

/**
 * 事件包. 可被监听.
 *
 * @see Subscribable
 */
interface EventPacket : Subscribable, Packet