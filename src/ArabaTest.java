
public class ArabaTest 
{
	public static void main(String[] args)
	{
		//model,yas,hız
		Araba arabaObj=new Araba("A3","1",50);
		arabaObj.başlat(0);
		arabaObj.arttırBenzinMiktarı(500);
		arabaObj.setkmbenzin(1);
		arabaObj.başlat(3);
		System.out.println("Güncel Benzin Durumunuz:"+arabaObj.getbenzinMiktarı()+"L");
		arabaObj.gitIleri(1);
		arabaObj.gitGeri(2);
		System.out.println("Güncel Benzin Durumunuz:"+arabaObj.getbenzinMiktarı()+"L");
		arabaObj.arttırHiz();
		arabaObj.arttırBenzinMiktarı(500);
	    arabaObj.başlat(2);
	
	    if( arabaObj.kontrolEtRadar()==2) {
	    	System.out.println("Aracınızın Renk Durumu: "+arabaObj.getIsrenkli());
	    }
	    else
	    {
	    	System.out.println("Aracınızın Rengi: "+arabaObj.getRenk());
	    }
	    arabaObj.azaltHiz();
	    arabaObj.gitIleri(1);
	    arabaObj.gosterBilgi();
		
		
	}
	

}
