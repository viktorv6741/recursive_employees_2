package recursion;

public class Employer {

    private String name;
    private String company;
    private String role;
    private Employer boss;

///////////////////////////////////////////////////////////////////////////////////

    public Employer(Employer boss, String role, String company, String name) {
        this.name = name;
        this.role = role;
        this.boss = boss;
        this.company = company;
    }

    public Employer() {
    }

///////////////////////////////////////////////////////////////////////////////////

    public String getCompanyStaff(int i) {
        if (i > 0) {
            return
                    "NAME -> " + name + '\n' +
                            "COMPANY -> " + company + '\n' +
                            "OCCUPATION -> " + role + '\n' +
                            "BOSS -> " + boss.getCompanyStaff(--i);
        } else return "";
    }

///////////////////////////////////////////////////////////////////////////////////

    public String getRole() {
        return role;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public Employer getBoss() {
        return boss;
    }

///////////////////////////////////////////////////////////////////////////////////
}