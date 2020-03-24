package test.com.chart2;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName MyData
 * @date 2020/3/22  23:39
 */
public class MyData {
    volatile int number = 0;
    public void addToData60() {
        this.number = 60;
    }
    //加voilicate修饰
    public void adPlusplus() {
        number++;
    }
}
