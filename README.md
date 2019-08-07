# CountOperation_-JAVA-MapReduce-
Very basic Java MapReduce code, it should:
* capture the required field
* perform a number count

# contents
* Proj0_1Driver - The Job configuration and Job handler code.
* Proj0_1Mapper   - The Field capture code.
* Proj0_1Reducer - The Aggregator code.

**note There are comments to help!**

To run:

* Export the code as jar Excutable.
**note: make sure you specify the codes' main class which is most definately be in the driver code.**
* Move to Hadoop enviroment(can use any SCP/FTP/SFTP tool like WinScp)
**note: make sure that data file already resides in hdfs!**
* if not use cmd on local terminal:
> hadoop fs -copyFromLocal <local_jar_path> <hdfs_path>
* run jar file on input data also specify the output path.
**note HDFS_output_path should be created! before operation**
> hadoop jar <local_jar_file_path> <HDFS_input_dataFile> <HDFS_output_path>

To see result:

> hadoop fs -cat <HDFS_output_path>/part-r-00000

* should display count as result

-Cheers!
 


