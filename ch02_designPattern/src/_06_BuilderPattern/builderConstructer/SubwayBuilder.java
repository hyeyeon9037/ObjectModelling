package _06_BuilderPattern.builderConstructer;

public class SubwayBuilder {
	

	
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vagetable;
	private String source;

	public SubwayBuilder(int size, String bread, String source) {
		super();
		this.size = size;
		this.bread = bread;
		this.source = source;
	} // 반드시 넣으라는 소리
	
	
	public SubwayBuilder setCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}
	public SubwayBuilder setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
		return this;
	}
	public SubwayBuilder setVagetable(boolean vagetable) {
		this.vagetable = vagetable;
		return this;
	}
	//setter 메소드로 받으라는 거

	
	// ★★★ 3. Subway 객체를 생성하여 리턴 : Subway 생성자 호출로 
	public Subway build( ) {
		return new Subway(size, bread, cheese, extraTopping, vagetable, source);
	} // 사용자로부터 받은 것
	
	

	@Override
	public String toString() {
		return "SubwayBuilder [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping="
				+ extraTopping + ", vagetable=" + vagetable + ", source=" + source + "]";
	}
	
	
	
	
	
}
