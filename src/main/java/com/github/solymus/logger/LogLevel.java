package com.github.solymus.logger;

import org.fusesource.jansi.Ansi.Color;

public enum LogLevel {

  INFO("INFO", Color.WHITE), WARNING("WARN", Color.YELLOW), ERROR("ERROR", Color.RED), NOTICE("NOTICE", Color.BLUE),
  DEBUG("DEBUG", Color.CYAN), EXCEPTION("EXCEPTION", Color.RED);

  private String prefix;
  private Color color;

  LogLevel(String prefix, Color color) {
    this.prefix = prefix;
    this.color = color;
  }

  public String getPrefix() {
    return this.prefix;
  }

  public Color getColor() {
    return this.color;
  }

}
