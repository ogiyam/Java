package extend.human;

//Humanクラスを継承したEmployeeクラス
public class Employee extends Human {
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    // サブクラスで追加したメソッド
    public String getEmployeeProfile() {
        String profile = "年齢は" + this.age + "です。";
        profile += "サラリーマンで、部署は" + this.department + "です。";
        return profile;
    }
}
