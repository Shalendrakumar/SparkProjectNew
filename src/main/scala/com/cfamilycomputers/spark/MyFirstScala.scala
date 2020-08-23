package com.cfamilycomputers.spark

import org.apache.spark.{SparkConf, SparkContext}

object MyFirstScala {
  def main(args: Array[String]): Unit = {

    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("First Application")

    val sc = new SparkContext(conf)

    //Create RDD

    val rdd1 = sc.makeRDD(Array(1, 2, 3, 4, 5, 6, 7, 8,10,11))
    rdd1.collect().foreach(println)
  }
}
