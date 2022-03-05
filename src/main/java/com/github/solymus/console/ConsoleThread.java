package com.github.solymus.console;

import com.github.solymus.server.Server;

public class ConsoleThread extends Thread {

  private Console console;

  private boolean interrupted = false;

  public ConsoleThread(Console console) {
    this.console = console;
  }

  @Override
  public void run() {
    try {
      String line = this.console.readLine();

      if (line.equals("stop")) {
        this.interrupt();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void interrupt() {
    if (this.interrupted)
      return;
    System.out.println("[CRITICAL]: ConsoleThread stopped.");
    System.out.println("[WARN]: Stopping server...");

    this.interrupted = true;
    Server.get().stop();
    super.interrupt();
  }

}
