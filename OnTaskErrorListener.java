package com.tcreator;

@FunctionalInterface
public interface OnTaskErrorListener {
  void onError(String error);
}
