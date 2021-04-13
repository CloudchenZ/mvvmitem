package com.example.common.others;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author:zhangyue
 * @date:2021/3/30
 */
public class ObjUtils {
    /**
     * 对象转byte数组
     * @param object
     * @return
     */
    public static byte[] obj2ByteArray(Object object){
        ByteArrayOutputStream byt=new ByteArrayOutputStream();
        ObjectOutputStream oos= null;
        try {
            oos = new ObjectOutputStream(byt);
            oos.writeObject(object);
            byte[] bytes = byt.toByteArray();
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (byt!=null){
                try {
                    byt.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return  null;
    }

    /**
     * byte 数组转对象
     * @param bytes
     * @param <T>
     * @return
     */
    public static <T> T byteArray2Object(byte[] bytes){
        ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
        ObjectInputStream obs=null;
        try {
            obs=new ObjectInputStream(bis);
            return (T) obs.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if (obs!=null){
                try {
                    obs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
