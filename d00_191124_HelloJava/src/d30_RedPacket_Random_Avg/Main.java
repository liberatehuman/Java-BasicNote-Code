package d30_RedPacket_Random_Avg;

public class Main {

    public static void main(String[] args) {

        RedPacket redPacket=new RedPacket("红包程序");

        redPacket.setOwnerName("马云");

//        /*//普通红包
//        NormalRed red1=new NormalRed();
//        redPacket.setOpenWay(red1); //参数是自定义openWay类，表示红包的类型*/

        //手气红包
        LuckyRed red2=new LuckyRed();
        redPacket.setOpenWay(red2);
    }
}
