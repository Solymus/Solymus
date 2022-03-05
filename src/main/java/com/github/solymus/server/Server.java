package com.github.solymus.server;

import com.github.solymus.logger.MainLogger;

public class Server {

  private MainLogger logger;
  private static Server instance;

  private boolean running = false;

  public Server(MainLogger logger) {
    instance = this;

    this.logger = logger;
    this.init();
  }

  private void init() {
    // TODO: init the server class
  }

  public void start() {
    if (this.running)
      throw new RuntimeException();
    // TODO: make the server start
  }

  public void stop() {
    if (!this.running)
      throw new RuntimeException();
    // TODO: make the server stop
  }

  public boolean isRunning() {
    return this.running;
  }

  public MainLogger getLogger() {
    return this.logger;
  }

  public static Server get() {
    return instance;
  }

}
