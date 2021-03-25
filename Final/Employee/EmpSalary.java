public class EmpSalary {
    private double basicAmout;
    private double festivalBonus;
    private double overtimeAmount;

    public EmpSalary(){

    }

    public EmpSalary(double basicAmout, double festivalBonus, double overtimeAmoun){
        this.basicAmout = basicAmout;
        this.festivalBonus = festivalBonus;
        this.overtimeAmount = overtimeAmoun;
    }


    public double getBasicAmout() {
        return basicAmout;
    }

    public void setBasicAmout(double basicAmout) {
        this.basicAmout = basicAmout;
    }

    public double getFestivalBonus() {
        return festivalBonus;
    }

    public void setFestivalBonus(double festivalBonus) {
        this.festivalBonus = festivalBonus;
    }

    public double getOvertimeAmount() {
        return overtimeAmount;
    }

    public void setOvertimeAmount(double overtimeAmount) {
        this.overtimeAmount = overtimeAmount;
    }
}


