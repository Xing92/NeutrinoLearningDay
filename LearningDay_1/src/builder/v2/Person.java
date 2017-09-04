package builder.v2;

public class Person {
	private final String lastName;
	private final String firstName;
	private final String middleName;
	private final String salutation;
	private final String suffix;
	private final String streetAddress;
	private final String city;
	private final String state;
	private final boolean isFemale;
	private final boolean isEmployed;
	private final boolean isHomewOwner;

	private Person(final String newLastName, final String newFirstName, final String newMiddleName,
			final String newSalutation, final String newSuffix, final String newStreetAddress, final String newCity,
			final String newState, final boolean newIsFemale, final boolean newIsEmployed,
			final boolean newIsHomeOwner) {
		this.lastName = newLastName;
		this.firstName = newFirstName;
		this.middleName = newMiddleName;
		this.salutation = newSalutation;
		this.suffix = newSuffix;
		this.streetAddress = newStreetAddress;
		this.city = newCity;
		this.state = newState;
		this.isFemale = newIsFemale;
		this.isEmployed = newIsEmployed;
		this.isHomewOwner = newIsHomeOwner;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", salutation=" + salutation + ", suffix=" + suffix + ", streetAddress=" + streetAddress + ", city="
				+ city + ", state=" + state + ", isFemale=" + isFemale + ", isEmployed=" + isEmployed
				+ ", isHomewOwner=" + isHomewOwner + "]";
	}
	
	public static class PersonBuilder {
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
}