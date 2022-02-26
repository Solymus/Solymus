package com.github.solymus.player;

import java.net.InetSocketAddress;

public interface PlayerInterface {

  /**
   * Returns the Player socket address containing all socket information
   *
   * @return {@link InetSocketAddress}
   */
  InetSocketAddress getAddress();

  /**
   * Returns the current player port
   *
   * @return {@link Integer}
   */
  int getPort();

}
