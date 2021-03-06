package com.github.solymus.block.info;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface BlockInfo {

  String name();

  int id();

  int meta() default 0;

  // TODO: Add more block info

}
