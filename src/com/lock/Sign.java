package com.lock;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;

public class Sign {
    public static String decry_RC4(byte[] data, String key) {
        if (data == null || key == null) {
            return null;
        }

        return asString(RC4Base(data, key));
    }

    public static String decry_RC4(String data, String key) {
        if (data == null || key == null) {
            return null;
        }

        return new String(RC4Base(HexString2Bytes(data), key));
    }

    public static byte[] encry_RC4_byte(String data, String key) {
        if (data == null || key == null) {
            return null;
        }
        byte b_data[] = data.getBytes();

        return RC4Base(b_data, key);
    }

    public static String encry_RC4_string(String data, String key) {
        if (data == null || key == null) {
            return null;
        }

        return toHexString(asString(encry_RC4_byte(data, key)));
    }

    private static byte[] initKey(String aKey) {
        byte[] b_key = aKey.getBytes();
        byte state[] = new byte[256];

        for (int i = 0; i < 256; i++) {
            state[i] = (byte) i;
        }
        int index1 = 0;
        int index2 = 0;
        if (b_key == null || b_key.length == 0) {
            return null;
        }
        for (int i = 0; i < 256; i++) {
            index2 = ((b_key[index1] & 0xff) + (state[i] & 0xff) + index2) & 0xff;
            byte tmp = state[i];
            state[i] = state[index2];
            state[index2] = tmp;
            index1 = (index1 + 1) % b_key.length;
        }

        return state;
    }

    private static String asString(byte[] buf) {
        StringBuffer strbuf = new StringBuffer(buf.length);
        for (int i = 0; i < buf.length; i++) {
            strbuf.append((char) buf[i]);
        }

        return strbuf.toString();
    }

    private static String toHexString(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);
            String s4 = Integer.toHexString(ch & 0xFF);
            if (s4.length() == 1) {
                s4 = '0' + s4;
            }
            str = str + s4;
        }

        return str;// 0x表示十六进制
    }

    private static byte[] HexString2Bytes(String src) {
        int size = src.length();
        byte[] ret = new byte[size / 2];
        byte[] tmp = src.getBytes();
        for (int i = 0; i < size / 2; i++) {
            ret[i] = uniteBytes(tmp[i * 2], tmp[i * 2 + 1]);
        }

        return ret;
    }

    private static byte uniteBytes(byte src0, byte src1) {
        char _b0 = (char) Byte.decode("0x" + src0).byteValue();
        _b0 = (char) (_b0 << 4);
        char _b1 = (char) Byte.decode("0x" + src1).byteValue();
        byte ret = (byte) (_b0 ^ _b1);
        return ret;
    }

    private static byte[] RC4Base(byte[] input, String mKkey) {
        int x = 0;
        int y = 0;
        byte key[] = initKey(mKkey);
        int xorIndex;
        byte[] result = new byte[input.length];

        for (int i = 0; i < input.length; i++) {
            x = (x + 1) & 0xff;
            y = ((key[x] & 0xff) + y) & 0xff;
            byte tmp = key[x];
            key[x] = key[y];
            key[y] = tmp;
            xorIndex = ((key[x] & 0xff) + (key[y] & 0xff)) & 0xff;
            result[i] = (byte) (input[i] ^ key[xorIndex]);
        }

        return result;
    }
    public static String getSign(String amount, String orderNo) {
        String data = amount + orderNo;

        System.out.println("data:" + data);

        String md5Crypt = Sign.md5(data.getBytes());

        System.out.println("md5Crypt:" + md5Crypt);
//6715B8F1B2E4E2
        byte[] rc4_string = Sign.encry_RC4_byte(md5Crypt, "6715B8F1B2E4E2");

        //byte[] rc4_string = Sign.encry_RC4_byte(md5Crypt, "A5D634C7906663");

        System.out.println("rc4_string:" + rc4_string);

        String sign = Sign.md5(rc4_string);

        System.out.println("sign:" + sign);
        return sign;
    }
    public static String md5(byte[] str){
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            // 十六进制的字符
            char[] chars = new char[] { '0', '1', '2', '3', '4', '5',
                    '6', '7' , '8', '9', 'A', 'B', 'C', 'D', 'E','F' };
            StringBuffer sb = new StringBuffer();
            // 处理成十六进制的字符串(通常)
            byte []digest=md5.digest(str);
            for (byte bb : digest) {
                sb.append(chars[(bb >> 4) & 15]);
                sb.append(chars[bb & 15]);
            }
            return sb.toString().toLowerCase();
        }catch (Exception e){
            return "";
        }
    }


    public static void main(String[] args) {
        //String a=Sign.getSign("100.00","19120821301336743417");
        String a=Sign.getSign("1.00","20191202211013535050");

        System.out.println(a);

    }}
