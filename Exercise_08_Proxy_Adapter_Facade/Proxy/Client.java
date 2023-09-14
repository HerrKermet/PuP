package Exercise_08_Proxy_Adapter_Facade.Proxy;

public class Client {

    public static void main(String[] args) {

        ProxyConnection proxyWhitelist = new ProxyConnection(false);
        ProxyConnection proxyBlacklist = new ProxyConnection( true);

        proxyWhitelist.connectToHost("google.com");
        proxyBlacklist.connectToHost("google.com");
        proxyBlacklist.connectToHost("test.com");
    }

}
