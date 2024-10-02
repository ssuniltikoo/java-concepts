package dev.core.concepts.java.designpattern.prototype.studentexample;

public class IntelligentStudent extends Student{

    private int iq;
    public IntelligentStudent( IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public IntelligentStudent( String name, int age, char gender, double percentage, Batch batch, int iq)  {
        super(name, age, gender, percentage, batch);
        this.iq = iq;
    }

    public IntelligentStudent copyStudent() {
        return this;
    }

//    public IntelligentStudent cloneStudent() {
//
//        return new IntelligentStudent(this);
//    }

    public IntelligentStudent(){}

    @Override
    public IntelligentStudent cloneStudent() {
       // IntelligentStudent copy = (IntelligentStudent) super.cloneStudent();
        //copy.iq = 2000;
        this.setIq(2000);
        return new IntelligentStudent(this);


    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
