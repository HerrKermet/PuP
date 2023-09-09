package Exercise_08_Proxy_Adapter_Facade.Adapter.Proxy;

public class WebConnection implements Connection{
    @Override
    public void connectToHost(String hostname) {
        System.out.println("Connected to " + hostname);
    }
}
