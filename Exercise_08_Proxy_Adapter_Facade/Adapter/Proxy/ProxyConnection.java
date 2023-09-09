package Exercise_08_Proxy_Adapter_Facade.Adapter.Proxy;

import java.io.*;

public class ProxyConnection implements Connection{



    private boolean isBlacklist;
    ProxyConnection(boolean isBlacklist){
        this.isBlacklist = isBlacklist;
    }
    @Override
    public void connectToHost(String hostname) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("Exercise_08_Proxy_Adapter_Facade/Adapter/Proxy/list.txt"));
            try {
                String line = reader.readLine();
                boolean found = false;
                while(line != null){
                   if(line.equals(hostname)){
                       found = true;
                       break;
                   }
                    line = reader.readLine();
                }
                reader.close();
                if(found){
                    if(isBlacklist){
                        System.out.println("Connection refused");
                    }
                    else{
                        WebConnection webConnection = new WebConnection();
                        webConnection.connectToHost(hostname);
                    }
                }else{
                    if(isBlacklist){
                        WebConnection webConnection = new WebConnection();
                        webConnection.connectToHost(hostname);
                    }else{
                        System.out.println("Connection refused");
                    }
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
