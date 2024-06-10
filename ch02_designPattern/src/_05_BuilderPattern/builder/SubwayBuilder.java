package _05_BuilderPattern.builder;

public class SubwayBuilder {
	
	//1. 멤버변수를 동일하게 넣어준다.
	
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vagetable;
	private String source;
	//Subway 클래스 속성이랑 똑같이.
	
	/* 2. 속성의 setter 메소드 구현
		  - 반환형 : 내 객체
	*/  
	
	/*
	 
	 메소드명 지정하는 방법
	 - 속성명(과 동일) : setter 메소드와 구분을 하기 위해서
	 				 ex) size(int size)
	 				 
	 - set 속성명 :  ex) setSzie(int size)
	 				
	 - with 속성명 : setter 메소드와 구분하기 위해서 'with'라는 키워드를 사용한다
 					 ex) withSize(int size)
 	
	 */
	
	/* 반환형 : 내 객체 
	public SubwayBuilder withSize(int size) {
		this.size = size;
		return s;
	} // 이렇게하면 계속 반복함 그렇다면 어떻게해야할까?
	*/
	
	public SubwayBuilder setSize(int size) {
		this.size = size;
		return this;
	}  // 이렇게 해야 반복을안함!
	
	
	public SubwayBuilder setBread(String bread) {
		this.bread = bread;
		return this;
	}
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
	public SubwayBuilder setSource(String source) {
		this.source = source;
		return this;
	}

	
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
