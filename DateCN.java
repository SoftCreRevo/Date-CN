public class DateCN {
    private transient long millis;//毫秒
    enum Shi2Chen2
    {
        夜半,鸡鸣,平旦,日出,食时,隅中,日中,日昳,晡时,日入,黄昏,人定;
    }//十二时辰枚举类
    enum Tian1Gan4
    {
        甲,乙,丙,丁,戊,己,庚,戌,壬,癸;
    }//十天干
    enum Di4Zhi1
    {
        子,丑,寅,卯,辰,巳,午,未,申,酉,戌,亥;
    }//十二地支

    /**
     * 创建并初始化DateCN这个对象,获取系统当前时间
     * 为毫秒
     *
     * @see     java.lang.System#currentTimeMillis()
     */
    public DateCN (){this(System.currentTimeMillis());}
    /**
     * 创建一个对象并初始化毫秒时间为参数ms
     *
     * @param   ms   从标准计算机起始时间 1970年1月1日开始的毫秒数
     * @see     java.lang.System#currentTimeMillis()
     */
    public DateCN (long ms){millis = ms;}

    /**
     * 获取对象时间
     * @return 毫秒
     */
    public long getMillis(){return millis;}

    /**
     * 获取对象时间，单位：刹那
     * @return 刹那(0.5秒)[十二时辰制]
     */
    public long getCha4Na4(){return millis/500;}

    /**
     * 获取对象时间，单位：指弹
     * @return 指弹(5秒|10刹那)[十二时辰制]
     */
    public long getZhi3Tan2(){return millis/5000;}
    /**
     * 获取对象时间，单位：分
     * @return 分(30秒|6指弹)[十二时辰制]
     */
    public long getFen1(){return millis/30000;}
    /**
     * 获取对象时间，单位：柱香
     * @return 柱香(2分30秒|5分)[十二时辰制]
     */
    public long getZhu4Xiang1(){return millis/150000;}
    /**
     * 获取对象时间，单位：盏茶
     * @return 盏茶(5分钟|2柱香)[十二时辰制]
     */
    public long getZhan3Cha2(){return millis/300000;}
    /**
     * 获取对象时间，单位：刻
     * @return 刻(15分钟|3盏茶)[十二时辰制]
     */
    public long getKe4(){return millis/900000;}
    /**
     * 获取对象时间，单位：时辰
     * @return 时辰(2小时|8刻)[十二时辰制]
     */
    public long getShi2Chen2(){return millis/7200000;}
    /**
     * 获取对象时间，单位：日
     * @return 日(24小时|12时辰)[十二时辰制]
     */
    public long getRi4(){return millis/86400000;}
}
