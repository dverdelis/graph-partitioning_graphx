import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.graphx.Graph;
import org.apache.spark.graphx.GraphLoader;
import org.apache.spark.graphx.lib.PageRank;
import sun.jvm.hotspot.debugger.Page;


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
        Graph graph = GraphLoader.edgeListFile();
        PageRank(PageRank)
        context.textFile(inputFilePath);
    }
}
