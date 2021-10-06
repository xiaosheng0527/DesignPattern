package com.atguigu.jdk;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Decorator {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//说明
		//1. InputStream 是抽象类, 类似我们前面讲的 Drink ,即 被装饰者【这里是设置了一个缓冲层】
		//2. FileInputStream 是  InputStream 子类，类似我们前面的 DeCaf, LongBlack ，【被装饰者的实体类】
		//3. FilterInputStream  是  InputStream 子类：类似我们前面 的 Decorator 装饰者 【这里还是抽象类，说明存在多层缓冲】
		//4. DataInputStream 是 FilterInputStream 子类，具体的修饰者，类似前面的 Milk, Soy 等 【即实体 装饰者】
		//5. FilterInputStream 类 有  protected volatile InputStream in; 即 装饰者中 含被装饰者
		//6. 分析得出在jdk 的io体系中，就是使用装饰者模式
		
		DataInputStream dis = new DataInputStream(new FileInputStream("d:\\abc.txt"));
		System.out.println(dis.read());
		dis.close();
	}

}


