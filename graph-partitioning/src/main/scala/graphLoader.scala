package scala

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object graphLoader {
  def main(args: Array[String]) {
    val transactionsIn = args(1)
    val usersIn = args(0)
    val conf = new SparkConf().setAppName("SparkJoins").setMaster("local")

  }
}
