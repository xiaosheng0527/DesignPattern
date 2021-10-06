package com.atguigu.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


// 实现Serializable接口的目的是为类可持久化，比如在网络传输或本地存储，为系统的分布和异构部署提供先决条件。
// 若没有序列化，现在我们所熟悉的远程调用，对象数据库都不可能存在。
// 注意：关于Serializable接口的使用可以看，CSDN -> 收藏夹 -> java 面试常考题
public class DeepProtoType implements Serializable, Cloneable{
	
	public String name; //String 属性
	public DeepCloneableTarget deepCloneableTarget;// 引用类型
	public DeepProtoType() {
		super();
	}
	
	
	//深拷贝 - 方式 1 使用clone 方法
	// 注意：里面是对String类型的常量字符串 和 引用数据类型的分别进行克隆
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Object deep = null;
		//这里完成对基本数据类型(属性)和String【常量池中创建的】的克隆
		deep = super.clone(); // 默认为浅拷贝
		//对引用类型的属性，进行单独处理
		DeepProtoType deepProtoType = (DeepProtoType)deep;
		deepProtoType.deepCloneableTarget  = (DeepCloneableTarget)deepCloneableTarget.clone();
		
		// TODO Auto-generated method stub
		return deepProtoType;
	}
	
	//深拷贝 - 方式2 通过对象的序列化实现 (推荐)
	
	public Object deepClone() {
		
		//创建流对象
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			
			//序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			// 注意：oos.writeObject(this) 需要先写，后面才能读
			oos.writeObject(this); //当前这个对象以对象流的方式输出
			
			//反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj = (DeepProtoType)ois.readObject();
			
			return copyObj;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			//关闭流
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
		
	}
	
}
