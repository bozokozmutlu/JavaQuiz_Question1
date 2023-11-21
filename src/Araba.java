import java.util.Random;

public class Araba {
	
	private String model,yas,renk,konum="Edremit";
	private int hiz,mod,yol,benzinMiktari,kmbenzin;
	private boolean IsRrenkli;
	public Araba() {}
	public Araba( String model,String yas,int hiz)
	  {
		this.model=model;
		this.yas=yas;
		this.hiz=hiz;
	  }
	public void setModel(String model) 
	  {
		   this.model=model;
	  }
	
	public void setYas(String yas) 
	  {
		this.yas=yas;
	  }
	public void setRenk(String Renk)
	  {
		this.renk=Renk;
	  }
	public void setkonum(String konum)
	  {
		this.konum=konum;
	  }
	public void sethiz(int hiz)
	  {
		this.hiz=hiz;
	  }
	
	public void setMod(int mod) 
	  {
		this.mod=mod;
	  }
	public void setkmbenzin(int kmbenzin) 
	  {
		this.kmbenzin=kmbenzin;
	  }

	public void setYol(int yol) 
	  {
		this.yol=yol;
		
	  }
	public void setBenzinMiktari(int BenzinMiktari)
	  {
		this.benzinMiktari=BenzinMiktari;
		
	  }
	public void setIsRenklı(boolean IsRenkli)
	  {
		this.IsRrenkli=IsRenkli;
		
	  }
	public String getModel()
	  {
	     return model;
	  }
	public String getYas()
	  {
	     return yas;
	  }
	public String getRenk()
	  {
	     return renk;
	  }
	public String getKonum()
	  {
	     return konum;
	  }
	public int gethiz()
	  {
	     return hiz;
	  }
	public int getkmbenzin()
	  {
	     return kmbenzin;
	  }
	public int getMod()
	  {
	     return mod;
	  }
	public int getYol()
	  {
	     return yol;
	  }
	public int getbenzinMiktarı()
	  {
	     return benzinMiktari;
	  }
	public boolean getIsrenkli()
	  {
	     return IsRrenkli;
	  }
	 
	public void arttırBenzinMiktarı(int z)
	  {
		
		benzinMiktari +=z;
		System.out.println("Başarıyla "+z+"L benzin yüklenmiştir");
		 
	  }
	public void azaltBenzinMiktari(int z)
	  {
		
		benzinMiktari -=z;
		System.out.println("Başarıyla "+z+"L benzin azaltılmıştır");
		
	  }
	public  void başlat(int saat) 
	  { 
		System.out.println("Başlangıç Konumunuz:"+konum);
		if(benzinMiktari>(saat*hiz)) 
		{
			System.out.println("Yola Çıkılıyor...");
			yol+=saat*hiz;
			benzinMiktari-=kmbenzin*yol;
			KonumBelirle(yol);

		}
		else
		{
			System.out.println("Benziniz yetersizdir, lütfen yükleme yapınız");
		}
		if(yol>250||yol<0) 
		{
			System.out.println("Zorla durduruldunuz.");
		}
		
		

	  }
	public void gitIleri(int saat) 
	  {
		if(benzinMiktari>(saat*hiz)) 
		{
			System.out.println(saat+" saat boyunca ileri gidiliyor...");
			yol+=saat*hiz;
			benzinMiktari-=kmbenzin*yol;
			KonumBelirle(yol);


		}
		else
		{
			System.out.println("Benziniz yetersizdir, lütfen yükleme yapınız");
		}
		if(yol>250||yol<0) 
		{
			System.out.println("Zorla durduruldunuz.");
		}
	  }
	public void gitGeri(int saat)
	  {
		if(benzinMiktari>(saat*hiz)) 
		{
			System.out.println(saat+" saat boyunca geri gidiliyor...");
			yol-=saat*hiz;
			benzinMiktari-=kmbenzin*yol;
			KonumBelirle(yol);
		}
		else
		{
			System.out.println("Benziniz yetersizdir, lütfen yükleme yapınız");
		}
		if(yol>250||yol<0) 
		{
			System.out.println("Zorla durduruldunuz.");
		}
		
	  }
	public void KonumBelirle(int yol)
	  {
		if(yol>0 && yol<51) 
		{
			konum="Edremit";
		}
		if(yol>50 && yol<101) 
		{
			konum="Marmara";
		}
		if(yol>100 && yol<151) 
		{
			konum="Erdek";
		}
		if(yol>150 && yol<201) 
		{
			konum="AltıEylül";
		}
		if(yol>200 && yol<251) 
		{
			konum="Bandırma";
		}
		
	  }
	public void arttırHiz() {
		int dizi1[]= {2,3,5};
		Random r= new Random();
		int a=r.nextInt(dizi1.length);
		hiz*=dizi1[a];
	  }
	public void azaltHiz() {
		hiz/=2;
	  }
	public int kontrolEtRadar()
	  {
		if(hiz>140)
		{
			System.out.println("Radara yakalandınız.Hiziniz: "+hiz);
			 mod=2;
		
		}
		else if(hiz<140 && hiz>100)
		{
			System.out.println("Lütfen Yavaşlayınız.Hiziniz: "+hiz);
		     mod=1;
		}
		else if(hiz<100 && hiz>70)
		{
			System.out.println("Teşekkür ederiz,güvenilir bir yolculuk yapıyorsunuz.Hiziniz: "+hiz);
			 mod=0;
		}
		return mod;
	  }
	public void silRenk()
	  {
		if(mod!=2)
		{
			renk="";
			System.out.println("Araç Renginiz Silinmiştir...");
			
		}
		else
		{
			System.out.println("Radara yakalandığınız için renginiz silinemez!");
		}
		
	  }
	public void ataRenk()
	{   if(mod==0)
	    { 
		  String dizi[]= {"Kırmızı","Yeşil","Lacivert","Siyah","Beyaz"};
		  Random r=new Random();
		  int renksecim=r.nextInt(dizi.length);
		  renk=dizi[renksecim];
	    }
	     else
	     {
	    	 System.out.println("Renk değiştirmek için güvenli bir yolculuk yapmanız gerekiyor!");
	     }
	}
	public void gosterBilgi()
	{
		System.out.println("Aracınızın Modeli: "+model);
		System.out.println("Aracınızın Yasi: "+yas);
		System.out.println("Aracınızın Rengi: "+renk);
		System.out.println("Aracınızın Hızı: "+hiz+" km/h");
		System.out.println("Aracınızın Modu: "+mod);
		System.out.println("Aracınız Renkli Midir: "+IsRrenkli);
		System.out.println("Aracınızın Yolu: "+yol +" km");
		if (benzinMiktari>0) {
			System.out.println("Aracınızın Benzini: "+benzinMiktari+" L");
			
		}
		else
		{
			System.out.println("Aracınızda Benzin Kalmamıştır");
		}
		System.out.println("Aracınızın Konumu: "+konum);
		
	}
		
		

}
