package com.github.solymus.console;

import java.util.LinkedHashMap;
import java.util.Map;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;

public class Console {

  private boolean isReading = false;
  private LineReader reader;

  private static Console instance;

  private String prompt = "Command: ";

  // TODO: Create class Command
  // TODO: private Map<String, Command> commands;

  public Console() {
    instance = this;
    // TODO: this.commands = new LinkedHashMap<>();
    this.reader = LineReaderBuilder.builder().build();

    this.init();
  }

  private void init() {
    this.reader.setOpt(LineReader.Option.AUTO_FRESH_LINE);
    this.reader.setOpt(LineReader.Option.MENU_COMPLETE);
    this.reader.setOpt(LineReader.Option.MOUSE);
  }

  public void redraw(boolean clear) {
    String buffer = this.reader.getBuffer().toString();
    if (clear) {
      buffer = "";
      this.reader.getBuffer().clear();
    }
    System.out.print(this.prompt + buffer);
  }

  public void redraw() {
    this.redraw(false);
  }

  public String readLine() {
    if (!this.isReading) {
      this.isReading = true;
      String line = this.reader.readLine(this.prompt);
      this.isReading = false;
      return line;
    }
    return "";
  }

}
