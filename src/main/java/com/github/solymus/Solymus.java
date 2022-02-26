package com.github.solymus;

import com.github.solymus.logger.MainLogger;
import com.github.solymus.server.Server;

public class Solymus {

  public static boolean ANSI = true;
  public static String VERSION = "1.0.0";
  public static boolean STABLE_REALASE = false;

  public static void main(String[] args) {

    if (args.length != 0) {
      for (String arg : args) {
        if (arg.equals("--no-ansi") || arg.equals("--disable-ansi"))
          ANSI = false;
      }
    }

    MainLogger logger = new MainLogger(ANSI);
    Server server = new Server(logger);

    // TODO: Add an "Server#start()" here
  }

}
