package testtd;

import java.util.function.Predicate;

public class main {

	public static void main(String[] args) {
		OEns<Integer> ens1 = new OEns<Integer>();
		ens1.add(12);
		ens1.add(55);
		ens1.add(33);
		
		System.out.println(ens1.localiser(12).toString() );
		System.out.println(ens1.localiser(112).toString());
		
		
		OEns<Integer> ens2 = new OEns<Integer>();
		ens2.add(110);
		ens2.add(120);
		ens2.add(330);
		
		
		OEns<Integer>union_ens = ens1.union(ens2);
		System.out.println(union_ens.toString());
		
        Predicate<Integer> moin100 = i -> (i < 100);  

		OEns<Integer> pred_ens = union_ens.pgp(moin100);
		System.out.println(pred_ens.toString());
		
		

	}

}
