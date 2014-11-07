package cvrp.action;

import net.sourceforge.stripes.action.*;

@UrlBinding("/cvrp/Home.htm")
public class HomeActionBean extends BaseActionBean {

    int numberOne;

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    int numberTwo;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    int result;

    @DefaultHandler
    public Resolution view() {
        return new ForwardResolution("/WEB-INF/jsp/home.jsp");
    }

    @HandlesEvent(value="Add")
    public Resolution addition() {
        result = numberOne + numberTwo;
        return new ForwardResolution("/WEB-INF/jsp/home.jsp");
    }
}
