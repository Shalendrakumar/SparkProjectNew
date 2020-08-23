package com.cfamilycomputers.spark

object Function {

  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y;
    }

    def square(x: Int) = x * x;
  }

  def add(x: Int, y: Int): Int = {
    return x + y;
  }

  def subtract(x: Int, y: Int): Int = {
    x - y;
  }

  def mulitply(x: Int, y: Int): Int = x * y;

  def divide(x: Int, y: Int) = x / y;

  def main(args: Array[String]) {
    println(Math.add(20, 10));
    println(Math.square(20));
    println(Math square 20);
    println(add(20, 10))
    println(subtract(20, 10));
    println(mulitply(20, 10))
    println(divide(20, 10))
  }
}