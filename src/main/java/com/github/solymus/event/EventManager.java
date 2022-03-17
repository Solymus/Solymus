package com.github.solymus.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import com.github.solymus.logger.MainLogger;

import org.reflections.Reflections;

public class EventManager {

  private Queue<Listener> listenerQueue;
  private Set<Class<? extends Event>> registeredEvents;

  private static final String[] EVENT_PACKAGES = { "com.github.solymus.event.player" };

  public EventManager() {
    this.listenerQueue = new PriorityQueue<>();
    this.registeredEvents = new LinkedHashSet<>();

    this.init();
  }

  private void init() {
    for (String packageName : EVENT_PACKAGES)
      for (Class<? extends Event> clazz : new Reflections(packageName).getSubTypesOf(Event.class))
        this.registeredEvents.add(clazz);
  }

  public boolean callEvent(Event event) {
    for (Listener listener : this.listenerQueue) {
      Class<? extends Listener> clazz = listener.getClass();

      for (Method method : clazz.getDeclaredMethods()) {
        if (method.getAnnotation(EventHandler.class) == null || method.getParameterCount() != 1 || !method.isVarArgs()
            || method.getParameterTypes()[0] != event.getClass())
          continue;

        try {
          // TODO: if the method is cancelled and the eventhandler annotation has ignoreCancelled
          method.invoke(listener, event);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
          MainLogger.getInstance().exception(e);
        }
      }
    }

    return false; // TODO: Event.isCancelled();
  }

}
