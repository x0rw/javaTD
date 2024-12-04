package testtd;

public class Paire<U,V> {
	private U first;
	private V second;
	//constructeur 
	public Paire(U first, V second) {
		this.first = first;
		this.second= second;
	}
	//getters
	public V getSecond() {
		return this.second;
	}
	public V getFirst() {
		return this.second;
	}
	public String toString() {
		return "first: "+this.first+ ", second: "+this.second;
	}
}
