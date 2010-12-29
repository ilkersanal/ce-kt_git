package at.jku.ce;

public class DomainObject {

private String uuid;

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

	public String getUuId() {
		return id;
	}	

	public String id = UUID.randomUUID().toString()

}
