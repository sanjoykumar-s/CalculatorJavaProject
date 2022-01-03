package BackEnd;

public class ArithmeticOperation {

    double num;
    public double operation(String textfield, int cal)
    {
        if(cal == 1) return num + Double.parseDouble(textfield);
        else if(cal == 2) return num - Double.parseDouble(textfield);
        else if(cal == 3) return num * Double.parseDouble(textfield);
        else return num / Double.parseDouble(textfield);
    }

}
