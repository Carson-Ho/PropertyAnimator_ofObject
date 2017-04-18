package scut.carson_ho.valueanimator_ofobject;

/**
 * Created by Carson_Ho on 17/4/18.
 */
public class Point {

    // 设置两个变量用于记录坐标的位置
    private float x;
    private float y;

    // 构造方法用于设置坐标
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // get方法用于获取坐标
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
