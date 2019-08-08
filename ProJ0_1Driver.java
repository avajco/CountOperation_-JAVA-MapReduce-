package mapreduce0_1;
import java.io.IOException;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class ProJ0_1Driver {

	public static void main(String[] args) throws Exception, IOException, ClassNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		Job job =  Job.getInstance();
		//set a name for this job, by default system can generate id for job.
		job.setJobName("certification count");
		//set Mapper
		job.setMapperClass(Proj0_1Mapper.class);
		//set reducer
		job.setReducerClass(Proj0_1Reducer.class);
		//specify the main Method
		job.setJarByClass(ProJ0_1Driver.class);
		//specify output type for reducer
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		job.setMapOutputValueClass(IntWritable.class);
		job.setMapOutputKeyClass(Text.class);
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		//ternary operator!
		System.out.println(job.waitForCompletion(true) ? 0 : 1);
	}

}
