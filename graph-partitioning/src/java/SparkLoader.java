package java;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;



public class SparkLoader {
    public static void main(String[] args) {
        String graphFile = SparkLoader.class.getResource("web-Google.txt").getPath();
        SparkLoader.run(graphFile);

    }
    public static void run(String inputFilePath){
        String master = "local[*]";

        SparkConf conf = new SparkConf()
                .setAppName(SparkLoader.class.getName())
                .setMaster(master);
        JavaSparkContext context = new JavaSparkContext(conf);
        context.textFile(inputFilePath);
    }
}
