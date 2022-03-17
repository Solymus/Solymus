package com.github.solymus.event.player;

import com.github.solymus.event.Event;
import com.github.solymus.player.Player;

public abstract class PlayerEvent extends Event {

  private Player player;

  public PlayerEvent(Player player) {
    this.player = player;
  }

  public Player getPlayer() {
    return player;
  }

}
