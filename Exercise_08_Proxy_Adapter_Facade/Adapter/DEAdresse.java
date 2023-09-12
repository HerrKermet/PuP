package Exercise_08_Proxy_Adapter_Facade.Adapter;

public class DEAdresse implements AdressValidator{
    @Override
    public boolean istGueltig(String adresse, String plz, String bundesland) {
        if(adresse.length() < 10)
            return false;
        if(plz.length() != 5)
            return false;
        if(bundesland.length() != 2)
            return false;
        return true;
    }
}
