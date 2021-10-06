package com.atguigu.prototype.demo.deep_copy;

/**
 * @author shengxiao
 * @date 2021/9/8 20:40
 */
class Student implements Cloneable {
    private String name;
    private int age;
    private Teacher teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Object clone() throws CloneNotSupportedException {
        // 浅复制时：
        // Object object = super.clone();
        // return object;

        // 改为深复制：
        Student student = (Student) super.clone();
        // 本来是浅复制，现在将Teacher对象复制一份并重新set进来
        // 原来仅仅只是执行clone()方法，浅拷贝；
        // 而此处额外进行拷贝了 浅拷贝中 主对象里面的对象，这时就是成为了深拷贝；
        // 即加上了手动拷贝 引用类型的Teacher对象
        student.setTeacher((Teacher) student.getTeacher().clone());
        return student;

    }
}
