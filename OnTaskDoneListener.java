package com.tcreator;

@FunctionalInterface
public interface OnTaskDoneListener {
  void onDone(String result);
}
