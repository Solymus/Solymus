package com.github.solymus.server;

import com.github.solymus.logger.MainLogger;
import com.whirvis.jraknet.server.RakNetServer;

public class Server {

  private MainLogger logger;
  private static Server instance;

  public Server(MainLogger logger) {
    instance = this;

    this.logger = logger;

    logger.info("Some tests, hi!!!!");
    try {
      logger.info(RakNetServer.class.getName());
    } catch (Exception e) {
      logger.exception(e);
    }
  }

  public MainLogger getLogger() {
    return this.logger;
  }

  public static Server get() {
    return instance;
  }

}
