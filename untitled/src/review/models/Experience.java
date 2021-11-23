package review.models;

public class Experience extends Candidates{
    int expInYear;
    String proSkill;

    public Experience() {
    }

    public Experience(int id, String firstName, String lastName, int birthDate, String address, int phone, String email, int candidateType, int expInYear, String proSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + this.getId() +
                ", firstName='" +this.getFirstName()  + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", birthDate=" + this.getBirthDate() +
                ", address='" + this.getAddress() + '\'' +
                ", phone=" + this.getPhone() +
                ", email='" + this.getEmail() + '\'' +
                ", candidateType=" + this.getCandidateType() +
                '}';
    }
}
