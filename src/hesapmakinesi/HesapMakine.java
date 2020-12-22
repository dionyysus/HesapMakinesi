package hesapmakinesi;

public class HesapMakine {
    
    public static int topla(int... parametreler)
    {
        int toplam = 0;
        for (int parametre : parametreler) {
            toplam+=parametre;
        }
        System.out.println("Toplam: "+ toplam);
        return toplam;    
    }
    public static int cikartma(int... parametreler)
    {
        int cikart = parametreler[0];
        for (int i = 1; i < parametreler.length; i++) {
            cikart = cikart-parametreler[i];
        }
        System.out.println("Fark: "+cikart);
        return cikart;    
    }
    public static int carpma(int... parametreler)
    {
        int carpma = 1;
        for (int parametre : parametreler) {
            carpma*=parametre;
        }
        System.out.println("Carpma: "+ carpma);
        return carpma;    
    }
    public static double bolme(int... parametreler)
    {
        int bolme = parametreler[0];
        for (int i = 1; i < parametreler.length; i++) {
            if(parametreler[i]!=0)
            {
                bolme = bolme / parametreler[i];
            }
            else
            {
                System.out.println("Lutfen 0 dan baska bir deger giriniz.!!");
                return -1;
            }
        }
        System.out.println("Bolme: "+bolme);
        return bolme;    
    }
}

