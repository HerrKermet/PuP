package Exercise_08_Proxy_Adapter_Facade.Adapter;

public class USAddressAdapter extends USAddress implements AdressValidator{

    @Override
    public boolean istGueltig(String adresse, String plz, String bundesland) {
        return isValidUSAddress(adresse, plz, bundesland);
    }
}
