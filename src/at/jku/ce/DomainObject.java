package at.jku.ce;

public class DomainObject {

private String uuid;

private String name;

private String comment;

	public DomainObject() {
		super();
	}
	/**
	* Default constructor
	*/
	public DomainObject(String name, String comment, String id){
	
		super();
		this.id = id;
		this.name = name;
		this.comment = comment;
	}

	public String getUuId() {
		return id;
	}

	public String getComment(){
		return comment;
	}	

	public String setComment(String comment){
		this.comment = comment;
	}	
	public String id = UUID.randomUUID().toString()

}
