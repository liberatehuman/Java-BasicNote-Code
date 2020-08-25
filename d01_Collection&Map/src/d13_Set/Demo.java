package d13_Set;

import java.util.Set;

/*
 * 【java.util.Set<E>接口】extends Collection<E>接口（Collection两大子类：List接口 和 Set接口）
 *
 * Set接口特点：
 * 1、【不重复】元素
 *
 *      add方法底层：
 *              public boolean add(E e) {
 *                  return map.put(e, PRESENT)==null;}
 *
 *         其中: public V put(K key, V value) {
 *                  return putVal(hash(key), key, value, false, true);}
 *
 *         其中: final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
 *                  boolean evict) {... hashCode() ... equals ...}
 *
 * 2、【无索引】，没有带索引的方法，【无法用普通for循环遍历】
 *
 * */
public class Demo {

}
