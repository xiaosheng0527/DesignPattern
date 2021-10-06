package com.atguigu.principle.open_closed.improve;

/**
 * @author shengxiao
 * @date 2021/9/5 9:31
 */
public class Ocp {

    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }

}

//这是一个用于绘图的类 [使用方]
class GraphicEditor {
    //接收Shape对象，调用draw方法
    public void drawShape(Shape s) {

        s.draw();
    }
}

//Shape类，基类
abstract class Shape {
    int m_type;

    public abstract void draw() ;   // 抽象方法
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;   // 创建对象时候初始化父类参数，此时此时子类可以继承此参数
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//新增画三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

// 新增一个图形
class OtherGraphic extends Shape {

    OtherGraphic() {
        super.m_type = 4 ;
    }

    @Override
    public void draw() {

        System.out.println("绘制其他图形");
    }
}
