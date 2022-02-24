package com.github.solymus.player;

import java.net.InetSocketAddress;

public class Player implements PlayerInterface {

  private InetSocketAddress address;
  private int port;

  /**
   * Class responsible for managing all Player features.
   */
  public Player(InetSocketAddress address, int port) {
    this.address = address;
    this.port = port;

    this.init();
  }

  private void init() {
    // TODO: Init the player class
  }

  public InetSocketAddress getAddress() {
    return this.address;
  }

  public int getPort() {
    return this.port;
  }

}
