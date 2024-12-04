package testtd;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Predicate;

public class OEns<T extends Comparable<? super T>> extends LinkedList<T> {
	public Paire<Integer,Boolean> localiser(T x){
		//retourne - dans « second » l’information sur l’existence de « x » dans la structure.
		// -dans « premier » la position d’insertion s’il y a lieu
		//A définir
			if(this.contains(x)) {
				return new Paire<Integer,Boolean>(this.indexOf(x), true);
			}else {
				
				return new Paire<Integer,Boolean>(-1, false);
			}		
	}
		// dans les ensmbles on n accept pas les elements duplique
		@Override
		public boolean add(T e) {
			 if(!this.localiser(e).getSecond() || !this.isEmpty()) {
				 super.add(e);
				 return true;
			 }
			 return true;
			
		}
		public OEns<T> union(OEns<T> x){
		//retourne la réunion de deux ensembles
		//Utiliser un itérateur explicite
			
			//iterateur de this class
			OEns<T> e_final = new OEns<T>();
	        Iterator<T> iterateur = this.iterator();
	     
	        while(iterateur.hasNext()) {
	        	e_final.add(iterateur.next());
	        }
	        
	        //iterateur de x
	        Iterator<T> iterateur2 = x.iterator();
	     
	        while(iterateur2.hasNext()) {
	        	e_final.add(iterateur2.next());
	        }
	        return e_final;

			
		}
		public OEns<T> pgp(Predicate<T> p){
		//retourne le plus long préfixe vérifiant « p »
		// « pgp » des impairs dans {1,5,8,9} est {1,5}
			OEns<T> ensemble = new OEns<T>();
			Iterator<T> iterateur = this.iterator();
			ensemble.add(this.getFirst());
	        while(iterateur.hasNext()) {
	        	T e = iterateur.next();
	        	if(p.test(e)) {
	        		ensemble.add(e);	
	        	}
	        }
	        return ensemble;
		}
}
