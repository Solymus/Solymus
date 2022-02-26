package com.github.solymus.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public final class Utils {

  public static boolean isNull(Object object) {
    return object == null;
  }

  public static String getExceptionMessage(Exception exception) {
    StringWriter writer = new StringWriter();
    PrintWriter printer = new PrintWriter(writer);

    exception.printStackTrace(printer);
    printer.close();
    return writer.toString();
  }

}
