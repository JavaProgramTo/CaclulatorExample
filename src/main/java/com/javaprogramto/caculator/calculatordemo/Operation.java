package com.javaprogramto.caculator.calculatordemo;

public interface Operation {

	long apply(long a, long b);

	boolean valid(char operator);

}
