package test.com.chart1;

/**
 * @author jgp
 * @version 1.0.0
 * @ClassName DiceDemo
 * @date 2020/2/27  9:36
 */
public class DiceDemo {
    public static void main(String[] args) {
/*        double[] doubles = calculateDiceProbability(100);
        //2的概率doubles[0]
        double x=14/4;

        System.out.println(x);*/
        Thread j = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        j.start();
        System.out.println("11111111111");
    }

    /**
     * 一次掷两个骰子
     * @return
     */
    public static int[] dice(){
        //TODO 掷两个骰子(用随机书代替两个筛子)
        int dice1=(int)(Math.random()*10+1);
        int dice2=(int)(Math.random()*10+1);
        return new int[]{dice1,dice2};
    }

    /**
     * 计算概率
     * @return 返回概率,double[0]2的概率
     */
    public static double[] calculateDiceProbability(int n){
        // 出现2的次数var2
        int var1 = 0;
        int var2 = 0;
        /// 出现2的次数
        double var3 = 0.00;
        double var4 = 0.00;
        for (int i = 0; i < n; i++) {
            int[] diceResult = dice();
            var1 = var1 + diceResult[0];
            var2 = var2 + diceResult[1];
        }
        var3 = var1/n;
        var4 = var2/n;

        return new double[]{var3,var4};
    }
}
