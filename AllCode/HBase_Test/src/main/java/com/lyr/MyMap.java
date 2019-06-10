package com.lyr;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class MyMap extends Mapper<Object, Text, Text, Text>{

	Text word = new Text();
	Text word1 = new Text();
	LongWritable l = new LongWritable();
	@Override
	protected void map(Object key, Text value, Context context)
			throws IOException, InterruptedException {
		StringTokenizer itr = new StringTokenizer(value.toString(),"/");
		String url = "";
		String time = "";
		while(itr.hasMoreTokens()){
			String s = itr.nextToken();
			if(s.startsWith("www")){
				url = s;
				break;
			}
			if(s.startsWith("2013:06：19")){
				time = s;
			}
		}
		StringTokenizer itr1 = new StringTokenizer(value.toString(),"[");
		String ip = itr1.nextToken().trim();
		int len = ip.length();
		ip = ip.substring(0,len-1);
		System.out.println(time);
		int in = time.indexOf("00+0000");
		time = time.substring(0,in-1);
		String str = url+","+time;
		word.set(ip);
		word1.set(str);
		System.out.println(url+","+str);
		context.write(word,word1);
	}
}
