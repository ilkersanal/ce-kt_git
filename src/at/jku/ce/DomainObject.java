package at.jku.ce;

public class DomainObject {

public String uuid;

private String name;

	public DomainObject() {
		super();
	}
	/**
	* Default constructor
	*/
	public DomainObject(String id){
	
		super();
		this.id = id;
	}

	public String getgetUuId() {
		return id;
	}	

}
