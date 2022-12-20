import java.util.HashMap;
import java.util.Map;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		int array[]= {1,1,2,3,5,1,5};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<array.length;i++) 
		{
			
	       if(hm.containsKey(array[i])) 
			{
				hm.put(array[i], hm.get(array[i])+1); //tekrar karşılaştığında value'sini 1 arttırır.
			}
		   else 
			{
				hm.put(array[i],1);
			}
		}
	    for(Map.Entry entry:hm.entrySet()) 
		{	
	    // gelen değer object tipinde oldugu icin cast işlemi yaparak integer'a ceviriyoruz.	
     	int a=(Integer)(entry.getValue()); 
     	//tekrar etmeyenleri vermesi için koşul 
     	
     	    if(a==1) 
     	    { 
	          System.out.println("Eleman"+"   "+"Tekrar sayısı");
	          System.out.println(entry.getKey()+"         "+entry.getValue());
	         //döngüden çıkartıyoruz , elemanı bulur bulmaz
	          break; 
		    }
		}

	}

}


