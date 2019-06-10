package com.lyr;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.mapreduce.TableReducer;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.util.MD5Hash;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class MyReduce extends TableReducer<Text, Text, Text>{
    LongWritable result = new LongWritable();
    protected void reduce(Text k2,Iterable<Text> v2, Context context) throws IOException, InterruptedException{
        String[] s = new String[100];
        for(Text a:v2){
            s = a.toString().split(",");
        }
        Put put = new Put(Bytes.toBytes(MD5Hash.getMD5AsHex(Bytes.toBytes(k2.toString()))));
        put.addColumn(Bytes.toBytes("f1"), Bytes.toBytes("ip"), Bytes.toBytes(k2.toString()));
        put.addColumn(Bytes.toBytes("f1"), Bytes.toBytes("time"), Bytes.toBytes(s[1]));
        put.addColumn(Bytes.toBytes("f1"), Bytes.toBytes("url"), Bytes.toBytes(s[0]));
        context.write(k2, put);
    }
}
