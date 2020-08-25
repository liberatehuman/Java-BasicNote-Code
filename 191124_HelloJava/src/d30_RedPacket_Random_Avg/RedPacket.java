package d30_RedPacket_Random_Avg;

public class RedPacket extends RedPacketFrame {
    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public RedPacket(String title) { //父类RedPacketFrame是抽象类，可以有构造方法
        super(title); //用于子类创建对象时，访问父类的构造方法
    }
}
