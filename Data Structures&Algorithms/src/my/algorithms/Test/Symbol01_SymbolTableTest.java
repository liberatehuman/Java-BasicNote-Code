package my.algorithms.Test;

import my.algorithms.symbol.SymbolTable;

public class Symbol01_SymbolTableTest {
    public static void main(String[] args) {

        SymbolTable<Integer, String> symbolTable = new SymbolTable<>();

        symbolTable.put(1, "热巴");
        symbolTable.put(2, "娜扎");
        symbolTable.put(3, "扎哈");

        System.out.println("键为2对应的值：" + symbolTable.get(2));

        symbolTable.delete(3);

        System.out.println("剩余元素个数：" + symbolTable.size());
    }
}
