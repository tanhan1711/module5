package THICUOIKY;

public class Experience extends Employee{
    int Exp;
    String Skill;
    String Workplace;

    public Experience(int idNv, String name, String birthDay, String address, String country, String numberPhone, String mail, int exp, String skill, String workplace) {
        super(idNv, name, birthDay, address, country, numberPhone, mail);
        Exp = exp;
        Skill = skill;
        Workplace = workplace;
    }

    public int getExp() {
        return Exp;
    }

    public void setExp(int exp) {
        Exp = exp;
    }

    public String getSkill() {
        return Skill;
    }

    public void setSkill(String skill) {
        Skill = skill;
    }

    public String getWorkplace() {
        return Workplace;
    }

    public void setWorkplace(String workplace) {
        Workplace = workplace;
    }
}
