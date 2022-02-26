package com.github.solymus.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.github.solymus.utils.Utils;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import org.fusesource.jansi.Ansi.Color;

public class MainLogger implements ILogger {

  private MainLogger instance;
  private boolean hasAnsi;

  public MainLogger(boolean ANSI) {
    if (!Utils.isNull(instance))
      throw new RuntimeException("An instance of MainLogger already is instantiated!");

    instance = this;
    this.hasAnsi = ANSI;
    AnsiConsole.systemInstall();
  }

  @Override
  public void log(LogLevel level, String message) {
    Ansi logMessage = new Ansi();
    Date date = Calendar.getInstance().getTime();
    DateFormat format = new SimpleDateFormat("hh:mm:ss");

    if (this.hasAnsi) {
      logMessage.fgBright(Color.BLUE).a("[").a(format.format(date)).a("] ").fgBright(level.getColor()).a("[")
          .a(level.getPrefix()).a("]: ").reset().a(message).newline();
    } else {
      logMessage.reset().a("[").a(format.format(date)).a("] ").a("[").a(level.getPrefix()).a("]: ").a(message)
          .newline();
    }

    // TODO: Redraw the console prompt when it's finished
    AnsiConsole.out().print(logMessage);
  }

  @Override
  public void error(String error) {
    this.log(LogLevel.ERROR, error);
  }

  @Override
  public void warning(String warning) {
    this.log(LogLevel.WARNING, warning);
  }

  @Override
  public void notice(String notice) {
    this.log(LogLevel.NOTICE, notice);
  }

  @Override
  public void debug(String log) {
    this.log(LogLevel.DEBUG, log);
  }

  @Override
  public void info(String message) {
    this.log(LogLevel.INFO, message);
  }

  @Override
  public void exception(Exception exception) {
    this.log(LogLevel.EXCEPTION, Utils.getExceptionMessage(exception));
  }

}
