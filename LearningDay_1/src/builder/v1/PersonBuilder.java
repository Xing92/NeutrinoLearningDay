package builder.v1;

public class PersonBuilder {
	private String LastName;
	private String FirstName;
	private String MiddleName;
	private String Salutation;
	private String Suffix;
	private String StreetAddress;
	private String City;
	private String State;
	private boolean IsFemale;
	private boolean IsEmployed;
	private boolean IsHomeOwner;

	public PersonBuilder() {
	}

	public PersonBuilder setLastName(String LastName) {
		this.LastName = LastName;
		return this;
	}

	public PersonBuilder setFirstName(String FirstName) {
		this.FirstName = FirstName;
		return this;
	}

	public PersonBuilder setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
		return this;
	}

	public PersonBuilder setSalutation(String Salutation) {
		this.Salutation = Salutation;
		return this;
	}

	public PersonBuilder setSuffix(String Suffix) {
		this.Suffix = Suffix;
		return this;
	}

	public PersonBuilder setStreetAddress(String StreetAddress) {
		this.StreetAddress = StreetAddress;
		return this;
	}

	public PersonBuilder setCity(String City) {
		this.City = City;
		return this;
	}

	public PersonBuilder setState(String State) {
		this.State = State;
		return this;
	}

	public PersonBuilder setIsFemale(boolean IsFemale) {
		this.IsFemale = IsFemale;
		return this;
	}

	public PersonBuilder setIsEmployed(boolean IsEmployed) {
		this.IsEmployed = IsEmployed;
		return this;
	}

	public PersonBuilder setIsHomeOwner(boolean IsHomeOwner) {
		this.IsHomeOwner = IsHomeOwner;
		return this;
	}

	public Person build() {
		return new Person(LastName, FirstName, MiddleName, Salutation, Suffix, StreetAddress, City,
				State, IsFemale, IsEmployed, IsHomeOwner);

	}

}