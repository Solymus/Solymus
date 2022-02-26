package com.github.solymus.logger;

public interface ILogger {

  void log(LogLevel level, String message);

  void info(String message);

  void error(String error);

  void warning(String warning);

  void notice(String notice);

  void debug(String log);

  void exception(Exception exception);

}
