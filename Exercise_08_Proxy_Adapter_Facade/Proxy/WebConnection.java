package Exercise_08_Proxy_Adapter_Facade.Proxy;

public class WebConnection implements Connection{
    @Override
    public void connectToHost(String hostname) {
        System.out.println("Connected to " + hostname);
    }
}
