/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author Ahsan Ullah
 */
public class Pair<K,V> {
    private K key;
    private V value;
    public Pair(K k , V v)
    {
        key=k;
        value=v;
    }
    public K getKey()
    {
        return key;
    }
    public V getValue()
    {
        return value;
    }
    
}
