package at.jku.ce;

public class Main {
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<DomainObject> objectSet = new HashSet<DomainObject>();
		
		objectSet.add(new DomainObject("Helga", "Mutter"));
		objectSet.add(new DomainObject("Walter", "Vater"));
		objectSet.add(new DomainObject("Hannah", "Tochter1"));
		objectSet.add(new DomainObject("Paul", "Sohn"));
		objectSet.add(new DomainObject("Claudia", "Tochter2"));
		
		for (DomainObject domainObject : objectSet) {
			LOGGER.debug(domainObject.getUuid);
		}		
	}

}
