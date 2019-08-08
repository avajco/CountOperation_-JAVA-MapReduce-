package mapreduce0_1;
import java.io.IOException;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Mapper;
/**
 * 
 * @author abdul.babatunde
 * extends the  mapper with input types LongWritables, Text and output Text and IntWritable  
 * 
 */
public class Proj0_1Mapper extends Mapper<	LongWritable, Text, Text , IntWritable> {
@Override
public void map(LongWritable inputMap, Text inputValue,Context context) throws IOException, InterruptedException{
	//split lines by converting text to string and split.
	String[] words = inputValue.toString().split("\t");
	//output 
	IntWritable outValue = new IntWritable(1);
	Text outKey = new Text(words[3]);
	context.write(outKey, outValue);
	}
}

