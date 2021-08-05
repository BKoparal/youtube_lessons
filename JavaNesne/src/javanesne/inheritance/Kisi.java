package javanesne.inheritance;

//SOLID
//Nesne Tabanlı Kodlama Prensipleri


public class Kisi{
   String ad;
   String soyad;
   String tckimlik;
   String tel;
   Maasliliar m;
   
   
   public Kisi(int a) {
      System.out.println("Kişi");
   }
   
   void yaz(){
       System.out.println("tepe sınıf");
   } 
}


class Maasliliar extends Kisi{
    double mass;

    public Maasliliar(int a) {
        super(a);
        System.out.println("maaşlılar");
    }
    
    //Override
    @Override
    void yaz(){
       System.out.println("alt sınıf yazdı");
    } 
    
    
    //Object
    @Override
    public String toString() {
        return "Maasliliar{" + "masdcgsdvs=" + mass + ad+" jlskjlfd"+'}';
    }
}


class Personel {
   String ad;
   String soyad;
   String tckimlik;
   String tel;
   Maasliliar m;
   
    //constructure overload
    public Personel() {
        super();
        System.out.println("Personel");
    }

    public Personel(int a) {
        super();
    }
    
    void yaz(){
       System.out.println("yönetici sınıf yazdı");
    } 
    
   String calistigiBirim;  
}



class Musteri extends Kisi{

    public Musteri(int a) {
        super(a);
    }
    
   void aldigiUrunler(){ 
   }
}



class Yonetici extends Maasliliar{
   String bagliPersoneller;

    public Yonetici(int b) {
        super(b);
            System.out.println("yönetici");
    }
    
    @Override
    void yaz(){
       System.out.println("yönetici sınıf yazdı");
    } 
    
    void nasilYonetici(){
        
    }
}


//override kalıtım

class Kalitim {
    public static void main(String[] args) {
        Yonetici p=new Yonetici(2);
        Kisi y=new Yonetici(3);
        System.out.println("---------");
        p.yaz();
        System.out.println("---------");
        y.yaz();
        p.nasilYonetici();
        ((Yonetici)y).nasilYonetici();
    }
}

/*
Kisi
Maaslilar
Yonetici
*/
