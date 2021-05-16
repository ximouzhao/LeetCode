package huawei.router;

public class HuaWeiRouterApi {
    Scram scram = new Scram();
    public String firstRequest(){
        String firstNonce = scram.getNonce(32);
        String password = "qazplm123=";
        String param = "{ \"name\": \"user_login_nonce\", \"data\": { \"username\": \"admin\", \"firstnonce\": \""+firstNonce+"\" } }";
        String result=HttpURLConnectionUtil.doPost("http://192.168.131.1/api/system/user_login_nonce",param);
        System.out.println(result);
        return result;
    }
}
