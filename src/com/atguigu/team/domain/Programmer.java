package com.atguigu.team.domain;


import com.atguigu.team.service.Status;

public class Programmer extends Employee {

    private int memberId;//开发团队中的Id
    private Status status = Status.FREE;//员工的状态
    private Equipment equipment;

    public Programmer(){

    }
    public Programmer(int id,String name,int age,double salary,Equipment equipment){
        super(id,name,age,salary);
        this.equipment = equipment;


    }


    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return getDetials() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
    }

    public String getDetailsForTeam(){
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary()+ "\t" + "程序员";
    }
}
