package cz.czechitas.webapp;

public class VypoctyForm {
    private String gender;
    private int age;
    private String strength;
    private String endurance;
    private String weapon;

    public String getGender() {
        return gender;
    }

    public void setGender(String newValue) {
        gender = newValue;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newValue) {
        age = newValue;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String newValue) {
        strength = newValue;
    }

    public String getEndurance() {
        return endurance;
    }

    public void setEndurance(String newValue) {
        endurance = newValue;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String newValue) {
        weapon = newValue;
    }

    private double hodnoceniPohlavi() {
        switch (gender) {
            case "woman":
                return 0.10;
            case "man":
                return 0.10;
        }
        return 0;
    }

    private double hodnoceniPodleVeku() {
        if (age > 18) {
            return 0.15;
        } else if (age > 25) {
            return 0.25;
        }else if (age > 35){
            return 0.20;
        }else if (age > 45) {
            return 0.10;
        }else {
            return 0.0;
        }
    }

    private double hodnoceniPodleSily() {
        switch (strength) {
            case "50":
                return 0.10;
            case "70":
                    return 0.15;
            case "90":
                    return 0.20;
                default:
                    return 0.25;
        }
    }

    private double hodnoceniPodleVytrvalosti() {
        switch (endurance) {
            case "walker":
                return 0.00;
            case "runner":
                return 0.10;
            case "marathoner":
                return 0.15;
                default:
                    return 0.25;
        }
    }

    private double hodnoceniZbrane() {
        switch (weapon) {
            case "axe":
                return 0.15;
            case "bat":
                return 0.10;
            case "chainsaw":
                return 0.10;
            case "colt":
                return 0.15;
            case "knife":
                return 0.10;
                default:
                    return 0.15;
        }
    }

    public double celkovaSancePreziti() {
    return (hodnoceniPohlavi()
            +hodnoceniPodleVeku()
            +hodnoceniPodleSily()
            +hodnoceniPodleVytrvalosti()
            +hodnoceniZbrane())*100.0;
    }
}
