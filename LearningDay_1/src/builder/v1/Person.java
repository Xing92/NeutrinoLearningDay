package builder.v1;

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

	public Person(final String newLastName, final String newFirstName, final String newMiddleName,
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
}