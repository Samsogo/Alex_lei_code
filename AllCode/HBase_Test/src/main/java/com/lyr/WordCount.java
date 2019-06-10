package com.lyr;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.mapreduce.TableMapReduceUtil;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class WordCount {
	public static void main(String[] args) throws Exception{

		Configuration conf = HBaseConfiguration.create();

		Connection conn = ConnectionFactory.createConnection(conf);

		Admin admin = conn.getAdmin();

		HTableDescriptor htdes = new HTableDescriptor(TableName.valueOf("Test0"));

		HColumnDescriptor hcdes =  new HColumnDescriptor(Bytes.toBytes("f1"));

		htdes.addFamily(hcdes);

		admin.createTable(htdes);

		Job job = Job.getInstance(conf, "页面访问量");

		job.setJarByClass(WordCount.class);

		job.setMapperClass(MyMap.class);

		TableMapReduceUtil.initTableReducerJob("Test0", MyReduce.class, job);

		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(Text.class);

		FileInputFormat.addInputPath(job, new Path("/input"));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}
