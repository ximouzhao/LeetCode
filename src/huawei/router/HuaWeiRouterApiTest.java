package huawei.router;

import org.junit.Test;

import static org.junit.Assert.*;

public class HuaWeiRouterApiTest {
    HuaWeiRouterApi huaWeiRouterApi=new HuaWeiRouterApi();

    @Test
    public void firstRequest() {
        String result=huaWeiRouterApi.firstRequest();
        System.out.println(result);
        assertNotNull(result);
    }
}