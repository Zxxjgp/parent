package com.org.spring.transactiondemo.study.对象的额拷贝;

import java.io.*;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName BeanCopy
 * @date 2020/4/13  0:17
 */
public class BeanCopy {
    public static void main(String[] args) {

    }

    public static Object deepCopy(Object source) throws IOException {
        ByteArrayOutputStream bo = null;
        ObjectOutputStream oo = null;
        ByteArrayInputStream bi = null;
        try {
            bo = new ByteArrayOutputStream();
            oo = new ObjectOutputStream(bo);
            oo.writeObject(source);

            bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(bi);
            return inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert oo != null;
            oo.flush();
            bo.flush();
            oo.close();
            bo.close();
        }
        return "";
    }
}
