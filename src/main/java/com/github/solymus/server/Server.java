package com.github.solymus.server;

import com.github.solymus.logger.MainLogger;

public class Server {

  private MainLogger logger;
  private static Server instance;

  public Server(MainLogger logger) {
    instance = this;

    this.logger = logger;

    logger.info("This need have ANSI!");
  }

  public MainLogger getLogger() {
    return this.logger;
  }

  public static Server get() {
    return instance;
  }

}
