package my.algorithms.Test;

import my.algorithms.symbol.OrderSymbolTable;

public class Symbol02_OrderSymbolTableTest {
    public static void main(String[] args) {

        OrderSymbolTable<Integer, String> orderSymbolTable = new OrderSymbolTable<>();

        orderSymbolTable.put(1, "小明");
        orderSymbolTable.put(2, "小王");
        orderSymbolTable.put(4, "小张");

        orderSymbolTable.put(3, "小李");//断点测试
        System.out.println();//断点测试
    }
}
