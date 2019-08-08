package mapreduce0_1;

import java.io.IOException;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Reducer;
/**
 * 
 * @author abdul.babatunde
 * extends Reducer with input key and value as text and intwritable respectively and
 * output key and value as text and intWritable respectively. 
 */
public class Proj0_1Reducer extends Reducer<Text, IntWritable, Text, IntWritable>{
    @Override
	public void reduce(Text inpKey, Iterable<IntWritable> inpValue, Context context) throws IOException, InterruptedException {
    	Text outKey = inpKey;
    	//for max
    	//IntWritable outValue = new IntWritable(this.max(inpValue));
    	//for sum
    	IntWritable outValue = new IntWritable(this.count(inpValue));
    	context.write(outKey, outValue);
    }

    public int count(Iterable<IntWritable> intInput) {
    	int  count = 0;
    	for(IntWritable i : intInput) {
    		count +=1;
    	}
    	return count;
    }
   
}
