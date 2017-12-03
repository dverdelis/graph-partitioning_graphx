package scala

import org.apache.spark.graphx.GraphLoader
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object graphLoader {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("SparkJoins").setMaster("local")
//    val sc = new SparkContext(conf)
    print("kitsos")
  }
}
