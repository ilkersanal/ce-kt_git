package at.jku.ce;

public class DomainObject {

private String uuid;

private String name;

private String comment;

	protected DomainObject() {
		super();
	}
	/**
	* Default constructor
	*/
	protected DomainObject(String name, String comment, String id){
	
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

	public String setComment(final String comment){
		this.comment = comment;
	}	

	public String getName(){
		
		return name;
	}

	public void setName(final String name){
		
		this.name = name;
	}
	public String toString() {
		return "DomainObject [name=" + name + ", comment=" +comment + ", uuid=" +uuid + "]";
		]";
	}
	public String id = UUID.randomUUID().toString()

}
