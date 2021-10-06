package com.atguigu.prototype.demo.shallow_copy;

/**
 * @author shengxiao
 * @date 2021/9/8 16:51
 */
public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher();
        teacher.setName("riemann");
        teacher.setAge(28);

        Student student1 = new Student();
        student1.setName("edgar");
        student1.setAge(18);
        student1.setTeacher(teacher);

        Student student2 = (Student) student1.clone();
        System.out.println("-------------拷贝后-------------");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getTeacher().getName());
        System.out.println(student2.getTeacher().getAge());

        System.out.println("下面是哈希值：");
        System.out.println("student1->hashcode:" + student1.hashCode());
        System.out.println("student2->hashcode:" + student2.hashCode());

        System.out.println("-------------修改老师的信息后-------------");
        // 修改老师的信息
        teacher.setName("jack");
        // 最后得到的值相等，说明 ”里面的对象“会在原来的对象和它的副本之间共享
        System.out.println("student1的teacher为： " + student1.getTeacher().getName());
        System.out.println("student2的teacher为： " + student2.getTeacher().getName());

        System.out.println("下面是哈希值：");
        System.out.println("student1->hashcode:" + student1.hashCode());
        System.out.println("student2->hashcode:" + student2.hashCode());

    }
}
